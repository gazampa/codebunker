/**
 * AuthProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class AuthProvider  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String consumerKey;

    private java.lang.String consumerSecret;

    private java.util.Calendar createdDate;

    private java.lang.String developerName;

    private java.lang.String errorUrl;

    private java.lang.String executionUserId;

    private java.lang.String friendlyName;

    private java.lang.String providerType;

    private java.lang.String registrationHandlerId;

    public AuthProvider() {
    }

    public AuthProvider(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String consumerKey,
           java.lang.String consumerSecret,
           java.util.Calendar createdDate,
           java.lang.String developerName,
           java.lang.String errorUrl,
           java.lang.String executionUserId,
           java.lang.String friendlyName,
           java.lang.String providerType,
           java.lang.String registrationHandlerId) {
        super(
            fieldsToNull,
            id);
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.createdDate = createdDate;
        this.developerName = developerName;
        this.errorUrl = errorUrl;
        this.executionUserId = executionUserId;
        this.friendlyName = friendlyName;
        this.providerType = providerType;
        this.registrationHandlerId = registrationHandlerId;
    }


    /**
     * Gets the consumerKey value for this AuthProvider.
     * 
     * @return consumerKey
     */
    public java.lang.String getConsumerKey() {
        return consumerKey;
    }


    /**
     * Sets the consumerKey value for this AuthProvider.
     * 
     * @param consumerKey
     */
    public void setConsumerKey(java.lang.String consumerKey) {
        this.consumerKey = consumerKey;
    }


    /**
     * Gets the consumerSecret value for this AuthProvider.
     * 
     * @return consumerSecret
     */
    public java.lang.String getConsumerSecret() {
        return consumerSecret;
    }


    /**
     * Sets the consumerSecret value for this AuthProvider.
     * 
     * @param consumerSecret
     */
    public void setConsumerSecret(java.lang.String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }


    /**
     * Gets the createdDate value for this AuthProvider.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this AuthProvider.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the developerName value for this AuthProvider.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this AuthProvider.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the errorUrl value for this AuthProvider.
     * 
     * @return errorUrl
     */
    public java.lang.String getErrorUrl() {
        return errorUrl;
    }


    /**
     * Sets the errorUrl value for this AuthProvider.
     * 
     * @param errorUrl
     */
    public void setErrorUrl(java.lang.String errorUrl) {
        this.errorUrl = errorUrl;
    }


    /**
     * Gets the executionUserId value for this AuthProvider.
     * 
     * @return executionUserId
     */
    public java.lang.String getExecutionUserId() {
        return executionUserId;
    }


    /**
     * Sets the executionUserId value for this AuthProvider.
     * 
     * @param executionUserId
     */
    public void setExecutionUserId(java.lang.String executionUserId) {
        this.executionUserId = executionUserId;
    }


    /**
     * Gets the friendlyName value for this AuthProvider.
     * 
     * @return friendlyName
     */
    public java.lang.String getFriendlyName() {
        return friendlyName;
    }


    /**
     * Sets the friendlyName value for this AuthProvider.
     * 
     * @param friendlyName
     */
    public void setFriendlyName(java.lang.String friendlyName) {
        this.friendlyName = friendlyName;
    }


    /**
     * Gets the providerType value for this AuthProvider.
     * 
     * @return providerType
     */
    public java.lang.String getProviderType() {
        return providerType;
    }


    /**
     * Sets the providerType value for this AuthProvider.
     * 
     * @param providerType
     */
    public void setProviderType(java.lang.String providerType) {
        this.providerType = providerType;
    }


    /**
     * Gets the registrationHandlerId value for this AuthProvider.
     * 
     * @return registrationHandlerId
     */
    public java.lang.String getRegistrationHandlerId() {
        return registrationHandlerId;
    }


    /**
     * Sets the registrationHandlerId value for this AuthProvider.
     * 
     * @param registrationHandlerId
     */
    public void setRegistrationHandlerId(java.lang.String registrationHandlerId) {
        this.registrationHandlerId = registrationHandlerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthProvider)) return false;
        AuthProvider other = (AuthProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.consumerKey==null && other.getConsumerKey()==null) || 
             (this.consumerKey!=null &&
              this.consumerKey.equals(other.getConsumerKey()))) &&
            ((this.consumerSecret==null && other.getConsumerSecret()==null) || 
             (this.consumerSecret!=null &&
              this.consumerSecret.equals(other.getConsumerSecret()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.errorUrl==null && other.getErrorUrl()==null) || 
             (this.errorUrl!=null &&
              this.errorUrl.equals(other.getErrorUrl()))) &&
            ((this.executionUserId==null && other.getExecutionUserId()==null) || 
             (this.executionUserId!=null &&
              this.executionUserId.equals(other.getExecutionUserId()))) &&
            ((this.friendlyName==null && other.getFriendlyName()==null) || 
             (this.friendlyName!=null &&
              this.friendlyName.equals(other.getFriendlyName()))) &&
            ((this.providerType==null && other.getProviderType()==null) || 
             (this.providerType!=null &&
              this.providerType.equals(other.getProviderType()))) &&
            ((this.registrationHandlerId==null && other.getRegistrationHandlerId()==null) || 
             (this.registrationHandlerId!=null &&
              this.registrationHandlerId.equals(other.getRegistrationHandlerId())));
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
        if (getConsumerKey() != null) {
            _hashCode += getConsumerKey().hashCode();
        }
        if (getConsumerSecret() != null) {
            _hashCode += getConsumerSecret().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getErrorUrl() != null) {
            _hashCode += getErrorUrl().hashCode();
        }
        if (getExecutionUserId() != null) {
            _hashCode += getExecutionUserId().hashCode();
        }
        if (getFriendlyName() != null) {
            _hashCode += getFriendlyName().hashCode();
        }
        if (getProviderType() != null) {
            _hashCode += getProviderType().hashCode();
        }
        if (getRegistrationHandlerId() != null) {
            _hashCode += getRegistrationHandlerId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConsumerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerSecret");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConsumerSecret"));
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
        elemField.setFieldName("errorUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ErrorUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExecutionUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("friendlyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FriendlyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("providerType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProviderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registrationHandlerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegistrationHandlerId"));
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

/**
 * LoginHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class LoginHistory  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String apiType;

    private java.lang.String apiVersion;

    private java.lang.String application;

    private java.lang.String browser;

    private java.lang.String clientVersion;

    private java.util.Calendar loginTime;

    private java.lang.String loginType;

    private java.lang.String loginUrl;

    private java.lang.String platform;

    private java.lang.String sourceIp;

    private java.lang.String status;

    private java.lang.String userId;

    public LoginHistory() {
    }

    public LoginHistory(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String apiType,
           java.lang.String apiVersion,
           java.lang.String application,
           java.lang.String browser,
           java.lang.String clientVersion,
           java.util.Calendar loginTime,
           java.lang.String loginType,
           java.lang.String loginUrl,
           java.lang.String platform,
           java.lang.String sourceIp,
           java.lang.String status,
           java.lang.String userId) {
        super(
            fieldsToNull,
            id);
        this.apiType = apiType;
        this.apiVersion = apiVersion;
        this.application = application;
        this.browser = browser;
        this.clientVersion = clientVersion;
        this.loginTime = loginTime;
        this.loginType = loginType;
        this.loginUrl = loginUrl;
        this.platform = platform;
        this.sourceIp = sourceIp;
        this.status = status;
        this.userId = userId;
    }


    /**
     * Gets the apiType value for this LoginHistory.
     * 
     * @return apiType
     */
    public java.lang.String getApiType() {
        return apiType;
    }


    /**
     * Sets the apiType value for this LoginHistory.
     * 
     * @param apiType
     */
    public void setApiType(java.lang.String apiType) {
        this.apiType = apiType;
    }


    /**
     * Gets the apiVersion value for this LoginHistory.
     * 
     * @return apiVersion
     */
    public java.lang.String getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this LoginHistory.
     * 
     * @param apiVersion
     */
    public void setApiVersion(java.lang.String apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the application value for this LoginHistory.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this LoginHistory.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the browser value for this LoginHistory.
     * 
     * @return browser
     */
    public java.lang.String getBrowser() {
        return browser;
    }


    /**
     * Sets the browser value for this LoginHistory.
     * 
     * @param browser
     */
    public void setBrowser(java.lang.String browser) {
        this.browser = browser;
    }


    /**
     * Gets the clientVersion value for this LoginHistory.
     * 
     * @return clientVersion
     */
    public java.lang.String getClientVersion() {
        return clientVersion;
    }


    /**
     * Sets the clientVersion value for this LoginHistory.
     * 
     * @param clientVersion
     */
    public void setClientVersion(java.lang.String clientVersion) {
        this.clientVersion = clientVersion;
    }


    /**
     * Gets the loginTime value for this LoginHistory.
     * 
     * @return loginTime
     */
    public java.util.Calendar getLoginTime() {
        return loginTime;
    }


    /**
     * Sets the loginTime value for this LoginHistory.
     * 
     * @param loginTime
     */
    public void setLoginTime(java.util.Calendar loginTime) {
        this.loginTime = loginTime;
    }


    /**
     * Gets the loginType value for this LoginHistory.
     * 
     * @return loginType
     */
    public java.lang.String getLoginType() {
        return loginType;
    }


    /**
     * Sets the loginType value for this LoginHistory.
     * 
     * @param loginType
     */
    public void setLoginType(java.lang.String loginType) {
        this.loginType = loginType;
    }


    /**
     * Gets the loginUrl value for this LoginHistory.
     * 
     * @return loginUrl
     */
    public java.lang.String getLoginUrl() {
        return loginUrl;
    }


    /**
     * Sets the loginUrl value for this LoginHistory.
     * 
     * @param loginUrl
     */
    public void setLoginUrl(java.lang.String loginUrl) {
        this.loginUrl = loginUrl;
    }


    /**
     * Gets the platform value for this LoginHistory.
     * 
     * @return platform
     */
    public java.lang.String getPlatform() {
        return platform;
    }


    /**
     * Sets the platform value for this LoginHistory.
     * 
     * @param platform
     */
    public void setPlatform(java.lang.String platform) {
        this.platform = platform;
    }


    /**
     * Gets the sourceIp value for this LoginHistory.
     * 
     * @return sourceIp
     */
    public java.lang.String getSourceIp() {
        return sourceIp;
    }


    /**
     * Sets the sourceIp value for this LoginHistory.
     * 
     * @param sourceIp
     */
    public void setSourceIp(java.lang.String sourceIp) {
        this.sourceIp = sourceIp;
    }


    /**
     * Gets the status value for this LoginHistory.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LoginHistory.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the userId value for this LoginHistory.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this LoginHistory.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoginHistory)) return false;
        LoginHistory other = (LoginHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.apiType==null && other.getApiType()==null) || 
             (this.apiType!=null &&
              this.apiType.equals(other.getApiType()))) &&
            ((this.apiVersion==null && other.getApiVersion()==null) || 
             (this.apiVersion!=null &&
              this.apiVersion.equals(other.getApiVersion()))) &&
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.browser==null && other.getBrowser()==null) || 
             (this.browser!=null &&
              this.browser.equals(other.getBrowser()))) &&
            ((this.clientVersion==null && other.getClientVersion()==null) || 
             (this.clientVersion!=null &&
              this.clientVersion.equals(other.getClientVersion()))) &&
            ((this.loginTime==null && other.getLoginTime()==null) || 
             (this.loginTime!=null &&
              this.loginTime.equals(other.getLoginTime()))) &&
            ((this.loginType==null && other.getLoginType()==null) || 
             (this.loginType!=null &&
              this.loginType.equals(other.getLoginType()))) &&
            ((this.loginUrl==null && other.getLoginUrl()==null) || 
             (this.loginUrl!=null &&
              this.loginUrl.equals(other.getLoginUrl()))) &&
            ((this.platform==null && other.getPlatform()==null) || 
             (this.platform!=null &&
              this.platform.equals(other.getPlatform()))) &&
            ((this.sourceIp==null && other.getSourceIp()==null) || 
             (this.sourceIp!=null &&
              this.sourceIp.equals(other.getSourceIp()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getApiType() != null) {
            _hashCode += getApiType().hashCode();
        }
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getBrowser() != null) {
            _hashCode += getBrowser().hashCode();
        }
        if (getClientVersion() != null) {
            _hashCode += getClientVersion().hashCode();
        }
        if (getLoginTime() != null) {
            _hashCode += getLoginTime().hashCode();
        }
        if (getLoginType() != null) {
            _hashCode += getLoginType().hashCode();
        }
        if (getLoginUrl() != null) {
            _hashCode += getLoginUrl().hashCode();
        }
        if (getPlatform() != null) {
            _hashCode += getPlatform().hashCode();
        }
        if (getSourceIp() != null) {
            _hashCode += getSourceIp().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoginHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApiType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApiVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Browser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ClientVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platform");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Platform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SourceIp"));
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
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserId"));
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

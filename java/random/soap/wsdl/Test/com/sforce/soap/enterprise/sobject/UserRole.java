/**
 * UserRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class UserRole  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String caseAccessForAccountOwner;

    private java.lang.String contactAccessForAccountOwner;

    private java.lang.String developerName;

    private java.lang.String forecastUserId;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Boolean mayForecastManagerShare;

    private java.lang.String name;

    private java.lang.String opportunityAccessForAccountOwner;

    private java.lang.String parentRoleId;

    private java.lang.String portalAccountId;

    private java.lang.String portalAccountOwnerId;

    private java.lang.String portalRole;

    private java.lang.String portalType;

    private java.lang.String rollupDescription;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult users;

    public UserRole() {
    }

    public UserRole(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String caseAccessForAccountOwner,
           java.lang.String contactAccessForAccountOwner,
           java.lang.String developerName,
           java.lang.String forecastUserId,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Boolean mayForecastManagerShare,
           java.lang.String name,
           java.lang.String opportunityAccessForAccountOwner,
           java.lang.String parentRoleId,
           java.lang.String portalAccountId,
           java.lang.String portalAccountOwnerId,
           java.lang.String portalRole,
           java.lang.String portalType,
           java.lang.String rollupDescription,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult users) {
        super(
            fieldsToNull,
            id);
        this.caseAccessForAccountOwner = caseAccessForAccountOwner;
        this.contactAccessForAccountOwner = contactAccessForAccountOwner;
        this.developerName = developerName;
        this.forecastUserId = forecastUserId;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.mayForecastManagerShare = mayForecastManagerShare;
        this.name = name;
        this.opportunityAccessForAccountOwner = opportunityAccessForAccountOwner;
        this.parentRoleId = parentRoleId;
        this.portalAccountId = portalAccountId;
        this.portalAccountOwnerId = portalAccountOwnerId;
        this.portalRole = portalRole;
        this.portalType = portalType;
        this.rollupDescription = rollupDescription;
        this.systemModstamp = systemModstamp;
        this.users = users;
    }


    /**
     * Gets the caseAccessForAccountOwner value for this UserRole.
     * 
     * @return caseAccessForAccountOwner
     */
    public java.lang.String getCaseAccessForAccountOwner() {
        return caseAccessForAccountOwner;
    }


    /**
     * Sets the caseAccessForAccountOwner value for this UserRole.
     * 
     * @param caseAccessForAccountOwner
     */
    public void setCaseAccessForAccountOwner(java.lang.String caseAccessForAccountOwner) {
        this.caseAccessForAccountOwner = caseAccessForAccountOwner;
    }


    /**
     * Gets the contactAccessForAccountOwner value for this UserRole.
     * 
     * @return contactAccessForAccountOwner
     */
    public java.lang.String getContactAccessForAccountOwner() {
        return contactAccessForAccountOwner;
    }


    /**
     * Sets the contactAccessForAccountOwner value for this UserRole.
     * 
     * @param contactAccessForAccountOwner
     */
    public void setContactAccessForAccountOwner(java.lang.String contactAccessForAccountOwner) {
        this.contactAccessForAccountOwner = contactAccessForAccountOwner;
    }


    /**
     * Gets the developerName value for this UserRole.
     * 
     * @return developerName
     */
    public java.lang.String getDeveloperName() {
        return developerName;
    }


    /**
     * Sets the developerName value for this UserRole.
     * 
     * @param developerName
     */
    public void setDeveloperName(java.lang.String developerName) {
        this.developerName = developerName;
    }


    /**
     * Gets the forecastUserId value for this UserRole.
     * 
     * @return forecastUserId
     */
    public java.lang.String getForecastUserId() {
        return forecastUserId;
    }


    /**
     * Sets the forecastUserId value for this UserRole.
     * 
     * @param forecastUserId
     */
    public void setForecastUserId(java.lang.String forecastUserId) {
        this.forecastUserId = forecastUserId;
    }


    /**
     * Gets the lastModifiedBy value for this UserRole.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this UserRole.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this UserRole.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this UserRole.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this UserRole.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this UserRole.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the mayForecastManagerShare value for this UserRole.
     * 
     * @return mayForecastManagerShare
     */
    public java.lang.Boolean getMayForecastManagerShare() {
        return mayForecastManagerShare;
    }


    /**
     * Sets the mayForecastManagerShare value for this UserRole.
     * 
     * @param mayForecastManagerShare
     */
    public void setMayForecastManagerShare(java.lang.Boolean mayForecastManagerShare) {
        this.mayForecastManagerShare = mayForecastManagerShare;
    }


    /**
     * Gets the name value for this UserRole.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UserRole.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the opportunityAccessForAccountOwner value for this UserRole.
     * 
     * @return opportunityAccessForAccountOwner
     */
    public java.lang.String getOpportunityAccessForAccountOwner() {
        return opportunityAccessForAccountOwner;
    }


    /**
     * Sets the opportunityAccessForAccountOwner value for this UserRole.
     * 
     * @param opportunityAccessForAccountOwner
     */
    public void setOpportunityAccessForAccountOwner(java.lang.String opportunityAccessForAccountOwner) {
        this.opportunityAccessForAccountOwner = opportunityAccessForAccountOwner;
    }


    /**
     * Gets the parentRoleId value for this UserRole.
     * 
     * @return parentRoleId
     */
    public java.lang.String getParentRoleId() {
        return parentRoleId;
    }


    /**
     * Sets the parentRoleId value for this UserRole.
     * 
     * @param parentRoleId
     */
    public void setParentRoleId(java.lang.String parentRoleId) {
        this.parentRoleId = parentRoleId;
    }


    /**
     * Gets the portalAccountId value for this UserRole.
     * 
     * @return portalAccountId
     */
    public java.lang.String getPortalAccountId() {
        return portalAccountId;
    }


    /**
     * Sets the portalAccountId value for this UserRole.
     * 
     * @param portalAccountId
     */
    public void setPortalAccountId(java.lang.String portalAccountId) {
        this.portalAccountId = portalAccountId;
    }


    /**
     * Gets the portalAccountOwnerId value for this UserRole.
     * 
     * @return portalAccountOwnerId
     */
    public java.lang.String getPortalAccountOwnerId() {
        return portalAccountOwnerId;
    }


    /**
     * Sets the portalAccountOwnerId value for this UserRole.
     * 
     * @param portalAccountOwnerId
     */
    public void setPortalAccountOwnerId(java.lang.String portalAccountOwnerId) {
        this.portalAccountOwnerId = portalAccountOwnerId;
    }


    /**
     * Gets the portalRole value for this UserRole.
     * 
     * @return portalRole
     */
    public java.lang.String getPortalRole() {
        return portalRole;
    }


    /**
     * Sets the portalRole value for this UserRole.
     * 
     * @param portalRole
     */
    public void setPortalRole(java.lang.String portalRole) {
        this.portalRole = portalRole;
    }


    /**
     * Gets the portalType value for this UserRole.
     * 
     * @return portalType
     */
    public java.lang.String getPortalType() {
        return portalType;
    }


    /**
     * Sets the portalType value for this UserRole.
     * 
     * @param portalType
     */
    public void setPortalType(java.lang.String portalType) {
        this.portalType = portalType;
    }


    /**
     * Gets the rollupDescription value for this UserRole.
     * 
     * @return rollupDescription
     */
    public java.lang.String getRollupDescription() {
        return rollupDescription;
    }


    /**
     * Sets the rollupDescription value for this UserRole.
     * 
     * @param rollupDescription
     */
    public void setRollupDescription(java.lang.String rollupDescription) {
        this.rollupDescription = rollupDescription;
    }


    /**
     * Gets the systemModstamp value for this UserRole.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this UserRole.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the users value for this UserRole.
     * 
     * @return users
     */
    public com.sforce.soap.enterprise.QueryResult getUsers() {
        return users;
    }


    /**
     * Sets the users value for this UserRole.
     * 
     * @param users
     */
    public void setUsers(com.sforce.soap.enterprise.QueryResult users) {
        this.users = users;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserRole)) return false;
        UserRole other = (UserRole) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.caseAccessForAccountOwner==null && other.getCaseAccessForAccountOwner()==null) || 
             (this.caseAccessForAccountOwner!=null &&
              this.caseAccessForAccountOwner.equals(other.getCaseAccessForAccountOwner()))) &&
            ((this.contactAccessForAccountOwner==null && other.getContactAccessForAccountOwner()==null) || 
             (this.contactAccessForAccountOwner!=null &&
              this.contactAccessForAccountOwner.equals(other.getContactAccessForAccountOwner()))) &&
            ((this.developerName==null && other.getDeveloperName()==null) || 
             (this.developerName!=null &&
              this.developerName.equals(other.getDeveloperName()))) &&
            ((this.forecastUserId==null && other.getForecastUserId()==null) || 
             (this.forecastUserId!=null &&
              this.forecastUserId.equals(other.getForecastUserId()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.mayForecastManagerShare==null && other.getMayForecastManagerShare()==null) || 
             (this.mayForecastManagerShare!=null &&
              this.mayForecastManagerShare.equals(other.getMayForecastManagerShare()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.opportunityAccessForAccountOwner==null && other.getOpportunityAccessForAccountOwner()==null) || 
             (this.opportunityAccessForAccountOwner!=null &&
              this.opportunityAccessForAccountOwner.equals(other.getOpportunityAccessForAccountOwner()))) &&
            ((this.parentRoleId==null && other.getParentRoleId()==null) || 
             (this.parentRoleId!=null &&
              this.parentRoleId.equals(other.getParentRoleId()))) &&
            ((this.portalAccountId==null && other.getPortalAccountId()==null) || 
             (this.portalAccountId!=null &&
              this.portalAccountId.equals(other.getPortalAccountId()))) &&
            ((this.portalAccountOwnerId==null && other.getPortalAccountOwnerId()==null) || 
             (this.portalAccountOwnerId!=null &&
              this.portalAccountOwnerId.equals(other.getPortalAccountOwnerId()))) &&
            ((this.portalRole==null && other.getPortalRole()==null) || 
             (this.portalRole!=null &&
              this.portalRole.equals(other.getPortalRole()))) &&
            ((this.portalType==null && other.getPortalType()==null) || 
             (this.portalType!=null &&
              this.portalType.equals(other.getPortalType()))) &&
            ((this.rollupDescription==null && other.getRollupDescription()==null) || 
             (this.rollupDescription!=null &&
              this.rollupDescription.equals(other.getRollupDescription()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              this.users.equals(other.getUsers())));
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
        if (getCaseAccessForAccountOwner() != null) {
            _hashCode += getCaseAccessForAccountOwner().hashCode();
        }
        if (getContactAccessForAccountOwner() != null) {
            _hashCode += getContactAccessForAccountOwner().hashCode();
        }
        if (getDeveloperName() != null) {
            _hashCode += getDeveloperName().hashCode();
        }
        if (getForecastUserId() != null) {
            _hashCode += getForecastUserId().hashCode();
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
        if (getMayForecastManagerShare() != null) {
            _hashCode += getMayForecastManagerShare().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOpportunityAccessForAccountOwner() != null) {
            _hashCode += getOpportunityAccessForAccountOwner().hashCode();
        }
        if (getParentRoleId() != null) {
            _hashCode += getParentRoleId().hashCode();
        }
        if (getPortalAccountId() != null) {
            _hashCode += getPortalAccountId().hashCode();
        }
        if (getPortalAccountOwnerId() != null) {
            _hashCode += getPortalAccountOwnerId().hashCode();
        }
        if (getPortalRole() != null) {
            _hashCode += getPortalRole().hashCode();
        }
        if (getPortalType() != null) {
            _hashCode += getPortalType().hashCode();
        }
        if (getRollupDescription() != null) {
            _hashCode += getRollupDescription().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUsers() != null) {
            _hashCode += getUsers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseAccessForAccountOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseAccessForAccountOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactAccessForAccountOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactAccessForAccountOwner"));
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
        elemField.setFieldName("forecastUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastUserId"));
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
        elemField.setFieldName("mayForecastManagerShare");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MayForecastManagerShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("opportunityAccessForAccountOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityAccessForAccountOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PortalAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalAccountOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PortalAccountOwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PortalRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PortalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rollupDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RollupDescription"));
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
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Users"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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

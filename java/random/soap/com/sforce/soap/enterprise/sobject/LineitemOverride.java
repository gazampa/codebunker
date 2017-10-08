/**
 * LineitemOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class LineitemOverride  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Boolean amountInherited;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean forecastCategoryInherited;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String opportunityId;

    private java.lang.String opportunityLineItemId;

    private java.lang.Double overrideAmount;

    private java.lang.String overrideForecastCategory;

    private java.lang.Double overrideQuantity;

    private java.lang.Double overrideUnitPrice;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private java.lang.Boolean quantityInherited;

    private java.util.Calendar systemModstamp;

    private java.lang.Boolean unitPriceInherited;

    public LineitemOverride() {
    }

    public LineitemOverride(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Boolean amountInherited,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean forecastCategoryInherited,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String opportunityId,
           java.lang.String opportunityLineItemId,
           java.lang.Double overrideAmount,
           java.lang.String overrideForecastCategory,
           java.lang.Double overrideQuantity,
           java.lang.Double overrideUnitPrice,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           java.lang.Boolean quantityInherited,
           java.util.Calendar systemModstamp,
           java.lang.Boolean unitPriceInherited) {
        super(
            fieldsToNull,
            id);
        this.amountInherited = amountInherited;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.forecastCategoryInherited = forecastCategoryInherited;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.opportunityId = opportunityId;
        this.opportunityLineItemId = opportunityLineItemId;
        this.overrideAmount = overrideAmount;
        this.overrideForecastCategory = overrideForecastCategory;
        this.overrideQuantity = overrideQuantity;
        this.overrideUnitPrice = overrideUnitPrice;
        this.owner = owner;
        this.ownerId = ownerId;
        this.quantityInherited = quantityInherited;
        this.systemModstamp = systemModstamp;
        this.unitPriceInherited = unitPriceInherited;
    }


    /**
     * Gets the amountInherited value for this LineitemOverride.
     * 
     * @return amountInherited
     */
    public java.lang.Boolean getAmountInherited() {
        return amountInherited;
    }


    /**
     * Sets the amountInherited value for this LineitemOverride.
     * 
     * @param amountInherited
     */
    public void setAmountInherited(java.lang.Boolean amountInherited) {
        this.amountInherited = amountInherited;
    }


    /**
     * Gets the createdBy value for this LineitemOverride.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this LineitemOverride.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this LineitemOverride.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this LineitemOverride.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this LineitemOverride.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this LineitemOverride.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the forecastCategoryInherited value for this LineitemOverride.
     * 
     * @return forecastCategoryInherited
     */
    public java.lang.Boolean getForecastCategoryInherited() {
        return forecastCategoryInherited;
    }


    /**
     * Sets the forecastCategoryInherited value for this LineitemOverride.
     * 
     * @param forecastCategoryInherited
     */
    public void setForecastCategoryInherited(java.lang.Boolean forecastCategoryInherited) {
        this.forecastCategoryInherited = forecastCategoryInherited;
    }


    /**
     * Gets the isDeleted value for this LineitemOverride.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this LineitemOverride.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this LineitemOverride.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this LineitemOverride.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this LineitemOverride.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this LineitemOverride.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this LineitemOverride.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this LineitemOverride.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the opportunityId value for this LineitemOverride.
     * 
     * @return opportunityId
     */
    public java.lang.String getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this LineitemOverride.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.String opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the opportunityLineItemId value for this LineitemOverride.
     * 
     * @return opportunityLineItemId
     */
    public java.lang.String getOpportunityLineItemId() {
        return opportunityLineItemId;
    }


    /**
     * Sets the opportunityLineItemId value for this LineitemOverride.
     * 
     * @param opportunityLineItemId
     */
    public void setOpportunityLineItemId(java.lang.String opportunityLineItemId) {
        this.opportunityLineItemId = opportunityLineItemId;
    }


    /**
     * Gets the overrideAmount value for this LineitemOverride.
     * 
     * @return overrideAmount
     */
    public java.lang.Double getOverrideAmount() {
        return overrideAmount;
    }


    /**
     * Sets the overrideAmount value for this LineitemOverride.
     * 
     * @param overrideAmount
     */
    public void setOverrideAmount(java.lang.Double overrideAmount) {
        this.overrideAmount = overrideAmount;
    }


    /**
     * Gets the overrideForecastCategory value for this LineitemOverride.
     * 
     * @return overrideForecastCategory
     */
    public java.lang.String getOverrideForecastCategory() {
        return overrideForecastCategory;
    }


    /**
     * Sets the overrideForecastCategory value for this LineitemOverride.
     * 
     * @param overrideForecastCategory
     */
    public void setOverrideForecastCategory(java.lang.String overrideForecastCategory) {
        this.overrideForecastCategory = overrideForecastCategory;
    }


    /**
     * Gets the overrideQuantity value for this LineitemOverride.
     * 
     * @return overrideQuantity
     */
    public java.lang.Double getOverrideQuantity() {
        return overrideQuantity;
    }


    /**
     * Sets the overrideQuantity value for this LineitemOverride.
     * 
     * @param overrideQuantity
     */
    public void setOverrideQuantity(java.lang.Double overrideQuantity) {
        this.overrideQuantity = overrideQuantity;
    }


    /**
     * Gets the overrideUnitPrice value for this LineitemOverride.
     * 
     * @return overrideUnitPrice
     */
    public java.lang.Double getOverrideUnitPrice() {
        return overrideUnitPrice;
    }


    /**
     * Sets the overrideUnitPrice value for this LineitemOverride.
     * 
     * @param overrideUnitPrice
     */
    public void setOverrideUnitPrice(java.lang.Double overrideUnitPrice) {
        this.overrideUnitPrice = overrideUnitPrice;
    }


    /**
     * Gets the owner value for this LineitemOverride.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this LineitemOverride.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this LineitemOverride.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this LineitemOverride.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the quantityInherited value for this LineitemOverride.
     * 
     * @return quantityInherited
     */
    public java.lang.Boolean getQuantityInherited() {
        return quantityInherited;
    }


    /**
     * Sets the quantityInherited value for this LineitemOverride.
     * 
     * @param quantityInherited
     */
    public void setQuantityInherited(java.lang.Boolean quantityInherited) {
        this.quantityInherited = quantityInherited;
    }


    /**
     * Gets the systemModstamp value for this LineitemOverride.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this LineitemOverride.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the unitPriceInherited value for this LineitemOverride.
     * 
     * @return unitPriceInherited
     */
    public java.lang.Boolean getUnitPriceInherited() {
        return unitPriceInherited;
    }


    /**
     * Sets the unitPriceInherited value for this LineitemOverride.
     * 
     * @param unitPriceInherited
     */
    public void setUnitPriceInherited(java.lang.Boolean unitPriceInherited) {
        this.unitPriceInherited = unitPriceInherited;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineitemOverride)) return false;
        LineitemOverride other = (LineitemOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amountInherited==null && other.getAmountInherited()==null) || 
             (this.amountInherited!=null &&
              this.amountInherited.equals(other.getAmountInherited()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.forecastCategoryInherited==null && other.getForecastCategoryInherited()==null) || 
             (this.forecastCategoryInherited!=null &&
              this.forecastCategoryInherited.equals(other.getForecastCategoryInherited()))) &&
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
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.opportunityLineItemId==null && other.getOpportunityLineItemId()==null) || 
             (this.opportunityLineItemId!=null &&
              this.opportunityLineItemId.equals(other.getOpportunityLineItemId()))) &&
            ((this.overrideAmount==null && other.getOverrideAmount()==null) || 
             (this.overrideAmount!=null &&
              this.overrideAmount.equals(other.getOverrideAmount()))) &&
            ((this.overrideForecastCategory==null && other.getOverrideForecastCategory()==null) || 
             (this.overrideForecastCategory!=null &&
              this.overrideForecastCategory.equals(other.getOverrideForecastCategory()))) &&
            ((this.overrideQuantity==null && other.getOverrideQuantity()==null) || 
             (this.overrideQuantity!=null &&
              this.overrideQuantity.equals(other.getOverrideQuantity()))) &&
            ((this.overrideUnitPrice==null && other.getOverrideUnitPrice()==null) || 
             (this.overrideUnitPrice!=null &&
              this.overrideUnitPrice.equals(other.getOverrideUnitPrice()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.quantityInherited==null && other.getQuantityInherited()==null) || 
             (this.quantityInherited!=null &&
              this.quantityInherited.equals(other.getQuantityInherited()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.unitPriceInherited==null && other.getUnitPriceInherited()==null) || 
             (this.unitPriceInherited!=null &&
              this.unitPriceInherited.equals(other.getUnitPriceInherited())));
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
        if (getAmountInherited() != null) {
            _hashCode += getAmountInherited().hashCode();
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
        if (getForecastCategoryInherited() != null) {
            _hashCode += getForecastCategoryInherited().hashCode();
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
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getOpportunityLineItemId() != null) {
            _hashCode += getOpportunityLineItemId().hashCode();
        }
        if (getOverrideAmount() != null) {
            _hashCode += getOverrideAmount().hashCode();
        }
        if (getOverrideForecastCategory() != null) {
            _hashCode += getOverrideForecastCategory().hashCode();
        }
        if (getOverrideQuantity() != null) {
            _hashCode += getOverrideQuantity().hashCode();
        }
        if (getOverrideUnitPrice() != null) {
            _hashCode += getOverrideUnitPrice().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getQuantityInherited() != null) {
            _hashCode += getQuantityInherited().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUnitPriceInherited() != null) {
            _hashCode += getUnitPriceInherited().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineitemOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LineitemOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AmountInherited"));
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
        elemField.setFieldName("forecastCategoryInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastCategoryInherited"));
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
        elemField.setFieldName("opportunityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityLineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideForecastCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideForecastCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OverrideUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("quantityInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuantityInherited"));
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
        elemField.setFieldName("unitPriceInherited");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnitPriceInherited"));
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

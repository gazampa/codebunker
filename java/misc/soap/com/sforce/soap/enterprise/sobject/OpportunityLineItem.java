/**
 * OpportunityLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class OpportunityLineItem  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double base_User_Amount__c;

    private java.lang.Boolean CP_Case__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Double listPrice;

    private java.lang.Boolean new_CP_Opp__c;

    private com.sforce.soap.enterprise.sobject.Opportunity opportunity;

    private java.lang.String opportunityId;

    private com.sforce.soap.enterprise.sobject.PricebookEntry pricebookEntry;

    private java.lang.String pricebookEntryId;

    private java.lang.Double quantity;

    private java.util.Date serviceDate;

    private java.lang.Integer sortOrder;

    private java.util.Calendar systemModstamp;

    private java.lang.Boolean temp_Instance__c;

    private java.lang.Double totalPrice;

    private java.lang.Double total_Users__c;

    private java.lang.Double unitPrice;

    private java.lang.Boolean users__c;

    public OpportunityLineItem() {
    }

    public OpportunityLineItem(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double base_User_Amount__c,
           java.lang.Boolean CP_Case__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Double listPrice,
           java.lang.Boolean new_CP_Opp__c,
           com.sforce.soap.enterprise.sobject.Opportunity opportunity,
           java.lang.String opportunityId,
           com.sforce.soap.enterprise.sobject.PricebookEntry pricebookEntry,
           java.lang.String pricebookEntryId,
           java.lang.Double quantity,
           java.util.Date serviceDate,
           java.lang.Integer sortOrder,
           java.util.Calendar systemModstamp,
           java.lang.Boolean temp_Instance__c,
           java.lang.Double totalPrice,
           java.lang.Double total_Users__c,
           java.lang.Double unitPrice,
           java.lang.Boolean users__c) {
        super(
            fieldsToNull,
            id);
        this.base_User_Amount__c = base_User_Amount__c;
        this.CP_Case__c = CP_Case__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description = description;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.listPrice = listPrice;
        this.new_CP_Opp__c = new_CP_Opp__c;
        this.opportunity = opportunity;
        this.opportunityId = opportunityId;
        this.pricebookEntry = pricebookEntry;
        this.pricebookEntryId = pricebookEntryId;
        this.quantity = quantity;
        this.serviceDate = serviceDate;
        this.sortOrder = sortOrder;
        this.systemModstamp = systemModstamp;
        this.temp_Instance__c = temp_Instance__c;
        this.totalPrice = totalPrice;
        this.total_Users__c = total_Users__c;
        this.unitPrice = unitPrice;
        this.users__c = users__c;
    }


    /**
     * Gets the base_User_Amount__c value for this OpportunityLineItem.
     * 
     * @return base_User_Amount__c
     */
    public java.lang.Double getBase_User_Amount__c() {
        return base_User_Amount__c;
    }


    /**
     * Sets the base_User_Amount__c value for this OpportunityLineItem.
     * 
     * @param base_User_Amount__c
     */
    public void setBase_User_Amount__c(java.lang.Double base_User_Amount__c) {
        this.base_User_Amount__c = base_User_Amount__c;
    }


    /**
     * Gets the CP_Case__c value for this OpportunityLineItem.
     * 
     * @return CP_Case__c
     */
    public java.lang.Boolean getCP_Case__c() {
        return CP_Case__c;
    }


    /**
     * Sets the CP_Case__c value for this OpportunityLineItem.
     * 
     * @param CP_Case__c
     */
    public void setCP_Case__c(java.lang.Boolean CP_Case__c) {
        this.CP_Case__c = CP_Case__c;
    }


    /**
     * Gets the createdBy value for this OpportunityLineItem.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this OpportunityLineItem.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this OpportunityLineItem.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this OpportunityLineItem.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this OpportunityLineItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this OpportunityLineItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description value for this OpportunityLineItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OpportunityLineItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isDeleted value for this OpportunityLineItem.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this OpportunityLineItem.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this OpportunityLineItem.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this OpportunityLineItem.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this OpportunityLineItem.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this OpportunityLineItem.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this OpportunityLineItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this OpportunityLineItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the listPrice value for this OpportunityLineItem.
     * 
     * @return listPrice
     */
    public java.lang.Double getListPrice() {
        return listPrice;
    }


    /**
     * Sets the listPrice value for this OpportunityLineItem.
     * 
     * @param listPrice
     */
    public void setListPrice(java.lang.Double listPrice) {
        this.listPrice = listPrice;
    }


    /**
     * Gets the new_CP_Opp__c value for this OpportunityLineItem.
     * 
     * @return new_CP_Opp__c
     */
    public java.lang.Boolean getNew_CP_Opp__c() {
        return new_CP_Opp__c;
    }


    /**
     * Sets the new_CP_Opp__c value for this OpportunityLineItem.
     * 
     * @param new_CP_Opp__c
     */
    public void setNew_CP_Opp__c(java.lang.Boolean new_CP_Opp__c) {
        this.new_CP_Opp__c = new_CP_Opp__c;
    }


    /**
     * Gets the opportunity value for this OpportunityLineItem.
     * 
     * @return opportunity
     */
    public com.sforce.soap.enterprise.sobject.Opportunity getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this OpportunityLineItem.
     * 
     * @param opportunity
     */
    public void setOpportunity(com.sforce.soap.enterprise.sobject.Opportunity opportunity) {
        this.opportunity = opportunity;
    }


    /**
     * Gets the opportunityId value for this OpportunityLineItem.
     * 
     * @return opportunityId
     */
    public java.lang.String getOpportunityId() {
        return opportunityId;
    }


    /**
     * Sets the opportunityId value for this OpportunityLineItem.
     * 
     * @param opportunityId
     */
    public void setOpportunityId(java.lang.String opportunityId) {
        this.opportunityId = opportunityId;
    }


    /**
     * Gets the pricebookEntry value for this OpportunityLineItem.
     * 
     * @return pricebookEntry
     */
    public com.sforce.soap.enterprise.sobject.PricebookEntry getPricebookEntry() {
        return pricebookEntry;
    }


    /**
     * Sets the pricebookEntry value for this OpportunityLineItem.
     * 
     * @param pricebookEntry
     */
    public void setPricebookEntry(com.sforce.soap.enterprise.sobject.PricebookEntry pricebookEntry) {
        this.pricebookEntry = pricebookEntry;
    }


    /**
     * Gets the pricebookEntryId value for this OpportunityLineItem.
     * 
     * @return pricebookEntryId
     */
    public java.lang.String getPricebookEntryId() {
        return pricebookEntryId;
    }


    /**
     * Sets the pricebookEntryId value for this OpportunityLineItem.
     * 
     * @param pricebookEntryId
     */
    public void setPricebookEntryId(java.lang.String pricebookEntryId) {
        this.pricebookEntryId = pricebookEntryId;
    }


    /**
     * Gets the quantity value for this OpportunityLineItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OpportunityLineItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the serviceDate value for this OpportunityLineItem.
     * 
     * @return serviceDate
     */
    public java.util.Date getServiceDate() {
        return serviceDate;
    }


    /**
     * Sets the serviceDate value for this OpportunityLineItem.
     * 
     * @param serviceDate
     */
    public void setServiceDate(java.util.Date serviceDate) {
        this.serviceDate = serviceDate;
    }


    /**
     * Gets the sortOrder value for this OpportunityLineItem.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this OpportunityLineItem.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the systemModstamp value for this OpportunityLineItem.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this OpportunityLineItem.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the temp_Instance__c value for this OpportunityLineItem.
     * 
     * @return temp_Instance__c
     */
    public java.lang.Boolean getTemp_Instance__c() {
        return temp_Instance__c;
    }


    /**
     * Sets the temp_Instance__c value for this OpportunityLineItem.
     * 
     * @param temp_Instance__c
     */
    public void setTemp_Instance__c(java.lang.Boolean temp_Instance__c) {
        this.temp_Instance__c = temp_Instance__c;
    }


    /**
     * Gets the totalPrice value for this OpportunityLineItem.
     * 
     * @return totalPrice
     */
    public java.lang.Double getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this OpportunityLineItem.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.Double totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the total_Users__c value for this OpportunityLineItem.
     * 
     * @return total_Users__c
     */
    public java.lang.Double getTotal_Users__c() {
        return total_Users__c;
    }


    /**
     * Sets the total_Users__c value for this OpportunityLineItem.
     * 
     * @param total_Users__c
     */
    public void setTotal_Users__c(java.lang.Double total_Users__c) {
        this.total_Users__c = total_Users__c;
    }


    /**
     * Gets the unitPrice value for this OpportunityLineItem.
     * 
     * @return unitPrice
     */
    public java.lang.Double getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this OpportunityLineItem.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the users__c value for this OpportunityLineItem.
     * 
     * @return users__c
     */
    public java.lang.Boolean getUsers__c() {
        return users__c;
    }


    /**
     * Sets the users__c value for this OpportunityLineItem.
     * 
     * @param users__c
     */
    public void setUsers__c(java.lang.Boolean users__c) {
        this.users__c = users__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunityLineItem)) return false;
        OpportunityLineItem other = (OpportunityLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.base_User_Amount__c==null && other.getBase_User_Amount__c()==null) || 
             (this.base_User_Amount__c!=null &&
              this.base_User_Amount__c.equals(other.getBase_User_Amount__c()))) &&
            ((this.CP_Case__c==null && other.getCP_Case__c()==null) || 
             (this.CP_Case__c!=null &&
              this.CP_Case__c.equals(other.getCP_Case__c()))) &&
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
            ((this.listPrice==null && other.getListPrice()==null) || 
             (this.listPrice!=null &&
              this.listPrice.equals(other.getListPrice()))) &&
            ((this.new_CP_Opp__c==null && other.getNew_CP_Opp__c()==null) || 
             (this.new_CP_Opp__c!=null &&
              this.new_CP_Opp__c.equals(other.getNew_CP_Opp__c()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              this.opportunity.equals(other.getOpportunity()))) &&
            ((this.opportunityId==null && other.getOpportunityId()==null) || 
             (this.opportunityId!=null &&
              this.opportunityId.equals(other.getOpportunityId()))) &&
            ((this.pricebookEntry==null && other.getPricebookEntry()==null) || 
             (this.pricebookEntry!=null &&
              this.pricebookEntry.equals(other.getPricebookEntry()))) &&
            ((this.pricebookEntryId==null && other.getPricebookEntryId()==null) || 
             (this.pricebookEntryId!=null &&
              this.pricebookEntryId.equals(other.getPricebookEntryId()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.serviceDate==null && other.getServiceDate()==null) || 
             (this.serviceDate!=null &&
              this.serviceDate.equals(other.getServiceDate()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.temp_Instance__c==null && other.getTemp_Instance__c()==null) || 
             (this.temp_Instance__c!=null &&
              this.temp_Instance__c.equals(other.getTemp_Instance__c()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.total_Users__c==null && other.getTotal_Users__c()==null) || 
             (this.total_Users__c!=null &&
              this.total_Users__c.equals(other.getTotal_Users__c()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.users__c==null && other.getUsers__c()==null) || 
             (this.users__c!=null &&
              this.users__c.equals(other.getUsers__c())));
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
        if (getBase_User_Amount__c() != null) {
            _hashCode += getBase_User_Amount__c().hashCode();
        }
        if (getCP_Case__c() != null) {
            _hashCode += getCP_Case__c().hashCode();
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
        if (getListPrice() != null) {
            _hashCode += getListPrice().hashCode();
        }
        if (getNew_CP_Opp__c() != null) {
            _hashCode += getNew_CP_Opp__c().hashCode();
        }
        if (getOpportunity() != null) {
            _hashCode += getOpportunity().hashCode();
        }
        if (getOpportunityId() != null) {
            _hashCode += getOpportunityId().hashCode();
        }
        if (getPricebookEntry() != null) {
            _hashCode += getPricebookEntry().hashCode();
        }
        if (getPricebookEntryId() != null) {
            _hashCode += getPricebookEntryId().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getServiceDate() != null) {
            _hashCode += getServiceDate().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTemp_Instance__c() != null) {
            _hashCode += getTemp_Instance__c().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getTotal_Users__c() != null) {
            _hashCode += getTotal_Users__c().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getUsers__c() != null) {
            _hashCode += getUsers__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpportunityLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("base_User_Amount__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Base_User_Amount__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CP_Case__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CP_Case__c"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
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
        elemField.setFieldName("listPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("new_CP_Opp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "New_CP_Opp__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity"));
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
        elemField.setFieldName("pricebookEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PricebookEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PricebookEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricebookEntryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PricebookEntryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("temp_Instance__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Temp_Instance__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_Users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_Users__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Users__c"));
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

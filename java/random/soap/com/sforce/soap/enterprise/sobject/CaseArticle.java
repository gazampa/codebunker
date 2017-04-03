/**
 * CaseArticle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class CaseArticle  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String articleLanguage;

    private java.lang.Integer articleVersionNumber;

    private com.sforce.soap.enterprise.sobject._case _case;

    private java.lang.String caseId;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isSharedByEmail;

    private com.sforce.soap.enterprise.sobject.Knowledgebase__ka knowledgeArticle;

    private java.lang.String knowledgeArticleId;

    private java.util.Calendar systemModstamp;

    public CaseArticle() {
    }

    public CaseArticle(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String articleLanguage,
           java.lang.Integer articleVersionNumber,
           com.sforce.soap.enterprise.sobject._case _case,
           java.lang.String caseId,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isSharedByEmail,
           com.sforce.soap.enterprise.sobject.Knowledgebase__ka knowledgeArticle,
           java.lang.String knowledgeArticleId,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.articleLanguage = articleLanguage;
        this.articleVersionNumber = articleVersionNumber;
        this._case = _case;
        this.caseId = caseId;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.isSharedByEmail = isSharedByEmail;
        this.knowledgeArticle = knowledgeArticle;
        this.knowledgeArticleId = knowledgeArticleId;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the articleLanguage value for this CaseArticle.
     * 
     * @return articleLanguage
     */
    public java.lang.String getArticleLanguage() {
        return articleLanguage;
    }


    /**
     * Sets the articleLanguage value for this CaseArticle.
     * 
     * @param articleLanguage
     */
    public void setArticleLanguage(java.lang.String articleLanguage) {
        this.articleLanguage = articleLanguage;
    }


    /**
     * Gets the articleVersionNumber value for this CaseArticle.
     * 
     * @return articleVersionNumber
     */
    public java.lang.Integer getArticleVersionNumber() {
        return articleVersionNumber;
    }


    /**
     * Sets the articleVersionNumber value for this CaseArticle.
     * 
     * @param articleVersionNumber
     */
    public void setArticleVersionNumber(java.lang.Integer articleVersionNumber) {
        this.articleVersionNumber = articleVersionNumber;
    }


    /**
     * Gets the _case value for this CaseArticle.
     * 
     * @return _case
     */
    public com.sforce.soap.enterprise.sobject._case get_case() {
        return _case;
    }


    /**
     * Sets the _case value for this CaseArticle.
     * 
     * @param _case
     */
    public void set_case(com.sforce.soap.enterprise.sobject._case _case) {
        this._case = _case;
    }


    /**
     * Gets the caseId value for this CaseArticle.
     * 
     * @return caseId
     */
    public java.lang.String getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this CaseArticle.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.String caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the createdBy value for this CaseArticle.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CaseArticle.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this CaseArticle.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this CaseArticle.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this CaseArticle.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CaseArticle.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the isDeleted value for this CaseArticle.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this CaseArticle.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isSharedByEmail value for this CaseArticle.
     * 
     * @return isSharedByEmail
     */
    public java.lang.Boolean getIsSharedByEmail() {
        return isSharedByEmail;
    }


    /**
     * Sets the isSharedByEmail value for this CaseArticle.
     * 
     * @param isSharedByEmail
     */
    public void setIsSharedByEmail(java.lang.Boolean isSharedByEmail) {
        this.isSharedByEmail = isSharedByEmail;
    }


    /**
     * Gets the knowledgeArticle value for this CaseArticle.
     * 
     * @return knowledgeArticle
     */
    public com.sforce.soap.enterprise.sobject.Knowledgebase__ka getKnowledgeArticle() {
        return knowledgeArticle;
    }


    /**
     * Sets the knowledgeArticle value for this CaseArticle.
     * 
     * @param knowledgeArticle
     */
    public void setKnowledgeArticle(com.sforce.soap.enterprise.sobject.Knowledgebase__ka knowledgeArticle) {
        this.knowledgeArticle = knowledgeArticle;
    }


    /**
     * Gets the knowledgeArticleId value for this CaseArticle.
     * 
     * @return knowledgeArticleId
     */
    public java.lang.String getKnowledgeArticleId() {
        return knowledgeArticleId;
    }


    /**
     * Sets the knowledgeArticleId value for this CaseArticle.
     * 
     * @param knowledgeArticleId
     */
    public void setKnowledgeArticleId(java.lang.String knowledgeArticleId) {
        this.knowledgeArticleId = knowledgeArticleId;
    }


    /**
     * Gets the systemModstamp value for this CaseArticle.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this CaseArticle.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaseArticle)) return false;
        CaseArticle other = (CaseArticle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.articleLanguage==null && other.getArticleLanguage()==null) || 
             (this.articleLanguage!=null &&
              this.articleLanguage.equals(other.getArticleLanguage()))) &&
            ((this.articleVersionNumber==null && other.getArticleVersionNumber()==null) || 
             (this.articleVersionNumber!=null &&
              this.articleVersionNumber.equals(other.getArticleVersionNumber()))) &&
            ((this._case==null && other.get_case()==null) || 
             (this._case!=null &&
              this._case.equals(other.get_case()))) &&
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isSharedByEmail==null && other.getIsSharedByEmail()==null) || 
             (this.isSharedByEmail!=null &&
              this.isSharedByEmail.equals(other.getIsSharedByEmail()))) &&
            ((this.knowledgeArticle==null && other.getKnowledgeArticle()==null) || 
             (this.knowledgeArticle!=null &&
              this.knowledgeArticle.equals(other.getKnowledgeArticle()))) &&
            ((this.knowledgeArticleId==null && other.getKnowledgeArticleId()==null) || 
             (this.knowledgeArticleId!=null &&
              this.knowledgeArticleId.equals(other.getKnowledgeArticleId()))) &&
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
        if (getArticleLanguage() != null) {
            _hashCode += getArticleLanguage().hashCode();
        }
        if (getArticleVersionNumber() != null) {
            _hashCode += getArticleVersionNumber().hashCode();
        }
        if (get_case() != null) {
            _hashCode += get_case().hashCode();
        }
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
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
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsSharedByEmail() != null) {
            _hashCode += getIsSharedByEmail().hashCode();
        }
        if (getKnowledgeArticle() != null) {
            _hashCode += getKnowledgeArticle().hashCode();
        }
        if (getKnowledgeArticleId() != null) {
            _hashCode += getKnowledgeArticleId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseArticle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseArticle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ArticleLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleVersionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ArticleVersionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_case");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseId"));
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
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSharedByEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsSharedByEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("knowledgeArticle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KnowledgeArticle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Knowledgebase__ka"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("knowledgeArticleId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KnowledgeArticleId"));
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

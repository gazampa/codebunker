/**
 * Advice_kCura_Recipes__VoteStat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Advice_kCura_Recipes__VoteStat  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String channel;

    private java.lang.Boolean isDeleted;

    private java.lang.Double normalizedScore;

    private com.sforce.soap.enterprise.sobject.Advice_kCura_Recipes__ka parent;

    private java.lang.String parentId;

    public Advice_kCura_Recipes__VoteStat() {
    }

    public Advice_kCura_Recipes__VoteStat(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String channel,
           java.lang.Boolean isDeleted,
           java.lang.Double normalizedScore,
           com.sforce.soap.enterprise.sobject.Advice_kCura_Recipes__ka parent,
           java.lang.String parentId) {
        super(
            fieldsToNull,
            id);
        this.channel = channel;
        this.isDeleted = isDeleted;
        this.normalizedScore = normalizedScore;
        this.parent = parent;
        this.parentId = parentId;
    }


    /**
     * Gets the channel value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the isDeleted value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the normalizedScore value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @return normalizedScore
     */
    public java.lang.Double getNormalizedScore() {
        return normalizedScore;
    }


    /**
     * Sets the normalizedScore value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @param normalizedScore
     */
    public void setNormalizedScore(java.lang.Double normalizedScore) {
        this.normalizedScore = normalizedScore;
    }


    /**
     * Gets the parent value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject.Advice_kCura_Recipes__ka getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject.Advice_kCura_Recipes__ka parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Advice_kCura_Recipes__VoteStat.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Advice_kCura_Recipes__VoteStat)) return false;
        Advice_kCura_Recipes__VoteStat other = (Advice_kCura_Recipes__VoteStat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.normalizedScore==null && other.getNormalizedScore()==null) || 
             (this.normalizedScore!=null &&
              this.normalizedScore.equals(other.getNormalizedScore()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId())));
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
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getNormalizedScore() != null) {
            _hashCode += getNormalizedScore().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Advice_kCura_Recipes__VoteStat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "advice_kCura_Recipes__VoteStat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel"));
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
        elemField.setFieldName("normalizedScore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NormalizedScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "advice_kCura_Recipes__ka"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentId"));
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

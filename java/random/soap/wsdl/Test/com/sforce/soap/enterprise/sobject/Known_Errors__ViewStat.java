/**
 * Known_Errors__ViewStat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Known_Errors__ViewStat  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String channel;

    private java.lang.Boolean isDeleted;

    private java.lang.Double normalizedScore;

    private com.sforce.soap.enterprise.sobject.Known_Errors__ka parent;

    private java.lang.String parentId;

    private java.lang.Integer viewCount;

    public Known_Errors__ViewStat() {
    }

    public Known_Errors__ViewStat(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String channel,
           java.lang.Boolean isDeleted,
           java.lang.Double normalizedScore,
           com.sforce.soap.enterprise.sobject.Known_Errors__ka parent,
           java.lang.String parentId,
           java.lang.Integer viewCount) {
        super(
            fieldsToNull,
            id);
        this.channel = channel;
        this.isDeleted = isDeleted;
        this.normalizedScore = normalizedScore;
        this.parent = parent;
        this.parentId = parentId;
        this.viewCount = viewCount;
    }


    /**
     * Gets the channel value for this Known_Errors__ViewStat.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Known_Errors__ViewStat.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the isDeleted value for this Known_Errors__ViewStat.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Known_Errors__ViewStat.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the normalizedScore value for this Known_Errors__ViewStat.
     * 
     * @return normalizedScore
     */
    public java.lang.Double getNormalizedScore() {
        return normalizedScore;
    }


    /**
     * Sets the normalizedScore value for this Known_Errors__ViewStat.
     * 
     * @param normalizedScore
     */
    public void setNormalizedScore(java.lang.Double normalizedScore) {
        this.normalizedScore = normalizedScore;
    }


    /**
     * Gets the parent value for this Known_Errors__ViewStat.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject.Known_Errors__ka getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Known_Errors__ViewStat.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject.Known_Errors__ka parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this Known_Errors__ViewStat.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Known_Errors__ViewStat.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the viewCount value for this Known_Errors__ViewStat.
     * 
     * @return viewCount
     */
    public java.lang.Integer getViewCount() {
        return viewCount;
    }


    /**
     * Sets the viewCount value for this Known_Errors__ViewStat.
     * 
     * @param viewCount
     */
    public void setViewCount(java.lang.Integer viewCount) {
        this.viewCount = viewCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Known_Errors__ViewStat)) return false;
        Known_Errors__ViewStat other = (Known_Errors__ViewStat) obj;
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
              this.parentId.equals(other.getParentId()))) &&
            ((this.viewCount==null && other.getViewCount()==null) || 
             (this.viewCount!=null &&
              this.viewCount.equals(other.getViewCount())));
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
        if (getViewCount() != null) {
            _hashCode += getViewCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Known_Errors__ViewStat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__ViewStat"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__ka"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ViewCount"));
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

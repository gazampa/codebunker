/**
 * ChatterActivity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ChatterActivity  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Integer commentCount;

    private java.lang.Integer commentReceivedCount;

    private java.lang.Integer influenceRawRank;

    private java.lang.Integer likeReceivedCount;

    private java.lang.String parentId;

    private java.lang.Integer postCount;

    private java.util.Calendar systemModstamp;

    public ChatterActivity() {
    }

    public ChatterActivity(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Integer commentCount,
           java.lang.Integer commentReceivedCount,
           java.lang.Integer influenceRawRank,
           java.lang.Integer likeReceivedCount,
           java.lang.String parentId,
           java.lang.Integer postCount,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.commentCount = commentCount;
        this.commentReceivedCount = commentReceivedCount;
        this.influenceRawRank = influenceRawRank;
        this.likeReceivedCount = likeReceivedCount;
        this.parentId = parentId;
        this.postCount = postCount;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the commentCount value for this ChatterActivity.
     * 
     * @return commentCount
     */
    public java.lang.Integer getCommentCount() {
        return commentCount;
    }


    /**
     * Sets the commentCount value for this ChatterActivity.
     * 
     * @param commentCount
     */
    public void setCommentCount(java.lang.Integer commentCount) {
        this.commentCount = commentCount;
    }


    /**
     * Gets the commentReceivedCount value for this ChatterActivity.
     * 
     * @return commentReceivedCount
     */
    public java.lang.Integer getCommentReceivedCount() {
        return commentReceivedCount;
    }


    /**
     * Sets the commentReceivedCount value for this ChatterActivity.
     * 
     * @param commentReceivedCount
     */
    public void setCommentReceivedCount(java.lang.Integer commentReceivedCount) {
        this.commentReceivedCount = commentReceivedCount;
    }


    /**
     * Gets the influenceRawRank value for this ChatterActivity.
     * 
     * @return influenceRawRank
     */
    public java.lang.Integer getInfluenceRawRank() {
        return influenceRawRank;
    }


    /**
     * Sets the influenceRawRank value for this ChatterActivity.
     * 
     * @param influenceRawRank
     */
    public void setInfluenceRawRank(java.lang.Integer influenceRawRank) {
        this.influenceRawRank = influenceRawRank;
    }


    /**
     * Gets the likeReceivedCount value for this ChatterActivity.
     * 
     * @return likeReceivedCount
     */
    public java.lang.Integer getLikeReceivedCount() {
        return likeReceivedCount;
    }


    /**
     * Sets the likeReceivedCount value for this ChatterActivity.
     * 
     * @param likeReceivedCount
     */
    public void setLikeReceivedCount(java.lang.Integer likeReceivedCount) {
        this.likeReceivedCount = likeReceivedCount;
    }


    /**
     * Gets the parentId value for this ChatterActivity.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this ChatterActivity.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the postCount value for this ChatterActivity.
     * 
     * @return postCount
     */
    public java.lang.Integer getPostCount() {
        return postCount;
    }


    /**
     * Sets the postCount value for this ChatterActivity.
     * 
     * @param postCount
     */
    public void setPostCount(java.lang.Integer postCount) {
        this.postCount = postCount;
    }


    /**
     * Gets the systemModstamp value for this ChatterActivity.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ChatterActivity.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChatterActivity)) return false;
        ChatterActivity other = (ChatterActivity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.commentCount==null && other.getCommentCount()==null) || 
             (this.commentCount!=null &&
              this.commentCount.equals(other.getCommentCount()))) &&
            ((this.commentReceivedCount==null && other.getCommentReceivedCount()==null) || 
             (this.commentReceivedCount!=null &&
              this.commentReceivedCount.equals(other.getCommentReceivedCount()))) &&
            ((this.influenceRawRank==null && other.getInfluenceRawRank()==null) || 
             (this.influenceRawRank!=null &&
              this.influenceRawRank.equals(other.getInfluenceRawRank()))) &&
            ((this.likeReceivedCount==null && other.getLikeReceivedCount()==null) || 
             (this.likeReceivedCount!=null &&
              this.likeReceivedCount.equals(other.getLikeReceivedCount()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.postCount==null && other.getPostCount()==null) || 
             (this.postCount!=null &&
              this.postCount.equals(other.getPostCount()))) &&
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
        if (getCommentCount() != null) {
            _hashCode += getCommentCount().hashCode();
        }
        if (getCommentReceivedCount() != null) {
            _hashCode += getCommentReceivedCount().hashCode();
        }
        if (getInfluenceRawRank() != null) {
            _hashCode += getInfluenceRawRank().hashCode();
        }
        if (getLikeReceivedCount() != null) {
            _hashCode += getLikeReceivedCount().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getPostCount() != null) {
            _hashCode += getPostCount().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChatterActivity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChatterActivity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentReceivedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommentReceivedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("influenceRawRank");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InfluenceRawRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("likeReceivedCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LikeReceivedCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("postCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PostCount"));
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

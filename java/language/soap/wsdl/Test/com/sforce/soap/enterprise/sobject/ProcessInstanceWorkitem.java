/**
 * ProcessInstanceWorkitem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ProcessInstanceWorkitem  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Name actor;

    private java.lang.String actorId;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.Name originalActor;

    private java.lang.String originalActorId;

    private com.sforce.soap.enterprise.sobject.ProcessInstance processInstance;

    private java.lang.String processInstanceId;

    private java.util.Calendar systemModstamp;

    public ProcessInstanceWorkitem() {
    }

    public ProcessInstanceWorkitem(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Name actor,
           java.lang.String actorId,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.Name originalActor,
           java.lang.String originalActorId,
           com.sforce.soap.enterprise.sobject.ProcessInstance processInstance,
           java.lang.String processInstanceId,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.actor = actor;
        this.actorId = actorId;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.isDeleted = isDeleted;
        this.originalActor = originalActor;
        this.originalActorId = originalActorId;
        this.processInstance = processInstance;
        this.processInstanceId = processInstanceId;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the actor value for this ProcessInstanceWorkitem.
     * 
     * @return actor
     */
    public com.sforce.soap.enterprise.sobject.Name getActor() {
        return actor;
    }


    /**
     * Sets the actor value for this ProcessInstanceWorkitem.
     * 
     * @param actor
     */
    public void setActor(com.sforce.soap.enterprise.sobject.Name actor) {
        this.actor = actor;
    }


    /**
     * Gets the actorId value for this ProcessInstanceWorkitem.
     * 
     * @return actorId
     */
    public java.lang.String getActorId() {
        return actorId;
    }


    /**
     * Sets the actorId value for this ProcessInstanceWorkitem.
     * 
     * @param actorId
     */
    public void setActorId(java.lang.String actorId) {
        this.actorId = actorId;
    }


    /**
     * Gets the createdBy value for this ProcessInstanceWorkitem.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ProcessInstanceWorkitem.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ProcessInstanceWorkitem.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ProcessInstanceWorkitem.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ProcessInstanceWorkitem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProcessInstanceWorkitem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the isDeleted value for this ProcessInstanceWorkitem.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ProcessInstanceWorkitem.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the originalActor value for this ProcessInstanceWorkitem.
     * 
     * @return originalActor
     */
    public com.sforce.soap.enterprise.sobject.Name getOriginalActor() {
        return originalActor;
    }


    /**
     * Sets the originalActor value for this ProcessInstanceWorkitem.
     * 
     * @param originalActor
     */
    public void setOriginalActor(com.sforce.soap.enterprise.sobject.Name originalActor) {
        this.originalActor = originalActor;
    }


    /**
     * Gets the originalActorId value for this ProcessInstanceWorkitem.
     * 
     * @return originalActorId
     */
    public java.lang.String getOriginalActorId() {
        return originalActorId;
    }


    /**
     * Sets the originalActorId value for this ProcessInstanceWorkitem.
     * 
     * @param originalActorId
     */
    public void setOriginalActorId(java.lang.String originalActorId) {
        this.originalActorId = originalActorId;
    }


    /**
     * Gets the processInstance value for this ProcessInstanceWorkitem.
     * 
     * @return processInstance
     */
    public com.sforce.soap.enterprise.sobject.ProcessInstance getProcessInstance() {
        return processInstance;
    }


    /**
     * Sets the processInstance value for this ProcessInstanceWorkitem.
     * 
     * @param processInstance
     */
    public void setProcessInstance(com.sforce.soap.enterprise.sobject.ProcessInstance processInstance) {
        this.processInstance = processInstance;
    }


    /**
     * Gets the processInstanceId value for this ProcessInstanceWorkitem.
     * 
     * @return processInstanceId
     */
    public java.lang.String getProcessInstanceId() {
        return processInstanceId;
    }


    /**
     * Sets the processInstanceId value for this ProcessInstanceWorkitem.
     * 
     * @param processInstanceId
     */
    public void setProcessInstanceId(java.lang.String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }


    /**
     * Gets the systemModstamp value for this ProcessInstanceWorkitem.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ProcessInstanceWorkitem.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessInstanceWorkitem)) return false;
        ProcessInstanceWorkitem other = (ProcessInstanceWorkitem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actor==null && other.getActor()==null) || 
             (this.actor!=null &&
              this.actor.equals(other.getActor()))) &&
            ((this.actorId==null && other.getActorId()==null) || 
             (this.actorId!=null &&
              this.actorId.equals(other.getActorId()))) &&
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
            ((this.originalActor==null && other.getOriginalActor()==null) || 
             (this.originalActor!=null &&
              this.originalActor.equals(other.getOriginalActor()))) &&
            ((this.originalActorId==null && other.getOriginalActorId()==null) || 
             (this.originalActorId!=null &&
              this.originalActorId.equals(other.getOriginalActorId()))) &&
            ((this.processInstance==null && other.getProcessInstance()==null) || 
             (this.processInstance!=null &&
              this.processInstance.equals(other.getProcessInstance()))) &&
            ((this.processInstanceId==null && other.getProcessInstanceId()==null) || 
             (this.processInstanceId!=null &&
              this.processInstanceId.equals(other.getProcessInstanceId()))) &&
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
        if (getActor() != null) {
            _hashCode += getActor().hashCode();
        }
        if (getActorId() != null) {
            _hashCode += getActorId().hashCode();
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
        if (getOriginalActor() != null) {
            _hashCode += getOriginalActor().hashCode();
        }
        if (getOriginalActorId() != null) {
            _hashCode += getOriginalActorId().hashCode();
        }
        if (getProcessInstance() != null) {
            _hashCode += getProcessInstance().hashCode();
        }
        if (getProcessInstanceId() != null) {
            _hashCode += getProcessInstanceId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessInstanceWorkitem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceWorkitem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActorId"));
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
        elemField.setFieldName("originalActor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OriginalActor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalActorId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OriginalActorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceId"));
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

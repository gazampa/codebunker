/**
 * Script_Exchange_Entry__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Script_Exchange_Entry__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String application__c;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String author__c;

    private java.lang.String category__c;

    private java.lang.Double comments__c;

    private java.lang.String compatibility__c;

    private java.lang.String compatible_Versions__c;

    private java.lang.Boolean compatible_With_All_Versions__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String description__c;

    private java.lang.Double downloads__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Boolean isDeleted;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar last_Comment_Date__c;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult script_Exchange_Comments__r;

    private com.sforce.soap.enterprise.QueryResult script_Exchange_Downloads__r;

    private java.util.Calendar systemModstamp;

    private java.lang.String title__c;

    public Script_Exchange_Entry__c() {
    }

    public Script_Exchange_Entry__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String application__c,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String author__c,
           java.lang.String category__c,
           java.lang.Double comments__c,
           java.lang.String compatibility__c,
           java.lang.String compatible_Versions__c,
           java.lang.Boolean compatible_With_All_Versions__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String description__c,
           java.lang.Double downloads__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Boolean isDeleted,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar last_Comment_Date__c,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult script_Exchange_Comments__r,
           com.sforce.soap.enterprise.QueryResult script_Exchange_Downloads__r,
           java.util.Calendar systemModstamp,
           java.lang.String title__c) {
        super(
            fieldsToNull,
            id);
        this.application__c = application__c;
        this.attachments = attachments;
        this.author__c = author__c;
        this.category__c = category__c;
        this.comments__c = comments__c;
        this.compatibility__c = compatibility__c;
        this.compatible_Versions__c = compatible_Versions__c;
        this.compatible_With_All_Versions__c = compatible_With_All_Versions__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.description__c = description__c;
        this.downloads__c = downloads__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.histories = histories;
        this.isDeleted = isDeleted;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.last_Comment_Date__c = last_Comment_Date__c;
        this.name = name;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.owner = owner;
        this.ownerId = ownerId;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.script_Exchange_Comments__r = script_Exchange_Comments__r;
        this.script_Exchange_Downloads__r = script_Exchange_Downloads__r;
        this.systemModstamp = systemModstamp;
        this.title__c = title__c;
    }


    /**
     * Gets the application__c value for this Script_Exchange_Entry__c.
     * 
     * @return application__c
     */
    public java.lang.String getApplication__c() {
        return application__c;
    }


    /**
     * Sets the application__c value for this Script_Exchange_Entry__c.
     * 
     * @param application__c
     */
    public void setApplication__c(java.lang.String application__c) {
        this.application__c = application__c;
    }


    /**
     * Gets the attachments value for this Script_Exchange_Entry__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Script_Exchange_Entry__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the author__c value for this Script_Exchange_Entry__c.
     * 
     * @return author__c
     */
    public java.lang.String getAuthor__c() {
        return author__c;
    }


    /**
     * Sets the author__c value for this Script_Exchange_Entry__c.
     * 
     * @param author__c
     */
    public void setAuthor__c(java.lang.String author__c) {
        this.author__c = author__c;
    }


    /**
     * Gets the category__c value for this Script_Exchange_Entry__c.
     * 
     * @return category__c
     */
    public java.lang.String getCategory__c() {
        return category__c;
    }


    /**
     * Sets the category__c value for this Script_Exchange_Entry__c.
     * 
     * @param category__c
     */
    public void setCategory__c(java.lang.String category__c) {
        this.category__c = category__c;
    }


    /**
     * Gets the comments__c value for this Script_Exchange_Entry__c.
     * 
     * @return comments__c
     */
    public java.lang.Double getComments__c() {
        return comments__c;
    }


    /**
     * Sets the comments__c value for this Script_Exchange_Entry__c.
     * 
     * @param comments__c
     */
    public void setComments__c(java.lang.Double comments__c) {
        this.comments__c = comments__c;
    }


    /**
     * Gets the compatibility__c value for this Script_Exchange_Entry__c.
     * 
     * @return compatibility__c
     */
    public java.lang.String getCompatibility__c() {
        return compatibility__c;
    }


    /**
     * Sets the compatibility__c value for this Script_Exchange_Entry__c.
     * 
     * @param compatibility__c
     */
    public void setCompatibility__c(java.lang.String compatibility__c) {
        this.compatibility__c = compatibility__c;
    }


    /**
     * Gets the compatible_Versions__c value for this Script_Exchange_Entry__c.
     * 
     * @return compatible_Versions__c
     */
    public java.lang.String getCompatible_Versions__c() {
        return compatible_Versions__c;
    }


    /**
     * Sets the compatible_Versions__c value for this Script_Exchange_Entry__c.
     * 
     * @param compatible_Versions__c
     */
    public void setCompatible_Versions__c(java.lang.String compatible_Versions__c) {
        this.compatible_Versions__c = compatible_Versions__c;
    }


    /**
     * Gets the compatible_With_All_Versions__c value for this Script_Exchange_Entry__c.
     * 
     * @return compatible_With_All_Versions__c
     */
    public java.lang.Boolean getCompatible_With_All_Versions__c() {
        return compatible_With_All_Versions__c;
    }


    /**
     * Sets the compatible_With_All_Versions__c value for this Script_Exchange_Entry__c.
     * 
     * @param compatible_With_All_Versions__c
     */
    public void setCompatible_With_All_Versions__c(java.lang.Boolean compatible_With_All_Versions__c) {
        this.compatible_With_All_Versions__c = compatible_With_All_Versions__c;
    }


    /**
     * Gets the createdBy value for this Script_Exchange_Entry__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Script_Exchange_Entry__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Script_Exchange_Entry__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Script_Exchange_Entry__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Script_Exchange_Entry__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Script_Exchange_Entry__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the description__c value for this Script_Exchange_Entry__c.
     * 
     * @return description__c
     */
    public java.lang.String getDescription__c() {
        return description__c;
    }


    /**
     * Sets the description__c value for this Script_Exchange_Entry__c.
     * 
     * @param description__c
     */
    public void setDescription__c(java.lang.String description__c) {
        this.description__c = description__c;
    }


    /**
     * Gets the downloads__c value for this Script_Exchange_Entry__c.
     * 
     * @return downloads__c
     */
    public java.lang.Double getDownloads__c() {
        return downloads__c;
    }


    /**
     * Sets the downloads__c value for this Script_Exchange_Entry__c.
     * 
     * @param downloads__c
     */
    public void setDownloads__c(java.lang.Double downloads__c) {
        this.downloads__c = downloads__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Script_Exchange_Entry__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Script_Exchange_Entry__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the histories value for this Script_Exchange_Entry__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Script_Exchange_Entry__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the isDeleted value for this Script_Exchange_Entry__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Script_Exchange_Entry__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the lastModifiedBy value for this Script_Exchange_Entry__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Script_Exchange_Entry__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Script_Exchange_Entry__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Script_Exchange_Entry__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Script_Exchange_Entry__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Script_Exchange_Entry__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the last_Comment_Date__c value for this Script_Exchange_Entry__c.
     * 
     * @return last_Comment_Date__c
     */
    public java.util.Calendar getLast_Comment_Date__c() {
        return last_Comment_Date__c;
    }


    /**
     * Sets the last_Comment_Date__c value for this Script_Exchange_Entry__c.
     * 
     * @param last_Comment_Date__c
     */
    public void setLast_Comment_Date__c(java.util.Calendar last_Comment_Date__c) {
        this.last_Comment_Date__c = last_Comment_Date__c;
    }


    /**
     * Gets the name value for this Script_Exchange_Entry__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Script_Exchange_Entry__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this Script_Exchange_Entry__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Script_Exchange_Entry__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Script_Exchange_Entry__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Script_Exchange_Entry__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the owner value for this Script_Exchange_Entry__c.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Script_Exchange_Entry__c.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Script_Exchange_Entry__c.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Script_Exchange_Entry__c.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the processInstances value for this Script_Exchange_Entry__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Script_Exchange_Entry__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Script_Exchange_Entry__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Script_Exchange_Entry__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the script_Exchange_Comments__r value for this Script_Exchange_Entry__c.
     * 
     * @return script_Exchange_Comments__r
     */
    public com.sforce.soap.enterprise.QueryResult getScript_Exchange_Comments__r() {
        return script_Exchange_Comments__r;
    }


    /**
     * Sets the script_Exchange_Comments__r value for this Script_Exchange_Entry__c.
     * 
     * @param script_Exchange_Comments__r
     */
    public void setScript_Exchange_Comments__r(com.sforce.soap.enterprise.QueryResult script_Exchange_Comments__r) {
        this.script_Exchange_Comments__r = script_Exchange_Comments__r;
    }


    /**
     * Gets the script_Exchange_Downloads__r value for this Script_Exchange_Entry__c.
     * 
     * @return script_Exchange_Downloads__r
     */
    public com.sforce.soap.enterprise.QueryResult getScript_Exchange_Downloads__r() {
        return script_Exchange_Downloads__r;
    }


    /**
     * Sets the script_Exchange_Downloads__r value for this Script_Exchange_Entry__c.
     * 
     * @param script_Exchange_Downloads__r
     */
    public void setScript_Exchange_Downloads__r(com.sforce.soap.enterprise.QueryResult script_Exchange_Downloads__r) {
        this.script_Exchange_Downloads__r = script_Exchange_Downloads__r;
    }


    /**
     * Gets the systemModstamp value for this Script_Exchange_Entry__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Script_Exchange_Entry__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title__c value for this Script_Exchange_Entry__c.
     * 
     * @return title__c
     */
    public java.lang.String getTitle__c() {
        return title__c;
    }


    /**
     * Sets the title__c value for this Script_Exchange_Entry__c.
     * 
     * @param title__c
     */
    public void setTitle__c(java.lang.String title__c) {
        this.title__c = title__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Script_Exchange_Entry__c)) return false;
        Script_Exchange_Entry__c other = (Script_Exchange_Entry__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.application__c==null && other.getApplication__c()==null) || 
             (this.application__c!=null &&
              this.application__c.equals(other.getApplication__c()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.author__c==null && other.getAuthor__c()==null) || 
             (this.author__c!=null &&
              this.author__c.equals(other.getAuthor__c()))) &&
            ((this.category__c==null && other.getCategory__c()==null) || 
             (this.category__c!=null &&
              this.category__c.equals(other.getCategory__c()))) &&
            ((this.comments__c==null && other.getComments__c()==null) || 
             (this.comments__c!=null &&
              this.comments__c.equals(other.getComments__c()))) &&
            ((this.compatibility__c==null && other.getCompatibility__c()==null) || 
             (this.compatibility__c!=null &&
              this.compatibility__c.equals(other.getCompatibility__c()))) &&
            ((this.compatible_Versions__c==null && other.getCompatible_Versions__c()==null) || 
             (this.compatible_Versions__c!=null &&
              this.compatible_Versions__c.equals(other.getCompatible_Versions__c()))) &&
            ((this.compatible_With_All_Versions__c==null && other.getCompatible_With_All_Versions__c()==null) || 
             (this.compatible_With_All_Versions__c!=null &&
              this.compatible_With_All_Versions__c.equals(other.getCompatible_With_All_Versions__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.description__c==null && other.getDescription__c()==null) || 
             (this.description__c!=null &&
              this.description__c.equals(other.getDescription__c()))) &&
            ((this.downloads__c==null && other.getDownloads__c()==null) || 
             (this.downloads__c!=null &&
              this.downloads__c.equals(other.getDownloads__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
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
            ((this.last_Comment_Date__c==null && other.getLast_Comment_Date__c()==null) || 
             (this.last_Comment_Date__c!=null &&
              this.last_Comment_Date__c.equals(other.getLast_Comment_Date__c()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.script_Exchange_Comments__r==null && other.getScript_Exchange_Comments__r()==null) || 
             (this.script_Exchange_Comments__r!=null &&
              this.script_Exchange_Comments__r.equals(other.getScript_Exchange_Comments__r()))) &&
            ((this.script_Exchange_Downloads__r==null && other.getScript_Exchange_Downloads__r()==null) || 
             (this.script_Exchange_Downloads__r!=null &&
              this.script_Exchange_Downloads__r.equals(other.getScript_Exchange_Downloads__r()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title__c==null && other.getTitle__c()==null) || 
             (this.title__c!=null &&
              this.title__c.equals(other.getTitle__c())));
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
        if (getApplication__c() != null) {
            _hashCode += getApplication__c().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAuthor__c() != null) {
            _hashCode += getAuthor__c().hashCode();
        }
        if (getCategory__c() != null) {
            _hashCode += getCategory__c().hashCode();
        }
        if (getComments__c() != null) {
            _hashCode += getComments__c().hashCode();
        }
        if (getCompatibility__c() != null) {
            _hashCode += getCompatibility__c().hashCode();
        }
        if (getCompatible_Versions__c() != null) {
            _hashCode += getCompatible_Versions__c().hashCode();
        }
        if (getCompatible_With_All_Versions__c() != null) {
            _hashCode += getCompatible_With_All_Versions__c().hashCode();
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
        if (getDescription__c() != null) {
            _hashCode += getDescription__c().hashCode();
        }
        if (getDownloads__c() != null) {
            _hashCode += getDownloads__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
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
        if (getLast_Comment_Date__c() != null) {
            _hashCode += getLast_Comment_Date__c().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getScript_Exchange_Comments__r() != null) {
            _hashCode += getScript_Exchange_Comments__r().hashCode();
        }
        if (getScript_Exchange_Downloads__r() != null) {
            _hashCode += getScript_Exchange_Downloads__r().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle__c() != null) {
            _hashCode += getTitle__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Script_Exchange_Entry__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Script_Exchange_Entry__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("author__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Author__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Comments__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatibility__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Compatibility__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatible_Versions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Compatible_Versions__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compatible_With_All_Versions__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Compatible_With_All_Versions__c"));
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
        elemField.setFieldName("description__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downloads__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Downloads__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("last_Comment_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Last_Comment_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
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
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("script_Exchange_Comments__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Script_Exchange_Comments__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("script_Exchange_Downloads__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Script_Exchange_Downloads__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("title__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title__c"));
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

/**
 * Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

public interface Soap extends java.rmi.Remote {

    /**
     * Login to the Salesforce.com SOAP Api
     */
    public com.sforce.soap.enterprise.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.LoginFault;

    /**
     * Describe an sObject
     */
    public com.sforce.soap.enterprise.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe a number sObjects
     */
    public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the Global state
     */
    public com.sforce.soap.enterprise.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe all the data category groups available for a given
     * set of types
     */
    public com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the data category group structures for a given set
     * of pair of types and data category group name
     */
    public com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[] pairs, boolean topCategoriesOnly) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of an sObject
     */
    public com.sforce.soap.enterprise.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of the SoftPhone
     */
    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe a list of objects representing the order and scope
     * of objects on a users search result page
     */
    public com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[] describeSearchScopeOrder() throws java.rmi.RemoteException;

    /**
     * Describe the tabs that appear on a users page
     */
    public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Create a set of new sObjects
     */
    public com.sforce.soap.enterprise.SaveResult[] create(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Update a set of sObjects
     */
    public com.sforce.soap.enterprise.SaveResult[] update(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Update or insert a set of sObjects based on object id
     */
    public com.sforce.soap.enterprise.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Merge and update a set of sObjects based on object id
     */
    public com.sforce.soap.enterprise.MergeResult[] merge(com.sforce.soap.enterprise.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Delete a set of sObjects
     */
    public com.sforce.soap.enterprise.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Undelete a set of sObjects
     */
    public com.sforce.soap.enterprise.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Empty a set of sObjects from the recycle bin
     */
    public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get a set of sObjects
     */
    public com.sforce.soap.enterprise.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Submit an entity to a workflow process or process a workitem
     */
    public com.sforce.soap.enterprise.ProcessResult[] process(com.sforce.soap.enterprise.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * convert a set of leads
     */
    public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(com.sforce.soap.enterprise.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Logout the current user, invalidating the current session.
     */
    public void logout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Logs out and invalidates session ids
     */
    public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for deleted sObjects
     */
    public com.sforce.soap.enterprise.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for updated sObjects
     */
    public com.sforce.soap.enterprise.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Create a Query Cursor
     */
    public com.sforce.soap.enterprise.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault;

    /**
     * Create a Query Cursor, including deleted sObjects
     */
    public com.sforce.soap.enterprise.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault;

    /**
     * Gets the next batch of sObjects from a query
     */
    public com.sforce.soap.enterprise.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault;

    /**
     * Search for sObjects
     */
    public com.sforce.soap.enterprise.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedSearchFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Gets server timestamp
     */
    public com.sforce.soap.enterprise.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Set a user's password
     */
    public com.sforce.soap.enterprise.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidNewPasswordFault;

    /**
     * Reset a user's password
     */
    public com.sforce.soap.enterprise.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Returns standard information relevant to the current user
     */
    public com.sforce.soap.enterprise.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Send existing draft EmailMessage
     */
    public com.sforce.soap.enterprise.SendEmailResult[] sendEmailMessage(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Send outbound email
     */
    public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(com.sforce.soap.enterprise.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;
}

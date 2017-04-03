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
    public com.sforce.soap.enterprise.LoginResponse login(com.sforce.soap.enterprise.Login parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.LoginFault;

    /**
     * Describe an sObject
     */
    public com.sforce.soap.enterprise.DescribeSObjectResponse describeSObject(com.sforce.soap.enterprise.DescribeSObject parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe a number sObjects
     */
    public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the Global state
     */
    public com.sforce.soap.enterprise.DescribeGlobalResponse describeGlobal(com.sforce.soap.enterprise.DescribeGlobal parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe all the data category groups available for a given
     * set of types
     */
    public com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the data category group structures for a given set
     * of pair of types and data category group name
     */
    public com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of an sObject
     */
    public com.sforce.soap.enterprise.DescribeLayoutResponse describeLayout(com.sforce.soap.enterprise.DescribeLayoutType0 parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of the SoftPhone
     */
    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(com.sforce.soap.enterprise.DescribeSoftphoneLayout parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe a list of objects representing the order and scope
     * of objects on a users search result page
     */
    public com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[] describeSearchScopeOrder(com.sforce.soap.enterprise.DescribeSearchScopeOrder parameters) throws java.rmi.RemoteException;

    /**
     * Describe the tabs that appear on a users page
     */
    public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs(com.sforce.soap.enterprise.DescribeTabs parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Create a set of new sObjects
     */
    public com.sforce.soap.enterprise.SaveResult[] create(com.sforce.soap.enterprise.sobject.SObject[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Update a set of sObjects
     */
    public com.sforce.soap.enterprise.SaveResult[] update(com.sforce.soap.enterprise.sobject.SObject[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Update or insert a set of sObjects based on object id
     */
    public com.sforce.soap.enterprise.UpsertResult[] upsert(com.sforce.soap.enterprise.Upsert parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Merge and update a set of sObjects based on object id
     */
    public com.sforce.soap.enterprise.MergeResult[] merge(com.sforce.soap.enterprise.MergeRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Delete a set of sObjects
     */
    public com.sforce.soap.enterprise.DeleteResult[] delete(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Undelete a set of sObjects
     */
    public com.sforce.soap.enterprise.UndeleteResult[] undelete(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Empty a set of sObjects from the recycle bin
     */
    public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get a set of sObjects
     */
    public com.sforce.soap.enterprise.sobject.SObject[] retrieve(com.sforce.soap.enterprise.Retrieve parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Submit an entity to a workflow process or process a workitem
     */
    public com.sforce.soap.enterprise.ProcessResult[] process(com.sforce.soap.enterprise.ProcessRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * convert a set of leads
     */
    public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(com.sforce.soap.enterprise.LeadConvert[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Logout the current user, invalidating the current session.
     */
    public com.sforce.soap.enterprise.LogoutResponse logout(com.sforce.soap.enterprise.Logout parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Logs out and invalidates session ids
     */
    public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for deleted sObjects
     */
    public com.sforce.soap.enterprise.GetDeletedResponse getDeleted(com.sforce.soap.enterprise.GetDeleted parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for updated sObjects
     */
    public com.sforce.soap.enterprise.GetUpdatedResponse getUpdated(com.sforce.soap.enterprise.GetUpdated parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Create a Query Cursor
     */
    public com.sforce.soap.enterprise.QueryResponse query(com.sforce.soap.enterprise.Query parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault;

    /**
     * Create a Query Cursor, including deleted sObjects
     */
    public com.sforce.soap.enterprise.QueryAllResponse queryAll(com.sforce.soap.enterprise.QueryAll parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault;

    /**
     * Gets the next batch of sObjects from a query
     */
    public com.sforce.soap.enterprise.QueryMoreResponse queryMore(com.sforce.soap.enterprise.QueryMore parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault;

    /**
     * Search for sObjects
     */
    public com.sforce.soap.enterprise.SearchResponse search(com.sforce.soap.enterprise.Search parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedSearchFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Gets server timestamp
     */
    public com.sforce.soap.enterprise.GetServerTimestampResponse getServerTimestamp(com.sforce.soap.enterprise.GetServerTimestamp parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Set a user's password
     */
    public com.sforce.soap.enterprise.SetPasswordResponse setPassword(com.sforce.soap.enterprise.SetPassword parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidNewPasswordFault;

    /**
     * Reset a user's password
     */
    public com.sforce.soap.enterprise.ResetPasswordResponse resetPassword(com.sforce.soap.enterprise.ResetPassword parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Returns standard information relevant to the current user
     */
    public com.sforce.soap.enterprise.GetUserInfoResponse getUserInfo(com.sforce.soap.enterprise.GetUserInfo parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Send existing draft EmailMessage
     */
    public com.sforce.soap.enterprise.SendEmailResult[] sendEmailMessage(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Send outbound email
     */
    public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(com.sforce.soap.enterprise.Email[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;
}

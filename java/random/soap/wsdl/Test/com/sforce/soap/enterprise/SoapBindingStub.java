/**
 * SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

public class SoapBindingStub extends org.apache.axis.client.Stub implements com.sforce.soap.enterprise.Soap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[34];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LoginResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.LoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault"),
                      "com.sforce.soap.enterprise.fault.LoginFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSObjectResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSObjectResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSObjectResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSObjectResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeGlobal");
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeGlobalResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeGlobalResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeDataCategoryGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeDataCategoryGroupStructures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "pairs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DataCategoryGroupSobjectTypePair"), com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "topCategoriesOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupStructureResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "recordTypeIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeLayoutResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSoftphoneLayout");
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSearchScopeOrder");
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSearchScopeOrderResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeTabs");
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTabSetResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeTabSetResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "externalIDFieldName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UpsertResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.UpsertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("merge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeRequest"), com.sforce.soap.enterprise.MergeRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.MergeResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DeleteResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.DeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("undelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UndeleteResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.UndeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyRecycleBin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmptyRecycleBinResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.EmptyRecycleBinResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "fieldList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject"));
        oper.setReturnClass(com.sforce.soap.enterprise.sobject.SObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "actions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessRequest"), com.sforce.soap.enterprise.ProcessRequest[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.ProcessResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("convertLead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "leadConverts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvert"), com.sforce.soap.enterprise.LeadConvert[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvertResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.LeadConvertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invalidateSessions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sessionIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "InvalidateSessionsResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.InvalidateSessionsResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeleted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetDeletedResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetDeletedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUpdated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetUpdatedResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetUpdatedResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryMore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryLocator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryLocator"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "searchString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SearchResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault"),
                      "com.sforce.soap.enterprise.fault.MalformedSearchFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerTimestamp");
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetServerTimestampResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetServerTimestampResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SetPasswordResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SetPasswordResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault"),
                      "com.sforce.soap.enterprise.fault.InvalidNewPasswordFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ResetPasswordResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.ResetPasswordResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInfo");
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetUserInfoResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetUserInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendEmailMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SendEmailResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "messages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Email"), com.sforce.soap.enterprise.Email[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult"));
        oper.setReturnClass(com.sforce.soap.enterprise.SendEmailResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[33] = oper;

    }

    public SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">AllOrNoneHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AllOrNoneHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">AllowFieldTruncationHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AllowFieldTruncationHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">AssignmentRuleHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AssignmentRuleHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">convertLead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvert[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvert");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "leadConverts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">convertLeadResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvertResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">create");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">createResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">DebuggingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebuggingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">DebuggingInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebuggingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">delete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">deleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DeleteResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupStructures");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupStructuresResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupStructureResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobal");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobalResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutType0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchScopeOrder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchScopeOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchScopeOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSearchScopeOrderResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjects");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSObjectResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoftphoneLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoftphoneLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTabs");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTabsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabSetResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTabSetResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">DisableFeedTrackingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DisableFeedTrackingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">EmailHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">emptyRecycleBin");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">emptyRecycleBinResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmptyRecycleBinResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmptyRecycleBinResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getDeleted");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeleted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getDeletedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeletedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getServerTimestamp");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestamp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getServerTimestampResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestampResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUpdated");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdated.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUpdatedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdatedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUserInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUserInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">invalidateSessions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sessionIds");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">invalidateSessionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.InvalidateSessionsResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "InvalidateSessionsResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">LocaleOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LocaleOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">login");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">loginResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">LoginScopeHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginScopeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">logout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">logoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">merge");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeRequest");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "request");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">mergeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">MruHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MruHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">OwnerChangeOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.OwnerChangeOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">PackageVersionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PackageVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PackageVersion");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "packageVersions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">process");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessRequest");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "actions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">processResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">query");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryAll");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryAllResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryMore");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryMore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryMoreResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryMoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">QueryOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">resetPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">resetPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieve");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Retrieve.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieveResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">search");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Search.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">searchResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmail");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Email[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Email");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "messages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailMessageResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">SessionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SessionHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">setPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">setPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">StreamingEnabledHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.StreamingEnabledHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">undelete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">undeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UndeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UndeleteResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">update");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">updateResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">upsert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Upsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">upsertResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UpsertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UpsertResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">UserTerritoryDeleteHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UserTerritoryDeleteHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ChildRelationship");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ChildRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DataCategory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DataCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DataCategoryGroupSobjectTypePair");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DebugLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebugLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DeletedRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeletedRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupStructureResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeGlobalResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeGlobalSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutButtonSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutButton[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutButton");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "detailButtons");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutRow");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSearchScopeOrderResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchScopeOrderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutCallType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutInfoField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneScreenPopOption");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTab");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTabSetResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabSetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Email");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Email.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmailFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmailPriority");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmptyRecycleBinResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmptyRecycleBinResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Error");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Field");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "fieldType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetDeletedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeletedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetServerTimestampResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestampResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetUpdatedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdatedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetUserInfoResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "InvalidateSessionsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.InvalidateSessionsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "layoutComponentType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LayoutComponentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LoginResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MassEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MassEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PackageVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PackageVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PicklistEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PicklistEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PicklistForRecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PicklistForRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessSubmitRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessSubmitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessWorkitemRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessWorkitemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryLocator");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypeInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypeMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelatedList");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelatedListColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedListColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelatedListSort");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedListSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ResetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailError");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SingleEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SingleEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "soapType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoapType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UndeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UndeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UpsertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UpsertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ApiFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ApiFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ApiQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ApiQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ExceptionCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ExceptionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "FaultCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.FaultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidFieldFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidIdFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidNewPasswordFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidSObjectFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.LoginFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.MalformedQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.MalformedSearchFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ActivityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AdditionalNumber");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AdditionalNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certification__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Admin_Certification__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Admin_Certification__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Admin_Certification__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "advice_blonk_Recipes__DataCategorySelection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Advice_blonk_Recipes__DataCategorySelection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "advice_blonk_Recipes__ka");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Advice_blonk_Recipes__ka.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "advice_blonk_Recipes__kav");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Advice_blonk_Recipes__kav.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "advice_blonk_Recipes__ViewStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Advice_blonk_Recipes__ViewStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "advice_blonk_Recipes__VoteStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Advice_blonk_Recipes__VoteStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AggregateResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AggregateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AMLAW_Ranking__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AMLAW_Ranking__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Analytic_Snapshot__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Analytic_Snapshot__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_Digest_Subscribed_Category__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Answer_Digest_Subscribed_Category__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Answer_Digest_Subscribed_Category__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Answer_Digest_Subscribed_Category__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClass");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexLog");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexPage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTestQueueItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTestQueueItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTestResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTestResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application_Tracking__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Application_Tracking__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Application_Tracking__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Application_Tracking__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approval");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Approval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Article_and_Category_Reporting__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Article_and_Category_Reporting__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Asset");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Asset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssetFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AssetFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssignmentRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AssignmentRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AsyncApexJob");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AsyncApexJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthProvider");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AuthProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Best_In_Service__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Best_In_Service__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Billing_Date__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Billing_Date__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BillingStart__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BillingStart__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Branded_Gear__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Branded_Gear__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Branded_Gear__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Branded_Gear__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BrandTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BrandTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BusinessHours.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessProcess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BusinessProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallCenter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CallCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign_Ids__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Campaign_Ids__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMemberStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignMemberStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject._case.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Category__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_Category__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Category__Share");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_Category__Share.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Category_RecordType_Setting__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_Category_RecordType_Setting__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Escalated__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_Escalated__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Migration_Differential_Copy__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_Migration_Differential_Copy__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_QueueType_Setting__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_QueueType_Setting__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Settings__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_Settings__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case_Time__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Case_Time__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseArticle");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseArticle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseSolution");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseSolution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplateMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplateRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplateRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Category__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Category__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Category__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CategoryData");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CategoryNode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CategoryNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CategoryNodeLocalization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CategoryNodeLocalization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Contact__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Contact__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Contact__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Resource__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Resource__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Specialization__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Specialization__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Specialization__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Specialization__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Subtype__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Subtype__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Subtype__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Subtype__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Type__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Type__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Certification_Type__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Certification_Type__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Control__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Change_Control__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Change_Control__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Change_Control__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChangeControlTicketAssociation__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ChangeControlTicketAssociation__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline_Contact__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline_Contact__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Channel_Mgr_Outline_Contact__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Channel_Mgr_Outline_Contact__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChatterActivity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ChatterActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Checklist__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Checklist__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Checklist__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Checklist__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroupFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroupFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroupMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroupMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroupMemberRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroupMemberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationInvitation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationInvitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Community");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Community.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Consulting_Partner_Work_Order__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Consulting_Partner_Work_Order__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Download_Config__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Content_Download_Config__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Content_Download_Notification__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Content_Download_Notification__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocument");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocumentFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocumentHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocumentLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersionHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentVersionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspace");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentWorkspace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspaceDoc");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentWorkspaceDoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Contract.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Courier_Schedule__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Courier1__Courier_Schedule__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Courier1__Recipient__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Courier1__Recipient__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Job__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Cron__Batch_Job__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__Batch_Run__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Cron__Batch_Run__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "cron__CronKit_Config__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Cron__CronKit_Config__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CronTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CronTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CronTriggerNamesAndIds__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CronTriggerNamesAndIds__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Field_Statistic__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CTSK_INSP__Field_Statistic__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Object_Statistic__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CTSK_INSP__Object_Statistic__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CTSK_INSP__Object_Statistic__Share");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CTSK_INSP__Object_Statistic__Share.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomConsoleComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CustomConsoleComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dashboard");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Dashboard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DashboardComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DashboardComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DashboardComponentFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DashboardComponentFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DashboardFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DashboardFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_File__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Data_File__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Data_File__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Data_File__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Demo__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Demo__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Attendee__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Demo_Attendee__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Cert_Presentation__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Demo_Cert_Presentation__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Cert_Presentation__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Demo_Cert_Presentation__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Certification__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Demo_Certification__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Demo_Certification__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Demo_Certification__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Department__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Department__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Partner_Product__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Dev_Partner_Product__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Partner_Product__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Dev_Partner_Product__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dev_Task_Defects__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Dev_Task_Defects__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Document");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DocumentAttachmentMap");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DocumentAttachmentMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Domain");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Domain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DomainSite");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DomainSite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Educational_Event__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Educational_Event__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Educational_Event__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Educational_Event__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Educational_Event_Attendee__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Educational_Event_Attendee__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email_Templates_cs__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Email_Templates_cs__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailServicesAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailServicesAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailServicesFunction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailServicesFunction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitySubscription");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntitySubscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Event.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EventFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventRelation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EventRelation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendees__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Exam_Attendees__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Exam_Attendees__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Exam_Attendees__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Excluded_User__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Excluded_User__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Excluded_User__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Excluded_User__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Feature__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Feature__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feature_Request__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Feature_Request__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feedback__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Feedback__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedLike");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedLike.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedTrackedChange");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedTrackedChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldPermissions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FieldPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FiscalYearSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Folder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ForecastShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Functional_Evaluation__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Functional_Evaluation__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Functional_Evaluation__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Functional_Evaluation__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Functional_Evaluation_User__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Functional_Evaluation_User__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Group");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.GroupMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HashtagDefinition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.HashtagDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Idea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdeaComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.IdeaComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ideas_Projects__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Ideas_Projects__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ideas_Projects__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Ideas_Projects__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Instance__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Instance__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Instance__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interface_Change__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Interface_Change__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Interface_Change__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Interface_Change__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invariant__DataCategorySelection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Invariant__DataCategorySelection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invariant__ka");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Invariant__ka.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invariant__kav");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Invariant__kav.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invariant__ViewStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Invariant__ViewStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Invariant__VoteStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Invariant__VoteStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KCD_Solution__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KCD_Solution__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KCD_Solution_Recipient__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KCD_Solution_Recipient__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Knowledgebase__DataCategorySelection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Knowledgebase__DataCategorySelection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Knowledgebase__ka");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Knowledgebase__ka.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Knowledgebase__kav");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Knowledgebase__kav.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Knowledgebase__ViewStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Knowledgebase__ViewStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Knowledgebase__VoteStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Knowledgebase__VoteStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__DataCategorySelection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Known_Errors__DataCategorySelection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__ka");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Known_Errors__ka.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__kav");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Known_Errors__kav.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__ViewStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Known_Errors__ViewStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Known_Errors__VoteStat");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Known_Errors__VoteStat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kPlex__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KPlex__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kPlex__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KPlex__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kProject__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KProject__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "kProject__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KProject__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Lead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LineitemOverride");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LineitemOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LoginHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Logo_Testimonial_Usage__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Logo_Testimonial_Usage__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Logo_Testimonial_Usage__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Logo_Testimonial_Usage__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailmergeTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MailmergeTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Marketing_Survey__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Marketing_Survey__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Marketing_Survey__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Marketing_Survey__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Meeting__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting__Feed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Meeting__Feed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Meeting__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting__Share");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Meeting__Share.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting_Attendee__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Meeting_Attendee__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Meeting_Attendee__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Meeting_Attendee__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Misc_Survey__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Misc_Survey__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Misc_Survey__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Misc_Survey__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Monthly_Billing__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Monthly_Billing__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Monthly_Billing__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Monthly_Billing__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Name.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NoteAndAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NoteAndAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ObjectPermissions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ObjectPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Old_Onsite_Visit__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Old_Onsite_Visit__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Old_Onsite_Visit__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Old_Primary_Contact__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Old_Primary_Contact__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Old_Primary_Contact__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Old_Primary_Contact__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpenActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Opportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityCompetitor");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityCompetitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityFieldHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityFieldHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityOverride");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityPartner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityStage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityStage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Organization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Organization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrgWideEmailAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrgWideEmailAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Other_Review_Solution__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Other_Review_Solution__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Partner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoff__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Partner_Kickoff__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner_Kickoff__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Partner_Kickoff__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PartnerRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PartnerRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Period");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Period.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PermissionSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PermissionSetAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pilot_Object__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pilot_Object__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pilot_Object__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pilot_Object__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PkTraining_Association__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PkTraining_Association__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PkTraining_Association__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PkTraining_Association__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pre_Deployments__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pre_Deployments__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pre_Deployments__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pre_Deployments__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Press_Mention__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Press_Mention__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pricebook2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PricebookEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PricebookEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Contact__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Primary_Contact__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Primary_Contact__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Primary_Contact__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceStep");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceWorkitem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceWorkitem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product2");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Product2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product2Feed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Product2Feed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Profile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Status__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Project_Status__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Project_Status__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Project_Status__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purchase_Order__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Purchase_Order__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purchase_Tracking__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Purchase_Tracking__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purchase_Tracking__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Purchase_Tracking__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purchasing_Line_Item__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Purchasing_Line_Item__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Purchasing_Line_Item__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Purchasing_Line_Item__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PushTopic");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PushTopic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Quality_Control__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Quality_Control__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuantityForecast");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QuantityForecast.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuantityForecastHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QuantityForecastHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Question");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Question.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuestionDataCategorySelection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QuestionDataCategorySelection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QueueSobject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QueueSobject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Monthly_Usage__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RA_Monthly_Usage__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RA_Rollup__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RA_Rollup__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCAContact_CertificationType__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RCAContact_CertificationType__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCE_Credits__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RCE_Credits__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RCE_Credits__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RCE_Credits__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeLocalization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RecordTypeLocalization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__RegOnlineContact__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RegOnline__RegOnlineContact__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__RegOnlineContact__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RegOnline__RegOnlineContact__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RegOnline__RegOnlineEvent__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RegOnline__RegOnlineEvent__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Relativity_Case__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Relativity_Case__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Relativity_Case_User__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Relativity_Case_User__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Release__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Release__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Note__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Release_Note__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Note__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Release_Note__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Note_Categories__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Release_Note_Categories__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Release_Note_Categories__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Release_Note_Categories__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reply");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Reply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Report");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Report.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReportFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ReportFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RevenueForecast");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RevenueForecast.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RevenueForecastHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RevenueForecastHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sales_Training_Survey__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Sales_Training_Survey__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scontrol");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Scontrol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ScontrolLocalization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ScontrolLocalization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SelfServiceUser");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SelfServiceUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Servers__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Servers__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupEntityAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SetupEntityAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFDC_Project__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFDC_Project__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFDC_Project__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFDC_Project__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Ad_Group__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Ad_Group__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Google_Campaign__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Google_Campaign__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Keyword__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Keyword__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Search_Phrase__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Search_Phrase__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Text_Ad__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Text_Ad__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SFGA__Version_33_0_3__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SFGA__Version_33_0_3__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Site");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Site.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SiteFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SiteFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SiteHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SiteHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Smoke_Test__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Smoke_Test__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Smoke_Test__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Smoke_Test__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solution");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Solution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StaticResource");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.StaticResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Status_Meeting__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Status_Meeting__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Attendee__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Status_Meeting_Attendee__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status_Meeting_Attendee__Share");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Status_Meeting_Attendee__Share.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Stop_Status__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Stop_Status__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SWAG__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SWAG__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Changes__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.System_Changes__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "System_Changes__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.System_Changes__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Task");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Task.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskPriority");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TEST__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TEST__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Test_Case__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Test_Case__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TicketReleaseAssociation__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TicketReleaseAssociation__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TicketReleaseAssociation__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TicketReleaseAssociation__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Time_Zone_Look_Up__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Time_Zone_Look_Up__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Attendee__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Training_Attendee__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Attendee__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Training_Attendee__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Questions__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Training_Questions__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Relativity__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Training_Relativity__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Relativity__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Training_Relativity__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Relativity__Share");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Training_Relativity__Share.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Training_Survey_Results__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Training_Survey_Results__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Transaction__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Transaction__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Transaction__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TransactionLineItem__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TransactionLineItem__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TransactionLineItem__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TransactionLineItem__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowBatchJobsQueue__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowBatchJobsQueue__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowBatchJobsQueue__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowBatchJobsQueue__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowQueue__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowQueue__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowRule__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowRule__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowRule__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowRule__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowRuleJob__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowRuleJob__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowTest__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowTest__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UnfollowTest__Feed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UnfollowTest__Feed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Users__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Unique_Users__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unique_Users__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Unique_Users__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Data__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Usage_Data__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Data__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Usage_Data__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Usage_Data__Share");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Usage_Data__Share.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Conference__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference__Feed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Conference__Feed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Conference__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Conference_Survey_Result__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Conference_Survey_Result__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Story__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Story__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Story__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Story__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Story_Idea__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Story_Idea__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User_Story_Idea__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User_Story_Idea__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreference");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserPreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserRecordAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Instance__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.VM_Instance__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VM_Instance__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.VM_Instance__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Vote");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Vote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VPN_Setup__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.VPN_Setup__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WebLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.WebLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WebLinkLocalization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.WebLinkLocalization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "xtma_Email_Result__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Xtma_Email_Result__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "xtma_Individual_Email_Result__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Xtma_Individual_Email_Result__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "xtma_Link_Detail__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Xtma_Link_Detail__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sforce.soap.enterprise.LoginResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.LoginFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.LoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.LoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.LoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.LoginFault) {
              throw (com.sforce.soap.enterprise.fault.LoginFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSObjectResult describeSObject(java.lang.String sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSObjectResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSObjectResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSObjectResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSObjectResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSObjectResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSObjectResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeGlobalResult describeGlobal() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeGlobal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeGlobalResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeGlobalResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeGlobalResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] sObjectType) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeDataCategoryGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair[] pairs, boolean topCategoriesOnly) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeDataCategoryGroupStructures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pairs, new java.lang.Boolean(topCategoriesOnly)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeLayoutResult describeLayout(java.lang.String sObjectType, java.lang.String[] recordTypeIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, recordTypeIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeLayoutResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeLayoutResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeLayoutResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult describeSoftphoneLayout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSoftphoneLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[] describeSearchScopeOrder() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSearchScopeOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeTabs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeTabSetResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeTabSetResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeTabSetResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SaveResult[] create(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SaveResult[] update(com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.UpsertResult[] upsert(java.lang.String externalIDFieldName, com.sforce.soap.enterprise.sobject.SObject[] sObjects) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "upsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {externalIDFieldName, sObjects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.UpsertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.UpsertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.UpsertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.MergeResult[] merge(com.sforce.soap.enterprise.MergeRequest[] request) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "merge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.MergeResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.MergeResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.MergeResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DeleteResult[] delete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.UndeleteResult[] undelete(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "undelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.UndeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.UndeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.UndeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "emptyRecycleBin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.EmptyRecycleBinResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.EmptyRecycleBinResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.EmptyRecycleBinResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.sobject.SObject[] retrieve(java.lang.String fieldList, java.lang.String sObjectType, java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fieldList, sObjectType, ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.sobject.SObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.sobject.SObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.sobject.SObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.ProcessResult[] process(com.sforce.soap.enterprise.ProcessRequest[] actions) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {actions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.ProcessResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.ProcessResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.ProcessResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(com.sforce.soap.enterprise.LeadConvert[] leadConverts) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "convertLead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {leadConverts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.LeadConvertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.LeadConvertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.LeadConvertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void logout() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] sessionIds) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "invalidateSessions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.InvalidateSessionsResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.InvalidateSessionsResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.InvalidateSessionsResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetDeletedResult getDeleted(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getDeleted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetDeletedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetDeletedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetDeletedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetUpdatedResult getUpdated(java.lang.String sObjectType, java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getUpdated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sObjectType, startDate, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetUpdatedResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetUpdatedResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetUpdatedResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryResult query(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryResult queryAll(java.lang.String queryString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryResult queryMore(java.lang.String queryLocator) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryMore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryLocator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SearchResult search(java.lang.String searchString) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.MalformedSearchFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {searchString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SearchResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SearchResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SearchResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedSearchFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedSearchFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetServerTimestampResult getServerTimestamp() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getServerTimestamp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetServerTimestampResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetServerTimestampResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetServerTimestampResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SetPasswordResult setPassword(java.lang.String userId, java.lang.String password) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidNewPasswordFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "setPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SetPasswordResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SetPasswordResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SetPasswordResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidNewPasswordFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidNewPasswordFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.ResetPasswordResult resetPassword(java.lang.String userId) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidIdFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "resetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.ResetPasswordResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.ResetPasswordResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.ResetPasswordResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetUserInfoResult getUserInfo() throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetUserInfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetUserInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetUserInfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SendEmailResult[] sendEmailMessage(java.lang.String[] ids) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sendEmailMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SendEmailResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SendEmailResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SendEmailResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(com.sforce.soap.enterprise.Email[] messages) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sendEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {messages});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SendEmailResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SendEmailResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SendEmailResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

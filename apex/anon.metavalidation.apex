// get all object names
//Map<String, Schema.SObjectType> globDesc = Schema.getGlobalDescribe();
//String name = '';
//Set<String> names = new Set<String>();
//for (Schema.SObjectType sObj : globDesc.values()){
//   name = sObj.getDescribe().getName();
//   if ( name.contains('__mdt') ){
//      names.add(name);      
//   }
//}

//system.debug('--- ' + names.size());
//system.debug('--- ' + names);




//Map<Id,Schema.ServiceTerritory> serviceTerritoryMap = ( Map<Id,Schema.ServiceTerritory>)Cache.Org.get('local.NGIntegrationCache.ServiceTerritoryMap');

//system.debug('---' + serviceTerritoryMap);


//Map<String, Status_Transition_validation_rule__mdt> metamap = Status_Transition_validation_rule__mdt.getAll();

//Status_Transition_validation_rule__mdt mm = metamap.get('Canceled_Dispatched');
//system.debug('---RT_Name_1__c : ' + mm.RT_Name_1__c );
//system.debug('---RT_Name_2__c : ' + mm.RT_Name_2__c);
//system.debug('---Status_New__c : ' + mm.Status_New__c);
//system.debug('---Status_Old__c : ' + mm.Status_Old__c);
StatusTransitionValidationControl__c cs = StatusTransitionValidationControl__c.getOrgDefaults();
system.debug('---' + cs.Canceled_to_Dispatched_status_Transition__c);
//CONTAINS($CustomMetadata.Status_Transition_validation_rule__mdt.Canceled_Dispatched.RT_Name_2__c, SAF_RecordTypeName__c)
//($Setup.StatusTransitionValidationControl__c.Canceled_to_Dispatched_status_Transition__c == true),
//( $CustomMetadata.Status_Transition_validation_rule__mdt.Canceled_Dispatched.Status_New__c== TEXT(Status)),
//($CustomMetadata.Status_Transition_validation_rule__mdt.Canceled_Dispatched.Status_Old__c== TEXT(PRIORVALUE(Status)))

//string txt = '{ \"serviceorders\": [ { \"sodetails\": [ { \"SAF_css_so_num\": \"366190251\", \"SAF_ordertype\": \"Turn On - Meter\", \"SAF_sfcaseid\": \"5006u0000029ZPlAAM\", \"SAF_so_status\": \"Field Order Issued\", \"SAF_customerrefid\": \"486231752\", \"SAF_accountnumber\": \"15030047\", \"SAF_date_wanted\": \"2021-12-03\", \"SAF_premiserefid\": \"1503000\", \"SAF_cms_revenue_class\": \"Residential\", \"SAF_service_point_number\": \"52997002\", \"soassetdetail\": [ { \"SAF_servicepointtype\": \"Electric\", \"SAF_meterpointnumber\": \"1\", \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_servicepointtype\": \"Electric\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Electric\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Electric\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Electric\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Electric\", \"SAF_meterpointnumber\": \"0\" } ], \"fodetails\": [ { \"SAF_css_fo_num\": \"388417928\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"MWk-Unassigned\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] }, { \"SAF_css_fo_num\": \"288049307\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"Void\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] }, { \"SAF_css_fo_num\": \"627161251\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"Void\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] }, { \"SAF_css_fo_num\": \"585553336\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"Void\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] } ] }, { \"SAF_css_so_num\": \"579210151\", \"SAF_ordertype\": \"Turn On - Meter\", \"SAF_sfcaseid\": \"5006u0000029ZPlAAM\", \"SAF_so_status\": \"Field Order Issued\", \"SAF_customerrefid\": \"486231752\", \"SAF_accountnumber\": \"15030047\", \"SAF_date_wanted\": \"2021-12-03\", \"SAF_premiserefid\": \"1503000\", \"SAF_cms_revenue_class\": \"Residential\", \"SAF_service_point_number\": \"56977365\", \"soassetdetail\": [ { \"SAF_servicepointtype\": \"Gas\", \"SAF_meterpointnumber\": \"1\", \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_servicepointtype\": \"Gas\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Gas\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Gas\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Gas\", \"SAF_meterpointnumber\": \"0\" }, { \"SAF_servicepointtype\": \"Gas\", \"SAF_meterpointnumber\": \"0\" } ], \"fodetails\": [ { \"SAF_css_fo_num\": \"388417928\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"MWk-Unassigned\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] }, { \"SAF_css_fo_num\": \"288049307\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"Void\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] }, { \"SAF_css_fo_num\": \"956839236\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"Void\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] }, { \"SAF_css_fo_num\": \"627161251\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"Void\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"27584514\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" }, { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] }, { \"SAF_css_fo_num\": \"21291151\", \"SAF_field_ordertype\": \"Turn On - Meter\", \"SAF_fo_status\": \"Void\", \"assetdetails\": [ { \"SAF_meterequipmentnumber\": \"0R063549\", \"SAF_meterpointnumber\": \"1\", \"SAF_meter_action\": \"Change Name\" } ] } ] } ] } ] }';
//SAF_WSObjectParser wsParserObj = new SAF_WSObjectParser(txt);
//system.debug('---' + wsParserObj.jsonMap);
//List<SAF_WSObjectParser> responseList = wsParserObj.getList('serviceorders');
//System.debug('Check responseList '+responseList.size());
//System.debug('Check responseList '+responseList);
//if(responseList!=null && responseList.size() > 0){
//    SAF_WSObjectParser respObj = responseList[0];
//    System.debug('---Check respObj'+respObj);
//    List<SAF_WSObjectParser> serviceOrderList = respObj.getList('sodetails');
//    System.debug('---Check sodetails'+serviceOrderList);

//}

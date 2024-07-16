//List<WorkOrder> wos = [select Source__c, ng_order_type_name__c, recordtype.name, priority, createddate, due_date__c, Earliest_Start_Permitted__c, NG_Finish_No_Later_Than__c from workorder where createddate > 2021-10-19T01:02:03Z and Priority='3 - Non-Committed' order by Source__c, ng_order_type_name__c, recordtype.name, priority, createddate desc limit 50000];

//System.debug('---' + 'Source' + ' ; ' + 'Order Type' + ';' + 'Record Type' + ' ; ' + 'Priority' + ';CreatedOnDay'+';DueOnDayDate'+ ';EarliestStartPermitted'+';FinishNoLater');

//for (WorkOrder ar : wos) {

//    System.debug('---' + ar.Source__c + ' ; ' + ar.NG_Order_Type_Name__c + ' ; ' + ar.recordtype.Name + ' ; ' + ar.Priority + ' ; ' + ar.CreatedDate + ' ; ' + ar.due_date__c );

//}

//Set<String> recordTypeIdentifierSet = new Set<String>{'gas_emg (g) - check for safety_appliance won\'t shut down','gas_emg (g) - check for safety_delayed ignition'};

//Set<Id> ids = new set<id>{'0WO77000000GrXkGAK','0WO77000000GrXpGAK','0WO77000000GrXpGAK','0WO77000000GrXqGAK','0WO77000000GrXrGAK','0WO77000000GrXrGAK','0WO77000000GrXuGAK','0WO77000000GrXuGAK','0WO77000000GrXzGAK','0WO77000000GrXzGAK','0WO77000000GrY0GAK','0WO77000000GrY1GAK','0WO77000000GrY4GAK'};

//List<WorkOrder> wos = [select id from workorder where id=:ids all rows];

//system.debug('---'+wos.size());

//system.debug('---' + Database.query('select id, parentrecordid, parentrecord.name, priority__c, Include_in_Appointment_Optimization__c, createddate, createdby.name from serviceappointment where parentrecordid in (\'0WO77000000GrXkGAK\', \'0WO77000000GrXpGAK\', \'0WO77000000GrXpGAK\', \'0WO77000000GrXqGAK\', \'0WO77000000GrXrGAK\', \'0WO77000000GrXrGAK\', \'0WO77000000GrXuGAK\', \'0WO77000000GrXuGAK\', \'0WO77000000GrXzGAK\', \'0WO77000000GrXzGAK\', \'0WO77000000GrY0GAK\', \'0WO77000000GrY1GAK\', \'0WO77000000GrY4GAK\') order by createddate asc all rows'));

//List<ServiceAppointment> sas = Database.query('select isdeleted, id, parentrecordid, parentrecord.name, priority__c, Include_in_Appointment_Optimization__c, createddate, createdby.name from serviceappointment where parentrecordid in (\'0WO77000000GrXkGAK\', \'0WO77000000GrXpGAK\', \'0WO77000000GrXpGAK\', \'0WO77000000GrXqGAK\', \'0WO77000000GrXrGAK\', \'0WO77000000GrXrGAK\', \'0WO77000000GrXuGAK\', \'0WO77000000GrXuGAK\', \'0WO77000000GrXzGAK\', \'0WO77000000GrXzGAK\', \'0WO77000000GrY0GAK\', \'0WO77000000GrY1GAK\', \'0WO77000000GrY4GAK\') order by isdeleted, createddate asc all rows');

//for ( ServiceAppointment sa : sas ){

//    system.debug('--- ' + sa);

//}

//Set<String> workOrderIdentifierSet = new Set<String>();
//workOrderIdentifierSet.add('Gas & Electric_Bundled');
//Map<String,NG_Maximo_to_SF_Metadata_for_Ordertype__mdt> recordTypeMap = GBE_MetadataSelectorClass.getMaximoToSFMetadataForOrderTypeMetaDataMap(workOrderIdentifierSet);

//system.debug('---'+recordTypeMap);

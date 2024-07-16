//resourceDayOptimization(resourceId, policyId, horizon, includeAllTasks, includeOnlyResourceFutureSA,
//                             radius, candidateSasFields, unschedulableServicesField, maxOptRuntime,
//                              nowTimeOnSchedule)

//DateTime start = DateTime.newInstanceGMT(2022, 05, 20);
//DateTime finish = DateTime.newInstanceGMT(2022, 05, 20).addHours(24);
//system.debug('---'+start + ' : ' + finish);
//FSL.TimeInterval timeInt = new FSL.TimeInterval(start,finish);
//FSL.OAAS oaas = new FSL.OAAS();
//id optRequest = oaas.resourceDayOptimization('0Hn8X000000fxxqSAA', 'a1P1V000001wr13', timeInt, true, true, null, 'Include_in_Appointment_Optimization__c', 'FSL__Pinned__c', null, start);

//system.debug('---optRequest : ' + optRequest); //0Hh1V0000008OMoSAM

// get ids from sas, query on the assigned resource table, build map ... 1 soql
system.debug('---' + Limits.getAggregateQueries());
Set<Id> saIds = new Set<Id>();
saIds.add('08p78000000RxaUAAS');
List<AssignedResource> assRes = [select id, ServiceAppointmentId, ServiceResourceId from AssignedResource where ServiceAppointmentId =:saIds];

Map<ID, List<AssignedResource>> mapResources = BuildResourceMap(assRes);

system.debug('---' + Limits.getQueries() + ' ' + Limits.getAggregateQueries());
system.debug('---' + mapResources);


static Map<Id, List<AssignedResource>> BuildResourceMap(List<AssignedResource> resources){

    Map<Id, List<AssignedResource>> mapResources = new Map<Id, List<AssignedResource>>();

    for (AssignedResource ar : resources){
        if (mapResources.get(ar.ServiceAppointmentId)==null){
            List<AssignedResource> values = new List<AssignedResource>();
            values.add(ar);
            mapResources.put(ar.ServiceAppointmentId, values );
        }else{
            List<AssignedResource> values = mapResources.get(ar.ServiceAppointmentId);
            values.add(ar);
            mapResources.put(ar.ServiceAppointmentId, values);
        }
    }

    return mapResources;

}
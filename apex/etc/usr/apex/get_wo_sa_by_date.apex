String statusValue = 'New';
Map<Id, ServiceAppointment> woToSa = new Map<Id, ServiceAppointment>();
Map<Id, WorkOrder> woToWo = new Map<Id, WorkOrder>();
List<ServiceAppointment> invalid = new List<ServiceAppointment>();
Set<Id> woIds = new Set<Id>();

List<ServiceAppointment> appointments = [select id, status, parentrecordid, ServiceTerritoryId, ParentRecordStatusCategory, ParentRecordType, createddate from ServiceAppointment where status =:statusValue and createddate < 2022-05-15T10:04:00.000+0000 and createddate > 2022-05-01T10:04:00.000+0000 and ParentRecordType='WorkOrder' ];

system.debug('---count sa '+appointments.size());
for ( ServiceAppointment sa : appointments ){
    woToSa.put(sa.parentrecordid, sa);
    woIds.add(sa.parentrecordid);
}

List<WorkOrder> workorders = [select id, status, ServiceTerritoryId, ServiceTerritory.Name from workorder where id=:woToSa.keySet() and recordtypeid='0121V000001YbVLQA0'];
Set<String> stnames = new Set<String>();
system.debug('---count sa '+workorders.size());
for (WorkOrder wo : workorders){
    woToWo.put(wo.id, wo);
    if (wo.status!=woToSa.get(wo.id).status){
        invalid.add(woToSa.get(wo.id));
    }
    stnames.add(wo.ServiceTerritory.Name);
}

system.debug('---count invalid ' + invalid.size());
system.debug('---'+stNames);

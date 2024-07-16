//List<ServiceTerritoryMember> TestA = [select id, ServiceResourceId from from ServiceTerritoryMember where ServiceTerritoryId = '0Hh1V0000008OMWSA2'];
//Set<ID> serviceResourceIds = new Set<ID>();
//for (ServiceTerritoryMember stm : TestA ){
//    serviceResourceIds.add(stm.serviceResourceId);
//}

//List<ServiceResource> srs = [SELECT Id, IsOptimizationCapable FROM ServiceResource where id=:serviceResourceIds ];
//List<ServiceTerritoryMember> listOfSTM = [select id, ServiceResource.Id, ServiceResource.Owner.IsActive, ServiceResource.IsOptimizationCapable from ServiceTerritoryMember where ServiceTerritoryId = '0Hh1V0000008OMWSA2'];

//List<ServiceTerritoryMember> TestA = new List<ServiceTerritoryMember>();

//TestA = [select id, ServiceResourceId from ServiceTerritoryMember where ServiceTerritoryId = '0Hh1V0000008OMWSA2'];

//System.debug('---' + TestA.size());

//Set<ID> serviceResourceIds = new Set<ID>();

//for (ServiceTerritoryMember stm : TestA ){
//    serviceResourceIds.add(stm.serviceResourceId);
//}

//system.debug('---'+serviceResourceIds.size());

//List<ServiceResource> srs = [SELECT Id, IsOptimizationCapable, ownerID, name FROM ServiceResource where id='0Hn1V000000XZRGSA4'];
//System.debug('---'+srs.size());

//for (ServiceResource s : srs ){
    //s.IsOptimizationCapable = false;
//    system.debug('---srid' + s.id + ' : ' + s.IsOptimizationCapable + ' : ' + s.Name);
//}
// Patrick Barry - 0Hn1V000000XZRGSA4
DateTime baseDateTime = DateTime.newInstance(2021, 11, 11);
System.debug('---basedatetime GMT ' + baseDateTime);
System.debug('---basedatetime userTZ ' + baseDateTime.format());
//Database.Update(srs); // 00577000000Dg6hAAC //0051V0000077brPQAQ -sb
// wo--*sa--*sr : select id, ServiceAppointment.Id, ServiceAppointment.ParentRecord.Id, ServiceResource.id from AssignedResource limit 5
// sr--*skill : select id, ServiceResource.id from ServiceResourceSkill limit 5
// st--*stm*--sr : select id, ServiceTerritoryid, ServiceTerritory.NG_Jurisdiction__c, serviceresourceid, serviceresource.name from ServiceTerritoryMember where ServiceTerritory.NG_Jurisdiction__c = 'RI'
Set<ID> testWoIds = new Set<ID>{'0WO77000000GqozGAC','0WO77000000GqlCGAS','0WO77000000Gpw6GAC','0WO77000000GpuKGAS','0WO77000000GptHGAS','0WO77000000GpqmGAC','0WO77000000GpqhGAC','0WO77000000GpqcGAC','0WO77000000GsXxGAK','0WO77000000GsXnGAK','0WO77000000GsXYGA0','0WO77000000GsWQGA0','0WO77000000GsWLGA0','0WO77000000GsWGGA0'};
//Set<ID> testWoIds = new Set<Id>{'0WO1V00000093f0WAA'};
//get workorders
List<WorkOrder> wos = [select id, Priority, due_date__c, Earliest_Start_Permitted__c, NG_Finish_No_Later_Than__c, NG_Assigned_Technician__c, ( select id, status, duedate, Include_in_Appointment_Optimization__c, NG_Assigned_Technician__c, EarliestStartTime, NG_Finish_No_Later_Than__c from ServiceAppointments), (select id, SkillLevel, SkillId, Skill.MasterLabel, Skill.DeveloperName from SkillRequirements) from WorkOrder where id=:testWoIds order by Priority];

for (WorkOrder wo : wos ){

    wo.due_date__c = baseDateTime;
    wo.Earliest_Start_Permitted__c = baseDateTime;
    wo.NG_Finish_No_Later_Than__c = baseDateTime.addDays(2);
    system.debug('---'+wo);
    system.debug('---'+wo.ServiceAppointments);  
    system.debug('---'+wo.SkillRequirements);
    //system.debug('---'+ ' ');
}
//update wos;
//get service appointments
List<ServiceAppointment> sas = [select id, status, duedate, Include_in_Appointment_Optimization__c, NG_Assigned_Technician__c from ServiceAppointment where ParentRecordId=:testWOIds];

//for (ServiceAppointment sa : sas ){

//    system.debug('---' + sa);
//    sa.duedate = baseDateTime;
//}
//update sas;
//0C51V000000HIPdSAO 

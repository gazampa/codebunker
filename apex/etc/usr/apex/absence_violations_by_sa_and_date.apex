Set<String> resourceNames = new Set<String>{'JOSHUA GREEN'}; // names are not unique, refine a little with jurisdiction, ids are
//get me scheduled on gannt sa by date range
//Map<Id, ServiceResource> mSr = new Map<Id, ServiceResource>([select id, name from serviceresource where name=:resourceNames]);
Map <Id, ResourceAbsence> mAbsences = new Map<Id, ResourceAbsence>([select id, resource.name,  resourceid, FSL__ScheduliSAF_Policy_Used__c, start, end from ResourceAbsence where  ( start > 2022-02-07T05:00:00.000+0000 and End < 2022-02-11T00:05:00.000+0000 ) and resource.IsActive=true order by start nulls last limit 50000 ]); // add code to chunk or make time period smaller
Map<Id,ServiceAppointment> mSAs = new Map<Id, ServiceAppointment>([select id, appointmentnumber, ServiceTerritory.name, SAF_Assigned_Technician__c, status, EarliestStartTime, SchedStartTime, SchedEndTime, duedate from serviceappointment where status!='New' and status!='Work_Order_Complete'  and ( SchedStartTime > 2022-02-07T11:28:00.000+0000 and SchedEndTime < 2022-02-11T23:28:00.000+0000)  order by SchedStartTime]);
Map<String, List<ResourceAbsence>> mNameToAbsences = new Map<String, List<ResourceAbsence>>();
Map<String, List<ServiceAppointment>> mNameToSAs = new Map<String, List<ServiceAppointment>>(); 

//create association map, resource name to Service Appointment
for (ServiceAppointment element : mSAs.values()){
    String key = element.SAF_Assigned_Technician__c;
    if ( key ==null ){ continue; }
    if ( mNameToSAs.containsKey(key)){
            mNameToSAs.get(key).add(element);
    }else{
        List<ServiceAppointment> value= new List<ServiceAppointment>();
        value.add(element);
        mNameToSAs.put(key,value);
    }
}
//create association map of literal resource names to absences
for ( ResourceAbsence element : mAbsences.values() ){
    String key = element.resource.name;
    if ( key == null ){ continue; }
    if (mNameToAbsences.containsKey(key)){
        mNameToAbsences.get(key).add(element);
    }else{
        List<ResourceAbsence> value = new List<ResourceAbsence>();
        value.add(element);
        mNameToAbsences.put(key, value);
    }
}

/*
for (String key : mNameToSAs.keyset()){
    
    for ( ServiceAppointment sa : mNameToSAs.get(key) ) {

        system.debug('--- sas ' + key + ' : '  + sa);
    
    }
}

for (String key : mNameToAbsences.keyset()){
    
    for ( ResourceAbsence ra : mNameToAbsences.get(key) ) {

        system.debug('--- abs ' + key + ' : '  + ra.Start +' : ' + ra.End);
    
    }
}
*/
// two loop - create data structure for each resouce with its sas and absences...

for (String key : mNameToSAs.keyset()){ // resources
    for ( ServiceAppointment sa : mNameToSAs.get(key) ) { // service appointments of resource   
        if (mNameToAbsences.get(sa.SAF_assigned_technician__c)==null){ continue; }
        for (ResourceAbsence ra : mNameToAbsences.get(sa.SAF_assigned_technician__c) ){ // absence for resources
            if (sa.SchedEndTime > ra.start && sa.SchedEndTime < ra.end) { system.debug('---begin overlap '+ sa.SAF_assigned_technician__c + ' : ' + sa.serviceterritory.name + ' : ' + sa); } //{ [ } ]
            if (sa.SchedStartTime > ra.start && sa.SchedEndTime < ra.end) { system.debug('---middle overlap '+ sa.SAF_assigned_technician__c + ' : '+ sa.serviceterritory.name + ' : '+sa); } // [ {} ]
            if (sa.SchedStartTime > ra.start && sa.SchedStartTime < ra.end) { system.debug('---end overlap '+ sa.SAF_assigned_technician__c + ' : '+ sa.serviceterritory.name + ' : '+sa); } //[ { ] } 
            if (sa.EarliestStartTime > sa.SchedStartTime){ system.debug('---earliest start permitted broken '); }
        }
    }
}

Set<Id> saIds = new Set<Id>();
saIds.add('08p78000000RxaUAAS');
List<ServiceAppointment> sas = [select id, schedstarttime, schedendtime from ServiceAppointment where Id =:saIds];

for (ServiceAppointment sa : sas ){
    system.debug('---old ' + sa.schedendtime);
    //    sa.schedendtime = sa.schedendtime.addHours(1);
    system.debug('---new ' + sa.schedendtime);
}
//update sas;
Id anId = 'a0B3K0000034O0NUAU';

System.debug('---> object : ' + anId.getSObjectType());

List<ServiceAppointment> sas = [select id, meter_size__c from ServiceAppointment limit 100];

for ( ServiceAppointment sa : sas ) {

    sa.meter_size__c = 'any value';

}

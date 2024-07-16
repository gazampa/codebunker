// get a group(20) of service appointments for a single jurisdiction
//List<ServiceAppointment> sas = [select id, appointmentnumber, parentrecordid, NG_Order_Type__c, status, priority__c, ServiceTerritory.Name, FSL__Schedule_Mode__c, FSL__Auto_Schedule__c, FSL__Scheduling_Policy_Used__c, NG_Assigned_Technician__c, DurationType, DurationInMinutes, EarliestStartTime, SchedStartTime, SchedEndTime, duedate from serviceappointment where status='New' and (createddate > 2022-01-01T05:00:00.000+0000 and createddate < 2022-02-01T05:00:00.000+0000) and serviceterritory.name like '%NORTH-RI' and duedate < 2022-03-01T05:00:00.000+0000 and ( not (NG_Order_Type__c like '%Regulator') ) and ( not (NG_Order_Type__c like '%Inspection%') ) limit 22];
List<ServiceAppointment> sas = [select id, appointmentnumber, parentrecordid, NG_Order_Type__c, status, priority__c, ServiceTerritory.Name, FSL__Schedule_Mode__c, FSL__Auto_Schedule__c, FSL__Scheduling_Policy_Used__c, NG_Assigned_Technician__c, DurationType, DurationInMinutes, EarliestStartTime, SchedStartTime, SchedEndTime, duedate, ArrivalWindowStartTime, ArrivalWindowEndTime from serviceappointment where id in ('08p8X000001zomcQAA','08p8X0000021fWnQAI','08p8X0000020JDgQAM','08p8X0000021Z3vQAE','08p8X0000021ZZ3QAM','08p8X000001zu5ZQAQ','08p8X00000203oBQAQ','08p8X0000020fAlQAI','08p8X0000020fJNQAY','08p8X00000213otQAA','08p8X0000021lqNQAQ','08p8X0000021mc4QAA','08p8X0000021nVCQAY','08p8X0000021oIyQAI','08p8X0000021rJdQAI','08p8X0000021tbqQAA','08p8X0000021zO9QAI','08p8X0000020fnDQAQ','08p8X000001zprNQAQ','08p8X000001zvTLQAY','08p8X0000021dE7QAI','08p8X0000021dEHQAY','08p8X0000021dERQAY','08p8X0000021fGuQAI','08p8X0000021ln5QAA','08p8X0000021locQAA','08p8X0000021lraQAA','08p8X0000021lrpQAA','08p8X0000021lsOQAQ','08p8X0000021lsYQAQ','08p8X0000021lsiQAA','08p8X0000021nPJQAY','08p8X0000021pQFQAY',
'08p8X0000021qoxQAA','08p8X0000021rRfQAI','08p8X0000021tihQAA','08p8X0000021unFQAQ','08p8X0000021uvnQAA','08p8X0000021wg2QAA','08p8X0000021xVPQAY','08p8X0000021xsTQAQ','08p8X000002209pQAA','08p8X00000220B2QAI','08p8X000002217lQAA','08p8X00000221LPQAY','08p8X00000221lJQAQ','08p8X00000223h1QAA','08p8X00000225cyQAA','08p8X00000225rzQAA','08p8X0000021xaGQAQ') ];
system.debug('--- ' + sas.size());
// update dates to be due in the next couple of days
Set<Id> relatedWos = new Set<Id>();
DateTime baseDateTime = DateTime.newInstance(2022, 03, 01);
System.debug('---basedatetime UTC    ' + baseDateTime);
System.debug('---basedatetime UserTZ ' + baseDateTime.format());

Integer count = 0;
for (ServiceAppointment sa : sas){
    //sa.EarliestStartTime = baseDateTime;
    //sa.duedate = baseDateTime.addDays(5);
    if ( count >= 30 ){ break; }
    sa.SchedStartTime = null;
    sa.SchedEndTime = null;
    sa.ArrivalWindowStartTime = null;
    sa.ArrivalWindowEndTime = null;
    System.debug('---' + sa.id + ' : ' + sa.EarliestStartTime + ' : ' + sa.SchedStartTime + ' : ' + sa.ArrivalWindowStartTime + ' : ' + sa.duedate);
    //system.debug('---'+sa.id + ',? ');
    relatedWos.add(sa.parentrecordid);
}
system.debug('---count ' + count);
//update sas;
//get skills required from workorders
//select skill.developername from SkillRequirement where relatedrecordid in
//Set<String> skillsRequired = new Set<String>();

//List<SkillRequirement> allSkillsRequired = [select skill.developername, relatedrecordid from SkillRequirement where relatedrecordid=:relatedWos];

//for (SkillRequirement sr : allSkillsRequired ){
//    skillsRequired.add(sr.skill.developername);
//    system.debug('--- ' + sr.relatedrecordid + ',?' + sr.skill.developername );
//}
//system.debug('---skills required by wos ' + skillsRequired);
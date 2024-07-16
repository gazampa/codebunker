//get the service resources for a territory
List<serviceterritorymember> srs = [select id, serviceresourceid, serviceresource.name, serviceresource.isactive, serviceterritoryid, territorytype, EffectiveEndDate from serviceterritorymember where serviceterritory.name = 'E_OS NORTH-RI' and serviceresource.isactive = true and ( ( territorytype='P' and EffectiveEndDate=null ) or ( territoryType='S' and EffectiveEndDate > 2022-03-01T05:00:00.000+0000 ) ) order by territorytype];
Set<Id> srsUnique = new Set<Id>();
Set<Id> stUnique = new Set<Id>();
//make the list unique
for (serviceterritorymember stm : srs){ srsUnique.add(stm.serviceresourceid); stUnique.add(stm.serviceterritoryid); }
system.debug('---number of active resources ' + srsUnique.size());
//query the serviceresourceskill tatble
List<ServiceResourceSkill> srsSkills = [select id, SkillId, skill.developername, serviceresource.name from ServiceResourceSkill where ServiceResourceId=:srsUnique];
system.debug('---number of skills for active resources ' + srsSkills.size());
// map resource to a list of their skills
Map<String, List<String>> resourceToSkills = new Map<String, List<String>>();
//make a list of unique skills in territory
Set<String> skillsForTerritory = new Set<String>();

for (ServiceResourceSkill srk : srsSkills ){ 
//    system.debug('--- add to map ' + srk.serviceresource.name + ' : ' + srk.skill.developername);
    if ( resourceToSkills.containskey(srk.serviceresource.name) ){
        List<String> existingValues = resourceToSkills.get(srk.serviceresource.name);
        existingValues.add(srk.skill.developername);
        resourceToSkills.put(srk.serviceresource.name,existingValues);
    }else{
        List<String> values = new List<String>();
        values.add(srk.skill.developername);
        resourceToSkills.put(srk.serviceresource.name,values);
    }    
    skillsForTerritory.add(srk.skill.developername);
    } 

for ( String key : resourceToSkills.keyset() ){
    String values = '';
    for ( String value : resourceToSkills.get(key) ) {
        values+=value+',';
    }
    system.debug('--- user skill ' + key + ' : ' + values );
}

//for (String skill : skillsForTerritory){

    system.debug('--- skill of resources in territory ' + skillsForTerritory );

//}

//get the required skills of a range of workorders in the territory
//select id, (select id, skill.developername from SkillRequirements) from WorkOrder where ServiceTerritoryId=:stUnique and createddate > 2022-03-01T05:00:00.000+0000

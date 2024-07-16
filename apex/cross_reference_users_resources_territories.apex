//get a list of active user ids for a profile
Set<Id> userIds = new Set<Id>();
List<User> users = [select id, username, profile.name, isactive from user where profile.name like 'CMS/Collections - Techncian' and isactive = true];

for (User u : users ) {
    userIds.add(u.id);
}

// get a service territory id
List<ServiceTerritory> territories = [select id, name from ServiceTerritory where name = 'Long Island' or ParentTerritory.name='Long Island'];
Set<Id> stIds = new Set<Id>();
system.debug('---'+'Service Territories');
for (ServiceTerritory st : territories){
    stIds.add(st.Id);
    system.debug('--- ' + st.Id + ' : ' + st.name);
}


//get a list of resources from the territory
List<ServiceTerritoryMember> stms = [select id, ServiceTerritoryId, serviceterritory.name, TerritoryType, serviceresource.name from ServiceTerritoryMember where ( ServiceTerritoryId=:stIds or ServiceTerritory.ParentTerritoryId=:stIds ) and TerritoryType='P'];
system.debug('---'+'Members');
for (ServiceTerritoryMember stm : stms ){
    system.debug('--- '  + stm.serviceresource.name + ' : ' + stm.serviceResourceId + ' : ' + stm.ServiceTerritoryId + ' : ' + stm.ServiceTerritory.name);
}

// get a list of service resources and cross reference it for users
//List<ServiceResource> srs = [select id from ServiceResource where relatedrecordid=:userIds];
//Set<Id> srsIds = new Set<Id>();
//for (ServiceResource sr : srs ){
//    srsIds.add(sr.id);
//}

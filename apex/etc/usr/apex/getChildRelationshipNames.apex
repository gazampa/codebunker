for ( ChildRelationship relation : SObjectType.Location.getChildRelationships() ){

    system.debug('---' + relation.getRelationShipName());

}

// dump normal sobject names
Map<String, Schema.SObjectType> describe = Schema.getGlobalDescribe();
Set<String> standard = new Set<String>();
Set<String> custom = new Set<String>();

for ( Schema.SObjectType ds : describe.values() ){
  Schema.DescribeSObjectResult d = ds.getDescribe();
  if ( ! d.isCreateable() ) { continue; }
  if ( !d.isCustom() && d.getRecordTypeInfos().size() > 0 ) {
    standard.add( d.getName() );
  } else if ( d.isCustom() ){ 
      custom.add( d.getName() );
  }
}

system.debug('---s ' + standard);
system.debug('---c ' + custom);

// dump_org_sobjects
 Map<String, Schema.SObjectType> describe = Schema.getGlobalDescribe();

for ( String sOj : describe.keyset() ){
  system.debug('--- ' + sOj);
}

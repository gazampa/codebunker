String[]  types = new String[]{'Case'};

// list of object names
List<String> sObjectNames = new List<String> ( types );

Schema.describeSObjectResult[] describe = Schema.describeSObjects(sObjectNames);

for (Schema.describeSObjectResult sObjectDescribe : describe ){

        String objName =  sObjectDescribe.getName();

        List<Schema.RecordTypeInfo> rtypes = sObjectDescribe.getRecordTypeInfos();
        
        System.debug('--- ' + objName);

        for (Schema.RecordTypeInfo rt : rtypes){

            System.debug( '--- ' + rt.getDeveloperName() + ' : ' + rt.getName() + ' : ' + rt.getRecordTypeId() );

        }

}

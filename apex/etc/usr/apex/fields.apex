String[]  types = new String[]{'WorkOrder'};

// list of object names
List<String> sObjectNames = new List<String> ( types );

Schema.describeSObjectResult[] describe = Schema.describeSObjects(sObjectNames);

for ( Schema.DescribeSObjectResult obj : describe ){

        System.debug('---' + obj);

        System.debug('---' + obj.getName());

        System.debug('---' + obj.getLabel());

        getFields( obj );

        getPicklistValues( obj );

}

static void getFields(Schema.DescribeSObjectResult obj){

    Map<String, Schema.SObjectField> fields = obj.fields.getMap();

    for (Schema.SObjectField field : fields.values() ){

            System.debug('---' + field + ' : ' + field.getDescribe().getLabel() + ' : ' + isRequired(field) + ' : ' + field.getDescribe().getType() );

    }

}

static void getPicklistValues(Schema.DescribeSObjectResult obj){

    Map<String, Schema.SObjectField> fields = obj.fields.getMap();

    for (Schema.SObjectField field : fields.values() ){

            Schema.DescribeFieldResult fd = field.getDescribe();

            if ('PICKLIST' == fd.getType().name() ) {

            System.debug('---' + fd.getLabel() + ' : ' + fd.getName() );

            List<Schema.PickListEntry> ples = fd.getPicklistValues();

            for ( Schema.PickListEntry entry : ples ){

                System.debug('---  ' + entry.getLabel() + ' : ' + entry.getValue() + ' : ' + entry.isActive());

                /*if ( !entry.isActive()) {

                    System.debug(' Inactive: ' + entry.getLabel() );

                }

                if ( entry.isActive()) {

                    System.debug(' Active: ' + entry.getLabel() );

                }
*/
            }


        }

    }

}

static String isRequired(Schema.SObjectField field){
        
        String result = 'Not Required';

        if ( !field.getDescribe().isNillable() ){ result ='Requires';}

        return result;

}

@isTest
public class TestDataBuilder {

    /** Utility Class to create test data
     *     - genericize using meta type sObject types
     *  - one method that returns any object
     *
     **/
    /**
     * @Return : List<Account>
     * @Args : Map<String, String>
     * Named Parameters
     * decouples reliance on index position when passing in a string[]
     *
     * map.size() == 1 can be any number of things depending on what parameter is named
     *
     * you can then determine what to assign based on that name but you are still
     * going to do the basic thing of returning the requested type
     *
     * Map<String, String> args : its a verbose -flag -value
     *
     *  **** NB **** Adding custom fields is overwriting this class. its probably better to just return blanks
     *  with standard field and association capability, then have the test programmer fill in the fields and types
     *  on those blanks.
     **/
    public static List<sObject> getObjects(Map<String, String> args){

        List<sObject> result = new List<sObject>();
        
        String objType = null;
        String name = null;
        String numberToCreate = null;
        Integer n = 0;
        String recordTypeName = null;
        Id recordTypeId = null;
        Map<String, String> fieldNamesString = new Map<String, String>();
        Map<String, Long> fieldNamesLong = new Map<String, Long>();
        Map<String, Decimal> fieldNamesDecimal = new Map<String, Decimal>();
        
        //parse args
        if (args.keySet().contains('object')) {
            objType = args.get('object');
        }
        if (args.keySet().contains('name')) {
            name = args.get('name');
        }
        if ( args.keySet().contains('create')) {
            numberToCreate = args.get('create');
        }
        if ( args.keySet().contains('recordType')) {
            recordTypeName = args.get('recordType');
        }

        for ( String key : args.keyset() ){
            if ( key.contains('field_') ) {
                String fieldName = '';
                if ( key.contains('decimal_') ){
                    fieldName = key.replace('field_','').replace('decimal_', '');
                    Decimal dataValue = Decimal.valueOf(args.get(key));
                    fieldNamesDecimal.put(fieldName, dataValue);
                }else { // all the types...
                    fieldName = key.replace('field_', '');
                    fieldNamesString.put(fieldName, args.get(key));
                }
            }
        }
        
        // defaults
        objType = (objType != null ) ? ( objType ) : ( null );
        name = (name != null ) ? ( name ) : ( 'Test Object' );
        numberToCreate = ( numberToCreate != null ) ? ( numberToCreate ) : ( '1' );
        n = Integer.valueOf( numberToCreate );

        // return an empty list if nothing is specified
        if ( objType==null ) { return new List<SObject>(n);} // blank untyped list

        if ( recordTypeName!=null  ){
            String[] types = new String[]{objType};
            Schema.DescribeSObjectResult[] describe = Schema.describeSObjects(types);
            recordTypeId = describe[0].getRecordTypeInfosByName().get(recordTypeName).getRecordTypeId();
        }
        
        //generate objects and field assignments
        for ( Integer i = 0; i < n ; i++ ) {
            System.debug(' assigning object fields');
            sObject sObj = Schema.getGlobalDescribe().get(objType).newSObject() ;
            if ( objType != 'Contact') { sObj.put('Name', name + ' ' + i ); }
            if ( recordtypeId!=null ){ sObj.put('RecordTypeId', recordTypeId ); }
            for ( String key : fieldNamesString.keyset() ){
                sObj.put( key, fieldNamesString.get(key) );
            }
            for ( String key : fieldNamesDecimal.keyset() ){
                sObj.put(key, fieldNamesDecimal.get(key) );
            }
            for ( String key : fieldNamesLong.keyset() ){
                sObj.put(key, fieldNamesLong.get(key) );
            }
            System.debug(' adding objects ' + sObj);
            result.add( sObj );
        }

        System.debug(' sobjs ' + result);
        
        return result;
    }
    
    public static void associate(List<sObject> objs, String fieldName, String Ids ){
        Id[] unpacked = Ids.split(':');
        
        System.debug(' objects ' + objs );
        System.debug(' field ' + fieldName );
        System.debug(' Ids ' + Ids );
        
        for ( Integer i = 0; i < objs.size(); i++ ){
            objs[i].put(fieldName, unpacked[Math.Mod( i, unpacked.size() )] );
        }
        
    }
    
    private static Set<Id> filterIds(List<sObject> sObjs){
        Set<Id> result = new Set<Id>();
        if ( sObjs != null ) {
            for ( sObject sObj : sObjs ){
                result.add( sObj.Id );
            }
        }
        return result;
    }
    
    /** utility method to help clients pack the ids into a formatted string **/
    private static String packIds(Set<Id> ids){
        String result = '';
        Integer counter = 0;
        
        if ( ids != null ){
            for (  Id param : ids ){
                result += param;
                if ( counter == ids.size() -1 ){
                    break;
                }
                if ( counter < ids.size() ){
                    result += ':';
                }
                counter++;
            }
        }
        
        return result;

    }
    /** one call  method **/
    public static String getIds(List<sObject> sObjects){
        String result = '';
        Set<Id> ids = new Set<Id>();
        
        if ( sObjects!=null ){
            ids = filterIds(sObjects);
        }
        
        result = packIds(ids);
        
        return result;
    }

}
@isTest
public class DataBuilder {
    
    private Map<String, String> args;
    private List<sObject> result = new List<sObject>();
    
    private String objType;
    private String name;
    private String numberToCreate;
    private Integer n;
    private String recordTypeName;
    private Id recordTypeId;
    private Map<String, String> fieldNamesString = new Map<String, String>();
    private Map<String, Long> fieldNamesLong = new Map<String, Long>();
    private Map<String, Decimal> fieldNamesDecimal = new Map<String, Decimal>();

    public DataBuilder() {
        
      args = new Map<String, String>();
    
  }
    
    public DataBuilder(Map<String, String> param) {
        
        args = param;
    
    }
    
    public List<sObject> getObjects() {
        execute();
        return result;
    }
    
    private void execute() {
        parse();
        defaultValues();
        construct();
    }
    
    private void parse() {
        objectType();
        name();
        numberToCreate();
        recordType();
        generalFields();
    }

    private void defaultValues() {
        // defaults
        objType = (objType != null ) ? ( objType ) : ( null );
        name = (name != null ) ? ( name ) : ( 'Test Object' );
        numberToCreate = ( numberToCreate != null ) ? ( numberToCreate ) : ( '1' );
        n = Integer.valueOf( numberToCreate );
        if ( recordTypeName!=null && objType!=null  ){
            String[] types = new String[]{objType};
            Schema.DescribeSObjectResult[] describe = Schema.describeSObjects(types);
            recordTypeId = describe[0].getRecordTypeInfosByName().get(recordTypeName).getRecordTypeId();
        }
    }
    
    private void construct() {
        //generate objects and field assignments
        for ( Integer i = 0; i < n ; i++ ) {
            System.debug(LoggingLevel.INFO, ' assigning object fields');
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
            System.debug(LoggingLevel.DEBUG, ' adding objects ' + sObj);
            result.add( sObj );
        }

    }

    private void objectType(){
        if (args.keySet().contains('object')) {
            objType = args.get('object');
        }
    }
    
    private void name(){
        if (args.keySet().contains('Name')) {
            name = args.get('Name');
        }
    }

    private void numberToCreate(){
        if ( args.keySet().contains('create')) {
            numberToCreate = args.get('create');
        }
    }
    
    private void recordType(){
        if ( args.keySet().contains('recordType')) {
            recordTypeName = args.get('recordType');
        }
    }
    
    private void generalFields(){
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
    }

    /** make static ? then you have to type out class name when calling **/
    public void associate(List<sObject> objs, String fieldName, String Ids ){
        Id[] unpacked = Ids.split(':');
        
        System.debug(LoggingLevel.DEBUG,' objects ' + objs );
        System.debug(LoggingLevel.DEBUG,' field ' + fieldName );
        System.debug(LoggingLevel.DEBUG,' Ids ' + Ids );
        System.debug(LoggingLevel.INFO,' unpacked ' + unpacked );
        
        for ( Integer i = 0; i < objs.size(); i++ ){
            objs[i].put(fieldName, unpacked[Math.Mod( i, unpacked.size() )] );
        }
    }

    private Set<Id> filterIds(List<sObject> sObjs){
        Set<Id> result = new Set<Id>();
        if ( sObjs != null ) {
            for ( sObject sObj : sObjs ){
                result.add( sObj.Id );
            }
        }
        return result;
    }
    
    /** utility method to help clients pack the ids into a formatted string **/
    private String packIds(Set<Id> ids){
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
    public String getIds(List<sObject> sObjects){
        String result = '';
        Set<Id> ids = new Set<Id>();
        
        if ( sObjects!=null ){
            ids = filterIds(sObjects);
        }
        
        result = packIds(ids);
        
        return result;
    }

    private String randomishCompanyName(){
        List<String> names = new List<String>();
        names.add('ABC Industries');names.add('Dunder & Mifflin Paper');names.add('Weyland-Yutani');names.add('Hudsucker Industries');names.add('Tyrell Corp');
        return names[randomize(names.size()-1)];
    }
    
    private String randomishFirstName(){
        List<String> names = new List<String>();
        names.add('Peter');names.add('Paul');names.add('Mary');names.add('Jane');names.add('Marie');
        return names[randomize(names.size()-1)];
    }

    private String randomishLastName(){
        List<String> names = new List<String>();
        names.add('Smith');names.add('Jones');names.add('O Conner');names.add('Wolenski');names.add('Peterson');
        return names[randomize(names.size()-1)];
    }
 
    private Integer randomize(Integer range){
        Double rand = Math.random()*(range);
        return (Integer) Math.roundtoLong( rand );
    }
    
}
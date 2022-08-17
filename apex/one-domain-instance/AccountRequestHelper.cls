public class AccountRequestHelper {

    private final integer uid;
    private static AccountRequestHelper instance;
    List<Account> newList;
    Map<Id, Account> oldMap;
    Map<Id, Account> newMap;
    LinkedList newLists;
    LinkedList newMaps;
    LinkedList oldMaps;
    
    private AccountRequestHelper(List<Account> triggerNew, Map<Id, Account> oldTrigger, Map<Id, Account> newTrigger){
        newLists = new LinkedList();
        oldMaps = new LinkedList();
        newMaps = new LinkedList();
        uid = createUUID();
    }

    public static AccountRequestHelper getInstance(){
        if ( instance == null ){
            instance = new AccountRequestHelper((List<Account>)Trigger.new, (Map<Id, Account>)Trigger.oldMap, (Map<Id, Account>)Trigger.newMap);
        }
        return instance;
    }
    
    public void setTriggerReferences(){
	    newLists.add((List<Account>)Trigger.new);
        oldMaps.add((Map<Id, Account>)Trigger.oldMap);
        newMaps.add((Map<Id, Account>)Trigger.newMap);
    }
        
    public List<Account> getCurrentInsertList(){
        return (List<Account>) newLists.getTail().getElement();
    }
    
    public Map<Id, Account> getCurrentOldMap(){
        return (Map<Id,Account>) oldMaps.getTail().getElement();
    }

    public Map<Id, Account> getCurrentNewMap(){
        return (Map<Id, Account>) newMaps.getTail().getElement();
    }
    
    public void reduceTriggerReferences( ){
        newLists.reduce();
        oldMaps.reduce();
        newMaps.reduce();
    }
    
    public void updateAccounts(Map<Id, Account> updateTriggerMap){
        
        List<Account> accountsToUpdate = [select id, name from Account where id=:updateTriggerMap.keyset() ];
        
        for ( Account a : accountsToUpdate ){
            a.name = a.name + ' level ' + RecursionControl.getCount('updateAccounts') + ' : ';
        }
        
        update accountsToUpdate;
    }    

    public void printLinkedLists(){
        if ( newLists!=null && newLists.getTail()!=null){
            
            for ( Account a : ( List<Account> )  ( newLists.getTail().getElement() ) ) {
                Account actualTriggerRecord; String currentName;
                if ( Trigger.newMap!=null) {
                    actualTriggerRecord = (Account)Trigger.newMap.get(a.id);
					currentName = actualTriggerRecord.name;
                } else {
                    currentName = a.Name; // no map, can do list match
                }
               
                //system.debug('--- account in linked trigger.insert instance ' + a.name + ' -- account in in current trigger - ' + currentName);
            }
        } else { System.debug('--- the new before insert linked trigger is null'); }
        if ( oldMaps!=null ){
            system.debug('---m oldmaps is not null ' + oldMaps.getTail() );
            if ( oldMaps.getTail()!=null && oldMaps.getTail().getElement()!=null ){
                List<Account> accounts = ( (Map<Id, Account> ) ( oldMaps.getTail().getElement() ) ).values();
            	if ( accounts!=null ){
                    Account actualTriggerRecord; String currentName;
            		for ( Account a : accounts ){
                        if ( Trigger.oldMap!=null ) { actualTriggerRecord = (Account)Trigger.oldMap.get(a.id);
                                                   currentName = actualTriggerRecord.name;}
                		system.debug('--- old linked map ' + a.name + currentName);
            		}
            	}
            } else { system.debug('--- old linked map element is null');}
        } else { System.debug('--- the old linked map is null'); }
        if ( newMaps!=null ){
            system.debug('---m newmaps is not null ' + newMaps.getTail() );
            if ( newMaps.getTail()!=null && newMaps.getTail().getElement()!=null ){
            	List<Account> newAccounts = ( (Map<Id, Account> ) ( newMaps.getTail().getElement() ) ).values();
            	Account actualTriggerRecord; String currentName;
                if ( newAccounts!=null){
	        		for ( Account a : newAccounts ){
                        if ( Trigger.newMap!=null ) { actualTriggerRecord = (Account)Trigger.newMap.get(a.id);
                                                     currentName = actualTriggerRecord.name;}
    	        		system.debug('--- new linked map ' + a.name + ' : ' + currentName);
        			}
            	}
            }  else { system.debug('--- new linked map element is null');}
        } else { system.debug('--- the new map is null'); }
    }
    
    private integer createUUID(){
        return Integer.valueOf( Math.random()*10000 );
    }

    public integer getUUID(){
        return uid;
    }    

}
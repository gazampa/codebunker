trigger Accounts on Account (before insert, before update, before delete, after insert, after update, after delete, after undelete) {

    RecursionControl.count('accountTrigger');
    System.debug('---trigger count ' + RecursionControl.getCount('accountTrigger'));
    AccountRequestHelper domain = AccountRequestHelper.getInstance();
    System.debug('---trigger instance ' + domain.getUUID());
    domain.setTriggerReferences();
    //System.debug('---trigger new' + Trigger.new);
    //System.debug('---trigger old map ' + Trigger.oldMap);
    //System.debug('---trigger new map ' + Trigger.newMap);
    
    if ( Trigger.isBefore ){
    	
        if ( Trigger.isInsert) {system.debug('---beforeInsert');}
        if ( Trigger.isUpdate) {
            system.debug('---beforeUpdate');
        }
        //domain.printMaps();
        domain.printLinkedLists();
        
    }
    
    if ( Trigger.isAfter ){
        if ( Trigger.isInsert) {system.debug('---afterInsert');}
        if ( Trigger.isUpdate) {system.debug('---afterUpdate');}
        if ( Trigger.isUpdate) {
            system.debug('---afterUpdate');
            RecursionControl.count('updateAccounts');
            if ( RecursionControl.getCount('updateAccounts') < 5 ) {
                domain.updateAccounts(Trigger.newMap);
            }
        }

        //domain.printMaps();
        domain.printLinkedLists();

    }

    domain.reduceTriggerReferences();
}
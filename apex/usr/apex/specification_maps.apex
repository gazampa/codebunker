public static Map<Id,NG_Specification__c> getspecificationDetailsMap = New Map<Id,NG_Specification__c>();
Map<Id,Workorder> getWorkorderDetailsMap = New Map<Id,Workorder>();
Set<Id> wotoSpec=new Set<Id>();
map<Id,List<WorkOrder>> preWO = new map<Id,List<WorkOrder>>();
map<Id,NG_Specification__c> specwoIdMap=new map <Id,NG_Specification__c>();
Set<Id> specWOIdsSet = new Set<Id>();
Set<Id> premiseidSet = new Set<Id>{'1311V0000013hpNQAQ'};

//
getWorkorderDetailsMap = GBE_WorkOrderSelector.getWorkOrdercreateSpecificationMap(premiseidSet);
getspecificationDetailsMap = GBE_SpecificationSelector.getSpecificationDetailsMap(getWorkorderDetailsMap.keyset());


if (getspecificationDetailsMap != null && !getspecificationDetailsMap.isEmpty()){
    for (NG_Specification__c objspec : getspecificationDetailsMap.values()){
        specwoIdMap.put(objspec.NG_Work_Order__c,objspec);    
    }
}                


if(getWorkorderDetailsMap != null && !getWorkorderDetailsMap.isEmpty()){                    
        for(WorkOrder woRec: getWorkorderDetailsMap.values()){                     
            if(preWO.containskey(woRec.NG_Premise__c)){
                List<WorkOrder> tempWO = preWO.get(woRec.NG_Premise__c);
                if(tempWO.size()<2){
                    tempWO.add(woRec);
                    preWO.put(woRec.NG_Premise__c,tempWO);
                    wotoSpec.add(woRec.id);
                }
            }
            else{
                preWO.put(woRec.NG_Premise__c,new List<WorkOrder>{woRec});
                wotoSpec.add(woRec.id);
            }
            
        }
}
System.debug('---spdm' + getspecificationDetailsMap);
System.debug('---wodm' + getWorkorderDetailsMap);
System.debug('--- prewo' + preWO);
System.debug('--- wotoSpec' + wotoSpec);
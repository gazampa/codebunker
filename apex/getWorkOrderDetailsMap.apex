Map<Id,Workorder> getWorkorderDetailsMap = New Map<Id,Workorder>();
Set<Id> wotoSpec=new Set<Id>();
map<Id,List<WorkOrder>> preWO = new map<Id,List<WorkOrder>>();

Set<Id> premiseidSet = new Set<Id>{'1311V0000013hpNQAQ'};

getWorkorderDetailsMap = SAF_WorkOrderSelector.getWorkOrdercreateSpecificationMap(premiseidSet);

if(getWorkorderDetailsMap != null && !getWorkorderDetailsMap.isEmpty()){                    
        for(WorkOrder woRec: getWorkorderDetailsMap.values()){                     
            if(preWO.containskey(woRec.SAF_Premise__c)){
                List<WorkOrder> tempWO = preWO.get(woRec.SAF_Premise__c);
                if(tempWO.size()<2){
                    tempWO.add(woRec);
                    preWO.put(woRec.SAF_Premise__c,tempWO);
                    wotoSpec.add(woRec.id);
                }
            }
            else{
                preWO.put(woRec.SAF_Premise__c,new List<WorkOrder>{woRec});
                wotoSpec.add(woRec.id);
            }
            
        }
}

System.debug('---wodm' + getWorkorderDetailsMap);
System.debug('--- prewo' + preWO);
System.debug('--- wotoSpec' + wotoSpec);
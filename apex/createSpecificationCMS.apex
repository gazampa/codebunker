
public static Map<Id,SAF_Specification__c> getspecificationDetailsMap = New Map<Id,SAF_Specification__c>();
Map<Id,Workorder> getWorkorderDetailsMap = New Map<Id,Workorder>();
Set<Id> wotoSpec=new Set<Id>();
map<Id,List<WorkOrder>> preWO = new map<Id,List<WorkOrder>>();
map<Id,SAF_Specification__c> specwoIdMap=new map <Id,SAF_Specification__c>();
Set<Id> specWOIdsSet = new Set<Id>();
Set<Id> premiseidSet = new Set<Id>{'1311V0000013hpNQAQ'};//1311V0000013hpNQAQ
List<SAF_Specification__c> specificationslist = new List<SAF_Specification__c>();
List<SAF_Specification__c> specificationslistToUpdate = new List<SAF_Specification__c>();
Map<Id, WorkOrder> newItemsMap = new Map<Id,WorkOrder>(); 
List<WorkOrder> newItems = [select id, SAF_Premise__c, status,RecordTypeId, SAF_RecordTypeName__c, SAF_order_type_name__c, SAF_Comments__c  from WorkOrder where SAF_premise__c = '1311V0000013hpNQAQ' and status !='Work_Order_Complete'];
for ( WorkOrder wo : newItems ){
    newItemsMap.put(wo.id, wo);
}
Map<String,Schema.RecordTypeInfo> woRecTypeToIdMap = Schema.SObjectType.WorkOrder.getRecordTypeInfosByDeveloperName();
Id emergencyGasRecTypeId = woRecTypeToIdMap.get(SAF_ConstantsUtility.EMERGENCYWO_GAS_RT).getRecordTypeId();
Id cmsGasRecTypeId = woRecTypeToIdMap.get(SAF_ConstantsUtility.WO_CMS_G).getRecordTypeId();
Id woObjElectricRecordTypeId = woRecTypeToIdMap.get(SAF_ConstantsUtility.WO_CMS_E).getRecordTypeId();
Id emeElecRecTypeId = woRecTypeToIdMap.get(SAF_ConstantsUtility.WO_EMERGENCY_E).getRecordTypeId();
Id meterOpsRecTypeId = woRecTypeToIdMap.get(SAF_ConstantsUtility.WO_METER_OPS).getRecordTypeId();    



getWorkorderDetailsMap = SAF_WorkOrderSelector.getWorkOrdercreateSpecificationMap(premiseidSet);
//getspecificationDetailsMap = SAF_SpecificationSelector.getSpecificationDetailsMap(getWorkorderDetailsMap.keyset());
getSpecificationDetail(newItems);

if (getspecificationDetailsMap != null && !getspecificationDetailsMap.isEmpty()){
    for (SAF_Specification__c objspec : getspecificationDetailsMap.values()){
        specwoIdMap.put(objspec.SAF_Work_Order__c,objspec);    
    }
}                


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
for(Id idItr : specWOIdsSet){
    WorkOrder objWorkOrder = (WorkOrder)newItemsMap.get(idItr);
    if(!specwoIdMap.containskey(objWorkOrder.Id)){
        SAF_Specification__c objSPec=new SAF_Specification__c ();
        objSPec.SAF_Work_Order__c=objWorkOrder.Id;
        SAF_WorkOrders.historicalSpecificationCreateUpdate(objWorkOrder,objSPec,preWO);
        specificationslist.add(objSPec);
    }
    if(specwoIdMap.containskey(objWorkOrder.Id)){
        SAF_Specification__c objSPecup = specwoIdMap.get(objWorkOrder.Id);
        SAF_WorkOrders.historicalSpecificationCreateUpdate(objWorkOrder,objSPecup,preWO);
        specificationslistToUpdate.add(objSPecup);
    }
}


System.debug('---newmap' + newItemsMap);
System.debug('---spdm' + getspecificationDetailsMap);
System.debug('---wodm' + getWorkorderDetailsMap);
System.debug('--- prewo' + preWO);
System.debug('--- wotoSpec' + wotoSpec);
System.debug('---specWOIdsSet' + specWOIdsSet);
System.debug('---listToInsert' + specificationslist);
System.debug('---listToUpdate' + specificationslistToUpdate);


    public static Void getSpecificationDetail(List<Workorder> woList){
        
        try{
            
                specWOIdsSet = new Set<Id>();
                Set<String> ordertypesSet = new Set<String>();
                List<String> ordertypelist = new list <String>{SAF_ConstantsUtility.WO_ORDERTYPE_Inspection_New_Service,SAF_ConstantsUtility.ORDERTYPE_TURNONMTR,SAF_ConstantsUtility.ORDERTYPE_TURNOFFMTR};
                ordertypesSet.addAll(ordertypelist);
                
                Set<Id> cmsRecTypeIds=new Set <Id>();
                cmsRecTypeIds.add(cmsGasRecTypeId);
                cmsRecTypeIds.add(woObjElectricRecordTypeId);   
                cmsRecTypeIds.add(emergencyGasRecTypeId);
                cmsRecTypeIds.add(emeElecRecTypeId);
                cmsRecTypeIds.add(meterOpsRecTypeId); 

                for (Workorder wo : woList){
                    System.debug('---hereinside ' + wo.id + ' : ' + wo.SAF_order_type_name__c + ' : ' + wo.status);
                    if(wo.Id != null){

                        if(ordertypesSet.contains(wo.SAF_order_type_name__c) && wo.status == SAF_ConstantsUtility.WO_STATUS_NEW) {
                            specWOIdsSet.add(wo.Id);
                        }
                        if(cmsRecTypeIds.Contains(wo.recordtypeID) && wo.status==SAF_ConstantsUtility.WO_STATUS_NEW){
                            specWOIdsSet.add(wo.Id);
                        }
                    }                        
                }
                
                if(specWOIdsSet != null && !specWOIdsSet.isEmpty()){
                    getspecificationDetailsMap = SAF_SpecificationSelector.getSpecificationDetailsMap(specWOIdsSet);
                }
            
        }catch (exception ex){

            System.debug('did you see the excption ' + ex);

        } 
}

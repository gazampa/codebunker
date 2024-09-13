

Map<String, List<Update_WO_TO_SA__mdt>> metadataMappingMap = new Map<String, List<Update_WO_TO_SA__mdt>>();
List<Update_WO_TO_SA__mdt> updateWOfromSAMetaData = SAF_MetadataSelectorClass.getUpdateWoToSAMetaData();

for(Update_WO_TO_SA__mdt mappingItr:updateWOfromSAMetaData){ 
                
                if(metadataMappingMap.containsKey(mappingItr.SAF_Object_Name__c)){
                    List<Update_WO_TO_SA__mdt> tempList = metadataMappingMap.get(mappingItr.SAF_Object_Name__c);
                    tempList.add(mappingItr);
                    metadataMappingMap.put(mappingItr.SAF_Object_Name__c,tempList);
                }else{
                    metadataMappingMap.put(mappingItr.SAF_Object_Name__c,new List<Update_WO_TO_SA__mdt>{mappingItr});
                } 
}

List<List<Update_WO_TO_SA__mdt>> lis = metadataMappingMap.values();

System.debug('---' + lis.size());

List<Update_WO_TO_SA__mdt> dis = lis[0];

for ( Update_WO_TO_SA__mdt whatmi : dis ) {

    System.debug('--- ' + whatmi);

}

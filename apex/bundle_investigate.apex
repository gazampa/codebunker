List<WorkOrder> bundle = [select id, ParentWorkOrderId, Status, SAF_RecordTypeName__c from WorkOrder where id = '0WO1L000000y9jSWAQ' or parentworkorderid ='0WO1L000000y9jSWAQ'];


for ( WorkOrder wo : bundle ){

    System.debug('---' + wo);

}

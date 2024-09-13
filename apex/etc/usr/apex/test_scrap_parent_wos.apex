/*      
      for(Integer i = 0; i<1; i++){
          WorkOrder wo = SAF_TestDataFactory.createWorkOrder('WO_REC',assetRec.Id);
          wo.RecordTypeId = ParentRecordTypeCMSBundled;
          wo.SAF_Service_Point_Type__c = 'Gas & Electric'; //commodity type
          wo.SAF_Jurisdiction__c = 'UNY - E';
          wo.SAF_Order_Type_Name__c = 'Bundled'; //order type
          wo.SAF_Description_Other__c = 'General Turn Off'; //reason code
          wo.SAF_Service_Type__c = 'Electric'; //service type
          wo.SAF_CSS_Work_Order_Number__c = '123456';
          wo.SAF_External_Bundle_Entity_Type__c = Label.SAF_Bundle_Parent_WO;
          wo.SAF_Completion_Code__c = 'Field Order'; //UTC Code
          wo.SAF_External_Order_Status__c = 'MWk-Unassigned';
          //New,Closed,Canceled,Scheduled,Dispatched,En Route,On-Site,On-Hold,Work Order Complete,Supervisor Complete
          wo.Status = SAF_ConstantsUtility.WO_STATUS_SCHEDULED;
          wo.SAF_dispatch_date__c = Date.today().addDays(5);
          //wo.SAF_TurnOnsCreated__c = true;
          //wo.SAF_External_Bundle_Entity_Type__c == SAF_ConstantsUtility.check_BundleParent; 
          //wo.Source__c == SAF_ConstantsUtility.WoSourceComposite; wo.Status == SAF_ConstantsUtility.WO_STATUS_CANCELED;
          wo.SAF_Is_RNW__c = false;
          wo.SAF_Comments__c = 'test comments';
          wo.Priority = '2 - Appointment';
          wo.SAF_MCA_Phone_Number__c = '555-555-5555';
          wo.StartDate = System.now().addDays(7);
          wo.EndDate = System.now().addDays(8);
          //SAF_Skip_Status_Validation__c < - what does this do SAF_WorkOrderHelper.cls : line 330
          parents.add(wo);
      }
      insert parents;
*/

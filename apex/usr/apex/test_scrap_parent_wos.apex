/*      
      for(Integer i = 0; i<1; i++){
          WorkOrder wo = NG_TestDataFactory.createWorkOrder('WO_REC',assetRec.Id);
          wo.RecordTypeId = ParentRecordTypeCMSBundled;
          wo.NG_Service_Point_Type__c = 'Gas & Electric'; //commodity type
          wo.NG_Jurisdiction__c = 'UNY - E';
          wo.NG_Order_Type_Name__c = 'Bundled'; //order type
          wo.NG_Description_Other__c = 'General Turn Off'; //reason code
          wo.NG_Service_Type__c = 'Electric'; //service type
          wo.NG_CSS_Work_Order_Number__c = '123456';
          wo.NG_External_Bundle_Entity_Type__c = Label.NG_Bundle_Parent_WO;
          wo.NG_Completion_Code__c = 'Field Order'; //UTC Code
          wo.NG_External_Order_Status__c = 'MWk-Unassigned';
          //New,Closed,Canceled,Scheduled,Dispatched,En Route,On-Site,On-Hold,Work Order Complete,Supervisor Complete
          wo.Status = NG_ConstantsUtility.WO_STATUS_SCHEDULED;
          wo.ng_dispatch_date__c = Date.today().addDays(5);
          //wo.NG_TurnOnsCreated__c = true;
          //wo.NG_External_Bundle_Entity_Type__c == NG_ConstantsUtility.check_BundleParent; 
          //wo.Source__c == NG_ConstantsUtility.WoSourceComposite; wo.Status == NG_ConstantsUtility.WO_STATUS_CANCELED;
          wo.NG_Is_RNW__c = false;
          wo.NG_Comments__c = 'test comments';
          wo.Priority = '2 - Appointment';
          wo.NG_MCA_Phone_Number__c = '555-555-5555';
          wo.StartDate = System.now().addDays(7);
          wo.EndDate = System.now().addDays(8);
          //NG_Skip_Status_Validation__c < - what does this do GBE_WorkOrderHelper.cls : line 330
          parents.add(wo);
      }
      insert parents;
*/

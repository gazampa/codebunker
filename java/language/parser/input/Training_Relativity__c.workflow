<?xml version="1.0" encoding="UTF-8"?>
<Workflow xmlns="http://soap.sforce.com/2006/04/metadata">
    <alerts>
        <fullName>Admin_Onsite_Training_Reminder</fullName>
        <description>Admin Onsite Training Reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_Admin_Onsite_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Admin_Training_Reminder</fullName>
        <ccEmails>admin@kcura.com</ccEmails>
        <description>Admin Training Reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_Admin_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Admin_Training_Reminder_Chicago_Sales</fullName>
        <ccEmails>sales@kcura.com</ccEmails>
        <description>Admin Training Reminder Chicago-Sales</description>
        <protected>false</protected>
        <senderType>CurrentUser</senderType>
        <template>Sales/Admin_Training_Reminder_Chicago</template>
    </alerts>
    <alerts>
        <fullName>Analytics_Training_Reminder</fullName>
        <ccEmails>admin@kcura.com</ccEmails>
        <description>Analytics Training Reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_Analytics_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Analytics_Training_Reminder_Onsite</fullName>
        <description>Analytics Training Reminder Onsite</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_Analytics_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Ask_The_Expert_Training_has_Ended</fullName>
        <ccEmails>Training@kcura.com</ccEmails>
        <description>Ask The Expert Training has Ended</description>
        <protected>false</protected>
        <recipients>
            <recipient>dmckay@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/Ask_The_Expert_Training_Ended</template>
    </alerts>
    <alerts>
        <fullName>Co_Trainer_Assigned_to_2_Day_Training</fullName>
        <description>Co-Trainer Assigned to 2 Day Training</description>
        <protected>false</protected>
        <recipients>
            <field>Team_Teaching__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/ICS_Invite_2_Day_Training_for_Co_Trainer</template>
    </alerts>
    <alerts>
        <fullName>Emai_to_Internal_Sales_for_Closed_Training_Session_Scheduled</fullName>
        <ccEmails>internalsales@kcura.com</ccEmails>
        <description>Emai to Internal Sales for Closed Training Session Scheduled</description>
        <protected>false</protected>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/New_Training_Scheduled</template>
    </alerts>
    <alerts>
        <fullName>EmailNewTrainingRequested</fullName>
        <description>Email - New Training Requested</description>
        <protected>false</protected>
        <recipients>
            <recipient>Pod2CSManager</recipient>
            <type>role</type>
        </recipients>
        <recipients>
            <recipient>Pod3CSManager</recipient>
            <type>role</type>
        </recipients>
        <recipients>
            <recipient>Pod_4_CS_Manager</recipient>
            <type>role</type>
        </recipients>
        <recipients>
            <recipient>gorr@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>rmerholz@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/New_Training_Requested</template>
    </alerts>
    <alerts>
        <fullName>EmailNewTrainingRequestedChicago</fullName>
        <description>Email - New Training Requested - Chicago</description>
        <protected>false</protected>
        <recipients>
            <recipient>Pod2CSManager</recipient>
            <type>role</type>
        </recipients>
        <recipients>
            <recipient>Pod3CSManager</recipient>
            <type>role</type>
        </recipients>
        <recipients>
            <recipient>Pod_4_CS_Manager</recipient>
            <type>role</type>
        </recipients>
        <recipients>
            <recipient>gorr@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>rmerholz@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/New_Training_Requested</template>
    </alerts>
    <alerts>
        <fullName>EmailSenttoSalesandCSthatTraininghasbeenscheduled</fullName>
        <description>Email Sent to Sales and CS that Training has been scheduled</description>
        <protected>false</protected>
        <recipients>
            <recipient>egorny@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>eperkins@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>stanzman@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/New_Training_Scheduled</template>
    </alerts>
    <alerts>
        <fullName>EmailSenttoSalesandCSthatTraininghasbeenscheduledChicago</fullName>
        <description>Email Sent to Sales and CS that Training has been scheduled - Chicago</description>
        <protected>false</protected>
        <recipients>
            <recipient>egorny@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>eperkins@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>stanzman@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/New_Training_Scheduled</template>
    </alerts>
    <alerts>
        <fullName>Email_Reminder_to_IT_for_training_reminder</fullName>
        <description>Email Reminder to KIE for Infrastructure training</description>
        <protected>false</protected>
        <recipients>
            <recipient>mkolek@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>rflint@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <recipients>
            <recipient>sellis@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderAddress>support@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/Upcoming_training_reminder_062311</template>
    </alerts>
    <alerts>
        <fullName>Email_Reminder_to_trainer_to_send_survey</fullName>
        <description>Email Reminder to trainer to send survey</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Survey_Follow_up_reminder_062311</template>
    </alerts>
    <alerts>
        <fullName>Email_to_KIE_that_Infrastructure_Training_has_been_Scheduled</fullName>
        <description>Email to KIE that Infrastructure Training has been Scheduled</description>
        <protected>false</protected>
        <recipients>
            <recipient>rflint@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/New_Training_Scheduled</template>
    </alerts>
    <alerts>
        <fullName>Email_to_revert_VM</fullName>
        <ccEmails>Training@kcura.com</ccEmails>
        <description>Email to revert Q &amp; A Webinar VM</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>RCA/Revert_RCA_Q_A_webinar_vm</template>
    </alerts>
    <alerts>
        <fullName>Email_to_sales_for_open_training_seat</fullName>
        <description>Email to sales for open training seat</description>
        <protected>false</protected>
        <recipients>
            <recipient>egorny@kcura.com</recipient>
            <type>user</type>
        </recipients>
        <senderAddress>support@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Sales/Spot_Opened_for_Training_070711</template>
    </alerts>
    <alerts>
        <fullName>Email_to_trainer_about_new_training_scheduled_all_day</fullName>
        <description>Notification to Trainer of new session 062911 With All Day Calendar Invite</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/ICS_Attachment_All_Day</template>
    </alerts>
    <alerts>
        <fullName>Email_to_trainer_about_new_training_scheduled_webinar</fullName>
        <ccEmails>CS-WebinarRoom@kcura.com</ccEmails>
        <description>Notification to Trainer of new session 062911 With Calendar Invite- Webinar</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/ICS_Attachment</template>
    </alerts>
    <alerts>
        <fullName>Email_to_trainer_about_new_training_scheduled_while_creating_training</fullName>
        <description>Email to trainer about new training scheduled while creating training</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Notification_to_Trainer_of_new_session_062911</template>
    </alerts>
    <alerts>
        <fullName>Facility_Feedback_Survey_Email</fullName>
        <description>Facility Feedback Survey Email</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>support@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/Facility_Feedback_Survey</template>
    </alerts>
    <alerts>
        <fullName>IT_Requirements_not_met_7_days_before</fullName>
        <ccEmails>training@kcura.com</ccEmails>
        <description>IT Requirements not met 7 days before</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/IT_Requirements_not_met</template>
    </alerts>
    <alerts>
        <fullName>IT_Training_Reminder</fullName>
        <ccEmails>itsupport@kcura.com</ccEmails>
        <description>IT Training Reminder</description>
        <protected>false</protected>
        <senderAddress>support@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>IT/Upcoming_training_reminder_IT</template>
    </alerts>
    <alerts>
        <fullName>Infrastructure_Training_Reminder</fullName>
        <ccEmails>admin@kcura.com</ccEmails>
        <description>Infrastructure Training Reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_infrastructure_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Infrastructure_Training_Reminder_Onsite</fullName>
        <description>Infrastructure Training Reminder Onsite</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_infrastructure_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Internal_admin_training_drink_reminder</fullName>
        <description>Internal admin training drink reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>support@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/Reminder_to_trainer_to_send_drink_email_070711</template>
    </alerts>
    <alerts>
        <fullName>Method_Training_Reminder</fullName>
        <ccEmails>admin@kcura.com</ccEmails>
        <description>Legal Hold Training Reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_Method_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Method_Training_Reminder_Onsite</fullName>
        <description>Legal Hold Training Reminder Onsite</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_Method_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>Method_Training_Requested_Scheduled_Sales</fullName>
        <ccEmails>sales@kcura.com</ccEmails>
        <description>Method Training Requested/Scheduled Sales</description>
        <protected>false</protected>
        <senderType>CurrentUser</senderType>
        <template>Sales/Method_Training_Sales</template>
    </alerts>
    <alerts>
        <fullName>Method_Webinar_Remidner</fullName>
        <description>Legal Hold Webinar Remidner</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/Method_Training_Reminder_Email</template>
    </alerts>
    <alerts>
        <fullName>Notification_to_Co_Trainer_of_new_session_062911_With_All_Day_Calendar_Invite</fullName>
        <description>Notification to Co-Trainer of new session 062911 With All Day Calendar Invite</description>
        <protected>false</protected>
        <recipients>
            <field>Team_Teaching__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/ICS_Attachment_All_Day_Co_Proctor</template>
    </alerts>
    <alerts>
        <fullName>Notification_to_Finance_that_Training_Class_is_Completed</fullName>
        <ccEmails>finance@kcura.com</ccEmails>
        <description>Notification to Finance that Training Class is Completed</description>
        <protected>false</protected>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Training_Completed_to_Finance_070711</template>
    </alerts>
    <alerts>
        <fullName>Notification_to_Team_Teacher_1_with_calendar_invite_Webinar</fullName>
        <description>Notification to Team Teacher 1 with calendar invite-Webinar</description>
        <protected>false</protected>
        <recipients>
            <field>Team_Teaching__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training_Survey_Results_Templates/ICS_Attachment2</template>
    </alerts>
    <alerts>
        <fullName>Notification_to_Team_Teacher_2_of_new_session_With_All_Day_Calendar_Invite</fullName>
        <description>Notification to Team Teacher 2 of new session With All Day Calendar Invite</description>
        <protected>false</protected>
        <recipients>
            <field>Team_Teacher_2__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/ICS_Attachment_All_Day_Co_Proctor</template>
    </alerts>
    <alerts>
        <fullName>Notification_to_Team_Teacher_2_with_calendar_invite_Webinar</fullName>
        <description>Notification to Team Teacher 2 with calendar invite-Webinar</description>
        <protected>false</protected>
        <recipients>
            <field>Team_Teacher_2__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training_Survey_Results_Templates/ICS_Attachment2</template>
    </alerts>
    <alerts>
        <fullName>Notification_to_Training_Evaluator_of_new_session_With_All_Day_Calendar_Invite</fullName>
        <description>Notification to Training Evaluator of new session With All Day Calendar Invite</description>
        <protected>false</protected>
        <recipients>
            <field>Training_Evaluator__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/ICS_Attachment_All_Day_Evaluator</template>
    </alerts>
    <alerts>
        <fullName>Notification_to_Training_Evaluator_with_calendar_invite_Webinar</fullName>
        <description>Notification to Training Evaluator with calendar invite-Webinar</description>
        <protected>false</protected>
        <recipients>
            <field>Training_Evaluator__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/ICS_Attachment_for_Evaluator</template>
    </alerts>
    <alerts>
        <fullName>Reminder_Alert_to_Close_Training</fullName>
        <description>Reminder Alert to Close Training</description>
        <protected>false</protected>
        <recipients>
            <type>owner</type>
        </recipients>
        <senderAddress>sales@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Sales/Reminder_to_Close_Sales_Training</template>
    </alerts>
    <alerts>
        <fullName>Reminder_to_Close_Training</fullName>
        <description>Reminder to Close Training</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Close_Training_Reminder_Email</template>
    </alerts>
    <alerts>
        <fullName>Team_Teacher_2_Assigned_to_2_Day_Training</fullName>
        <description>Team Teacher 2 Assigned to 2 Day Training</description>
        <protected>false</protected>
        <recipients>
            <field>Team_Teacher_2__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/ICS_Invite_2_Day_Training_for_Co_Trainer</template>
    </alerts>
    <alerts>
        <fullName>Trainer_Assigned_to_2_Day_Training</fullName>
        <description>Trainer Assigned to 2 Day Training</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/ICS_Attachment_Two_Day</template>
    </alerts>
    <alerts>
        <fullName>Training_Reminder</fullName>
        <ccEmails>admin@kcura.com,</ccEmails>
        <description>Training Reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>support@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/Upcoming_training_reminder_062311</template>
    </alerts>
    <alerts>
        <fullName>Training_Reminder_email_for_non_Chicago_trainings</fullName>
        <description>Training Reminder email for non-Chicago trainings</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderAddress>support@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/Upcoming_training_reminder_062311</template>
    </alerts>
    <alerts>
        <fullName>Training_class_is_full</fullName>
        <ccEmails>marketing@kcura.com</ccEmails>
        <description>Training class is full</description>
        <protected>false</protected>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Relativity_Training_Class_Full</template>
    </alerts>
    <alerts>
        <fullName>Turn_Off_VMs_for_Custom_Class_trainings</fullName>
        <ccEmails>training@kcura.com</ccEmails>
        <description>Turn Off VMs for Custom Class trainings</description>
        <protected>false</protected>
        <senderType>CurrentUser</senderType>
        <template>Training/X5_hour_reminder_after_Training</template>
    </alerts>
    <alerts>
        <fullName>Turn_On_Vms_for_Custom_Class</fullName>
        <ccEmails>training@kcura.com</ccEmails>
        <description>Turn On Vms for Custom Class</description>
        <protected>false</protected>
        <senderType>CurrentUser</senderType>
        <template>Training/X96_hr_reminder_before_training</template>
    </alerts>
    <alerts>
        <fullName>Webinar_Training_Reminder</fullName>
        <description>Webinar Training Reminder</description>
        <protected>false</protected>
        <recipients>
            <field>Trainer__c</field>
            <type>userLookup</type>
        </recipients>
        <senderType>CurrentUser</senderType>
        <template>Automated_Training_Emails/Upcoming_Webinar_training_reminder</template>
    </alerts>
    <alerts>
        <fullName>X1_hour_reminder_after_webinar_training</fullName>
        <ccEmails>education@kcura.com</ccEmails>
        <description>1 hour reminder after webinar training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/X1_hr_after_webinar</template>
    </alerts>
    <alerts>
        <fullName>X5_hours_after_reminder_for_analytics_or_Method_training</fullName>
        <ccEmails>education@kcura.com</ccEmails>
        <description>5 hours after reminder for analytics or Method training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/X5_hour_reminder_after_Training</template>
    </alerts>
    <alerts>
        <fullName>X5_hr_reminder_after_RAR_or_Processing_training</fullName>
        <ccEmails>advice@kcura.com</ccEmails>
        <description>5 hr reminder after RAR or Processing training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/X5_hour_reminder_after_Training</template>
    </alerts>
    <alerts>
        <fullName>X5_hr_reminder_after_infrastructure_training</fullName>
        <ccEmails>training@kcura.com</ccEmails>
        <description>5 hr reminder after infrastructure training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/X5_hour_reminder_after_Training</template>
    </alerts>
    <alerts>
        <fullName>X96_hours_before_RAR_or_Processing_training</fullName>
        <ccEmails>advice@kcura.com</ccEmails>
        <description>96 hours before RAR or Processing training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/X96_hr_reminder_before_training</template>
    </alerts>
    <alerts>
        <fullName>X96_hours_before_infrastructure_training</fullName>
        <ccEmails>Training@kcura.com</ccEmails>
        <description>96 hours before infrastructure training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/X96_hr_reminder_before_training</template>
    </alerts>
    <alerts>
        <fullName>X96_hr_reminder_before_analytics_or_method_training</fullName>
        <ccEmails>education@kcura.com</ccEmails>
        <description>96 hr reminder before analytics or method training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Training/X96_hr_reminder_before_training</template>
    </alerts>
    <alerts>
        <fullName>email_to_Finance_Cancelled_Closed_Training</fullName>
        <ccEmails>Finance@kcura.com</ccEmails>
        <description>email to Finance, Cancelled Closed Training</description>
        <protected>false</protected>
        <senderAddress>training@kcura.com</senderAddress>
        <senderType>OrgWideEmailAddress</senderType>
        <template>Automated_Training_Emails/email_to_Finance_for_Cancelled_Closed_Training</template>
    </alerts>
    <fieldUpdates>
        <fullName>Binders_Sales_Training_2_Credits</fullName>
        <field>RCE_Credits__c</field>
        <formula>2</formula>
        <name>Binders Sales Training 2 Credits</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Null_out_Laptop_Information_field</fullName>
        <field>Laptop_Information__c</field>
        <name>Null out Laptop Information field</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Null</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Populate_Training_Group_ID</fullName>
        <field>Training_Group_ID__c</field>
        <formula>Training_Type__r.Training_Group__r.Id</formula>
        <name>Populate Training Group ID</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Sales_Training_4_Credits</fullName>
        <field>RCE_Credits__c</field>
        <formula>4</formula>
        <name>Sales Training 4 Credits</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_0_Credits</fullName>
        <field>RCE_Credits__c</field>
        <formula>0</formula>
        <name>Set 0 Credits</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_16_Training_Hours</fullName>
        <field>Training_Hours__c</field>
        <formula>16</formula>
        <name>Set 16 Training Hours</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_1_Training_Hour</fullName>
        <field>Training_Hours__c</field>
        <formula>1</formula>
        <name>Set 1 Training Hour</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_4_Training_Hours</fullName>
        <field>Training_Hours__c</field>
        <formula>4</formula>
        <name>Set 4 Training Hours</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_8_Training_Hours</fullName>
        <field>Training_Hours__c</field>
        <formula>8</formula>
        <name>Set 8 Training Hours</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_Billable_to_No</fullName>
        <field>Billable__c</field>
        <literalValue>No</literalValue>
        <name>Set Billable to No</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_Environment_to_kPlex</fullName>
        <field>Environment__c</field>
        <literalValue>Kplex</literalValue>
        <name>Set Environment to kPlex</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_RCE_Credits_for_Training</fullName>
        <field>RCE_Credits__c</field>
        <formula>Training_Type__r.RCE_Credits__c</formula>
        <name>Set RCE Credits for Training</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Set_Training_class_size_to_10</fullName>
        <field>Class_Size__c</field>
        <formula>10</formula>
        <name>Set Training class size to 10</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Allow_Credits_for_Multiple_Ts</fullName>
        <field>Allow_Credits_from_Multiple_Trainings__c</field>
        <literalValue>1</literalValue>
        <name>Update Allow Credits for Multiple Ts</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Create_Calendar_Event</fullName>
        <field>Create_Calendar_Event__c</field>
        <literalValue>1</literalValue>
        <name>Update Create Calendar Event</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Delivery_Method_to_Class</fullName>
        <field>Delivery_Method__c</field>
        <literalValue>Class</literalValue>
        <name>Update Delivery Method to Class</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
        <reevaluateOnChange>true</reevaluateOnChange>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Delivery_Method_to_Class_via_Webi</fullName>
        <field>Delivery_Method__c</field>
        <literalValue>Class via Webinar</literalValue>
        <name>Update Delivery Method to Class via Webi</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
        <reevaluateOnChange>true</reevaluateOnChange>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Delivery_Method_to_Webinar</fullName>
        <field>Delivery_Method__c</field>
        <literalValue>Webinar</literalValue>
        <name>Update Delivery Method to Webinar</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
        <reevaluateOnChange>true</reevaluateOnChange>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Laptop_Information_field</fullName>
        <field>Laptop_Information__c</field>
        <formula>&quot;To complete the training exercises, please bring a laptop that has wireless access and Remote Desktop Connection capabilities.&quot;</formula>
        <name>Update Laptop Information field</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Require_Checklist_for_Trainings</fullName>
        <field>Require_Checklist_for_Trainings__c</field>
        <literalValue>1</literalValue>
        <name>Update Require Checklist for Trainings</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Session_Type_Closed</fullName>
        <field>Session_Type__c</field>
        <literalValue>Closed</literalValue>
        <name>Update Session Type Closed</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Session_Type_Open</fullName>
        <field>Session_Type__c</field>
        <literalValue>Open</literalValue>
        <name>Update Session Type Open</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Literal</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Trainer_Team_at_Close_Field</fullName>
        <field>Trainer_Pod__c</field>
        <formula>IF(CONTAINS(Trainer__r.UserRole.Name, &quot;Pod&quot;), MID(Trainer__r.UserRole.Name, 5, 1),
IF(CONTAINS(Trainer__r.UserRole.Name, &quot;Night&quot;), &quot;Night&quot;,
IF(CONTAINS(Trainer__r.UserRole.Name, &quot;Education&quot;), &quot;Education&quot;,
IF(CONTAINS(Trainer__r.UserRole.Name, &quot;KIE&quot;), &quot;KIE&quot;,
IF(CONTAINS(Trainer__r.UserRole.Name, &quot;QC&quot;), &quot;QC&quot;,
IF(CONTAINS(Trainer__r.UserRole.Name, &quot;Advice&quot;), &quot;Advice&quot;,
IF(CONTAINS(Trainer__r.UserRole.Name, &quot;Technical Writer&quot;),&quot;Documentation&quot;,
IF(CONTAINS(Trainer__r.UserRole.Name, &quot;CS - TS Architect&quot;), &quot;TSA&quot;, &quot;NA&quot;))))))))</formula>
        <name>Update Trainer Team at Close Field</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Training_RCE_Credits_to_2</fullName>
        <field>RCE_Credits__c</field>
        <formula>2</formula>
        <name>Update Training RCE Credits to 2</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Training_RCE_Credits_to_4</fullName>
        <field>RCE_Credits__c</field>
        <formula>4</formula>
        <name>Update Training RCE Credits to 4</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <fieldUpdates>
        <fullName>Update_Training_RCE_Credits_to_8</fullName>
        <field>RCE_Credits__c</field>
        <formula>8</formula>
        <name>Update Training RCE Credits to 8</name>
        <notifyAssignee>false</notifyAssignee>
        <operation>Formula</operation>
        <protected>false</protected>
    </fieldUpdates>
    <rules>
        <fullName>2 Point RCE Credit Update</fullName>
        <actions>
            <name>Update_Training_RCE_Credits_to_2</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <booleanFilter>1</booleanFilter>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Searching in Relativity,Relativity Applications,Method Web,Relativity Assisted Review for End Users,Pre-Release Webinar,Relativity Assisted Review for Administrators,Relativity Reviewer,Relativity Collection Webinar</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>2 Point RCE Credit Update for Binders Sales Training</fullName>
        <actions>
            <name>Binders_Sales_Training_2_Credits</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <booleanFilter>1 AND 2</booleanFilter>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Sales</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Type_Sub__c</field>
            <operation>equals</operation>
            <value>Binders</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>2 Point RCE Credit Update for Legal Hold Webinar</fullName>
        <actions>
            <name>Update_Training_RCE_Credits_to_2</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Legal Hold</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Delivery_Method__c</field>
            <operation>equals</operation>
            <value>Webinar</value>
        </criteriaItems>
        <description>Give 2 credits to Legal Hold Webinars</description>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>4 Point RCE Credit Update</fullName>
        <actions>
            <name>Update_Training_RCE_Credits_to_4</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Legal Hold</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>4 Point RCE Credit Update for Sales Training</fullName>
        <actions>
            <name>Sales_Training_4_Credits</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <booleanFilter>1 AND 2</booleanFilter>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Sales</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Type_Sub__c</field>
            <operation>notEqual</operation>
            <value>Binders</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>8 Point RCE Credit Update</fullName>
        <actions>
            <name>Update_Training_RCE_Credits_to_8</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Infrastructure,Relativity Assisted Review,Analytics,Method</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>8 Point RCE Credit Update for Legal Hold Class Trainings</fullName>
        <actions>
            <name>Update_Training_RCE_Credits_to_8</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Legal Hold</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Delivery_Method__c</field>
            <operation>equals</operation>
            <value>Class,Class via Webinar</value>
        </criteriaItems>
        <description>Give 8 credits to Legal Hold Webinars</description>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Admin Training Chicago Reminder Monday</fullName>
        <active>true</active>
        <formula>AND( 	CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, 	ISPICKVAL(Location__c, &quot;Chicago&quot;), 	Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;, 	NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)), 	NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), 	DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Admin_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Admin Training Chicago Reminder T-F</fullName>
        <active>true</active>
        <formula>AND( 	CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, 	ISPICKVAL(Location__c, &quot;Chicago&quot;), 	NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)), 	NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), 	Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;, 	DATEVALUE(LastModifiedDate) &gt; DATE(2012,1,3) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Admin_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Admin Training Onsite Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;, DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Admin_Onsite_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Admin Training Onsite Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Admin_Onsite_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Admin Training Reminder Chicago</fullName>
        <active>true</active>
        <formula>AND( 	Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;, 	ISPICKVAL(Location__c, &quot;Chicago&quot;), 	OR( 		ISPICKVAL(Status__c, &quot;Requested&quot;), 		ISPICKVAL(Status__c, &quot;Scheduled&quot;) 	), 	Start_Date__c &gt; DATETIMEVALUE(&quot;2012-11-26 00:00:00&quot;) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Admin_Training_Reminder_Chicago_Sales</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-1</timeLength>
            <workflowTimeTriggerUnit>Days</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Analytics Training Chicago Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Analytics&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Analytics_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Analytics Training Chicago Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Analytics&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Analytics_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Analytics Training Onsite Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Analytics&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Analytics_Training_Reminder_Onsite</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Analytics Training Onsite Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Analytics&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Analytics_Training_Reminder_Onsite</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Ask the Expert Training Ended</fullName>
        <active>true</active>
        <formula>AND(NOT(ISPICKVAL(Status__c, &quot;Cancelled&quot;)), Training_Type__r.Training_Group__r.Name = &quot;Ask The Expert&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Ask_The_Expert_Training_has_Ended</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>1</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Co-Trainer assigned to 1 Day training</fullName>
        <actions>
            <name>Notification_to_Co_Trainer_of_new_session_062911_With_All_Day_Calendar_Invite</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( 	NOT(ISPICKVAL(Location__c, &quot;Web&quot;)), 	NOT(Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;), 	OR( 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISCHANGED(Team_Teaching__c ) 		), 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISNEW(), 			NOT(ISBLANK(Team_Teaching__c)) 		) 	) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Co-Trainer assigned to 2 Day training</fullName>
        <actions>
            <name>Co_Trainer_Assigned_to_2_Day_Training</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( 	NOT(ISPICKVAL(Location__c, &quot;Web&quot;)), 	Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;, 	OR( 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISCHANGED(Team_Teaching__c) 		), 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISNEW(), 			NOT(ISBLANK(Team_Teaching__c)) 		) 	) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Email to Finance for Cancelled Trainings</fullName>
        <actions>
            <name>email_to_Finance_Cancelled_Closed_Training</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(ISCHANGED(Status__c), ISPICKVAL(Status__c, &quot;Cancelled&quot;),ISPICKVAL(Session_Type__c, &quot;Closed&quot;),  Start_Date_Only__c -Today()&lt;= 5)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Facility Feedback Survey - Training</fullName>
        <actions>
            <name>Facility_Feedback_Survey_Email</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <criteriaItems>
            <field>Training_Relativity__c.Status__c</field>
            <operation>equals</operation>
            <value>Completed</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Location__c</field>
            <operation>equals</operation>
            <value>Onsite</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Session_Type_Formula__c</field>
            <operation>equals</operation>
            <value>Open</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>IT Training Reminder Monday</fullName>
        <active>false</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),
1, 1, 0) = 1, 
ISPICKVAL(Location__c, &quot;Chicago&quot;),
OR(
ISPICKVAL( Type__c , &quot;Admin&quot;), 
ISPICKVAL( Type__c , &quot;infrastructure&quot;), 
ISPICKVAL( Type__c , &quot;Method&quot;),
ISPICKVAL( Type__c , &quot;Analytics&quot;))
)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>IT_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>IT Training Reminder T-F</fullName>
        <active>false</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),
0, 0,
1, 0,
6, 0,
1) = 1,
ISPICKVAL(Location__c, &quot;Chicago&quot;),
OR(
ISPICKVAL( Type__c , &quot;Admin&quot;),
ISPICKVAL( Type__c , &quot;infrastructure&quot;),
ISPICKVAL( Type__c , &quot;Method&quot;),
ISPICKVAL( Type__c , &quot;Analytics&quot;))
)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>IT_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>IT requirements not met 7 Days Before</fullName>
        <active>true</active>
        <formula>AND(   Confirmed_IT_Requirements__c = FALSE,   NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),   OR(     ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class&quot;),     ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;)   ),   NOT(ISPICKVAL(Location__c, &quot;Chicago&quot; )) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>IT_Requirements_not_met_7_days_before</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-7</timeLength>
            <workflowTimeTriggerUnit>Days</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Infrastructure Training Chicago Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Infrastructure_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Infrastructure Training Chicago Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Infrastructure_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Infrastructure Training Onsite Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Infrastructure_Training_Reminder_Onsite</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Infrastructure Training Onsite Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Infrastructure_Training_Reminder_Onsite</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Infrastructure Training Scheduled</fullName>
        <actions>
            <name>Email_to_KIE_that_Infrastructure_Training_has_been_Scheduled</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(   ISPICKVAL( Status__c , &quot;Scheduled&quot;),   Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;,   NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Webinar&quot;)),   NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;))  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Internal Reminder for drinks post admin session</fullName>
        <active>false</active>
        <formula>AND(ISPICKVAL(Type__c, &quot;Admin&quot;),
        ISPICKVAL(Location__c, &quot;Chicago&quot;),
        DATEVALUE(Start_Date__c) &gt;  DATE(2011,4,21),
        OR(SendEmail__c == True,
               DATEVALUE( CreatedDate ) &gt;  DATE(2011,5,9)
        )
)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Internal_admin_training_drink_reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-1</timeLength>
            <workflowTimeTriggerUnit>Days</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Laptop Not Provided for Training</fullName>
        <actions>
            <name>Update_Laptop_Information_field</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <criteriaItems>
            <field>Training_Relativity__c.Laptops_Provided__c</field>
            <operation>equals</operation>
            <value>False</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Location__c</field>
            <operation>equals</operation>
            <value>Onsite</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Session_Type__c</field>
            <operation>equals</operation>
            <value>Open</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Laptop Provided for Training</fullName>
        <actions>
            <name>Null_out_Laptop_Information_field</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <criteriaItems>
            <field>Training_Relativity__c.Laptops_Provided__c</field>
            <operation>equals</operation>
            <value>True</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Legal Hold Training Chicago Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Method_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Legal Hold Training Chicago Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Method_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Legal Hold Training Onsite Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Method_Training_Reminder_Onsite</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Legal Hold Training Onsite Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Onsite&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)),  Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;,   DATEVALUE(LastModifiedDate)  &gt;  DATE(2012,1,3)  )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Method_Training_Reminder_Onsite</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Legal Hold Webinar Reminder</fullName>
        <active>true</active>
        <formula>AND(ISPICKVAL(Location__c, &quot;Web&quot;), Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;,NOT(ISPICKVAL( Status__c , &quot;Canceled&quot;)),  DATEVALUE(LastModifiedDate) &gt; DATE(2012, 03, 06))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Method_Webinar_Remidner</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-7</timeLength>
            <workflowTimeTriggerUnit>Days</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>Method_Webinar_Remidner</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Method Training Requested%2FScheduled</fullName>
        <actions>
            <name>Method_Training_Requested_Scheduled_Sales</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Method,Method Web</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Status__c</field>
            <operation>equals</operation>
            <value>Requested,Scheduled</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>New Training Requested - Chicago</fullName>
        <actions>
            <name>EmailNewTrainingRequestedChicago</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <formula>AND(ISPICKVAL(Status__c, &quot;Requested&quot;), ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;))</formula>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>New Training Requested - Onsite</fullName>
        <actions>
            <name>EmailNewTrainingRequested</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Status__c</field>
            <operation>equals</operation>
            <value>Requested</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Location__c</field>
            <operation>equals</operation>
            <value>Onsite</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>notEqual</operation>
            <value>Sales</value>
        </criteriaItems>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>New Training Requested Web</fullName>
        <actions>
            <name>EmailNewTrainingRequested</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Status__c</field>
            <operation>equals</operation>
            <value>Requested</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Location__c</field>
            <operation>equals</operation>
            <value>Web</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>notEqual</operation>
            <value>Sales</value>
        </criteriaItems>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>No RCE Credit Update</fullName>
        <actions>
            <name>Set_0_Credits</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Advice Day,RCA,Admin</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Notification for Training Completed</fullName>
        <actions>
            <name>Notification_to_Finance_that_Training_Class_is_Completed</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <description>Trigger when Training Class status set to Completed</description>
        <formula>OR( AND(   ISPICKVAL(Status__c, &quot;Completed&quot;),   NOT(ISPICKVAL(Billable__c, &quot;No&quot;)) ),   AND(   ISPICKVAL(Status__c, &quot;Completed&quot;),   ISPICKVAL(Travel_Billable__c, &quot;Yes&quot;)   ) )   /*AND(   ISPICKVAL(Status__c, &quot;Completed&quot;),   NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),   NOT(Training_Type__r.Training_Group__r.Name = &quot;Applications Webinar&quot;),   NOT(Training_Type__r.Training_Group__r.Name = &quot;Reviewer&quot;) )*/</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Onsite Traing Scheduled - Create Task</fullName>
        <actions>
            <name>BookTravelforOnsiteTraining</name>
            <type>Task</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Location__c</field>
            <operation>equals</operation>
            <value>Onsite</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Populate Training Group ID</fullName>
        <actions>
            <name>Populate_Training_Group_ID</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>Training_Type__r.Training_Group__c &lt;&gt; null</formula>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>Reminder email for webinar training VM Configuration</fullName>
        <active>true</active>
        <description>Reminder for webinar training goes to education</description>
        <formula>AND(
	OR(
		ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Webinar&quot;),
		ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;)
	),
	OR(
		Training_Type__r.Training_Group__r.Name = &quot;Advanced Searching&quot;,
		Training_Type__r.Training_Group__r.Name = &quot;Applications&quot;,
		Training_Type__r.Training_Group__r.Name = &quot;Applications Webinar&quot;,
		Training_Type__r.Training_Group__r.Name = &quot;Relativity Assisted Review for Admins&quot;,
		Training_Type__r.Training_Group__r.Name = &quot;Relativity Assisted Review for End Users&quot;,
		Training_Type__r.Training_Group__r.Name = &quot;Reviewer&quot;,
		Training_Type__r.Training_Group__r.Name = &quot;Collection Webinar&quot;
	),
	NOT(ISPICKVAL(Status__c , &quot;Cancelled&quot;)),
	CreatedDate &gt; DATETIMEVALUE(&quot;2013-03-31 00:00:00&quot;)
)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X1_hour_reminder_after_webinar_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>1</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Reminder for Analytics%2C Method Relativity Applications%2C or Developer training VM configuration</fullName>
        <active>true</active>
        <description>Reminder for Analytics or Method or Developer training vm configuration. Goes to Education</description>
        <formula>AND( 	NOT(ISPICKVAL(Delivery_Method__c, &quot;Webinar&quot;)), 	NOT(ISPICKVAL(Delivery_Method__c, &quot;Class via Webinar&quot;)), 	OR( 		Training_Type__r.Training_Group__r.Name = &quot;Analytics&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Developer&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Applications&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Reviewer&quot;,Training_Type__r.Training_Group__r.Name = &quot;Collection&quot; 	), 	NOT(ISPICKVAL(Status__c, &quot;Cancelled&quot;)),  	Start_Date__c &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X5_hours_after_reminder_for_analytics_or_Method_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>X96_hr_reminder_before_analytics_or_method_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-96</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Reminder for Custom Class trainings</fullName>
        <active>true</active>
        <description>Reminder to Configure VMs for Custom class Trainings Goes to Education</description>
        <formula>AND( 	NOT(ISPICKVAL(Status__c , &quot;Cancelled&quot;)), 	Training_Type__r.Training_Group__r.Name = &quot;Custom&quot;, 	Start_Date__c &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Turn_On_Vms_for_Custom_Class</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-96</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>Turn_Off_VMs_for_Custom_Class_trainings</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Reminder for Infrastructure training</fullName>
        <active>true</active>
        <description>Reminder for Infrastructure Training VM configurations. Goes to training@kcura.com.</description>
        <formula>AND( 	Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;, 	NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), 	CreatedDate &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;), NOT( Test_Workflow__c ) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X96_hours_before_infrastructure_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-96</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>X5_hr_reminder_after_infrastructure_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Reminder for RAR or Processing Training VM configuration</fullName>
        <active>true</active>
        <description>Reminder for RAR or processing Training VM configuration goes to education</description>
        <formula>AND( 	OR( 		Training_Type__r.Training_Group__r.Name = &quot;Processing&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Relativity Assisted Review&quot; 	), 	CreatedDate &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;), 	NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), NOT( Test_Workflow__c ) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X96_hours_before_RAR_or_Processing_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-96</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>X5_hr_reminder_after_RAR_or_Processing_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Reminder to Close Sales Training</fullName>
        <active>true</active>
        <formula>AND(ISPICKVAL(Status__c, &quot;Scheduled&quot;), Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Reminder_Alert_to_Close_Training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>1</timeLength>
            <workflowTimeTriggerUnit>Days</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Reminder to Close Training</fullName>
        <active>true</active>
        <criteriaItems>
            <field>Training_Relativity__c.Delivery_Method__c</field>
            <operation>equals</operation>
            <value>Class,Class via Webinar</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Status__c</field>
            <operation>notEqual</operation>
            <value>Completed,Cancelled</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Reminder_to_Close_Training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>20</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Reminder to Revert Q %26 A webinar</fullName>
        <active>true</active>
        <description>This sends an email to the training queue to revert a  VM for a Q &amp; A webinar.</description>
        <formula>AND(  Start_Date__c &gt;=  DATETIMEVALUE(&quot;2013-8-28 05:00:00&quot;), CONTAINS(Name,&quot;RCA Q and A Webinar&quot;), LastModifiedDate &gt;=  DATETIMEVALUE(&quot;2013-9-3 05:00:00&quot;) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Email_to_revert_VM</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>2</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>SFDC Reminder email for webinar training VM Configuration</fullName>
        <active>true</active>
        <description>Reminder for webinar training goes to education</description>
        <formula>AND(   OR(     ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Webinar&quot;),     ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;)   ),   OR(     Training_Type__r.Training_Group__r.Name = &quot;Advanced Searching&quot;,     Training_Type__r.Training_Group__r.Name = &quot;Applications&quot;,     Training_Type__r.Training_Group__r.Name = &quot;Applications Webinar&quot;,     Training_Type__r.Training_Group__r.Name = &quot;Relativity Assisted Review for Admins&quot;,     Training_Type__r.Training_Group__r.Name = &quot;Relativity Assisted Review for End Users&quot;,     Training_Type__r.Training_Group__r.Name = &quot;Reviewer&quot;   ),   NOT(ISPICKVAL(Status__c , &quot;Cancelled&quot;)), Start_Date__c &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;),   CreatedDate &lt; DATETIMEVALUE(&quot;2015-02-16 00:00:00&quot;),
Test_Workflow__c )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X1_hour_reminder_after_webinar_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>1</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>SFDC Reminder for Analytics%2C Method Relativity Applications%2C or Developer training VM configuration</fullName>
        <active>true</active>
        <description>Reminder for Analytics or Method or Developer training vm configuration. Goes to Education</description>
        <formula>AND( 	NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Webinar&quot;)), 	NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;)), 	OR( 		Training_Type__r.Training_Group__r.Name = &quot;Analytics&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Developer&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Applications&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Reviewer&quot; 	), 	NOT(ISPICKVAL(Status__c, &quot;Cancelled&quot;)),  	Start_Date__c &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;),  CreatedDate &lt; DATETIMEVALUE(&quot;2014-09-17 00:00:00&quot;),
Test_Workflow__c 
 )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X96_hr_reminder_before_analytics_or_method_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-96</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>X5_hours_after_reminder_for_analytics_or_Method_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>SFDC Reminder for Infrastructure training</fullName>
        <active>true</active>
        <description>Reminder for Infrastructure Training VM configurations. Goes to training@kcura.com.</description>
        <formula>AND( 	Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;, 	NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), 	Start_Date__c &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;),
	CreatedDate &lt; DATETIMEVALUE(&quot;2014-09-17 00:00:00&quot;),
	Test_Workflow__c )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X5_hr_reminder_after_infrastructure_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>X96_hours_before_infrastructure_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-96</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>SFDC Reminder for RAR or Processing Training VM configuration</fullName>
        <active>true</active>
        <description>Reminder for RAR or processing Training VM configuration goes to education</description>
        <formula>AND( 	OR( 		Training_Type__r.Training_Group__r.Name = &quot;Processing&quot;, 		Training_Type__r.Training_Group__r.Name = &quot;Relativity Assisted Review&quot; 	), 	Start_Date__c &gt; DATETIMEVALUE(&quot;2013-03-01 00:00:00&quot;),
	CreatedDate &lt; DATETIMEVALUE(&quot;2014-09-17 00:00:00&quot;),
	Test_Workflow__c, 	NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>X5_hr_reminder_after_RAR_or_Processing_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>5</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
        <workflowTimeTriggers>
            <actions>
                <name>X96_hours_before_RAR_or_Processing_training</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-96</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Sales Training</fullName>
        <actions>
            <name>Set_Billable_to_No</name>
            <type>FieldUpdate</type>
        </actions>
        <actions>
            <name>Set_Environment_to_kPlex</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Seat Opened for training</fullName>
        <actions>
            <name>Email_to_sales_for_open_training_seat</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <description>Alert to sales when a seat opens for a training session</description>
        <formula>AND(PRIORVALUE(Total_Attendees__c) ==  Class_Size__c, Total_Attendees__c &lt;&gt; Class_Size__c,  Total_on_Waitlist__c &lt;&gt; 0)</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Set 1 Training Hour</fullName>
        <actions>
            <name>Set_1_Training_Hour</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>OR(   Training_Type__r.Training_Group__r.Name = &quot;Applications Webinar&quot;,   Training_Type__r.Training_Group__r.Name = &quot;RAR for Admins&quot;,   Training_Type__r.Training_Group__r.Name = &quot;RAR for End Users&quot;,  Training_Type__r.Training_Group__r.Name = &quot;Reviewer&quot;,   Training_Type__r.Training_Group__r.Name = &quot;Advanced Searching&quot;, AND(  Training_Type__r.Training_Group__r.Name = &quot;Legal Hold Webinar&quot;, NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class&quot;)) ) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Set 16 Training Hours</fullName>
        <actions>
            <name>Set_16_Training_Hours</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Set 4 Training Hours</fullName>
        <actions>
            <name>Set_4_Training_Hours</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>AND( 	Training_Type__r.Training_Group__r.Name = &quot;Legal Hold&quot;, ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class&quot;) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Set 8 Training Hours</fullName>
        <actions>
            <name>Set_8_Training_Hours</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>OR(   Training_Type__r.Training_Group__r.Name = &quot;Applications&quot;, Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;,   Training_Type__r.Training_Group__r.Name = &quot;RAR&quot;,  Training_Type__r.Training_Group__r.Name = &quot;Processing&quot;,   Training_Type__r.Training_Group__r.Name = &quot;Analytics&quot;, Training_Type__r.Training_Group__r.Name = &quot;Developer&quot;,  Training_Type__r.Training_Group__r.Name = &quot;Advice Day&quot;,
Training_Type__r.Training_Group__r.Name = &quot;Advice Day-Multiple Credits&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Set Class size for onsite training</fullName>
        <actions>
            <name>Set_Training_class_size_to_10</name>
            <type>FieldUpdate</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>equals</operation>
            <value>Analytics,Infrastructure,Admin</value>
        </criteriaItems>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>Set RCE Credits for Training</fullName>
        <actions>
            <name>Set_RCE_Credits_for_Training</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>true</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Team Teacher 1 assigned to training webinar</fullName>
        <actions>
            <name>Notification_to_Team_Teacher_1_with_calendar_invite_Webinar</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(  ISPICKVAL(Location__c, &quot;Web&quot;),  OR(  AND(  NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISCHANGED(Team_Teaching__c)  ),  AND(  NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISNEW(),  NOT(ISBLANK(Team_Teaching__c))  )  )  )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Team Teacher 2 assigned to 1 Day training</fullName>
        <actions>
            <name>Notification_to_Team_Teacher_2_of_new_session_With_All_Day_Calendar_Invite</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( 	NOT(ISPICKVAL(Location__c, &quot;Web&quot;)), 	NOT(Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;), 	OR( 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISCHANGED(Team_Teacher_2__c) 		), 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISNEW(), 			NOT(ISBLANK(Team_Teacher_2__c)) 		) 	) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Team Teacher 2 assigned to 2 Day training</fullName>
        <actions>
            <name>Team_Teacher_2_Assigned_to_2_Day_Training</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( 	NOT(ISPICKVAL(Location__c, &quot;Web&quot;)), 	Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;, 	OR( 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISCHANGED( Team_Teacher_2__c ) 		), 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISNEW(), 			NOT(ISBLANK(Team_Teacher_2__c )) 		) 	) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Team Teacher 2 assigned to training webinar</fullName>
        <actions>
            <name>Notification_to_Team_Teacher_2_with_calendar_invite_Webinar</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(  ISPICKVAL(Location__c, &quot;Web&quot;),  OR(  AND(  NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISCHANGED(Team_Teacher_2__c)  ),  AND(  NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISNEW(),  NOT(ISBLANK(Team_Teacher_2__c))  )  )  )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Trainer assigned to 1 Day training</fullName>
        <actions>
            <name>Email_to_trainer_about_new_training_scheduled_all_day</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( 	NOT(ISPICKVAL( Location__c, &quot;Web&quot;)), 	NOT(Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;), 	OR( 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISCHANGED(Trainer__c) 		), 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISNEW(), 			NOT(ISBLANK(Trainer__c)) 		) 	) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Trainer assigned to 2 Day training</fullName>
        <actions>
            <name>Trainer_Assigned_to_2_Day_Training</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( 	NOT(ISPICKVAL(Location__c, &quot;Web&quot;)), 	Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;, 	OR( 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISCHANGED(Trainer__c) 		), 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISNEW(), 			NOT(ISBLANK(Trainer__c)) 		) 	) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Trainer assigned to training webinar</fullName>
        <actions>
            <name>Email_to_trainer_about_new_training_scheduled_webinar</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( ISPICKVAL(Location__c, &quot;Web&quot;),  OR( AND( NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISCHANGED(Trainer__c)), AND( NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISNEW(), NOT(ISBLANK(Trainer__c)) ) ) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Trainer assigned to training while creating training</fullName>
        <actions>
            <name>Email_to_trainer_about_new_training_scheduled_while_creating_training</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), NOT(ISBLANK(Trainer__c)) )</formula>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>Training Chicago Reminder Monday</fullName>
        <active>false</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),
1, 1,
0) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(ISPICKVAL( Type__c, &quot;Sales&quot;)))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Training Chicago Reminder T-F</fullName>
        <active>false</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),
0, 0,
1, 0,
6, 0,
1) = 1, ISPICKVAL(Location__c, &quot;Chicago&quot;), NOT(ISPICKVAL( Type__c, &quot;Sales&quot;)))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Training Class Full</fullName>
        <actions>
            <name>Training_class_is_full</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <formula>AND(Class_Size__c ==  Total_Attendees__c, 
        NOT(ISBLANK(Class_Size__c)),
        ISPICKVAL( Session_Type__c, &quot;Open&quot;)
)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Training Evaluator assigned to 1 Day training</fullName>
        <actions>
            <name>Notification_to_Training_Evaluator_of_new_session_With_All_Day_Calendar_Invite</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND( 	NOT(ISPICKVAL(Location__c, &quot;Web&quot;)), 	NOT(Training_Type__r.Training_Group__r.Name = &quot;Admin&quot;), 	OR( 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISCHANGED(Training_Evaluator__c) 		), 		AND( 			NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), 			ISNEW(), 			NOT(ISBLANK(Training_Evaluator__c)) 		) 	) )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Training Evaluator assigned to training webinar</fullName>
        <actions>
            <name>Notification_to_Training_Evaluator_with_calendar_invite_Webinar</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(  ISPICKVAL(Location__c, &quot;Web&quot;),  OR(  AND(  NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISCHANGED(Training_Evaluator__c)  ),  AND(  NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),  ISNEW(),  NOT(ISBLANK(Training_Evaluator__c))  )  )  )</formula>
        <triggerType>onAllChanges</triggerType>
    </rules>
    <rules>
        <fullName>Training Infra Reminder Monday</fullName>
        <active>true</active>
        <description>KIE reminder for Infrastructure trainings not presented in Chicago</description>
        <formula>AND( 	CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),1, 1,0) = 1, 	NOT(ISPICKVAL(Location__c, &quot;Chicago&quot;)),  	Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot; )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Email_Reminder_to_IT_for_training_reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Training Infra Reminder T-F</fullName>
        <active>true</active>
        <description>KIE reminder for Infrastructure trainings not presented in Chicago</description>
        <formula>AND( 	CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),0, 0,1, 0,6, 0,1) = 1, 	NOT(ISPICKVAL(Location__c, &quot;Chicago&quot;)), 	Training_Type__r.Training_Group__r.Name = &quot;Infrastructure&quot;, 	NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Email_Reminder_to_IT_for_training_reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Training Reminder Monday - Not Chicago</fullName>
        <active>false</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),
1, 1,
0) = 1, NOT(ISPICKVAL(Location__c, &quot;Chicago&quot;)), NOT(ISPICKVAL( Type__c, &quot;Sales&quot;)),
NOT(ISPICKVAL(Location__c, &quot;Chicago&quot;)),
NOT(ISBLANK( Trainer__c )))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Training_Reminder_email_for_non_Chicago_trainings</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Training Reminder T-F - Not Chicago</fullName>
        <active>false</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7),
0, 0,
1, 0,
6, 0,
1) = 1, NOT(ISPICKVAL(Location__c, &quot;Chicago&quot;)), NOT(ISPICKVAL( Type__c, &quot;Sales&quot;)),
NOT(ISPICKVAL(Location__c, &quot;Web&quot;)),
NOT(ISBLANK(Trainer__c)))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Training_Reminder_email_for_non_Chicago_trainings</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Training Scheduled - Chicago</fullName>
        <actions>
            <name>EmailSenttoSalesandCSthatTraininghasbeenscheduledChicago</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(   ISPICKVAL(Status__c, &quot;Scheduled&quot;),   ISPICKVAL(Location__c, &quot;Chicago&quot;),   NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),   NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Webinar&quot;)),   NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;)) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Training Scheduled - Not Chicago</fullName>
        <actions>
            <name>EmailSenttoSalesandCSthatTraininghasbeenscheduled</name>
            <type>Alert</type>
        </actions>
        <active>true</active>
        <formula>AND(   ISPICKVAL(Status__c, &quot;Scheduled&quot;),   NOT(ISPICKVAL(Location__c, &quot;Chicago&quot;)),   NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;),   NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Webinar&quot;)),   NOT(ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;)) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Training Scheduled Closed Session</fullName>
        <actions>
            <name>Emai_to_Internal_Sales_for_Closed_Training_Session_Scheduled</name>
            <type>Alert</type>
        </actions>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.Status__c</field>
            <operation>equals</operation>
            <value>Scheduled</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Session_Type__c</field>
            <operation>equals</operation>
            <value>Closed</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>notEqual</operation>
            <value>Sales</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Delivery_Method__c</field>
            <operation>notEqual</operation>
            <value>Webinar,Class via Webinar</value>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Training Survey follow-up reminder</fullName>
        <active>false</active>
        <criteriaItems>
            <field>Training_Relativity__c.End_Date__c</field>
            <operation>notEqual</operation>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Type__c</field>
            <operation>notEqual</operation>
            <value>Sales</value>
        </criteriaItems>
        <description>Reminder sent to trainer after training to send out survey to attendees</description>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Email_Reminder_to_trainer_to_send_survey</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.End_Date__c</offsetFromField>
            <timeLength>1</timeLength>
            <workflowTimeTriggerUnit>Days</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Update Allow Credits for Multiple Trainings</fullName>
        <actions>
            <name>Update_Allow_Credits_for_Multiple_Ts</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>Training_Type__r.Training_Group__r.Allow_Credits_from_Multiple_Trainings__c = TRUE</formula>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>Update Create Calendar Event</fullName>
        <actions>
            <name>Update_Create_Calendar_Event</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>Training_Type__r.Training_Group__r.Create_Calendar_Event__c = TRUE</formula>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>Update Delivery Method to Class</fullName>
        <actions>
            <name>Update_Delivery_Method_to_Class</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Update Delivery Method to Class via Webinar</fullName>
        <actions>
            <name>Update_Delivery_Method_to_Class_via_Webi</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Class via Webinar&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Update Delivery Method to Webinar</fullName>
        <actions>
            <name>Update_Delivery_Method_to_Webinar</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>ISPICKVAL(Training_Type__r.Delivery_Method__c, &quot;Webinar&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Update Require Checklist for Trainings</fullName>
        <actions>
            <name>Update_Require_Checklist_for_Trainings</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>Training_Type__r.Training_Group__r.Require_Checklist_for_Trainings__c = TRUE</formula>
        <triggerType>onCreateOnly</triggerType>
    </rules>
    <rules>
        <fullName>Update Session Type Closed</fullName>
        <actions>
            <name>Update_Session_Type_Closed</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>ISPICKVAL(Training_Type__r.Session_Type__c,&quot;Closed&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Update Session Type Open</fullName>
        <actions>
            <name>Update_Session_Type_Open</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <formula>ISPICKVAL(Training_Type__r.Session_Type__c,&quot;Open&quot;)</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Update Trainer Team at Close Field</fullName>
        <actions>
            <name>Update_Trainer_Team_at_Close_Field</name>
            <type>FieldUpdate</type>
        </actions>
        <active>true</active>
        <criteriaItems>
            <field>Training_Relativity__c.Status__c</field>
            <operation>equals</operation>
            <value>Completed</value>
        </criteriaItems>
        <criteriaItems>
            <field>Training_Relativity__c.Trainer__c</field>
            <operation>notEqual</operation>
        </criteriaItems>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
    </rules>
    <rules>
        <fullName>Webinar Training Reminder Monday</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 1, 1, 0) = 1, ISPICKVAL(Location__c, &quot;Web&quot;), NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), DATEVALUE(LastModifiedDate) &gt; DATE(2012,1,4))</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Webinar_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-69</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <rules>
        <fullName>Webinar Training Reminder T-F</fullName>
        <active>true</active>
        <formula>AND(CASE(MOD( DATEVALUE(Start_Date__c) - DATE(1900, 1, 7), 7), 0, 0, 1, 0, 6, 0, 1) = 1, ISPICKVAL(Location__c, &quot;Web&quot;), NOT(Training_Type__r.Training_Group__r.Name = &quot;Sales&quot;), NOT(ISPICKVAL( Status__c , &quot;Completed&quot;)),NOT(ISPICKVAL( Status__c , &quot;Cancelled&quot;)), DATEVALUE(LastModifiedDate) &gt; DATE(2012,1,4) )</formula>
        <triggerType>onCreateOrTriggeringUpdate</triggerType>
        <workflowTimeTriggers>
            <actions>
                <name>Webinar_Training_Reminder</name>
                <type>Alert</type>
            </actions>
            <offsetFromField>Training_Relativity__c.Start_Date__c</offsetFromField>
            <timeLength>-21</timeLength>
            <workflowTimeTriggerUnit>Hours</workflowTimeTriggerUnit>
        </workflowTimeTriggers>
    </rules>
    <tasks>
        <fullName>BookTravelforOnsiteTraining</fullName>
        <assignedToType>owner</assignedToType>
        <dueDateOffset>1</dueDateOffset>
        <notifyAssignee>false</notifyAssignee>
        <offsetFromField>Training_Relativity__c.CreatedDate</offsetFromField>
        <priority>Normal</priority>
        <protected>false</protected>
        <status>Not Started</status>
        <subject>Book Travel for Onsite Training</subject>
    </tasks>
</Workflow>

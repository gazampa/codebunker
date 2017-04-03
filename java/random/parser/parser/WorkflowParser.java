package parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;

public class WorkflowParser extends DefaultHandler {

        // alert section
        private boolean inAlertSection;
        private boolean inFullName;
		private boolean inCCEmails;
		private boolean inDescription;
        private boolean inRecipients;
        private boolean inRecipient;
        private boolean inType;
		private boolean inTemplate;
		private boolean inProtected;
		private boolean inSenderType;
		private boolean inSenderAddress;

		// field update section : also has protected
		private boolean inFieldUpdates;
		private boolean inField;
		private boolean inLiteralValue;
		private boolean inName;
		private boolean inNotifyAssignee;
		private boolean inOperation;

		// rule section : also has fullname, name, type
        private boolean inRules;
        private boolean inAction;
        private boolean inActive;
		private boolean inFormula;
		private boolean inCriteriaItems;
		private boolean inValue;

		// task section : also has fullname, description, notifyAssignee, protected
        private boolean inTasks;
        private boolean inAssignedTo;
        private boolean inAssignedToType;
        private boolean inDueDateOffset;
		private boolean inOffsetFromField;
        private boolean inPriority;
        private boolean inStatus;
		private boolean inSubject;

		// fields to hold values with document tags
		private AlertDetail currentAlert;
		private StringBuilder recipientField;
		private Recipient recipient;
		private List<Recipient> recipients;
		private RuleDetail currentRule;
		private List<String> aggActionNames;
		private List<String> aggCriteriaItems;
		private StringBuilder criteriaFields;
		private String actionName = new String();
		private String actionType = new String();
		private List<Data> result = new ArrayList<Data>();

		/** join disparate sections by common field - name **/
		private HashMap<String, AlertDetail> alertSection = new HashMap<String, AlertDetail>();
		private HashMap<String, RuleDetail> ruleSection = new HashMap<String, RuleDetail>();

		private CharArrayWriter contents = new CharArrayWriter();

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
			contents.write( ch, start, length );
        }

        @Override
        public void startElement(String uri, String localName,
            String qName, Attributes attributes) throws SAXException {

            contents.reset();

            if (localName != null) {
				// alerts section
                if (localName.equals("alerts")) {
					currentAlert = new AlertDetail();
					recipients = new ArrayList<Recipient>();
					currentAlert.setRecipients(recipients);
                    inAlertSection = true;
                }
				if (localName.equals("fullName")) {
					inFullName = true;
				}
                if (localName.equals("ccEmails")) {
                    inCCEmails = true;
                }
                if (localName.equals("description")) {
                    inDescription = true;
                }
                if (localName.equals("protected")) {
                    inProtected = true;
                }
                if (localName.equals("recipients")) {
                    inRecipients = true;
					recipient = new Recipient();
                }
                if (localName.equals("recipient")) {
                    inRecipient = true;
                }
                if (localName.equals("type")) {
                    inType = true;
                }
                if (localName.equals("senderType")) {
                    inSenderType = true;
                }
                if (localName.equals("senderAddress")) {
                    inSenderAddress = true;
                }
                if (localName.equals("template")) {
                    inTemplate = true;
                }
				// rules section
                if (localName.equals("rules")) {
                    currentRule = new RuleDetail();
					aggActionNames = new ArrayList<String>();
					currentRule.setActionNames(aggActionNames);
					aggCriteriaItems = new ArrayList<String>();
                    currentRule.setCriteriaItems(aggCriteriaItems);
                    inRules = true;
                }
                if (localName.equals("actions")) {
                    inAction = true;
                }
                if (localName.equals("name")) {
                    inName = true;
                }
                if (localName.equals("active")) {
                    inName = true;
                }
                if (localName.equals("criteriaItems")) {
                    inCriteriaItems = true;
                    criteriaFields = new StringBuilder();
                }
                if (localName.equals("field")) {
                    inField = true;
                }
                if (localName.equals("operation")) {
                    inOperation = true;
                }
                if (localName.equals("value")) {
                    inValue = true;
                }
                if (localName.equals("formula")) {
                    inFormula = true;
                }
            	// field updates
                if (localName.equals("fieldUpdates")) {
                    inFieldUpdates = true;
                }
                if (localName.equals("literalValue")) {
                    inFieldUpdates = true;
                }
                if (localName.equals("notifyAssignee")) {
                    inNotifyAssignee = true;
                }
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (localName != null) {
                if (localName.equals("alerts")) {
                    inAlertSection = false;
                	alertSection.put(currentAlert.getFullName(),currentAlert);
                }
                if (inAlertSection && localName.equals("fullName")) {
                    inFullName = false;
                    currentAlert.setFullName(contents.toString());
                }
                if (inAlertSection && localName.equals("ccEmails")) {
                    inCCEmails = false;
                    currentAlert.setCCEmails(contents.toString());
                }
                if (localName.equals("description")) {
                    inDescription = false;
                }
                if (localName.equals("recipients")) {
                    inRecipients = false;
                    recipients.add(recipient);
                }
                if (inAlertSection && inRecipients && localName.equals("recipient")) {
                    inRecipient = false;
                	recipient.setRecipient(contents.toString() );
                }
                if (inAlertSection && inRecipients && localName.equals("type")) {
                    inType = false;
                    recipient.setType( contents.toString() );
                }
                if (inAlertSection && inRecipients && localName.equals("field")) {
                    inField = false;
                    recipient.setField( contents.toString() );
                }
                if (inAlertSection && localName.equals("senderType")) {
                    inSenderType = false;
                	currentAlert.setSenderType((contents.toString()));
                }
                if (inAlertSection && localName.equals("senderAddress")) {
                    inSenderAddress = false;
                	currentAlert.setSenderAddress((contents.toString()));
                }
                if (localName.equals("template")) {
                    inTemplate = false;
                }
				// Rule
                if (localName.equals("rules")) {
                	inRules = false;
                	ruleSection.put(currentRule.getFullName(), currentRule);
					actionName = new String();
					actionType = new String();
                }
                if (inRules && localName.equals("fullName")) {
					currentRule.setFullName(contents.toString());
                    inName = false;
                }
                if (inRules && localName.equals("actions")) {
                    inAction = false;
                }
                if (inRules && inAction && localName.equals("name")) {
                    inName = false;
					actionName = (contents.toString());
				}
                if (inRules && inAction && localName.equals("type")) {
                    inType = false;
					actionType = contents.toString();
					aggActionNames.add(actionName + "_:type:_" + actionType);
                }
                if (inRules && localName.equals("active")) {
					currentRule.setActive(contents.toString());
                    inActive = false;
                }
                if (inRules && localName.equals("criteriaItems")) {
                    inCriteriaItems = false;
                	aggCriteriaItems.add(criteriaFields.toString());
                }
                if (inRules && inCriteriaItems && localName.equals("field")) {
                    inField = false;
					criteriaFields.append(" field : " + contents.toString());
                }
                if (inRules && inCriteriaItems && localName.equals("operation")) {
                    inOperation = false;
					criteriaFields.append(": operation : " + contents.toString());
                }
                if (inRules && inCriteriaItems && localName.equals("value")) {
                    inValue = false;
					criteriaFields.append(": value : " + contents.toString());
                }
                if (inRules && localName.equals("formula")) {
                    inFormula = false;
					currentRule.setFormula(contents.toString());
                }
            }
        }

        @Override
        public void startDocument( ) throws SAXException { }

        @Override
        public void endDocument( ) throws SAXException {
			result = new ArrayList<Data>();
			for ( RuleDetail rule : ruleSection.values() ){
				List<String> actionNames = rule.getActionNames();
				if ("False".equalsIgnoreCase(rule.getActive()))continue;
				for (String name : actionNames){
					//System.out.println("----------> "+name + " <----------");
					//System.out.println(" ---> "+name);
					String nameSpl[] = name.split("_:type:_");
					if ("Alert".equals(nameSpl[1])){
						for (String alertName : alertSection.keySet()){
							if ( nameSpl[0].equals(alertName)){
								//System.out.println( "# " + rule.getActive() + " Rule : " + rule.getFullName() + " : alert : " + alertSection.get(alertName).toString()  );
								Data data = new Data();
								data.setFieldName1(decode(rule.getFullName()));
								AlertDetail alert = alertSection.get(alertName);
								data.setFieldName2(alert.getFullName());
								StringBuilder sb = new StringBuilder();
								if ( alert.getCCEmails()!=null ) { sb.append(alert.getCCEmails());sb.append("; "); }

									for (Recipient field : alert.getRecipients() ){
										if (field!=null ){
											if (field.getRecipient()!=null){
												sb.append(field.getRecipient());
												sb.append("; ");
											}else if (field.getField()!=null){
												sb.append(field.getType());
												sb.append(" ");
												sb.append(field.getField());
												sb.append("; ");
											}else if (field.getType()!=null){
												sb.append(field.getType());
												sb.append("; ");
											}
										}
									}

								data.setFieldName3(sb.toString());
								data.setFieldName4(rule.getCriteriaItems().toString());
								data.setFieldName5(rule.getFormula());
								data.setFieldName6(alert.getSenderType());
								data.setFieldName7(alert.getSenderAddress());
								result.add(data);
								System.out.println("---------> " + data.toString());
							}
						}
					}
				}
			}
		}

		private static String decode(String input){
			String result = null;
			try{
				result = java.net.URLDecoder.decode(input, "UTF-8");
			}catch(UnsupportedEncodingException e){
				;
			}
			return (result!=null)?result:input;
		}

		public List<Data> getResult(){ return result;}
		// turn this into a string[] || JSONArray. more transferable between reports, toString will ouput a ss row.
		public class Data{
			String fieldName1;
			String fieldName2;
			String fieldName3;
			String fieldName4;
			String fieldName5;
			String fieldName6;
			String fieldName7;

			Data(){}

			public String getFieldName1(){ return fieldName1; }
			public String getFieldName2(){ return fieldName2; }
			public String getFieldName3(){ return fieldName3; }
			public String getFieldName4(){ return fieldName4; }
			public String getFieldName5(){ return fieldName5; }
			public String getFieldName6(){ return fieldName6; }
			public String getFieldName7(){ return fieldName7; }

			private void setFieldName1(String val){ fieldName1=val; }
			private void setFieldName2(String val){ fieldName2=val; }
			private void setFieldName3(String val){ fieldName3=val; }
			private void setFieldName4(String val){ fieldName4=val; }
			private void setFieldName5(String val){ fieldName5=val; }
			private void setFieldName6(String val){ fieldName6=val; }
			private void setFieldName7(String val){ fieldName7=val; }

			public String toString(){
				StringBuilder sb = new StringBuilder();
				sb.append(fieldName1);
				sb.append(" :: ");
				sb.append(fieldName2);
				sb.append(" :: ");
				sb.append(fieldName3);
				sb.append(" :: ");
				sb.append(fieldName4);
				sb.append(" :: ");
				sb.append(fieldName5);
				sb.append(" :: ");
				sb.append(fieldName6);
				sb.append(" :: ");
				sb.append(fieldName7);

				return sb.toString();
			}

		}

		private class AlertDetail{

			String fullName;
			String ccEmails;
			String description;
			List<Recipient> recipients;
			String recipientType;
			String protectedF;
			String senderType;
			String senderAddress;
			String template;

			AlertDetail(){}

			public String getFullName(){ return fullName; }
			public String getCCEmails(){ return ccEmails; }
			public String getDescription(){ return description; }
			public String getProtected(){ return protectedF; }
			public String getSenderType(){ return senderType; }
			public String getSenderAddress(){ return senderAddress; }
			public String getTemplate(){ return template; }
			public List<Recipient> getRecipients(){ return recipients; }

			private void setFullName(String val){ fullName=val; }
			private void setCCEmails(String val){ ccEmails=val; }
			private void setDescription(String val){ description=val; }
			private void setRecipients(List<Recipient> obj){ this.recipients = obj; }
			private void setProtected(String val){ protectedF=val; }
			private void setSenderType(String val){ senderType=val; }
			private void setSenderAddress(String val){ senderAddress=val; }
			private void setTemplate(String val){ template=val; }

			public String toString(){
				StringBuilder sb = new StringBuilder();
				sb.append(fullName);
				if (ccEmails!=null){
					sb.append(" : ");
					sb.append(ccEmails);
				}
				if ( null!=recipients ){
					for (Recipient recipient : recipients){
						sb.append(" : ");
						sb.append(recipient.getRecipient());
						sb.append(" : ");
						sb.append(recipient.getType());
						sb.append(" : ");
						sb.append(recipient.getField());
					}
				}
				if (senderType !=null ){
					sb.append(" : ");
					sb.append(senderType);
				}

				return sb.toString();
				}

		}

		private class Recipient{
			String recipient;
			String type;
			String field;

			Recipient(){}

			public String getRecipient(){ return recipient; }
			public String getType(){ return type; }
			public String getField(){ return field; }

			protected void setRecipient(String val){ recipient=val; }
			protected void setType(String val){ type=val; }
			protected void setField(String val){ field=val; }

			public String toString(){
				StringBuilder sb = new StringBuilder();
				sb.append(recipient);
				sb.append(" : ");
				sb.append(type);
				sb.append(" : ");
				sb.append(field);

				return sb.toString();
			}


		}

		private class RuleDetail{

			String fullName;
			List<String> actionNames;
			String actionType;
			String formula;
			String active;
			List<String> criteriaItems;

			RuleDetail(){}

			public String getFullName(){ return fullName; }
			public List<String> getActionNames(){ return actionNames; }
			public String getActionType(){ return actionType; }
			public String getFormula(){ return formula; }
			public String getActive(){ return active; }
			public List<String> getCriteriaItems(){ return criteriaItems; }
			public String getCriteriaItemsAsString(){
				StringBuilder sb = new StringBuilder();
				for (String item : criteriaItems ){
					sb.append(item);
				}
				return sb.toString();
			}

			private void setFullName(String val){ fullName=val; }
			private void setActionNames(List<String> val){ actionNames = val; }
			private void setActionType(String val){ actionType = val; }
			private void setFormula(String val){ formula=val; }
			private void setActive(String val){ active=val; }
			private void setCriteriaItems(List<String> listVal){ criteriaItems=listVal; }

			public String toString(){
				StringBuilder sb = new StringBuilder();
				sb.append("RULE ::::");
				sb.append(" Full Name : ");
				sb.append(fullName);
				sb.append(" : \n");
				if ( null!=actionNames ){
				sb.append("Action Names : \n");
					for (String actionName : actionNames){
						sb.append(actionName);
						sb.append(" : \n");
					}
				}
				sb.append(" :\n ");
				sb.append("Formula : ");
				sb.append(formula );
				sb.append(" :\n");
				if ( null!=criteriaItems ){
					sb.append(" Criteria : \n");
					for (String criteriaItem : criteriaItems){
						sb.append(criteriaItem);
						sb.append(" : \n");
					}
				}
				sb.append(" \n\n\n");

					return sb.toString();
				}

		}

		private class FieldUpdateDetail{

			String fullName;
			String description;
			String field;
			String literalValue;
			String name;
			String notifyAssignee;
			String protectedF;

			FieldUpdateDetail(){}

			public String getFullName(){ return fullName; }
			public String getDescription(){ return description; }
			public String getField(){ return field; }
			public String getLiteralValue(){ return literalValue; }
			public String getName(){ return name; }
			public String getNotifyAssignee(){ return notifyAssignee; }
			public String getProtectedF(){ return protectedF; }

			public void setFullName(String val){ fullName=val; }
			public void setDescription(String val){ description=val; }
			public void setField(String val){ field=val; }
			public void setLiteralValue(String val){ literalValue=val; }
			public void setName(String val){ name=val; }
			public void setNotifyAssignee(String val){ notifyAssignee=val; }
			public void setProtectedF(String val){ protectedF=val; }

			public String toString(){
					StringBuilder sb = new StringBuilder();
					sb.append("Field Update ::::");
					return sb.toString();
			}
		}

		private class TaskDetail{

			String fullName;
			String assignedTo;
			String assignedToType;
			String description;
			String dueDateOffset;
			String notifyAssignee;
			String offsetFromField;
			String priority;
			String protectedF;
			String status;
			String subject;

			TaskDetail(){}

			public String getFullName(){ return fullName; }
			public String getAssignedTo(){ return assignedTo; }
			public String getAssignedToType(){ return assignedToType; }
			public String getDescription(){ return description; }
			public String getDueDateOffset(){ return dueDateOffset; }
			public String getNotifyAssignee(){ return notifyAssignee; }
			public String getOffsetFromField(){ return offsetFromField; }
			public String getPriority(){ return priority; }
			public String getProtected(){ return protectedF; }
			public String getStatus(){ return status; }
			public String getSubject(){ return subject; }

			private void setFullName(String val){  fullName=val; }
			private void setAssignedTo(String val){  assignedTo=val; }
			private void setAssignedToType(String val){  assignedToType=val; }
			private void setDescription(String val){  description=val; }
			private void setDueDateOffset(String val){  dueDateOffset=val; }
			private void setNotifyAssignee(String val){  notifyAssignee=val; }
			private void setOffsetFromField(String val){  offsetFromField=val; }
			private void setPriority(String val){  priority=val; }
			private void setProtected(String val){  protectedF=val; }
			private void setStatus(String val){  status=val; }
			private void setSubject(String val){  subject=val; }

			public String toString(){
					StringBuilder sb = new StringBuilder();
					sb.append("Task ::::");
					return sb.toString();
			}
		}

}
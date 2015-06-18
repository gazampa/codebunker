<%@page import="java.sql.*"%>
<%@page import="unlock.*"%>
<html>
<head>
<title>Shared Marketing Services, Inc. | User Selection</title>
<link rel="stylesheet" href="../../css/sms.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body>





Please check the radio box next to the user you would like to unlock.<p>

  	<%
	try{
		UserlistBean bean=(UserlistBean)request.getAttribute("bean");
	%>
<FORM ACTION="/unlock/delete" METHOD="POST">					
<table border="1">
<tr><td class="strheader">&nbsp;</td><td class="strheader">User Login</td>
<td class="strheader">User Name</td></tr>
	<%	
		do
		{
			out.println("<tr><td><INPUT TYPE=\"RADIO\" NAME=\"user_id\" VALUE=\""
			+bean.getString(1)+"\"</td><td class=\"entry\">"
			+bean.getString(2)+"</td><td>"+bean.getString(3)+"</td></tr>"
			);	
		}
		while(bean.next());
		bean.close;
	}
	catch (Exception e) {
  	out.println("I threw an exception");}
	%>	
</table>
<input type="submit" value="Submit">
</FORM>
	  	
   
 </body>
</html>
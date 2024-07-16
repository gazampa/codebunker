<%@ page import="java.sql.*" %>
<%	Class.forName("com.hxtt.sql.paradox.ParadoxDriver"); %>

<html>
<head>
<title>Shared Marketing Services, Inc. | Unlock User tool</title>
<link rel="stylesheet" href="../../css/sms.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body>
<div id="container">

Please choose the client for the user you would like to unlock:<p>

<div id="main">
  <div id="maintable">
<%

			

            String url  = "jdbc:paradox:/C:/Database/sms460";
            String user = "";
            String pwd  = "";
			String query = "select client_id,client_listname from client where "+ 
			"client_locked = 'F' order by client_listname";
			

            Connection con = DriverManager.getConnection(url,user,pwd);
            
            
            Statement stmt = con.createStatement();			
            ResultSet rs = stmt.executeQuery(query); %>

    <FORM method="POST" action="/unlock/userlist" name="form1">
	<select name="clientid">
      <table class="search formelement">
      <tr>
        <td class="header" colspan="3">Locked User List</td>
      </tr>
      <tr>
        <td class="entry" colspan="3">

            
            <% while (rs.next()){ %>

              <option value=" <%= rs.getString(1)%> "> <%= rs.getString(2)%> </option>
          <% } %>

          &nbsp;<input type="submit" name="btnSearch" value="GO!"><br>
        </td>
      </tr>
      <tr>
</tr>

      </table>

    </FORM>
  </div>
</div>

</div>
</body>
</html>
<!-- 
CLIENT CODES
283.0
AT&T Carolinas
286.0
AT&T Connecticut
330.0
AT&T National
314.0
AT&T Ohio
269.0
AdBucks Program
255.0
American Honda Motorcycle
335.0
Audi Canada Service & Parts
2009.0
Audi Service & Parts TEST
333.0
Audi US New Vehicle
334.0
Audi US Service & Parts
336.0
BP
271.0
BRP
2.0
Bayer HealthCare - DCD (test)
244.0
Bayer HealthCare - Diabetes Care
340.0
Cartridge World
326.0
Consumer Group Canada
266.0
Diversified Brands
267.0
Diversified Brands Canada
274.0
Dunham Boot
300.0
ExxonMobil
302.0
ExxonMobil - AEP
316.0
ExxonMobil - Argentina
317.0
ExxonMobil - Brazil
318.0
ExxonMobil - CCA
319.0
ExxonMobil - Colombia
320.0
ExxonMobil - Ecuador
329.0
ExxonMobil - Marine
315.0
ExxonMobil - Mexico
303.0
ExxonMobil - PUV
321.0
ExxonMobil - Peru
327.0
ExxonMobil - Retail
322.0
ExxonMobil - SouthCone
323.0
ExxonMobil - Venezuela
256.0
Gold Eagle
272.0
HTH Water Chemicals Canada
201.0
HTH Water Chemicals USA
311.0
IR Lock and Key
219.0
Independent Dealer Group
265.0
Independent Dealer Group Canada
304.0
Ingersoll-Rand
307.0
Johnston & Murphy
157.0
Komatsu Marketing
122.0
Mannington
170.0
Master Lock
145.0
Minwax
293.0
New Balance
232.0
Oki Canada
227.0
Oki USA
165.0
Pirelli
273.0
Shell Source
305.0
Sherwin Williams Ace / Pratt & Lambert
224.0
Smith & Wesson
245.0
Stanley Hardware
237.0
Stanley Tools
238.0
Subaru of America, Inc.
301.0
The Valvoline Company
264.0
Thompson
135.0
Timex
275.0
Toyota Dealer Association
280.0
Toyota TRAC Program
332.0
VW Canada Service & Parts
331.0
VW Service & Parts
959.0
VW Service & Parts (TEST)
2008.0
Valvoline Test
253.0
Volkswagen of America
137.0
Wagner Spraytech
259.0
Watkins
258.0
Weatherby
324.0
Winchester

-->
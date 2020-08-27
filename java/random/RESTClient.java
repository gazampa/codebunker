import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.JSONException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.params.HttpParams;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.NameValuePair;
import org.apache.http.util.EntityUtils;

class RESTClient{

		public static void main(String args[]){

			/**  The Environment **/
			URIBuilder builder = new URIBuilder();
			builder.setScheme("https").setHost("api.citrixonline.com").setPath("/G2W/rest/organizers/2932712/webinars/756285440/attendees");//sessions");///361450665/355603145,351435129"); //"/G2M/rest/meetings");///351435129");
//			builder.setParameter("scheduled", "false");
			//builder.setParameter("startDate","2014-05-21T09:00:00Z");
			//builder.setParameter("endDate","2014-07-31T09:00:00Z");
			//String servicePath = "/G2M/rest/meetings/351435129";

			/**  Build  a Client - Post Method **/
			HttpClient httpclient = new DefaultHttpClient();
			List<NameValuePair> loginParams = new ArrayList<NameValuePair>();

			try {
				URI uri = builder.build();
				System.out.println("\n built uri " + uri);
				HttpGet loginrequest = new HttpGet(uri);
				loginrequest.addHeader("Accept", "application/json");
				loginrequest.addHeader("Content-Type","application/json;charset=UTF-8");
				loginrequest.addHeader("Authorization","q197DAEFvOLEYgKoaupzVFemc1sn");
				System.out.println(" ...sending Login Request... " + loginrequest.getRequestLine() );
				Header[] reqHeaders = loginrequest.getAllHeaders();
				for (Header headr : reqHeaders){
					System.out.println("Headers : "+headr);
				}
				JSONObject jsonPar = new JSONObject().put("meetingtype", "Scheduled");
				StringEntity params = new StringEntity(jsonPar.toString());//
//				loginrequest.setEntity(params);
//				loginrequest.getEntity().writeTo(System.out);
				HttpResponse response = httpclient.execute(loginrequest);
				System.out.println(response.getStatusLine().toString());
				/**  Get the Response and figure out what to do  **/
				HttpEntity entity = response.getEntity();
//				JSONArray json = new JSONArray(  new JSONTokener(  new InputStreamReader(  entity.getContent()  )  )  );
				entity.writeTo(System.out);
				EntityUtils.consume(response.getEntity());
			}catch(IOException ioe){
				System.out.println("IOException :" + ioe);
			}catch(URISyntaxException urie){
				System.out.println("URI Syntax Exception :" + urie);
			}catch(JSONException jsone){
				System.out.println("JSON Exception :" + jsone);
			}
			finally {
			  httpclient.getConnectionManager().shutdown();
			}

			//System.out.println(result);
			System.out.println("\nThe Main Method has left the building");

		}

		private static void log(String param){
			System.out.println(param);
		}

}

/**

POST /services/oauth2/token HTTP/1.1
Host: login.salesforce.com
grant_type=authorization_code&code=aPrxsmIEeqM9PiQroGEWx1UiMQd95_5JUZ
VEhsOFhS8EVvbfYBBJli2W5fn3zbo.8hojaNW_1g%3D%3D&client_id=3MVG9lKcPoNI
NVBIPJjdw1J9LLM82HnFVVX19KY1uA5mu0QqEWhqKpoW3svG3XHrXDiCQjK1mdgAvhCs
cA9GE&client_secret=1955279925675241571&
redirect_uri=https%3A%2F%2Fwww.mysite.com%2Fcode_callback.jsp

**/

/*
    For authorization: https://login.salesforce.com/services/oauth2/authorize
    For token requests: https://login.salesforce.com/services/oauth2/token
    For revoking OAuth tokens: https://login.salesforce.com/services/oauth2/revoke
*/
/*
				InputStream in=entity.getContent();
				byte[] byteData = new byte[1024];
				in.read(byteData);

*/

//String environment="https://cs13.salesforce.com/services/data" /*apexrest/launchpartyform/001W0000004ZXKQ*/, code="", grant_type="password", clientSecret = "1711390793153965553", redirectUri = "https://test.salesforce.com/services/oauth2/authorize/success" , clientId = "3MVG982oBBDdwyHg.khs.6lurHpDgw2blVBLYKqwrvWRf8VHBgu3JlG9bMpt9CaALyL1CpcJXa.1MDt5_lFF2";
//String authenvironment = "https://cs13.salesforce.com/services/oauth2/authorize";

/**
	String l;
            while ((l = inputStream.readLine()) != null) {
                outputStream.println(l);
            }
**/

/**
Map<String, String> oauthLoginResponse = (Map<String, String>)
        JSON.parse(EntityUtils.toString(response.getEntity()));
    System.out.println("OAuth login response");
    for (Map.Entry<String, String> entry : oauthLoginResponse.entrySet())
    {
        System.out.println(String.format("  %s = %s", entry.getKey(), entry.getValue()));
    }
    System.out.println("");

**/

/**
	StringEntity stringParams = new StringEntity("{\"params\":[\"name\",\"organization\",\"address\",\"city\",\"province\",\"country\",\"bmurphyisanewlead3@gmetrix.com\",\"phone\",\"asdf\"]}");
	stringParams.setContentType("application/json;charset=UTF-8");
	System.out.println(stringParams.toString());

    private static final String LOGIN_ENDPOINT = "https://test.salesforce.com";
    private static final String USER_NAME = "blink@blonk.com.uat";
    private static final String PASSWORD = "test1ngserv1cesqcCcQJVsURwQaj4uaPdYFRy6";
    private static final String SERVICES_SOAP_PARTNER_ENDPOINT = "/services/Soap/u/22.0/";

	private class AuthenticationRequest extends HttpPost{

		private final URI authURI;
		private UrlEncodedFormEntity messageEntity;
		private HttpResponse response;

		public AuthenticationRequest(){
			authURI = buildURI();
			messageEntity = buildParameters();
		}

		private URI buildURI(){
			URI result = null;
			try{
				URIBuilder builder = new URIBuilder();
				builder.setScheme("https").setHost("test.salesforce.com").setPath("/services/oauth2/token");
				result = builder.build();
			} catch( Exception e){
				System.out.println("Bombed out Building Authentication URI");
			}
			return result;
		}

		private UrlEncodedFormEntity buildParameters(){
			UrlEncodedFormEntity formEntity = null;
			ArrayList<NameValuePair> namevalue = new ArrayList<NameValuePair>();

			namevalue.add(new BasicNameValuePair("grant_type", "password"));
			namevalue.add(new BasicNameValuePair("username","blink@blonk.com.bmurphy"));
			namevalue.add(new BasicNameValuePair("password","blonk!nTxJDYvSWnW9iWyHQVyOnWUu"));
			namevalue.add(new BasicNameValuePair("client_id", "	3MVG982oBBDdwyHg.khs.6lurHiLvyiYxZNwiXbAlJXHEgvD3JRk3gjF3sdcGrv_W3eQUyzCE21wPDv7FvEen"));
			namevalue.add(new BasicNameValuePair("client_secret", "4743202023810632782"));

			try{
				formEntity = new UrlEncodedFormEntity(namevalue);
			}catch( UnsupportedEncodingException usee ){
				System.out.println("EnCrunking!!");
			}
			return formEntity;
		}

		private void authenticate(){



		}

	}

				String token = json.getString("access_token");
				String instanceUrl = json.getString("instance_url");
				System.out.println("Token : " + token);
				System.out.println("Endpoint : " + instanceUrl);
				if ( token !=null ){
					HttpPost serviceRequest = new HttpPost("https://cs13.salesforce.com"+servicePath);
					serviceRequest.setHeader("Authorization", "OAuth " + token);
					JSONObject jsonParams = new JSONObject();
					JSONArray list = new JSONArray();
					list.put("aOUW000this is new");
					jsonParams.put("params", list);
					(new StringEntity(jsonParams.toString())).writeTo(System.out);
					StringEntity serviceParams = new StringEntity(jsonParams.toString());//
					serviceParams.setContentType("application/json;charset=UTF-8");
					serviceRequest.setEntity(serviceParams);
					System.out.println(" ...sending Service Request... " +  serviceRequest.getRequestLine() +  " : " );
					HttpResponse serviceresponse = httpclient.execute(serviceRequest);
					HttpEntity srent = serviceresponse.getEntity();
					if (srent != null) {
										//instream = srent.getContent();
										System.out.println(srent.getContentType());
										System.out.println(srent.getContentLength());
										srent.writeTo( System.out );//.println();// do something useful
					}
				}
**/
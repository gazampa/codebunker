import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.io.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
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



public class HttpParp{

   public static void main(String[] args)
   {
        new HttpParp().execute(null);
   }

   public void execute(String param){

      String http_url;
      if ( param == null )
      	http_url = "http://127.0.0.1:1337";
      else
      	http_url = param;

      URL url;
	  final long begin;
	  final long end;
      try {

	     url = new URL(http_url);

		begin =  System.currentTimeMillis();
     	URLConnection con = url.openConnection();

//		for ( int i=0;i<100000;i++ ){
			con.addRequestProperty("Property", " val " );
//			con.setRequestProperty("Connection", "close");
			print_content(con);
//		}

		end = System.currentTimeMillis();

		log(end - begin);

      } catch (MalformedURLException e) {
	     e.printStackTrace();
      } catch (IOException e) {
	     e.printStackTrace();
      }

   }


   private void print_content(URLConnection con){
	if(con!=null){

	try {

	   //System.out.println("****** Content of the URL ********");
	   BufferedReader br =
		new BufferedReader(
			new InputStreamReader(con.getInputStream()));

	   String input;
	 	char[] cbuf= new char[1024];
		int len = con.getContentLength();

//	   while ((input = br.readLine()) != null){
//	      System.out.println(input);
//			log("enter stream read");
//		}
		while ( br.read(cbuf) > -1){
//				 	br.read(cbuf, 0, len);
			log("reading stream");
			log(len);
		}

    	br.close();
    	cbuf.toString();

	} catch (IOException e) {
	   e.printStackTrace();
	}

       }

   }

	private void log(String val){
		System.out.println(val);
	}

	private void log(long val){
		System.out.println(val);
	}

}
/**
HttpClient code

			InputStream instream = System.in;
			URIBuilder builder = new URIBuilder();
			builder.setScheme("http").setHost("127.0.0.1:1337").setPath("/");

			HttpClient httpclient = new DefaultHttpClient();
			List<NameValuePair> params = new ArrayList<NameValuePair>();

			try {
				URI uri = builder.build();
				System.out.println("\n built uri " + uri);
				HttpPost req = new HttpPost(uri);
				req.setEntity(new UrlEncodedFormEntity(params));
				System.out.println(" ...sending request... " + req.getRequestLine() + "\n"  + params.toString() );
				Header[] reqHeaders = req.getAllHeaders();
				System.out.println("Content-Type"+req.getFirstHeader("Content-Type"));
				req.getEntity().writeTo(System.out);
				HttpResponse response = httpclient.execute(req);
				System.out.println(response.getStatusLine().toString());
				//  Get the Response and figure out what to do
				HttpEntity entity = response.getEntity();
				entity.writeTo( System.out );
				EntityUtils.consume(response.getEntity());

**/
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.io.*;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;

public class HttpsClient{

   public static void main(String[] args)
   {
        new HttpsClient().testIt(null);
   }

   public void testIt(String param){

      String https_url;
      if ( param == null )
      	https_url = "https://www.yahoo.com";
      else
      	https_url = param;

      URL url;
      try {

	     url = new URL(https_url);
	     HttpsURLConnection con = (HttpsURLConnection)url.openConnection();
		 con.setRequestProperty("Authorization", "OAuth " + "client_id:3MVG982oBBDdwyHg.khs.6lurHpDgw2blVBLYKqwrvWRf8VHBgu3JlG9bMpt9CaALyL1CpcJXa.1MDt5_lFF2" );
         con.setDoOutput(true);
         con.setInstanceFollowRedirects(false);
         con.setRequestProperty("Content-Type", "application/xml");

	     //dumpl all cert info
	     print_https_cert(con);

	     //dump all the content
	     print_content(con);

      } catch (MalformedURLException e) {
	     e.printStackTrace();
      } catch (IOException e) {
	     e.printStackTrace();
      }

   }

   private void print_https_cert(HttpsURLConnection con){

    if(con!=null){

      try {

	System.out.println("Response Code : " + con.getResponseCode());
	System.out.println("Cipher Suite : " + con.getCipherSuite());
	System.out.println("\n");

	Certificate[] certs = con.getServerCertificates();
	for(Certificate cert : certs){
	   System.out.println("Cert Type : " + cert.getType());
	   System.out.println("Cert Hash Code : " + cert.hashCode());
	   System.out.println("Cert Public Key Algorithm : " + cert.getPublicKey().getAlgorithm());
	   System.out.println("Cert Public Key Format : " + cert.getPublicKey().getFormat());
	   System.out.println("\n");
	}

	} catch (SSLPeerUnverifiedException e) {
		e.printStackTrace();
	} catch (IOException e){
		e.printStackTrace();
	}

     }

   }

   private void print_content(HttpsURLConnection con){
	if(con!=null){

	try {

	   System.out.println("****** Content of the URL ********");
	   BufferedReader br =
		new BufferedReader(
			new InputStreamReader(con.getInputStream()));

	   String input;

	   while ((input = br.readLine()) != null){
	      System.out.println(input);
	   }
	   br.close();

	} catch (IOException e) {
	   e.printStackTrace();
	}

       }

   }

}
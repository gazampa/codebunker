import java.io.*;
import java.net.*;
import java.util.*;

public class URLRequest
{
  public static void main(String[] args) {
    BufferedReader in = null;
    if (args.length>0) {
      try {
        URL url = new URL(args[0]);
        URLConnection connection = url.openConnection();
        connection.setRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 5.01; Windows NT 5.0)");
        if (args.length > 1) {
          connection.setDoOutput(true);
          Writer post = new OutputStreamWriter(connection.getOutputStream());
          for (int i=1; i<args.length; i++) {
            if (i > 1)
              post.write('&');
              post.write(encodeParameter(args[i]));
          }
          post.write("\r\n");
          post.close();
        }
        connection.connect();
        Map headers = connection.getHeaderFields();
        Iterator it = headers.keySet().iterator();
        while (it.hasNext()) {
          String key = (String)it.next();
          System.out.println(key+": "+headers.get(key));
        }
        System.out.println();
        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line=null;
        while ((line=in.readLine()) != null)
          System.out.println(line);
      }
      catch (MalformedURLException ex) {
        System.err.println(ex);
      }
      catch (FileNotFoundException ex) {
        System.err.println("Failed to open stream to URL: "+ex);
      }
      catch (IOException ex) {
        System.err.println("Error reading URL content: "+ex);
      }
      if (in != null)
        try {in.close();} catch (IOException ex) {}
    }
    else {
      System.err.println ("Usage: URLRequest URL (uses GET)");
      System.err.println ("       URLRequest URL parameters... (uses POST)");
    }
  }

  private static String encodeParameter(String parameter)
  {
    StringBuffer result = new StringBuffer();
    try {
      String name = null;
      String value = "";
      int ix = parameter.indexOf('=');
      if (ix == -1)
        name = parameter;
      else {
        name = parameter.substring(0,ix);
        value = parameter.substring(ix+1);
      }
      result.append(name);
      result.append('=');
      result.append(URLEncoder.encode(value,"UTF-8"));
    }
    catch (UnsupportedEncodingException ex) {
      System.err.println(ex);
    }
    return result.toString();
  }
}
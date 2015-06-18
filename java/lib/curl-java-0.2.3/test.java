/*
** This test application accesses the Web site from Banco Santander,
** a Mexican bank, performs a login over SSL, receives a cookie and 
** obtain the balance of a bank account, all using libcurl from Java.
**
** $Id: test.java 42 2008-10-20 09:27:21Z patrick $
*/

// import CurlGlue;
// import CurlRead;
// import CurlWrite;

class test extends CurlIO {

    public int handleString(byte s[])
    {
        /* output everything */
        System.out.println("IIIIIIIIIII -------------- OOOOOOOOOOOOOOOOOOO");
        try {

          System.out.write(s);

        }
        catch (java.io.IOException moo) {
          // nothing
        }
        return 0;
    }

    public static void main(String[] args)
    {

        // Bank account number and PIN - fake of course :)
        String account = new String("1234567");
        String pinCode = new String("1234");

        boolean bInsecureMode = false;
        boolean bVerboseMode = false;
        int iSSLVersion = CurlGlue.CURL_SSLVERSION_DEFAULT;

        for (int i = 0; i < args.length; i++) {
            if (( args[i].compareTo("-k") == 0 ) || ( args[i].compareTo("--insecure") == 0 )) {
                bInsecureMode = true;
            } else if (( args[i].compareTo("-v") == 0 ) || ( args[i].compareTo("--verbose") == 0 )) {
                bVerboseMode = true;
            } else if (( args[i].compareTo("-1") == 0 ) || ( args[i].compareTo("--tlsv1") == 0 )) {
                iSSLVersion = CurlGlue.CURL_SSLVERSION_TLSv1;
            } else if (( args[i].compareTo("-2") == 0 ) || ( args[i].compareTo("--sslv2") == 0 )) {
                iSSLVersion = CurlGlue.CURL_SSLVERSION_SSLv2;
            } else if (( args[i].compareTo("-3") == 0 ) || ( args[i].compareTo("--sslv3") == 0 )) {
                iSSLVersion = CurlGlue.CURL_SSLVERSION_SSLv3;
            }
        }
        // System.out.println( "libcurl version: " + CurlGlue.version() );
        System.out.println( "Using " + (bInsecureMode ? "in" : "") + "secure certificate mode." );
        System.out.println( "Using " + (bVerboseMode ? "" : "non-") + "verbose mode." );

        CurlGlue cg;

        try {
            test cw = new test();

            // Register callback write function
            cg = new CurlGlue();
            cg.setopt(CurlGlue.CURLOPT_WRITEFUNCTION, cw);

            // Login to the bank's secure Web site, posting account number and PIN code
            cg.setopt(CurlGlue.CURLOPT_URL, "https://www.santander.com.mx/SuperNetII/servlet/Login");
            cg.setopt(CurlGlue.CURLOPT_SSLVERSION, iSSLVersion);
            cg.setopt(CurlGlue.CURLOPT_SSL_VERIFYPEER, bInsecureMode ? 0 : 1);
            cg.setopt(CurlGlue.CURLOPT_VERBOSE, bVerboseMode ? 1 : 0);
            cg.setopt(CurlGlue.CURLOPT_FOLLOWLOCATION, 1);
            cg.setopt(CurlGlue.CURLOPT_POST, 1);
            cg.setopt(CurlGlue.CURLOPT_COOKIEJAR, "cookie.txt");
            cg.setopt(CurlGlue.CURLOPT_POSTFIELDS, "pag=login&pagErr=/index.html&usuario="+account+"&clave="+pinCode+"&irAmodulo=1");
            cg.perform();

            // Access the bank account balance re-using the session ID stored in memory inside a cookie
            cg.setopt(CurlGlue.CURLOPT_URL, "https://www.santander.com.mx/SuperNetII/servlet/Cchequeras");
            cg.setopt(CurlGlue.CURLOPT_SSLVERSION, iSSLVersion);
            cg.setopt(CurlGlue.CURLOPT_SSL_VERIFYPEER, bInsecureMode ? 0 : 1);
            cg.setopt(CurlGlue.CURLOPT_VERBOSE, bVerboseMode ? 1 : 0);
            cg.setopt(CurlGlue.CURLOPT_FOLLOWLOCATION, 1);
            cg.setopt(CurlGlue.CURLOPT_COOKIEFILE, "cookie.txt");
            cg.perform();

            // The cookie.txt file is actually created now
            cg.finalize();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



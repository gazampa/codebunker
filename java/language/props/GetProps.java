import java.io.*;
import java.util.*;
public class GetProps{

    protected static Properties props = new Properties();
    static File root;
    static int timeout = 0;
    static int workers = 5;
	static PrintStream log;

    protected static void p(String s) {
        System.out.println(s);
    }

    static void printProps() {
        p("root="+root);
        p("timeout="+timeout);
        p("workers="+workers);
        p("log="+log);
    }

    static void loadProps() throws IOException {
		File f = new File
			(System.getProperty("java.home")+File.separator+
				"lib"+File.separator+"www-server.properties");
		if (f.exists()) {
			InputStream is =new BufferedInputStream(new
				   FileInputStream(f));
			props.load(is);
			is.close();
			String r = props.getProperty("root");
			if (r != null) {
			root = new File(r);
			if (!root.exists()) {
				throw new Error(root + " doesn't exist as server root");
			}
			}
			r = props.getProperty("timeout");
			if (r != null) {
			timeout = Integer.parseInt(r);
			}
			r = props.getProperty("workers");
			if (r != null) {
			workers = Integer.parseInt(r);
			}
			r = props.getProperty("log");
			if (r != null) {
			p("opening log file: " + r);
			log = new PrintStream(new BufferedOutputStream(
						  new FileOutputStream(r)));
			}
		}

		/* if no properties were specified, choose defaults */
		if (root == null) {
			root = new File(System.getProperty("user.dir"));
		}
		if (timeout <= 1000) {
			timeout = 5000;
		}
		if (workers < 25) {
			workers = 5;
		}
		if (log == null) {
			p("logging to stdout");
			log = System.out;
		}
    }

public static void main(String[] args){props.list(System.out);printProps();}

}
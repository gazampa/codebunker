import java.io.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.ParserConfigurationException;
import handler.Echo;

public class ParsingApp {

	public static void main(String args[]){
		Writer outstream=null;
		if ( args.length != 1 ){
			System.err.println("Usage : cmd filename");
			System.exit(1);
		}

		try {
			outstream = new BufferedWriter( new OutputStreamWriter(System.out, "UTF8") );
		} catch(Throwable t){
			t.printStackTrace();
		}

		Echo handler = new Echo(outstream);

		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setValidating(true);

		try {
			SAXParser saxParser = factory.newSAXParser();
			XMLReader xmlReader = saxParser.getXMLReader();
			xmlReader.setProperty("http://xml.org/sax/properties/lexical-handler",handler);
			saxParser.parse( new File(args[0]), handler );
		}catch(SAXParseException spe){
			Exception x = spe;
			if(spe.getException()!=null)
				x = spe.getException();
			System.out.println("\n** Parsing Error, line "+spe.getLineNumber()+", uri "+spe.getSystemId());
			System.out.println("  "+x.getMessage() );
			x.printStackTrace();
		} catch (SAXException sxe){
			Exception x = sxe;
			if(sxe.getException()!=null)
				x = sxe.getException();
			x.printStackTrace();
		} catch (ParserConfigurationException pce){
			pce.printStackTrace();
		} catch (IOException ioe){
			ioe.printStackTrace();
		}

	System.exit(0);
	}

}
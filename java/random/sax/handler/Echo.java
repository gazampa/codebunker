package handler;
import java.io.*;
import org.xml.sax.*;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

public class Echo extends DefaultHandler implements LexicalHandler{
	private static Writer out;
	private String indentString = "    ";
	private int indentLevel = 0;
	public Echo(Writer outstream){
		out = outstream;
	}

	public void setDocumentLocator(Locator l)
	{
		try{
			out.write("LOCATOR");
			out.write("\n SYS ID: " + l.getSystemId());
		}catch(IOException e){
			//System.out("IO Exception : " + e);
		}
	}

	public void startDocument() throws SAXException{
		nl();nl();
		emit("START DOCUMENT");
		nl();
		emit("<?xml version='1.0' encoding='UTF-8'?>");
	}

	public void startElement(String namespaceURI, String sName, String qName, Attributes attributes) throws SAXException{

		String eName = sName;
		if ("".equals(eName))
			eName = qName;
		indentLevel++;
		nl();emit("ELEMENT: ");
		emit("<"+eName);
		if ( attributes != null ){
			for ( int i=0;i<attributes.getLength();i++ ){
				String aName = attributes.getLocalName(i);
				if ("".equals(aName))
					aName = attributes.getQName(i);
				//emit(" ");
				//emit(aName+"=\""+attributes.getValue(i)+"\"");
				nl();
				emit("   ATTR: ");
				emit(attributes.getLocalName(i));
				emit("\t\"");
				emit(attributes.getValue(i));
				emit("\"");
			}
		}
		if (attributes.getLength() > 0) nl();
		emit(">");
	}

	public void endElement(String namespaceURI, String sName, String qName) throws SAXException{
		String eName = sName;
		if("".equals(eName))
			eName=qName;
		nl();
		emit("END_ELM: ");
		emit("</" + eName +">");
		indentLevel--;
	}

	public void endDocument() throws SAXException{
		nl();emit("END DOCUMENT");
		try{
			nl();
			out.flush();
		}catch(IOException e) {
			throw new SAXException("I/O Error : " + e);
		}
	}

	public void characters(char buf[], int offset, int len) throws SAXException{
		nl(); emit("CHARS: |");
		String s = new String (buf, offset, len);
		if (!s.trim().equals("")) emit(s);
		emit("|");
	}

	public void ignorableWhitespace(char buf[], int offset, int len) throws SAXException{
		//nl();emit("IGNORABLE");
	}

	public void processingInstruction(String target, String data) throws SAXException{
		nl();
		emit("PROCESS: ");
		emit("<?"+target+" "+data+"?>");
	}

	public void comment(char[] ch, int start, int length) throws SAXException{
	}

	public void startCDATA() throws SAXException{
		nl(); emit("START CDATA SECTION");
	}

	public void endCDATA() throws SAXException{
		nl(); emit("END CDATA SECTION");
	}
	public void startEntity(String name)throws SAXException{
		nl(); emit("START ENTITY SECTION: "+name);
	}

	public void endEntity(String name)throws SAXException{
		nl(); emit("END ENTITY SECTION: "+ name);
	}

	public void startDTD(String name, String publicId, String systemId)	throws SAXException
	{
		nl(); emit("START DTD: "+name+"\n\tpublicId= "+publicId+"\n\tsystemId= "+systemId);
	}

	public void endDTD()throws SAXException
	{
		nl(); emit("END DTD");
	}

	private void emit (String s) throws SAXException{
		try{
			out.write(s);
			out.flush();
		} catch (IOException e) {
			throw new SAXException("I/O Error : " + e);
		}
	}

	private void nl() throws SAXException{
		String lineEnd = System.getProperty("line.separator");
		try {
			out.write(lineEnd);
			for(int i=0;i<indentLevel;i++)
				out.write(indentString);
		} catch ( IOException e ){
			throw new SAXException("I/O Error : " + e );
		}
	}

	public void error(SAXParseException e) throws SAXParseException{
		throw e;
	}

	public void warning(SAXParseException err) throws SAXParseException{
	  System.out.println("** Warning"
	      + ", line " + err.getLineNumber()
	      + ", uri " + err.getSystemId());
	  System.out.println("   " + err.getMessage());
	}

}
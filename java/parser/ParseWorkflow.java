import parser.WorkflowParser;
import metareport.reports.WorkflowAlertMetaReportHSSF;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

class ParseWorkflow{

	public static void main(String[] args){

 		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		String userDir;
		if ( null!=args && args.length > 0)
			userDir = args[0];
		else
			userDir = System.getProperty("user.dir");

		String inputPath = userDir + "/input/";
		String outputPath = userDir + "/output/";
		File folder = new File(inputPath);
		File[] files = folder.listFiles();

		SAXParserFactory spf = SAXParserFactory.newInstance();
		spf.setNamespaceAware(true);

		try {
			SAXParser saxParser = spf.newSAXParser();
			XMLReader xmlReader = saxParser.getXMLReader();
			for (int i = 0; i < files.length ; i++ ){
				log("");
				log("################ Parsing : " + files[i].toString());
				log("");
				WorkflowParser workflowParser = new WorkflowParser();
				xmlReader.setContentHandler(workflowParser);
				xmlReader.setErrorHandler(new ParserErrorHandler(System.err));
				xmlReader.parse(files[i].toString());
				String wbName = getNameFromFile(files[i]);
				FileOutputStream fout = new FileOutputStream(outputPath+wbName);
				WorkflowAlertMetaReportHSSF report = new WorkflowAlertMetaReportHSSF();
				report.createReport("Workflow Rule + Alert + Recipients",workflowParser);
				report.saveReport(fout);
			}
		}catch(ParserConfigurationException pce){
			log("Parser Configuration Error ");
		}catch(SAXException se){
			log("Sax Exception Error " + se);
		}catch(IOException ioe){
			log("IO Exception Error " + ioe);
		}

	}

	private static void log(String str){
		System.out.println(str);
	}

	private static String getNameFromFile(File file){
		String result = new String();
		if ( null!=file ){
			result = file.getName();
		}
		result+=".xls";
		return result;
	}

}
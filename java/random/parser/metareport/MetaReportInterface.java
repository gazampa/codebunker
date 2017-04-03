package metareport;

import parser.WorkflowParser;
import java.io.IOException;
import java.io.OutputStream;

interface MetaReportInterface{

	void createReport(String name, WorkflowParser parser);

	void saveReport(OutputStream out) throws IOException;

}
package metareport.reports;

import metareport.MetaReportAbstractSSF;
import java.io.OutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WorkflowAlertMetaReportXSSF extends MetaReportAbstractSSF{

	public WorkflowAlertMetaReportXSSF(){
		super(new XSSFWorkbook());
	}

	public WorkflowAlertMetaReportXSSF(XSSFWorkbook wb){
		super(wb);
	}

}
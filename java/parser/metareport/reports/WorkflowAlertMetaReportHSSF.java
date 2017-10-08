package metareport.reports;

import metareport.MetaReportAbstractSSF;
import java.io.OutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class WorkflowAlertMetaReportHSSF extends MetaReportAbstractSSF{

	public WorkflowAlertMetaReportHSSF(){
		super(new HSSFWorkbook());
	}

	public WorkflowAlertMetaReportHSSF(HSSFWorkbook wb){
		super(wb);
	}

}
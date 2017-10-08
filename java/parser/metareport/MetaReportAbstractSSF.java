package metareport;

import parser.WorkflowParser;
import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.util.List;
import java.io.IOException;

public abstract class MetaReportAbstractSSF implements MetaReportInterface{

	protected Workbook wb;

	public MetaReportAbstractSSF(){this.wb=new HSSFWorkbook();}

	public MetaReportAbstractSSF(Workbook wb){this.wb=wb;}

	public void createReport(String name, WorkflowParser parser){
		Sheet sheet = wb.createSheet(name);
		List<WorkflowParser.Data> contents = parser.getResult();
		String[] titles = {"Rule Name","Alert Name","Recipients", "Criteria", "Formula", "Sender Type", "Sender Address"};
		Row headerRow = sheet.createRow(0);
		CellStyle headerStyle = wb.createCellStyle();
		Font headerFont = wb.createFont();
		headerFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
		headerStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
		//headerStyle.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
		headerStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		headerStyle.setFont(headerFont);
		headerStyle.setShrinkToFit(false);
		for (int i = 0; i < titles.length; i++ ){
			Cell headerCell = headerRow.createCell(i);
			headerCell.setCellValue(titles[i]);
			headerCell.setCellStyle(headerStyle);
		}
		for (int j = 0; j < contents.size(); j++){
			WorkflowParser.Data contentLine = contents.get(j);
			Row row = sheet.createRow(j+1);
			CellStyle dataStyle = wb.createCellStyle();
			dataStyle.setShrinkToFit(false);
			String dataLine = contentLine.toString();
			//System.out.println(dataLine);
			String[] cellElements = dataLine.split("::");
			if ( null != cellElements ){
				for ( int jj = 0; jj < cellElements.length; jj++){
					Cell cell = row.createCell(jj);
					if (!cellElements[jj].equals(" null"))
						cell.setCellValue(cellElements[jj]);
					cell.setCellStyle(dataStyle);
				}
			}
		}
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
	}

	public void saveReport(OutputStream out) throws IOException{
		try{
			wb.write(out);
			out.close();
		}catch(IOException ioe){
			System.out.println("IO Exception Error Saving Report As File" + ioe);
		}
	}

}
package excelFile;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel File--> Workbook-->Multiple Sheets---->Rows--->Cells
public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		//if(!myfile.xlsx) {
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		
		 XSSFRow row1=sheet.createRow(0);
		 row1.createCell(0).setCellValue("Welcome");
		 row1.createCell(1).setCellValue("To");
		 row1.createCell(2).setCellValue("Automation");
		 
		 XSSFRow row2=sheet.createRow(1);
		 row2.createCell(0).setCellValue("manual");
		 row2.createCell(1).setCellValue("java");
		 row2.createCell(2).setCellValue("selenium");
		 
		 XSSFRow row3=sheet.createRow(2);
		 row3.createCell(0).setCellValue("DB");
		 row3.createCell(1).setCellValue("API");
		 row3.createCell(2).setCellValue("Playwright");
		 
		 workbook.write(fos);
		 
		 workbook.close();
		 fos.close();
		 
		 System.out.println("Inside File data written / created");
	}

}

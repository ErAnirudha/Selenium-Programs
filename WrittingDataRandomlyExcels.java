package excelFile;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataRandomlyExcels {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\RandomWrite.xlsx");

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Random");
		
		XSSFRow Row=sheet.createRow(2);
		XSSFCell cell=Row.createCell(3);
		cell.setCellValue("welcome");
		
		workbook.write(fos);
        workbook.close();
        fos.close();
        
        System.out.println("file is created...");
	}
	
	
}

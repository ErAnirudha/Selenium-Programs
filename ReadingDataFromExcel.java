package excelFile;
// Excel File--> Workbook-->Multiple Sheets---->Rows--->Cells
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {


		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\TestData.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(fis); 
		
		XSSFSheet sheet=workbook.getSheet("sheet1");   //or getsheet or getsheetAt(0/1/2) getsheet in that you have to pass name & getsheetAt pass index of sheet prefer asny one
		
		int TotalRows=sheet.getLastRowNum();          //it return No of Rows
		
		int Totalcells=sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Number of Rows: "+TotalRows+"\nNumber of cells: "+Totalcells);  
		//Rows-5 ,column -4  (Rows count from 0 and column Count from 1)
		System.out.println("===========================================================");
		
		for(int r=0;r<=TotalRows;r++) 
		{
			 XSSFRow currentRow=sheet.getRow(r);
			
			for(int c=0;c<Totalcells;c++) 
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
				//System.out.println();
			}
			System.out.println();
		}
		
		workbook.close();
		fis.close();
		
	}
}

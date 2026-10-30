package excelFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
        FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\myDynamicfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How many Rows you want to Enter");
		int No_ofRows=sc.nextInt();
		
		System.out.println("Enter How many Columns in Every Row");
		int No_ofColumns=sc.nextInt();
		
		for(int r=0;r<=No_ofRows;r++)
		{
			XSSFRow currentRow=sheet.createRow(r);
			
			for(int c=0;c<No_ofColumns;c++)
			{
		    	XSSFCell cell=currentRow.createCell(c);
		    	cell.setCellValue(sc.next());
			}
		}
		
       workbook.write(fos);
		 sc.close();
		 workbook.close();
		 fos.close();
		 
		 System.out.println("file created");
		
	}

}

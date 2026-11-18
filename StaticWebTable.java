package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		//1) find Total no of Rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of Rows:"+rows);

		//2) if your webpage contain only one Table then you can find by tagName Also <tr> 
		// int	rows1= driver.findElements(By.tagName("tr")).size();
		// System.out.println("No of Rows:"+rows1);

		//Find Total no of Columns in Table
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		System.out.println("No of columns:"+col);

		//we caan find with tag name Also but on webpage single table present then we prefer
		// int column=driver.findElements(By.tagName("th")).size();
		// System.out.println("No of Columns:"+column);

		//3) Read data from specific Row And column (for ex, 5th row and 1st column)
		String BookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(BookName);

		//4) Read data from all the Rows and Columns

		for(int r=2;r<=rows;r++) {

			for(int c=1;c<=col;c++) {
				String	values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(values+" \t ");
				//we cant variable r & c directly into xpath for that "+r+"  "+c+" you can pass
				// inbetween Double quotes And + symbol xpath syntax
			}
			System.out.println();
		}

		System.out.println("=================================================================");
		/*		//5) condition based (Read BookName whose Author is Mukesh
		for(int r=2;r<rows;r++) {
			String	AuthorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(AuthorName.equals("Mukesh")) {
				String	Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Bookname+"\t"+AuthorName);
			}

		 */			
		System.out.println("==================================================");

		//6) find Total price of All the books
		int Total=0;
		for(int ro1=2;ro1<=rows;ro1++) {
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+ro1+"]//td[4]")).getText();
			Total=Total+Integer.parseInt(price);
		}
		System.out.println("Total book price is:"+Total); //7100
	}

}



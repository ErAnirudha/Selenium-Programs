package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		//1) select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();

		//2) select All checkboxes (find common Attribute Locator For All)
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
/*
		for(int i=0; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();	 
		}
*/		
		//3) By using For-each loop  Easy and simple way 
		
/*		
		for(WebElement c:checkboxes)
		{
			c.click();
		}
*/
		//4) on basis Condition (last 2 or 3 checkboxes selection)
		//on condition based (last 3 checkboxes)-we need to count total no of checkboxes (ToTal no of checkboxes - how many checkbox you want to select) =starting index
/*		for(int i=4; i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();	 
		}
*/		
		//5) select First 3 checkboxes
/*		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();	 
		}
*/		
		//6) if want to uncheck selected checkboxes
		for(int i=0; i<3; i++)
		{
			checkboxes.get(i).click();	 
		}
		
		Thread.sleep(4000);
		for(int i=0; i<3; i++)
		{
			if(checkboxes.get(i).isSelected()) 
			{
				checkboxes.get(i).click();	 
					
			}
		}
	}

}

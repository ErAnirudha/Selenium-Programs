package radioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonshandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//selection of male Radio button 
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		Thread.sleep(3000);
		//selection of female Radio button
		driver.findElement(By.xpath("//input[@id='female']")).click();

	}

}

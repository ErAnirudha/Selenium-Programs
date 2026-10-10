package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromebasic {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();               
		driver.get("https://www.google.com");                		    //navigate to url
		System.out.println("Browser Launched11");

		driver.manage().window().maximize();                  			// window maximize
		System.out.println("Window maximized");        

		driver.findElement(By.id("ti6dpd")).sendKeys("hello Google");  //pass input data 
		
		String title = driver.getTitle();        						//get title
		System.out.println(title);
		
		Thread.sleep(3000);
		// Google
		String pgesource = driver.getPageSource();          		//get page source
		System.out.println(pgesource.contains("Google"));  			//it returns boolean (true or false)
		driver.quit();

	}

}

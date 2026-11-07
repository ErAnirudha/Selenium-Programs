package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Driver
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		
		//maximize Window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//For scroll purpose
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0, 4500)");
		
		System.out.println("Scroll down complete");
		Thread.sleep(4000);

		driver.quit();
		
	}

	
}

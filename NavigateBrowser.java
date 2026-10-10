package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);                // providing for wait- to visible Properly(becoz it Execute fast)
		driver.navigate().back();
		
		Thread.sleep(3000);  
		driver.navigate().forward();
		
		Thread.sleep(3000);  
		driver.navigate().refresh();
		
		driver.navigate().to("http://www.google.com");  //its Alternative way to driver.get
		
		driver.quit();    // To End All open window sessions

	}

}

package basic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//LAUNCH
		WebDriver driver=new ChromeDriver();
		
		//goto url-open url of browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle-returns Title of page
		System.out.println("Title of page is:"+driver.getTitle());  //OrangeHRM
		
		//getcurrentURl()-returns url of page
		System.out.println("current url is:"+driver.getCurrentUrl());
		

		//getPageSource--returns source code of page
		//System.out.println("page source code is :"+driver.getPageSource());
		
		Thread.sleep(2000);
		
		String windowid=driver.getWindowHandle();
		System.out.println("Window ID: "+windowid); //B9CB96DFC4CB2B5676A9017A6435C498
		//5711854069DA865D9854532B9A261E79  Every time it provide new ID
		
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
		//driver.close--close the open current Browser
		driver.close();
	}

}

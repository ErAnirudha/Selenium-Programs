package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		//Normal Alert handle with click on ok button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//put some wait to see clearly because Action done very fast
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();  //switch to Alert And Accecpt for Alert 
		//when you have to do multiple operations direct Dont Apply accecpt method first store in variable
		Alert MyAlert = driver.switchTo().alert();
		System.out.println(MyAlert.getText());
		MyAlert.accept();
		
		//you can capture Text on Alert And validate with Expected
		
		//Confirmation Alert-ok And cancel button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept(); //close Alert click using ok button
		driver.switchTo().alert().dismiss();  //close Alert click on cancel button
		
		//prompt Alert-Input Box
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("welcome"); //-->to pass text on Alert (its not visible at RunTime)
		Thread.sleep(3000);
	    promptAlert.accept();
		
	    driver.quit();
	}

}

package alerts;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handle Alert without using switchTo().alert()
public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();

		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.manage().window().maximize();

		//Normal Alert handle with click on ok button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

		//put some wait to see clearly because Action done very fast
		Thread.sleep(3000);

		//driver.switchTo().alert().accept();  //switch to Alert And Accecpt for Alert 
		//when you have to do multiple operations direct Dont Apply accecpt method first store in variable
		
		Alert MyAlert = mywait.until(ExpectedConditions.alertIsPresent());

		System.out.println(MyAlert.getText());
		MyAlert.accept();
		
	}

}

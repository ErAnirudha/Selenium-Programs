package waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// Fluent wait declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		// FIX: Use 'driverInstance' (the parameter passed by the wait) 
		// instead of the global 'driver' object.
		WebElement txtuname = mywait.until(driverInstance -> {
            return driverInstance.findElement(By.xpath("//input[@placeholder='Username']"));
        });
		
		txtuname.sendKeys("Admin");

		// Optional: use quit() to cleanly close the browser and ChromeDriver service
		//driver.quit();
	}
}

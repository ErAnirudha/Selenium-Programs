package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//isDisplayed
		WebElement display=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("Logo Displayed : "+display.isDisplayed());

		//isselected    
		WebElement btn= driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("button selected : "+ btn.isSelected());

		//isEnabled
		WebElement Enabled=driver.findElement(By.xpath("//a[@target='_blank']"));
		System.out.println("Link Enabled : "+Enabled.isEnabled());

	}

}

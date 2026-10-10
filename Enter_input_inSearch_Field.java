package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_input_inSearch_Field {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();

		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);      //To avoid NoSuchElementException:
		WebElement EntTxt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		EntTxt.sendKeys("mobile");

		//OR 
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
	}

}

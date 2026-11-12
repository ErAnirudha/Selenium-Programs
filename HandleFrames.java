package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://ui.vision/demo/webtest/frames/");

		driver.manage().window().maximize();

		//Frame 1
		//driver.switchTo().frame(webElement)
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("welcome");

		driver.switchTo().defaultContent(); //go back to page

		//frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");

		//frame4
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("playwright");

		driver.switchTo().defaultContent();

		//switchto frame 3

		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Anirudha");
		
		//inner frame
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
		//instead of click direct we can click by javascriptExecutor
		WebElement Radiobtn = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Radiobtn);
		
		driver.switchTo().defaultContent();
	}
}



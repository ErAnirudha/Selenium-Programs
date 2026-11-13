package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTake {

	public static void main(String[] args) throws IOException {
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.w3schools.com/");
	 
	 TakesScreenshot ts=(TakesScreenshot)driver;  //pass driver instance to TakesScreenshot interface
	 File src =ts.getScreenshotAs(OutputType.FILE);
	 File target=new File("./screenshots/image.png");
	 FileUtils.copyFile(src, target);
	 
	 driver.quit();
	}

}

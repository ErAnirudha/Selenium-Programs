package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/?utm_source=chatgpt.com");

		//xpath with single Attribute
		WebElement single = driver.findElement(By.xpath("//input[@type='text']"));
		single.sendKeys("xpath with single Attribute"); Thread.sleep(2000);
		single.clear();

		System.out.println("xpath with single Attribute");

		//xpath with multiple Attributes
		WebElement multiple = driver.findElement(By.xpath("//input[@type='text'] [@placeholder=\"Search\"]"));
		multiple.sendKeys("xpath with multiple Attributes");Thread.sleep(2000);
		multiple.clear();

		System.out.println("xpath with multiple Attribute");

		//Xpath with And operator
		WebElement xpathAndoperator = driver.findElement(By.xpath("//input[@type='text' and @placeholder=\"Search\"]"));
		xpathAndoperator.sendKeys("Xpath with And operator");Thread.sleep(2000);
		xpathAndoperator.clear();
		System.out.println("xpath with And operator");

		//xpath with OR Operator
		WebElement OROperator = driver.findElement(By.xpath("//input[@type='text' or @placeholder=\"Search\"]"));
		OROperator.sendKeys("xpath with OR Operator");Thread.sleep(2000);
		OROperator.clear();

		System.out.println("xpath with OR operator");

		driver.close();
	}

}

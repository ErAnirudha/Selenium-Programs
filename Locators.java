package basic;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Locators ID,name, LinkText partialLinkText,className,TagName covered
public class Locator {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);

		WebDriver driver = new ChromeDriver(options);


		driver.manage().window().maximize();


		driver.get("https://tutorialsninja.com/demo/?utm_source=chatgpt.com");

		//Name locator
		driver.findElement(By.name("search")).sendKeys("Mobile");

		System.out.println("Name Locator successfully used");

		//LinkText Locator
		boolean logoDisplayed = driver.findElement(By.linkText("Qafox.com")).isDisplayed();

		if(logoDisplayed) {
			System.out.println("Logo Displayed");
		}
		else {
			System.out.println("logoNotDisplayed");
		}

		System.out.println("LinkText & partial  Locator successfully used");

		//className
		List<WebElement> headerLinks = driver.findElements(By.className("dropdown"));
		System.out.println("Total number of header Links: "+ headerLinks.size());
		System.out.println("Title: " + driver.getTitle());

		System.out.println("className  Locator successfully used");

		//Tagname
		List<WebElement> TotalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links: "+TotalLinks.size());
		System.out.println("Tagname  Locator successfully used");
		
		List<WebElement> TotalImages = driver.findElements(By.tagName("img"));
		System.out.println("Total images on page: "+TotalImages.size());
		
	}
}



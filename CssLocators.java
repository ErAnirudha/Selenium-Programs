package basic;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/?utm_source=chatgpt.com");

		//direct, immediate child of the element with the ID
		WebElement searchinput = driver.findElement(By.cssSelector("#search > input"));
		searchinput.sendKeys("immediate child of the element with the ID");
		System.out.println("Done by-direct, immediate child of the element with the ID");
		Thread.sleep(4000);
		searchinput.clear();

		//By using tag & class name css selector
		WebElement searchinput1 = driver.findElement(By.cssSelector("input.form-control"));
		searchinput1.sendKeys("tag & class name");

		Thread.sleep(4000);
		System.out.println("Done by- using tag & class name css selector");
		searchinput1.clear();

		//tag & attribute
		WebElement searchinput2=driver.findElement(By.cssSelector("input[type='text']"));
		searchinput2.sendKeys("tag & attribute");

		Thread.sleep(4000);
		System.out.println("Done by- using tag & attribute css selector");
		searchinput2.clear();

		//tag & class attribute
				WebElement searchinput3=driver.findElement(By.cssSelector("input.form-control[type='text']"));
				searchinput3.sendKeys("tag & class attribute");

				Thread.sleep(4000);
				System.out.println("Done by- using tag & class attribute css selector");
				searchinput3.clear();

		driver.close();
	}

}

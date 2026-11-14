package drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpcountry=new Select(drpCountryEle);
		
		//select option from dropdown (1.SelectByVisibleText(),2.SelectByvalue(), 3.SelectByIndex())
		
		List<WebElement> options = drpcountry.getOptions();
		
		System.out.println("Total Number of countries present in Dropdown: "+options.size());
		
		for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
		}
		
		//select by visible Text-choose Canada
		drpcountry.selectByVisibleText("Canada");
		
		//select by value -choose Brazil
		drpcountry.selectByValue("brazil");
		
		//select by index-choose India (india at 10th place,index start from 0 so its at 9th place)
		drpcountry.selectByIndex(9);
	}

}

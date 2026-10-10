package alerts;

import javax.swing.text.DefaultEditorKit.BeepAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_In_selenium {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.findElement(By.xpath("//button[@onclick='showAlert()']")).click();
		
		Thread.sleep(2000);
		//To handle Alert pop up
		driver.switchTo().alert().accept();	 // For click on Ok button
		System.out.println("clicked on OK button");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss(); // For click on cancel button
		System.out.println("clicked on cancel button");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
		String txt =driver.switchTo().alert().getText(); // For print text on Alert popup
	   	System.out.println("On Alert pop up visible Text:="+txt);
	   	driver.switchTo().alert().dismiss();
	   	
	   	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Anirudha");  //To provide input for Alert pop up
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		System.out.println("Inside Alert Text passed ");
		
		driver.close();
		//Action
		
	}

}

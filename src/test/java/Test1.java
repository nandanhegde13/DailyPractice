import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
	//Alerts in selenium
	@Test
	public void testMethod1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		Log.info("Getting url");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Log.info("Clicking on alert button");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.quit();
	}

}

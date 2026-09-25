import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Test1.class)
public class Test1  implements ITestListener{
	
	static WebDriver driver;
	
	//Alerts in selenium
	
	@Test
	public void testMethod1() throws InterruptedException 
	{
		this.driver = new ChromeDriver();
		Log.info("Getting url");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Log.info("Clicking on alert button");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		
	}
	
	private static String takeScreenshot() throws WebDriverException, IOException
	{
        TakesScreenshot ts = (TakesScreenshot)driver;
        String filePath=System.getProperty("user.dir")
                + "/pictures/"      
                + "_Thread-"
                + Thread.currentThread().getId()
                + "_"
                + System.currentTimeMillis()
                + ".png";
		
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(filePath));
		return filePath;
	}
	
	@Override
	public  void onTestSuccess(ITestResult result)
	{
		try {
			Test1.takeScreenshot();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public  void onTestFailure(ITestResult result)
	{
		try {
			Test1.takeScreenshot();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

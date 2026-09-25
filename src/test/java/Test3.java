import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test3 {

//	@Test
//	public void uploadFile() throws InterruptedException
//	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/upload-download-test/");
//		By element = By.className("upload");
//		
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(element));
//		JavascriptExecutor jse = (JavascriptExecutor)driver;	
//	    jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(element));
//		driver.findElement(element).sendKeys("C:\\Users\\NandanSH\\Desktop\\Sampleimage.jpg");
//		
//		
//	}
	
	
	@Test
	public void uploadFileWithoutSendKeys() throws AWTException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/upload");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Upload')]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", driver.findElement(By.id("file-upload")));
		
		Thread.sleep(2000);
		Robot robot = new Robot();
		StringSelection path = new StringSelection("C:\\Users\\NandanSH\\Desktop\\API Testing.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}

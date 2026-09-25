import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void RobotClass() throws AWTException, InterruptedException
	{
		WebDriver driver  = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.id("dropdown-class-example")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("dropdown-class-example")).click();
		Actions action = new Actions(driver);
		action.keyDown(Keys.DOWN).build().perform();
		
		action.keyDown(Keys.ENTER).build().perform();
	}
}

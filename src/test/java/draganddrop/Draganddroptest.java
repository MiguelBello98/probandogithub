package draganddrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddroptest {
	
WebDriver driver;
	
	@BeforeTest
	public void launchpage() throws InterruptedException  {
		
	
		WebDriverManager.chromedriver().setup();
		//System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		Thread.sleep(2000);
	}
	@AfterTest
	public void closeapp() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);

}
	
	
	
	@Test
	public void dragdroptest() throws InterruptedException {
		Thread.sleep(2000);
		
	WebElement dragDropFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,'droppable/photo')]"));
	driver.switchTo().frame(dragDropFrame);
	
	WebElement Image3 =driver.findElement(By.xpath("//img[contains(@src,'tatras3')]"));
	WebElement Image4 =driver.findElement(By.xpath("//img[contains(@src,'tatras4')]"));	
	WebElement trash =driver.findElement(By.cssSelector("div#trash"));	
	
	Actions act = new Actions(driver);
	act.dragAndDrop(Image3, trash).perform();
	act.dragAndDrop(Image4, trash).perform();
	
	}
	
	
	

	

}

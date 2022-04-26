package hrmlLoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import configreadexample.ReadconfigDemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLLoginExample {

	WebDriver driver;
	ReadconfigDemo config;

	@BeforeTest
	public void launchpage() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		config = new ReadconfigDemo();

		System.out.println(config.getAppURL());
		;

		driver.get(config.getAppURL());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);
	}

	@AfterTest
	public void closeapp() throws InterruptedException {
		driver.close();
		Thread.sleep(2000);

	}

	@Test
	public void getadminusername() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.id("txtUsername")).sendKeys(config.getAdminusername());
		driver.findElement(By.id("txtPassword")).sendKeys(config.getAdminpassword());
		driver.findElement(By.id("btnLogin")).click();
	}

}

package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestJUnit {

	WebDriver driver;

	@Before
	public void launchBrowser() {

		// system set property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rizvi\\June2020Selenium\\FirstSeleniumProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// going to website
		driver.get("https://techfios.com/billing/?ng=admin/");
		// maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() {
		// pass username or username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// pass password or pass field
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click on login button
		WebDriverWait wait = new WebDriverWait(driver,5); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("login"))));
		
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void loginTest1() {
		// pass username or username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// pass password or pass field
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click on login button
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void loginTest2() {
		// pass username or username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// pass password or pass field
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click on login button
		driver.findElement(By.name("login")).click();
	}

	@After
	public void tearDown() {
		// close browser
		driver.close();
	}
}

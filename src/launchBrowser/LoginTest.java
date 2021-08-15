package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;

	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		tearDown();
	
		launchBrowser();
		loginTest1();
		tearDown();
	
		launchBrowser();
		loginTest2();
		tearDown();
	
	
	}
	

public static void launchBrowser() {
	
	//system set property
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rizvi\\June2020Selenium\\FirstSeleniumProject\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		//going to website 
			driver.get("https://techfios.com/billing/?ng=admin/");
			//maximize browser
			driver.manage().window().maximize(); 
			
	
}

	public static void loginTest() {
		// pass username or username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
      // pass password or pass field
		driver.findElement(By.id("password")).sendKeys("abc123");
      // click on login button
		driver.findElement(By.name("login")).click();
	}
	public static void loginTest1() {
		// pass username or username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
      // pass password or pass field
		driver.findElement(By.id("password")).sendKeys("abc123");
      // click on login button
		driver.findElement(By.name("login")).click();
	}
	public static void loginTest2() {
		// pass username or username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
      // pass password or pass field
		driver.findElement(By.id("password")).sendKeys("abc123");
      // click on login button
		driver.findElement(By.name("login")).click();
	}

public static void tearDown() {
	//close browser
	driver.close();	
}
}

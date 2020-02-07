package PageHomeTest;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home {

	WebDriver driver;

	@BeforeTest
	public void setupTest() {
		//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); or Give path in Environment Variable.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


		//        ChromeOptions options = new ChromeOptions();
		//        Map < String, Object > prefs = new HashMap < String, Object > ();
		//        prefs.put("profile.managed_default_content_settings.javascript", 1);
		//        options.setExperimentalOption("prefs", prefs);
		//driver = new ChromeDriver();
		//driver=(WebDriver)options;
		//driver.get("http://www.gmail.com");
		driver.get("http://www.facebook.com");
	}

//	@Test
//	public void homePage() throws InterruptedException {
//
//		String ActualTitle = "Gmail";
//		String ExpectedTitle =driver.getTitle();
//		//Assert.assertEquals(ActualTitle, ExpectedTitle);
//		Assert.assertTrue(ActualTitle.contains(ExpectedTitle));
//
//	}

	@Test
	public void login() throws InterruptedException{
		//		try {
		//			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("development0047");
		//			driver.findElement(By.xpath("//span[text()='Next']")).click();
		//			Thread.sleep(3000);
		//			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9036994767$");
		//			driver.findElement(By.xpath("//span[text()='Next']")).click();
		//			Thread.sleep(3000);
		//			driver.findElement(By.xpath("//a[@class='gb_D gb_Oa gb_i']//span[@class='gb_Ia gbii']")).click();
		//			driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		//			Thread.sleep(3000);
		//		}
		//		catch(Exception e) {
		//			e.printStackTrace();
		//		}

		try {
			List<WebElement> wbelem=driver.findElements(By.xpath("//input"));
			wbelem.get(2).sendKeys("ArrayList");
			
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@AfterTest
	public void tearDown() throws IOException {
		driver.close();
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
	}


}

package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	
	public static void main(String[] args) {
		String str="ELEVEN" +11 +12+ "TWO";
		System.out.println(str);
	}
	
}
	/*WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void googleTitleTest() {
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Google","title is not matched");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
*/
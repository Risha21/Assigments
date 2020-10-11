package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
		
		@Test(priority=1,groups="Title")
		public void googleTitleTest() {
			String title=driver.getTitle();
			System.out.println(title);
			
		}
		
		@Test(priority=3,groups="Logo")
		public void googleLogoTest() {
			Boolean b =driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
			
		}
		
		@Test(priority=2,groups="Link")
		public void gmailLinkTest() {
			Boolean c =driver.findElement(By.xpath("//a[text()='mail']")).isDisplayed();
			
		}
		
		@Test(priority=4,groups="test")
		public void test1() {
			Boolean b =driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
			
		}
		
		@Test(priority=5,groups="test")
		public void test2() {
			Boolean b =driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
			
		}
		
		@AfterMethod
		 public void tearDown() {
			driver.quit();
	}
}
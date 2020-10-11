package com.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","email","password"})
	
	public void yahooLoginTest(String browser,String url,String email,String password) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\software\\chromedriver.exe");
	        driver=new ChromeDriver();
		}
		
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\software\\chromedriver.exe");
	        driver=new FirefoxDriver();
		}
		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("url");
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.id("login-username")).sendKeys("email");
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.id("login-signin")).click();
		
	}

}

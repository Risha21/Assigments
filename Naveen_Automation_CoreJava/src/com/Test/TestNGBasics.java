package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	/*@BeforeMethod
@Test-2 
@AfterMethod
*/
	
	//pre-conditions annotations--starting with @Before
	
	@BeforeSuite
	
	public void setUP() {//1)
		System.out.println("@BeforeSuite------------setup system property for chrome");
	}
	
	@BeforeTest //2)
	public void launchBrowser(){
		System.out.println("@BeforeTest-------------launch the browser");
		
	}

	@BeforeClass //3)
	public void logintoUrl(){
		System.out.println("@BeforeClass--------------login to url");
		
	}
	
	@BeforeMethod //4)
	public void enterURL(){
		System.out.println("@BeforeMethod---------------Enter the url");
		
	}
	
	
	//test cases starting with test
	@Test//5)
	public void googleTitleTest() {
		System.out.println("@Test----------------google title test");
	}
	
	@Test//
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test//
	public void googlelogoTest() {
		System.out.println("google logo test");
	}
	
	//post conditions starting with @After
	@AfterMethod //6)
	public void logOut() {
		System.out.println("@AfterMethod----------logout from app");
	}
	@AfterTest //7)s
	public void deleteAllCookies() {
		System.out.println("@AfterTest------------deleteAllCookies");
	}
	
	@AfterClass //8)
	public void closeBrowser() {
		System.out.println("@AfterClass---------close the browser");
	}
	@AfterSuite //9)
	public void generateTestReport() {
		System.out.println("@AfterSuite----------generate test report");
	}
}

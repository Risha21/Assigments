package com.Test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void Login() {
		System.out.println("login test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="Login")
	public void HomePageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="Login")
	public void SearchTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="Login")
	public void RegistrationTest() {
		System.out.println("home page test");
	}
	//@Test
	//public void Login() {
		//System.out.println("login test");
	//}

}


package com.saucedemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemo.POMclass.LoginPOMclass;
import com.saucedemo.Utilityclass.Screenshotclass;

//import testngpack.TestBaseClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
//
			@Test
			public void loginfunctionality() 
			{
		       //System.out.println("apply the validation");
			    log.info("apply the validation");
			   String expectedTitle = "Swag Labs";    //dev/BA
				
			   String actualTitle = driver.getTitle();
			
			   if(expectedTitle.equals(actualTitle))
			   {
				   System.out.println("login functionality test case is passed");
			   }
			   else
			   {
				   System.out.println("login functionality test case is failed");
			   }
			}
			
			
			@Test
			public void loginTest()
			{
				String expectedTitle = "Swag Labs";
				
//				String actuaTitle = driver.getTitle();
				
				String actualTitle = " Labs";
				
				//Soft Assertion
				SoftAssert soft = new SoftAssert();
				
				soft.assertEquals(actualTitle, expectedTitle);
				
				//use assertAll method to get exact result
				soft.assertAll();
			}

			
	}


	   	
		
	



package com.saucedemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.saucedemo.POMclass.HomePOMclass;
import com.saucedemo.POMclass.LoginPOMclass;


public class TC02_VerifyLogoutFunctionality extends  TestBaseClass
{
	 SoftAssert soft = new SoftAssert();
//	
//	WebDriver driver;
//	@BeforeMethod
//	public void Setup()
//	{
//
//
//		 System.setProperty("webdriver.chrome.driver",
//				 "E:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
//	   	 
//	   	
//	   	
//	   	  driver=new ChromeDriver();
//	   	 System.out.println("Chrome broswer is open");
//	   	 driver.get("https://www.saucedemo.com/");
//	   	driver.manage().window().maximize();
//	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//		
//	  //loginPage elements find +action perform
//	  		//loginfunctionality
//	  	//	LoginPOMclass x= new LoginPOMclass(driver);
//	  	LoginPOMclass x= new LoginPOMclass(driver);	
//	  		x.sendUsername();
//	  		x.sendPassword();
//	  		x.clickOnLoginButton();
//	
//	  		
//	  		//home-page
//	  		//HomePOMClass y = new HomePOMClass(driver);
//	  		HomePOMclass y=new HomePOMclass(driver);
//	  		y.clickMenuButton();
//	  		y.clickLogOutButton();
//	}
//	
	  		//login-page
	@Test
	public void Logoutfunctionality()
	{
	  		
	  		System.out.println("apply the validation");
	  		
	  		   String expectedTitle = "Swag Labs";    //dev/BA
	  			
	  		   String actualTitle = driver.getTitle();
	  		
	  		   if(expectedTitle.equals(actualTitle))
	  		   {
	  			   System.out.println("logOut functionality test case is passed");
	  		   }
	  		   else
	  		   {
	  			   System.out.println("logOut functionality test case is failed");
	  		   }
	}
	@Test
	public void logOutTest()
	{
		//1.
       String expectedTitle = "Labs";
	   String actualTitle = "Labs";
	   soft.assertEquals(actualTitle, expectedTitle);
	   soft.assertAll();
	}

	  	       

		
	}



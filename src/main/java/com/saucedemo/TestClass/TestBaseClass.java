package com.saucedemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMclass.LoginPOMclass;
import com.saucedemo.Utilityclass.Screenshotclass;

public class TestBaseClass
{
	
	 public WebDriver driver;
	 
	 Logger log= Logger.getLogger("Saucedemo04Junem");
		

	 @Parameters("browsername")
	@BeforeMethod
	public void setup(String browsername) throws IOException
	{
		 if(browsername.equals("chrome"))
		 {
		 System.setProperty("webdriver.chrome.driver",
				 "./DriverFiles\\chromedriver.exe");
	   	 driver = new ChromeDriver();
		 }
	   	 
	   	 else
	   	 {
	   		System.setProperty("webdriver.gecko.driver",
					"E:\\firefox\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			
		 driver= new FirefoxDriver();
	   	 }
	   		 
			System.out.println("browser is opened");
			
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("SauceDemo URL is opened");
			
			PropertyConfigurator.configure("log4j.properties");			
			log.info("Browser is opened");
			

			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			
			//take sreenshot
			Screenshotclass.takeScreenshot(driver);
			
			//loginPage elements find +action perform
			
		LoginPOMclass x=new LoginPOMclass(driver);
			
			x.sendUsername();
		//	System.out.println("username is entered");
			log.info("usernmae is entered");
			
			x.sendPassword();
			System.out.println("Password is entered");
			
			x.clickOnLoginButton();
			System.out.println("Clicked on login button");
			
			Screenshotclass.takeScreenshot(driver);
			
	}
			@AfterMethod
			public void Teardown()
			{
//			  driver.quit();
//		       System.out.println("browser is closed");
//		 
		      
			System.out.println("end of Program");

			}	
			
			
	}	
			



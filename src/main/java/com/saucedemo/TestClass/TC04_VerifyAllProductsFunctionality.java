package com.saucedemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.HomePOMclass;
import com.saucedemo.POMclass.LoginPOMclass;

//import testngpack.TestBaseClass;

public class TC04_VerifyAllProductsFunctionality extends TestBaseClass
{
	
	
	//bag product
	  		//HomePOMClass hp = new HomePOMClass(driver);
	@Test
	public  void verifyallproducts()
	{
	  		HomePOMclass hp= new HomePOMclass(driver);
	  		hp.clickAllProducts();
	  		System.out.println("All products will get selected");
	  		//checking filter
	  		hp.clickDropDownFilter();
	  		
	  		//--validation--//
	  		String exceptedProduct = "6";
	  		
	  		String actualProduct = hp.getTextFromAddToCart();
	  		System.out.println("actual product->"+actualProduct);
	  		
	  		System.out.println("apply validation");
	  		
	  		if(exceptedProduct.equals(actualProduct))
	  		{
	  			System.out.println("All products add to cart case is passed");
	  		}
	  		else
	  		{
	  			System.out.println("All products add to cart case is failed");
	  		}
	}
	  		

				
	

}

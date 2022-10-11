package com.saucedemo.TestClass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMclass.HomePOMclass;
import com.saucedemo.POMclass.LoginPOMclass;




public class TC03_VerifyBagProductFunctionality extends TestBaseClass
{

	 
		//--homePage--//
		
		//bag product
		//HomePOMClass hp = new HomePOMClass(driver);
	 @Test
	 public void checkvalidation()
	 {
		HomePOMclass hp= new HomePOMclass(driver);
		hp.clickBagButton();
		System.out.println("Bag product will get selected");
		
		//--validation--//
		String exceptedProduct = "1";
		
		String actualProduct = hp.getTextFromAddToCart();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		if(exceptedProduct.equals(actualProduct))
		{
			System.out.println("Bag product add to cart case is passed");
		}
		else
		{
			System.out.println("Bag product add to cart case is failed");
		}
	 }
		
		


	

}

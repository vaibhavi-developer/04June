package com.saucedemo.TestClass;

import org.testng.annotations.Test;

import com.saucedemo.POMclass.HomePOMclass;

//import testngpack.TestBaseClass;

public class TCO5_Verifyfilterapply extends TestBaseClass
{
	
	@Test
	 public void VerifyapplyFilter() 
	 {     
	     // click on filter
	      
	       HomePOMclass y = new HomePOMclass(driver); 
	       
	      y.clickDropDownFilter();
	       String given="Price (low to high)";
	       String actual=y.textFilter();
	       System.out.println("Actual---->"+actual);
	       
	       
	   	if(given.equals(actual))
       	{
       	 System.out.println("the Iteam are Filter on the base of Price (low to high)");
       	 System.out.println("The test case is passed");
       	}
       	else
       	{
       		System.out.println("the Iteam are NOT Filter on the base of Price (low to high)");
       		System.out.println("The test case is Failed"); 
       	}  

}
}
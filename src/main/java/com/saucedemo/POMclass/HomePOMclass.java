package com.saucedemo.POMclass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMclass 
{
	private WebDriver driver;
	private Select s;
	
	//2.
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	private WebElement menuButton;
	
	//3.
	public void clickMenuButton()
	{
		menuButton.click();
	}
	
	//2.
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	private WebElement logOutButton;
	
	//3. 
	public void clickLogOutButton()
	{
		logOutButton.click();
	}
	
	//4
	public HomePOMclass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		s = new Select(dropDown);
	}
	
	
	//bag ele
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagButton;
	
	public void clickBagButton()
	{
		bagButton.click();
	}
	
	
	//addToCart ele
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addToCart;
	
	public String getTextFromAddToCart()
	{
		String totalProducts= addToCart.getText();
		return totalProducts;
	}

	//------------------------//
	
	//multiple product ele
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> allProducts;
	
	public void clickAllProducts()
	{
		for(WebElement i:allProducts)
		{
			i.click();
		}
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement dropDown;
	
	public void clickDropDownFilter()
	{
		dropDown.click();
   Select s = new Select(dropDown);
		s.selectByValue("za");//inspect from  value
		//  s.selectByIndex(a);by index
	}

	public String textFilter() 
	{
		
		Select s = new Select(dropDown);
		String z=  s.getFirstSelectedOption().getText();
		return z;		
	}



}

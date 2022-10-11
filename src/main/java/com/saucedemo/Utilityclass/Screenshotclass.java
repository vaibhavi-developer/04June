package com.saucedemo.Utilityclass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotclass
{
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		Date d= new Date();
		DateFormat x= new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		
		String date=x.format(d);
		TakesScreenshot ts= (TakesScreenshot)driver;
		File selenium =ts.getScreenshotAs(OutputType.FILE);
		File myfile=new File("./ScreenshotFolder\\project1"+date+".jpg");
		FileHandler.copy(selenium, myfile);
		
	}
}

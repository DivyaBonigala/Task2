package com.functional_testing;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.apache.commons.io.FileUtils;

public class screenshot {
	
	public screenshot()
	{
		
	}
	public static void takescreenshot(WebDriver driver, String filepath)
	{
		
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File(filepath));
		}catch (WebDriverException e) {
			
			e.printStackTrace();
			} catch (IOException e) {
			
			e.printStackTrace();
			}
		
	}
	
	public static class dateutils
	{	
	public static String  getDateTimeStamp(){
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
		 String dateStamp = now.format(formatter);
	        
	        System.out.println(dateStamp);
	        return dateStamp;
	    }
        
		 
		}

}







	



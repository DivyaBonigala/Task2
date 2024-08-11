package com.functional_testing;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import com.functional_testing.screenshot;


public class orders_page extends browserset{
	
	
	@Test
	
	
	public void loginpage()
	{
		try
		{
			
			driver.get("https://demo.dealsdray.com/");
			driver.manage().window().fullscreen();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		    
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-1")));
			username.sendKeys("prexo.mis@dealsdray.com");
		     Thread.sleep(1000);
		     
			WebElement password =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mui-2")));
			password.sendKeys("prexo.mis@dealsdray.com");
		     Thread.sleep(1000);
		     
			WebElement login =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[3]/div/button")));
		     login.click();
		     Thread.sleep(1000);
			
		     WebElement orderbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/button/div[1]/span[1]")));
		     orderbutton.click();
		     
		     WebElement choice= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button")));
		     choice.click();
		     Thread.sleep(1000);
		     WebElement bulk_order=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/button")));

		     bulk_order.click();
			
			WebElement choosefile=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='file']")));
			choosefile.sendKeys("/Users/divyabonigala/eclipse-workspace/demo-data.xlsx");
			Thread.sleep(2000);
			
			WebElement importbutton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/button")));
			importbutton.click();
			Thread.sleep(3000);
			
			WebElement validate =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/button")));
			
			validate.click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			driver.manage().window().fullscreen();
			
			String folderss ="/Users/divyabonigala/eclipse-workspace/Task_2_FunctionalTesting/task_2_images";
		    File folder = new File(folderss);
		    if (!folder.exists()) {
		   	 Assert.fail("Folder path does not exist: " + folderss);
		   }

		    String ssfile = folderss +"/screenshot_"+screenshot.dateutils.getDateTimeStamp()+ ".png";
		    screenshot.takescreenshot(driver, ssfile);
		    System.out.println("Screenshot taken and saved as: " + ssfile);
			
	
			
            wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'"));

            JavascriptExecutor js = (JavascriptExecutor) driver;
          
            js.executeScript("window.scrollBy(0, 1000);"); 
            
           
            Thread.sleep(2000); 

           
            WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[4]/table/tbody/tr[5]/td[1]")); // Replace with actual locator
            js.executeScript("arguments[0].scrollIntoView(true);", element);

			
			
			//Screenshots
			 folderss ="/Users/divyabonigala/eclipse-workspace/Task_2_FunctionalTesting/task_2_images";
			     folder = new File(folderss);
			    if (!folder.exists()) {
			   	 Assert.fail("Folder path does not exist: " + folderss);
			   }

			     ssfile = folderss +"/screenshot_"+screenshot.dateutils.getDateTimeStamp()+ ".png";
			    screenshot.takescreenshot(driver, ssfile);
			    System.out.println("Screenshot taken and saved as: " + ssfile);
			    Thread.sleep(3000);
			    
			    js.executeScript("window.scrollBy(1000, 1000);"); 
	   
			 
		    Thread.sleep(4000);
		    driver.quit();
			
		}catch(Exception e)
		{
			Assert.fail("Unable to login"+e.getMessage());
			e.printStackTrace();
		}
	}
	

}

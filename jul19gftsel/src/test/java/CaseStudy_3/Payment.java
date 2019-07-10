//Scenario 5 & 6 
//Adding to Cart and Payments Page

package CaseStudy_3;

	
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import sample.Drivers;



public class Payment {
	WebDriver driver;
  @Test
  public void testCart() {
	  
	  driver=Drivers.getDriver("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  	  driver.manage().window().maximize();
	  	  driver.findElement(By .name("userName")).sendKeys("lalitha");
		  driver.findElement(By .name("password")).sendKeys("password123");
		  driver.findElement(By .name("Login")).click();
		  
		  
		  
		  driver.findElement(By .name("products")).sendKeys("headPhone");
		  driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
		  driver.findElement(By .xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		  driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		  
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  
	  	
	 
	  	
  }
	  	@Test (priority=4)
	    
	    public void testPayment() {
	  	  
	  	
	  	  	

	    	driver.findElement(By .name("ShippingAdd")).sendKeys("Chennai-530017");
	    	driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.findElement( By .xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
	    	driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
	    	driver.findElement(By .name("username")).sendKeys("123456");
	    	driver.findElement(By .name("password")).sendKeys("Pass@456");
	    	driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    	driver.findElement(By .name("transpwd")).sendKeys("Trans@456");
	    	driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	    	driver.findElement(By .xpath("//html//body//header//div//div//ul//b//a[2]")).click();
	    	
  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  
  	
  	
  }
}

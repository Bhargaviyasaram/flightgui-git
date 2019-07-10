 package CaseStudy_3;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sele.testng.Drivers;
//import freemarker.log.logger;
import junit.framework.Assert;
public class Scenario1_3_4_5_6 
{
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
	ExtentTest logger;
    WebDriver driver;
  @Test (priority=1)
  public void testRegistration() 
  {
      driver=Drivers.getDriver("chrome");
       //logger = extent.createTest("TestRegistreation");
	  
      driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
      driver.manage().window().maximize();
	  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  //logger = extent.createTest("TEST REGISTRATION");
	  driver.findElement(By .name("userName")).sendKeys("bill75641145");
	  driver.findElement(By .name("firstName")).sendKeys("Ale");
	  driver.findElement(By .name("lastName")).sendKeys("All");
	  driver.findElement(By .name("password")).sendKeys("bill4700");
	  driver.findElement(By .name("confirmPassword")).sendKeys("bill4700");
	  driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
	  driver.findElement(By .name("emailAddress")).sendKeys("bill162@gmail.com");
	  driver.findElement(By .name("mobileNumber")).sendKeys("9876543210");
	  driver.findElement(By .xpath("//*[@id=\"dob\"]")).sendKeys("07/11/1996");
	  driver.findElement(By .name("address")).sendKeys("Riggie Grand,Flat: 404, USA");
	  driver.findElement(By .name("securityQuestion")).sendKeys("My birth place???????");
	  driver.findElement(By .name("answer")).sendKeys("MIAMI");
	  driver.findElement(By .name("Submit")).click();
	  logger.log(Status.INFO, MarkupHelper.createLabel("Register successful", ExtentColor.GREEN));
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
     
  
	@Test (priority=2)
  public void testLogin()
	  {
		  
		  //logger = extent.createTest("TEST LOGIN");
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  	  driver.findElement(By .name("userName")).sendKeys("bill75641101");
		  driver.findElement(By .name("password")).sendKeys("bill4070");
		  driver.findElement(By .name("Login")).click();
		  driver.findElement(By .name("products")).sendKeys("headPhone");
		  driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
		  driver.findElement(By .xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		  driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		  Assert.assertEquals(driver.getTitle(),"Home");
		  //logger.log(Status.PASS,MarkupHelper.createLabel("Logged in successfully",ExtentColor.GREEN));
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		  
	  	}
	@Test (priority=3)
	  public void testCart() {
	  
	 
	  //driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  //driver.manage().window().maximize();
	
		  
		  //logger = extent.createTest("TEST CART");
		  driver.findElement(By .name("products")).sendKeys("headPhone");
		  driver.findElement(By .xpath("/html/body/div[1]/form/input")).click();
		  driver.findElement(By .xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		  driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		  //logger.log(Status.PASS,MarkupHelper.createLabel("Product added to cart",ExtentColor.GREEN));
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

	  	
		  @Test (priority=4)
	    
	    public void testPayment() {
			  
	  	    logger = extent.createTest("Test Payment");  
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
	    	//logger.log(Status.PASS,MarkupHelper.createLabel("PAYMENT STATUS",ExtentColor.GREEN));
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        }
		  @AfterMethod
		  public void getResultAfterMethod(ITestResult result)throws IOException{
			  if(result.getStatus()==ITestResult.FAILURE) {
			       
			      logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"- Test case failed",ExtentColor.RED));
			      TakesScreenshot sht=(TakesScreenshot)driver;
			       File src=sht.getScreenshotAs(OutputType.FILE);
			       String path=System.getProperty("user.dir"+"/extent-reports/snapshots/"+result.getName()+".png");
			       //FileUtils.copyFile(src,new File(path));
			       logger.addScreenCaptureFromPath(path, result.getName());
				  logger.log(Status.FAIL,MarkupHelper.createLabel(result.getThrowable()+"- Test case failed",ExtentColor.RED));
				  
				
			  }else if(result.getStatus()==ITestResult.SKIP) {
				  logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"- Test case skip",ExtentColor.ORANGE));
				  
			  }
			  //System.out.println("Inside after method");
		  }
		  @BeforeTest
		  public void startReportBeforeTest() {
			  System.out.println("Before test");
		  }
		  @AfterTest
		  public void endReportAfterTest() {
			  System.out.println("Inside after test");
			  }
		  @Test
		  public void testLogout() {
			  System.out.println("Inside test logout");
		  }
		  
}

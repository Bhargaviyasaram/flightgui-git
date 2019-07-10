//Scenario 3 & 4

package CaseStudy_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sele.testng.Drivers;

public class registration {

  WebDriver driver;
  @Test
  public void f() {
  driver=Drivers.getDriver("chrome");
	  
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  driver.findElement(By .name("userName")).sendKeys("alle34560511");
	  driver.findElement(By .name("firstName")).sendKeys("Ale");
	  driver.findElement(By .name("lastName")).sendKeys("All");
	  driver.findElement(By .name("password")).sendKeys("alekya1234567890");
	  driver.findElement(By .name("confirmPassword")).sendKeys("alekya1234567890");
	  driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
	  driver.findElement(By .name("emailAddress")).sendKeys("alekhyaj162gmail.com");
	  driver.findElement(By .name("mobileNumber")).sendKeys("9876543210");
	  driver.findElement(By .xpath("//*[@id=\"dob\"]")).sendKeys("07/11/1996");
	  driver.findElement(By .name("address")).sendKeys("Riggie Grand,Flat: 404, USA");
	  driver.findElement(By .name("securityQuestion")).sendKeys("My birth place???????");
	  driver.findElement(By .name("answer")).sendKeys("MIAMI");
	  driver.findElement(By .name("Submit")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
      //driver.findElement(By. xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	  
	  //driver.findElement(By.linkText("login.htm")).click();
	  driver.findElement(By .name("userName")).sendKeys("alle34560511");
	  driver.findElement(By .name("password")).sendKeys("alekya1234567890");
	  driver.findElement(By .name("Login")).click();
	  String txt = driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a/text()")).getText();
	  //*[@id="header"]/div[1]/div/div/div[2]/div/ul/a/text()
	  System.out.println(txt);
	  //SoftAssert a = new SoftAssert();
	  

	  
	  
  }
}

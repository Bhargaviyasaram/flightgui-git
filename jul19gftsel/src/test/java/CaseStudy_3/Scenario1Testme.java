package CaseStudy_3;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sele.testng.Drivers;

public class Scenario1Testme {
	WebDriver driver;
	
  @Test
  public void testme() {
	  
	  driver=Drivers.getDriver("chrome");
	  
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  
	  
  }
@Test 

public void testregistration() {
	System.out.println("In test reg");

	//driver=registration.
}
@BeforeTest
 public void beforetest() {
	System.out.println("Before test");
}

	@Test 

	public void testLogin() {
		System.out.println("In test login");

	}

@Test
public void testcart() {
	System.out.println("Cart");
	
}
@Test
public void testPayment() {
	System.out.println("Payments");
}

@AfterMethod
public void aftermethod() {
	
}
@AfterTest
public void aftertest() 
 {
	
 }


}

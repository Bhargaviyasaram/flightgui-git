package com.sele.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testme1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver=Drivers.getDriver("Chrome");
	  driver.get("http://10.232.237.143:443//TestMeApp//fetchcat.htm");
	  
  }
@Test1 
public void testlogin() {
	driver.findElement(By .linkText("SighIn")).Click();
	
	
	
}
}
0
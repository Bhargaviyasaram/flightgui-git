package com.sele.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelectTest {
	WebDriver driver;
  @Test
  public void seltest() {
	  driver=Drivers.getDriver("chrome");
	  WebDriverWait wait=new WebDriverWait(driver,20);
	  driver.get("http://newtours.demoaut.com/");
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")));
	  driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")).sendKeys("INDIA");
	   boolean b=driver.findElement(By .linkText("REGISTER")).isDisplayed();
	   System.out.println(b);
	  driver.findElement(By .linkText("REGISTER")).click();
	 Select sel=new Select(driver.findElement(By .name("country")));
	 sel.selectByValue("1");
	 //sel.selectByVisibleText("INDIA");
	 //sel.selectByIndex(220);
  }
}

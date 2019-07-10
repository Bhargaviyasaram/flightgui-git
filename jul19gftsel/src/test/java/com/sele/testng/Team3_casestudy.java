package com.sele.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Team3_casestudy {
	
	WebDriver driver;
	  @Test
	  public void Sample() {
		  
		  driver=Drivers.getDriver("chrome");
		  
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//*[@id=\"fsl\"]/a[1]")).click();
		  driver.findElement(By .name("lang-selector")).click();
		 

		  WebElement c =driver.findElement(By .id("lang-selector"));
		  List<WebElement> abc= c.findElements(By .tagName("option"));
		  
		  int count = abc.size();
	
		  System.out.println(count);
		
		  
		   
		  for(int i=0;i<=abc.size()-1;i++){
		   String count_1=abc.get(i).getText();
		   System.out.println(count_1);
		   
		   if(count_1.equals("Nepal – English")) {
			   abc.get(i).click();
		   }
		  }
		  
			    
		  
		  
		    
		
		    
		  
	  }
}

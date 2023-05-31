package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Example {

	public static void main(String[] args) {
		
		//register the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
  		
		//driver.get("https://demoqa.com/select-menu"); // get cureent URL
  		Navigation chromeobj=driver.navigate();
		chromeobj.to("https://demoqa.com/select-menu"); 
		
  		driver.manage().window().maximize();//to maximize window
		//manage give access to options interface then options to window interface
		//method maximize is in windows interface

  		WebElement oldmenu=driver.findElement(By.id("oldSelectMenu")); 
  // oldSelectMenu ko drop down krna so uska humne loacaor crate kiya and then select class ko refre kiya 		
  		Select obj=new Select(oldmenu); // select class has deal with drop down aarrow 
  	//there are 3 way to select to text by index, by value,by visible	
  		//obj.selectByIndex(6);
  		//obj.selectByVisibleText("Black");
  		obj.selectByValue("5");
  		obj.selectByValue("2");
  	//	obj.deselectByValue("5"); // deselect only use fro multi-select otherwise unsupportedOperationException and all deselect is use multi select only 
  	//	obj.isMultiple(); // return type is bollean becuase method start from is 
  // answer is false means user should be on single value will be select
  		
	}

}
 
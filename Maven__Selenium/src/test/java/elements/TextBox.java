package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

public class TextBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
				//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver(); //  it use to java script method
				driver.get("https://demoqa.com/text-box");
				//chromeobj.navigate().to("\"https://demoqa.com/text-box\"");
				driver.manage().window().maximize();//to maximize window
				//manage give access to options interface then options to window interface
				//method maximize is in windows interface
				
				WebElement FullNametxt=driver.findElement(By.id("userName"));
				FullNametxt.sendKeys("testing");//find element method used to find an element
				//it will return a web element
				//we need to store this element in a value
				//element can be find by giving locator strategy in find element
				//sendkeys method is used to enter text in text box
				//values passed in sendkeys method will enter in text box
				
				WebElement emailtxt=driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
				emailtxt.sendKeys("hafisa@gmail.com"); 
				
				driver.findElement(By.id("currentAddress")).sendKeys("Address");//method chaining
				                   //here we are taking output of one method as input to another method
				driver.findElement(By.id("permanentAddress")).sendKeys("permanentAddress");
				FullNametxt.clear();
				FullNametxt.sendKeys("software");
				
				WebElement fullnamelabel=driver.findElement(By.id("userName-label"));
				
				WebElement submitbutton=driver.findElement(By.id("submit"));
				
				System.out.println(fullnamelabel.isDisplayed()); 
				System.out.println(fullnamelabel.getText()); // read the text box
	
//scrol button and then submit button
//scroll down there are 3 diff. way	
			//driver.executeScript("window.scrollBy(0 " + submitbutton.getLocation().getY() + ")");
				//driver.executeScript("arguments[0].scrollIntoView();",submitbutton );
				JavascriptExecutor exu=(JavascriptExecutor) driver; // it is use typecasting it is mandotry 
				exu.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//but this code why we done --> becuase chromdriver has implemented both the interface and exucutescript in not a webdriver
// they came from java Script exucator and thats why if u want to call exucutescript we have to type casting we have to move from webdirver to javaScript exucator
			WebElement obj=driver.findElement(By.id("submit")); // find using by id
			obj.click();  // to click and go to next page 
		// page ager scroll nhi hoga to  org.openqa.selenium.ElementClickInterceptedException: element ye expetion show krega 				
				
			
			
				
				
				
			
				
	
	
	}

	}

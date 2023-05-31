package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Example_XY {

	public static void main(String[] args) {
		//register the driver
		System.setProperty("webdriver.chrome.driver", ".//src\\main\\resources\\chromedriver.exe");
		//create object of chrome driver to launch chrome browser
		ChromeDriver driver = new ChromeDriver(); //launch the browser
		
		//1.for entering url we use get(string url) method of webdriver interface
		//driver.get("https://demoqa.com/text-box");
		//2.for entering url we use navigate().to() method of webdriver interface
		driver.navigate().to("https://demoqa.com/dragabble");
		
		driver.manage().window().maximize();//it is use to maximize or minimize the browser
		
		//we find locator of click button & perform click operation on that button
		WebElement src=driver.findElement(By.id("dragBox")); // Drop me 
	//	src.click(); // click operation 
		 
//Drag and drop ke liye action class ka use hoga 
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, 220, 42); // drag & drop method using cordinator X , Y 

	}

}

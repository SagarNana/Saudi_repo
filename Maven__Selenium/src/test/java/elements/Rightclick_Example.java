package com.abc.elements;

import java.awt.Desktop.Action;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_Example {

	public static void main(String[] args) {
		//register the driver
		System.setProperty("webdriver.chrome.driver", ".//src\\main\\resources\\chromedriver.exe");
		//create object of chrome driver to launch chrome browser
		ChromeDriver driver = new ChromeDriver(); //launch the browser
		
		//1.for entering url we use get(string url) method of webdriver interface
		//driver.get("https://demoqa.com/text-box");
		//2.for entering url we use navigate().to() method of webdriver interface
		driver.navigate().to("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();//it is use to maximize or minimize the browser
		
		//we find locator of click button & perform click operation on that button
		WebElement clickmebutton=driver.findElement(By.id("rightClickBtn"));
		clickmebutton.click();
		
		Actions act=new Actions(driver); // it is class actions, so crate to object 
		//act.doubleClick(); // run the program there is no error 
		//so we use to perform() method . this is coming from action interface so impelemtent only perfrom () and then use to doubleclick 
	//	act.doubleClick(clickmebutton).perform(); // it is use to double click 
		act.contextClick(clickmebutton).perform(); // right click krne ke liye contextClick methos use 
		
		
		
	}

}

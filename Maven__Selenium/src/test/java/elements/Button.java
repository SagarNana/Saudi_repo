package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	
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
		WebElement clickmebutton=driver.findElement(By.xpath("//button[text()=\"Click Me\"]"));
		clickmebutton.click();
		
	/*	WebElement Doubleclickme=driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
		Doubleclickme.click();
		
		WebElement Rightclickme=driver.findElement(By.id("rightClickBtn"));
		 Rightclickme.click();*/



		
	}
}

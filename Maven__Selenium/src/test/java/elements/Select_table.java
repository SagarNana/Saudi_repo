package com.abc.elements;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_table {

	public static void main(String[] args) {
			
		//register the driver
		System.setProperty("webdriver.chrome.driver", ".//src\\main\\resources\\chromedriver.exe");
		//create object of chrome driver to launch chrome browser
		ChromeDriver driver = new ChromeDriver(); //launch the browser
		
		//1.for entering url we use get(string url) method of webdriver interface
		//driver.get("https://demoqa.com/text-box");
		//2.for entering url we use navigate().to() method of webdriver interface
			Navigation p=driver.navigate();
				p.to("https://demoqa.com/selectable");
		//driver.navigate().to("https://demoqa.com/selectable"); we can use line 21 use 
		
		driver.manage().window().maximize();//it is use to maximize or minimize the browser
		
		//we find locator of click button & perform click operation on that button
		WebElement src=driver.findElement(By.id("demo-tabpane-list"));
		src.click(); // click operation 
		//src.getText();
		

		Actions click=new Actions(driver);
		click.click().perform();
		
		//click.doubleClick().perform();
		
	}

}

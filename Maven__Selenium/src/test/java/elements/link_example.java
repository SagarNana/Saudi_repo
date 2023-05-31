package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link_example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		
//		WebElement homelink=driver.findElement(By.linkText("Home"));
//		homelink.click();
//		WebElement home2link=driver.findElement(By.partialLinkText("Home"));
//		home2link.click();
		WebElement homelink=driver.findElement(By.id("dynamicLink"));
	homelink.click();
	
	}
}
package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_attribute {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		username.sendKeys("7559059795");
		System.out.println(username.getAttribute("value"));
        
		if(username.getAttribute("value").length()>0) {
			System.out.println("user is able to enter mobile number");
		}
		else {
			System.out.println("user is not able to enter number");
		}
	
}
}

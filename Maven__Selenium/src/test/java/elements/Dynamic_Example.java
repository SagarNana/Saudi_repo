package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Example {

	public static void main(String[] args) {
		//register the browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver(); //launch the chrome
				//driver.get("https://demoqa.com/select-menu"); // get cureent URL
		  		Navigation chromeobj=driver.navigate();
				chromeobj.to("https://demoqa.com/select-menu"); 
				
		  		driver.manage().window().maximize();//to maximize window
				//manage give access to options interface then options to window interface
				//method maximize is in windows interface	}
		  			
		  		WebElement oldmenu=driver.findElement(By.xpath("//div[@id='withOptGroup']")); // iske bad drop arrow pe click hoga
		  		oldmenu.click();
		  		
		  		driver.findElement(By.id("react-select-2-option-1-0")).click();;
		  		
	
		  		
	}
	
}

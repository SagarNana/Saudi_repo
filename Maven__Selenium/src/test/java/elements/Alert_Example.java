package com.abc.elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {
	public static void main(String[] args) throws InterruptedException {
		//register the driver 
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver(); //launch the chrome
			//driver.get("https://demoqa.com/webtables"); 
			
				Navigation p=driver.navigate();
				p.to("https://demoqa.com/alerts"); // get to page url 
			
			
			driver.manage().window().maximize(); // maximize the window 
	//find element ka return type WebElement hai 			
			WebElement clickbutton=driver.findElement(By.xpath("//button[@id='confirmButton']")); // by using xpath 
			clickbutton.click(); // pop -up to click 
			
	//switch type of return type is alert interface  
			Thread.sleep(1000); // this is use for hold a few second in pop-up 
			Alert obj=driver.switchTo().alert(); // return type alert interface
	//to click on ok button but selenium me ok,yes kuch bhi ho accept hai
			obj.accept(); //aprroved click 
			//obj.dismiss(); // to click on cancel button
			
	//use to input sendenumber and then pop -up accept 
			WebElement clickobj=driver.findElement(By.className("//button[@class='btn btn-primary']"));
			clickobj.click();
			clickobj.sendKeys("9075");
		 //	driver.switchTo().alert().accept();
			Alert obj1=driver.switchTo().alert();
			obj1.accept(); //  approved to value and ok 
			
			
			
	}

}

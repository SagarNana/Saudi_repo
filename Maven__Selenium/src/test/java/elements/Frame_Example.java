package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example {

	public static void main(String[] args) {
		// browser window new tab and close tab 
		//register the driver 
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven_Selenium\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		//driver.get("https://demoqa.com/webtables"); 
			Navigation p=driver.navigate();
			p.to("https://demoqa.com/frames"); // get to page url 
		
		driver.manage().window().maximize(); // maximize the window 
	
		//driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
// ager is page ka text read krna hai to gettext method use hogi 
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='frame1'][@src='/sample']"));
		//driver switchto().frame then show 3 method so use webelement method 
		driver.switchTo().frame(frame); 
		//frame me frame jo hai vho webelement ka fram stored kiya hai 
		System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText())
		
		 
		
		
		;
		
	
	}

}

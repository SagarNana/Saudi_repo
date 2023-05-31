package com.abc.elements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Synchronization {

	public static void main(String[] args) throws InterruptedException {

		// Register the browser
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // launch the browser
	
		Navigation p = driver.navigate();
		p.to("https://demoqa.com/alerts"); // if wait have condition
		// driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize(); // to open the maximize window
	
	/*	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // underline means differnaite method mtlub new line me kam nhi ayegi but it will run 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 	*/
		
		
//findElement ka return type Webelement		
		WebElement clicktxt = driver.findElement(By.xpath("//button[@id='timerAlertButton']")); //find element is poll the dom structure to find krega element ko 
		//poll the dom means jub tk elment nhi milta tub tk find kro 
		clicktxt.click();
	//	Thread.sleep(6000); // we push the  script 6 Ssecond and then run 
		
//we create a explixit wait object and the driver is instance and duration of second is class 		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10)); 
							// we have pass to parameter(driver),duration(how much second))		
		//then call to until method and until is webdriver method
		wait.until(ExpectedConditions.alertIsPresent()); // this condition we will check the specific condition to check alert is present or not 
		
		
		Alert obj=driver.switchTo().alert();
		obj.accept(); // ok ke liye accept button hai 
		
	}

}

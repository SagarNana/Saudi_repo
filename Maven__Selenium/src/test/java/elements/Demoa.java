package com.abc.elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoa {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://demoqa.com/text-box");
		Navigation p=driver.navigate();
		p.to("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	
		WebElement fullname=driver.findElement(By.id("userName"));
		fullname.sendKeys("SagarNana");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("SagarNana@gmail.com");

		WebElement cureentaddress=driver.findElement(By.id("currentAddress"));
		cureentaddress.sendKeys("Chandigrah");
		
	}

}

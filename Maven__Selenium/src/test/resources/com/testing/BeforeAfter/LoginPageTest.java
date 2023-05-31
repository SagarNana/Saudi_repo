package com.testing.BeforeAfter;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginPageTest {

	ChromeDriver driver;
	
	@BeforeSuite
	public void LaunchBrowser() {
		//Register the browser
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven_Selenium\\src\\main\\resources\\chromedriver.exe");
		//create a object of class
		  driver=new ChromeDriver(); // launch the browser 
		
		//driver.navigate("https://www.saucedemo.com/"); // we have to condtion
		Navigation p=driver.navigate();
		p.to("https://www.saucedemo.com/"); // we peste the url 
		
		driver.manage().window().maximize();
		
	}
	@Test(description=" Verify that user is able to login with valid credential",priority=1,enabled=false) // by default true hota hai)
	public void TC1() {
		//driver.--> it can not show the all method becuase chromdriver is private in launch browser so we can chrmoebrowser is global and then use
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	@Test(description="Verify that user is  unable to login with invalid credential",priority=0)
	public void TC2 () {
		//driver.--> it can not show the all method becuase chromdriver is private in launch browser so we can chrmoebrowser is global and then use
		driver.findElement(By.id("user-name")).sendKeys("standard_use");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();	
	}
	
	@BeforeMethod
	public void precondition() { // i will run before each @test Method
		
	List<WebElement> menubutton=driver.findElements(By.id("react-burger-menu-btn"));
	if(menubutton.size()>0) { //greater then zero mtlub is ka size ager greater then zero mtlub locatore milega aur button per click hoga 
		menubutton.get(0).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		}	
	}
	
	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
		
	}
}

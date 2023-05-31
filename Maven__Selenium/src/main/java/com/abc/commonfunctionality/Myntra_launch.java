package com.abc.commonfunctionality;

import java.sql.Driver;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven_Selenium\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // launch the browser

		Navigation p = driver.navigate();// getting url with navigate to method
		p.to("https://www.myntra.com/");

		driver.manage().window().maximize(); // incrase the page size maximize

	}

}


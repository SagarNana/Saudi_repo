package com.abc.elements;

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) {

		// register the driver
		System.setProperty("webdriver.chrome.driver", ".//src\\main\\resources\\chromedriver.exe");
		// when we create object of chrome driver to browser launch auromatically chrome
		// browser
		ChromeDriver driver = new ChromeDriver();
		// 1.for entering url we use get(string url) method of webdriver interface
		// driver.get("https://demoqa.com/text-box");
		// 2.for entering url we use navigate().to() method of webdriver interface
		driver.navigate().to("https://demoqa.com/checkbox");

		driver.manage().window().maximize();// it is use to maximize or minimize the browser

		// find the address of home checkbox-
		// we find address home checkbox base on the label locator because we click on
		// home label it will checked Home checkbox
		// findelement()-it is used for,if locator is not found selenium throw
		// NoSuchElement Exception
		WebElement HomeCheckBox = driver.findElement(By.xpath("//label[@for='tree-node-home']"));
		HomeCheckBox.click();
		/*
		 * //if click operation is not perform & we use findelements method because
		 * selenium shouldn't throw NoSuchElement Exception //findelements()-it is used
		 * for to tell selenium don't throw NoSuchElement Exception if locator is not
		 * found List<WebElement>
		 * result=driver.findElements(By.xpath("//div[@id='result']"));
		 * 
		 * if(result.size()>0) {
		 * System.out.println("user is able to select the checkbox");//if checkebox is
		 * selected test case is pass }else {
		 * System.out.println("user is unable to select the checkbox");//if checkebox is
		 * not selected test case is fail }
		 */

		WebElement button = driver.findElement(By.xpath("//label[@for='tree-node-home']"));
		button.click();

		WebDriverWait waitobj = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement desktopchekbox = driver.findElement(By.xpath("(//label[@for='tree-node-desktop']));"));
		// waitobj.until(ExpectedConditions.elementToBeClickable(desktop));

		desktopchekbox.click();

		waitobj.until(CheckBox.VerifyDisplay());

		// customre expected condition

		// ExpectedCondition ---> apply
		// Predefined ExpectedCondition --> ExpectedConditions
	}

	public static ExpectedCondition<Boolean> VerifyDisplay() { // VerifyDisplay is return to new otherwisw u can change
																// the void

		return new ExpectedCondition<Boolean>() {

			public Boolean apply(WebDriver driver) { // ya humne override kiya hai
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("(//label[@for='tree-node-desktop']));")).isDisplayed();
			}
		};

	}
}
 
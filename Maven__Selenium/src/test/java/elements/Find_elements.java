package com.abc.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver chromeobj=new ChromeDriver();
		chromeobj.get("https://demoqa.com/text-box");
		chromeobj.manage().window().maximize();
		
	 List<WebElement>listofwebelements=chromeobj.findElements(By.tagName("input"));
		System.out.println("no.of elements"+listofwebelements.size());

	}

}

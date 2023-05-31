package com.abc.elements;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.layertree.model.ScrollRect;

public class TakeScreenShot {
	//Take a screenshot one method i.e. getscreenshot as

	public static void main(String[] args) throws IOException {
		//register the driver
				System.setProperty("webdriver.chrome.driver", ".//src\\main\\resources\\chromedriver.exe");
				//create object of chrome driver to launch chrome browser
				ChromeDriver driver = new ChromeDriver(); //launch the browser
				
				//1.for entering url we use get(string url) method of webdriver interface
				//driver.get("https://demoqa.com/text-box");
				//2.for entering url we use navigate().to() method of webdriver interface
					Navigation p=driver.navigate();
						p.to("https://demoqa.com/tabs");
				//driver.navigate().to("https://demoqa.com/selectable"); we can use line 21 use 
				
				driver.manage().window().maximize();//it is use to maximize or minimize the browser

				TakesScreenshot obj=(TakesScreenshot)driver; // create a object like that javascript type 
				
				Date screenshotdate=new Date();
				System.out.println(screenshotdate);
				SimpleDateFormat formatobj=new SimpleDateFormat("yyyyMMddHHmmss"); // datefromate by default hai SimpleDateFormat so it can use own way  

				
				System.out.println(formatobj.format(screenshotdate));
				File resultfile=obj.getScreenshotAs(OutputType.FILE);// return  type is file 
				//it is method to use get a screenshot 
			// directly access this mehtod becuase object of chromdriver and prefer to chromderiver it self
			
				
	//File it is part of appache .. so download thsi file and set up tp pom.xml 
//Note--> file util not a part of java either util part of not a selenuim ,this is appache inbuild method i.e. copy file we use 
			
			// it will crate new file and the select to the path becuase screenshot where is store so selected the path 
				File reuslt=new File("C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven_Selenium\\Result\\" + formatobj.format(screenshotdate) + " .png" ); // screenshot.png to pic name select to add the own hand 
				FileUtils.copyFile(resultfile, reuslt); 
				//FileUtils.copyFile(resultfile, reuslt);  there is error so cheack exception 
			//	FileUtils.copyDirectory(src is resultfile, dest meanss destination file );
				
				
				
	}

}

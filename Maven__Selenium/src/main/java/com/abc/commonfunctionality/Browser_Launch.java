package com.abc.commonfunctionality;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Launch {
		
		public static void main(String[] args) {
			  //register the driver in selenium
			 //for that we need to call set property from system class
				//give key and value
				//key-webdriver.browsername.driver
				//value should be the path of chrome driver
			String browsername="chrome";
				if(browsername.equalsIgnoreCase("chrome")){
			
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven_Selenium\\src\\main\\resources\\chromedriver.exe ");
			ChromeDriver driver=new ChromeDriver();
		//	driver.get("https://demoqa.com/webtables");
			Navigation p=driver.navigate();
			p.to("https://demoqa.com/text-box");//will enter the url

			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			
			if(driver.getTitle().equalsIgnoreCase("ToolsQA")) {
				System.out.println("browser launch successfully");
		}
				else {
				System.out.println("test failed");
		}
				driver.navigate().refresh();
				driver.navigate().back();
				driver.close();
		}
				else if(browsername.equalsIgnoreCase("edge")){
					System.setProperty("webdriver.edge.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven_Selenium\\src\\main\\resources\\chromedriver.exe");
					EdgeDriver obj1=new EdgeDriver();//launch edge browser
						
						//launch edge browser
					}

	}

}

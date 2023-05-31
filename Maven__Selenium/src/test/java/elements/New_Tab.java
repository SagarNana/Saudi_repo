package com.abc.elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab {
	public static void main(String[] args) {
		// browser window new tab and close tab 
				//register the driver 
				System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver(); //launch the chrome
				//driver.get("https://demoqa.com/webtables"); 
					Navigation p=driver.navigate();
					p.to("https://demoqa.com/browser-windows"); // get to page url 
				
				driver.manage().window().maximize(); // maximize the window 
				//System.out.println(driver.getWindowHandle()); // it is nothing but get windo handler it is nothing but gethandle window page 
			String parentwindow=driver.getWindowHandle(); // parentwindow -windohandles

				driver.findElement(By.id("tabButton")).click();
				// iske bad vho new tab per jayega 
			//	System.out.println(driver.getWindowHandles()); // return type set of string
				
				Set<String> windohandles=driver.getWindowHandles(); 				
				Iterator<String> iterator=windohandles.iterator();
//Iteratot ther is method hashnext() and next()
				
				while(iterator.hasNext()) {
					String handler=iterator.next();
					if(!handler.equalsIgnoreCase(parentwindow));   
						driver.switchTo().window(handler);
//if ka pert explain -- if there are two string so campare to parent string so condition is true so do not allowed entry in--> if(handler.equalsIgnoreCase(handler))
//so conditi is not eqaul to means childwindo and parent windo are equal -no - false and false = true 
//true-- then switch to windowhandler 						
						
		//		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
			// serach krega humesh first page krega ki sampleHeading jis page per hai vhi page pe kro 
						
			//	driver.close(); // cureent working all broswer ko close krega 
				driver.quit(); // all broswer are close all to open in this url 
				
				
				
				}
				
			}
}

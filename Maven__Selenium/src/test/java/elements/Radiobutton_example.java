package com.abc.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_example {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/radio-button");//launch the radio button page
			driver.manage().window().maximize();
//			
//			WebElement YesRadio=driver.findElement(By.xpath("//label[@for='yesRadio']"));
//			YesRadio.click();
//			System.out.println(YesRadio.isSelected());
		WebElement NoRadio=driver.findElement(By.xpath("//label[@for='noRadio']"));
		NoRadio.click();
			System.out.println(NoRadio.isEnabled());
			
			if(NoRadio.isEnabled()) {
			System.out.println("test case fail if it is enabled");
			}
				else {
					System.out.println("test case successful");
				
			}
				
		
	}

}

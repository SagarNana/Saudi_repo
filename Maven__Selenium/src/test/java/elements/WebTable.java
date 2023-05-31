package com.abc.elements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		//register the driver 
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\admin\\EclipsePhotonWorkspace\\Maven-Project\\src\\main\\resources\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); //launch the chrome
		//driver.get("https://demoqa.com/webtables");
		Navigation p=driver.navigate();
		p.to("https://demoqa.com/webtables"); // get to page url 
		driver.manage().window().maximize();
		
		List<WebElement> Columns= driver.findElements(By.xpath("//div[@role='columnheader']"));
		int index = 0;
		System.out.println(Columns.size());
		
		List<WebElement> Colunheading =driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
	//	Columnheading shows the webelements method . columnheading represent one collection to storing object		
		
		Iterator<WebElement>iterator=Colunheading.iterator();
	// which has the method in iterator to read the element one by one --> hashnext 
		while(iterator.hasNext()){
			WebElement element=iterator.next(); // return type is Webelement
			System.out.println(element.getText());
		if(element.getText().equalsIgnoreCase("Salary")) {
			System.out.println("Salary column is present");
		
		} 
	}
		//find the index of salary 
		for(int i=0;i<Colunheading.size();i++) {
			//object lene ke liye get methodd use ki hai get indext aur uska text nikalne ke liye get text method use kr rhe hai
			if(Colunheading.get(i).getText().equalsIgnoreCase("Salary")) {
			System.out.println("Salary column is persent ");
			index =i;
			break;
		}
	}
		System.out.println("index of salary " + index ); // index of salery 4 
	
//Find the rows 
	/*	List<WebElement> rows= driver.findElements(By.xpath("//div[@role='rowgroup']"));
	
		System.out.println(rows.size());
		
		for(int j=0;j<rows.size();j++) {
			System.out.println("Value of j" + j );
		List<WebElement> listgridcell=rows.get(j).findElements(By.xpath("//div[@class='rt-td']"));
		System.out.println(listgridcell.get(4).getText());*/

		WebElement obj=driver.findElement(By.id("//span[@id='delete-record-1']"));
		obj.click();
	}
}

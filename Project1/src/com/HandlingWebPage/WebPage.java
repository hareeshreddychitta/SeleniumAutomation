package com.HandlingWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {
	
	public void lanuchBrowser()
	
	{
	// config browser
	
	// for config browser add selenium web driver and browser drivers
	
	//for chorme driver :webdriver.chrome.driver
	//For IE   :webdriver.ie.driver
	//For firefox  :webdriver.gecko.driver
		
		
	//for getting System.setProerty() -->type Sys ctrl+spacebar select System put . type set and select setProperty
	//	System.setProperty(key, value)
	//System.setproperty("webdriver.chrome.driver","driver path");
	
	System.setProperty("webdriver.chrome.driver","G:\\workspace\\MyeighthWorkSpace\\Project1\\browser Drivers\\chromedriver.exe" );
	
	// for lanuching browser give object for interface of webdriver
	
	WebDriver driver = new ChromeDriver();
	// now chrome is lunch
	//here driver is object for chromedriver and refernce is webdriver
	//webDriver is  interface
	
	// for broswer maximize
	
	driver.manage().window().maximize();
	
	//for getting website
	driver.get("http://www.seleniumhq.org");
	
	// for close the driver
	//driver.close();
	
	//for refresh
	
	driver.navigate().refresh();
	
	// for getting title of page 
	String appTitleFirst = driver.getTitle();
	//here is string is java class
	System.out.println(appTitleFirst);
	
	// for getting currenturl of page
	String appCurrentUrl=driver.getCurrentUrl();
			System.out.println(appCurrentUrl);
			
			
			
			//webelement handing
			/*WebElement downloadElement=driver.findElement(By.xpath("//li [@id='menu_projects']/a[@href='/projects/']"));
			downloadElement.click();
			
			
			
			String currnetTittle=driver.getTitle();
			System.out.println(currnetTittle);*/
	
			
			WebElement clickedelement=driver.findElement(By.xpath("//li[@id='menu_support']/a[@href='/support/']"));
			clickedelement.click();
			String currentTittle=driver.getTitle();
			System.out.println(currentTittle);
	
	driver.navigate().back();
	driver.navigate().forward();

	System.out.println(" this is launchBrowser method");
	
	
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		WebPage obj =new WebPage();
		obj.lanuchBrowser();
		

	}

}

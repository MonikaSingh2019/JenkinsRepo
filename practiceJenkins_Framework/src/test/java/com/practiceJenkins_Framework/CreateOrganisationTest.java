package com.practiceJenkins_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import comcast.vtiger.genericUtilities.PropertyUtlity;


public class CreateOrganisationTest {
	
	
	@Test 
	public void createOrganisationTest() throws Throwable 
	{
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
//		FileInputStream fis = new FileInputStream("./Data/CommonProperty.properties");
//		Properties p = new Properties();
//		
//		p.load(fis);
//		
		
		String URL=System.getProperty("url");
		System.out.println(URL);
		driver.get(URL);
//		String Url=p.getProperty("url");
//		driver.get(Url);
	System.out.println("Organization Created");
	System.out.println("Vtiger Org");
	System.out.println("Test Script");
	System.out.println("Failed");
	System.out.println("Passed test scrpt");
	System.out.println("Classmate");
System.out.println("Ilisha");
	
}
	
	
}
package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		//JavascriptExecutor j=((JavascriptExecutor)driver);
		//j.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(5000);
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\Ashok\\Documents\\cv.docx");
	//	driver.get("https://html.com/input-type-file/#site-main");
	//	driver.findElement(By.xpath("//label[.=' Select a file to upload']")).sendKeys("C:\\Users\\Ashok\\Documents\\doubleclick.html");
		
		
		
	
		
		
		
		
		

	}

}

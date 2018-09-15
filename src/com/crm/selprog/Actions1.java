package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[.='Sub Agent Login (AGENT PLUS)'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		 
		//moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin")));
		
	
		
		
		
		

	}
	/*public static void moveToElement(WebElement element) {
	Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}*/

}

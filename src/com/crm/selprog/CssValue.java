package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValue {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		WebElement mytralogo = driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite desktop-logo')]"));
		String bgcolor = mytralogo.getCssValue("backgroundcolor");
		System.out.println(bgcolor);
		
		

	}

}

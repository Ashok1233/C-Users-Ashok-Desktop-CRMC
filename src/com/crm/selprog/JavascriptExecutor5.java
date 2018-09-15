package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor5 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement technology = driver.findElement(By.id("email"));
		//flash(technology,driver);
		drawBorder(technology,driver);
		
		

	}
	public static void flash(WebElement element,WebDriver driver) {
		
		JavascriptExecutor j=((JavascriptExecutor)driver);
		String color = element.getCssValue("color");
		System.out.println(color);
		
		
		for(int i=0;i<100;i++) {
			changeColor("rgb(255, 255, 0)",element,driver);
			changeColor(color,element,driver);
		
		
		}
	
		//element.click();
		
	}
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		try {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("arguments[0].style.backgroundcolor='"+color+"' ", element);
		}
		catch(Exception e) {
			
		}
		
		
	}
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("arguments[0].style.border='5px solid red'",element );
		
	}
	

}

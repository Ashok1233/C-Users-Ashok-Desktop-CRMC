package com.crm.selprog;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	String text = alert.getText();
	alert.accept();
	if(text.equals("Please enter a valid user name"))
	{
		System.out.println("corrcet popup");
	}
	else {
		System.out.println("in-correct popup");
	}
	driver.close();
	
		
		
		
	

	}

}

package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Authentication_popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://the-internet.herokuapp.com/key_presses");
		//driver.findElement(By.id("result")).sendKeys("Keys.E");
		Actions action=new Actions(driver);
		action.sendKeys("Keys.E").perform();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
			
				
		
		

	}

}

package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		Actions action=new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//a[.='Women']"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-user']"))).perform();
		WebElement subMenu = driver.findElement(By.xpath("//a[.='Sign up']"));
		subMenu.click();
		//action.moveToElement(driver.findElement(By.xpath("(//a[contains(.,'Home & Living')])[1]"))).perform();
		Thread.sleep(2000);
		driver.close();
		

	}

}

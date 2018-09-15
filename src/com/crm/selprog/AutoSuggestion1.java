package com.crm.selprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allasts = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
	    int count = allasts.size();
	    System.out.println(count);
	    for(int i=0;i<count;i++) {
	    	WebElement ast = allasts.get(i);
	    	String text = ast.getText();
	    	System.out.println(text);
	    }
	    allasts.get(0).click();

	}

}

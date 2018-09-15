package com.crm.selprog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_elements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println("totla links in page:"+count);
		int visible=0;
		for(int i=0;i<count;i++) {
			WebElement link = allLinks.get(i);
			if(link.isDisplayed()) {
				String text = link.getText();
				System.out.println(text);
			}
			visible++;
		}
		driver.close();
		System.out.println(visible);
				
			
		

	}

}

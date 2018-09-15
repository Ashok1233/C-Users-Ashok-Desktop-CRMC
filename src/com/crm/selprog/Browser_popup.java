package com.crm.selprog;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_popup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> allWHS = driver.getWindowHandles();
		for(String s:allWHS) {
			
			String title = driver.switchTo().window(s).getTitle();
			System.out.println(title);
			if(title.equals("Amazon"))
			{
				
				driver.close();
				break;
		
			}
		
		
			
		}
		
	

	}

}

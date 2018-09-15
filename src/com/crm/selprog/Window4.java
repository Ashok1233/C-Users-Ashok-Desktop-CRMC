package com.crm.selprog;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window4 {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\\\Program Files\\\\Git\\\\usr\\\\bin\\\\notepad");
		try {
			//Runtime.getRuntime().exec("E:\\Program Files\\Git\\usr\\bin\\notepad");
			Runtime.getRuntime().exec("C:\\Users\\Ashok\\Documents\\AutoIT\\pad.exe");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}

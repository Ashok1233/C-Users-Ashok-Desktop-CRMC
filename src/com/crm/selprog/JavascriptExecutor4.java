package com.crm.selprog;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.myntra.com");
		driver.get("https://www.flipkart.com");
		
	    //	scrollpageDown(driver);
		//WebElement element = 
		//scrollspecificElement(driver,driver.findElement(By.xpath("//a[@href='db2-tutorial']")));
		//scrollIntoView(driver,driver.findElement(By.xpath("//a[.='Developed by SSS IT Pvt Ltd (JavaTpoint)']")));
		System.out.println(getPageInnerText(driver));
	    // System.out.println(getTitleByJS(driver));
		//refreshBrowserByJS(driver);
		//clickElementByJS(driver,driver.findElement(By.xpath("//a[@href='db2-tutorial']")));
		//generateAlert(driver,"There is issue with logibutton");
		//WebElement element = driver.findElement(By.xpath("//a[.='Android']"));
		//flash(driver,element);
		
		
		
	

	}
	public static void scrollpageDown(WebDriver driver) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollspecificElement(WebDriver driver,WebElement element) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
	
		int y = element.getLocation().getY();
		String script = "window.scrollTo(0,'"+y+"')";
		 j.executeScript(script);
		
	}
	public static void scrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor j=((JavascriptExecutor )driver);
		j.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		String pageText = j.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		
		String title = j.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("history.go(0)");
		
	}
	public static void clickElementByJS(WebDriver driver,WebElement element) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("arguments[0].click();",element );
	}
	public static void flash(WebDriver driver,WebElement element) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundcolor");
		for(int i=0;i<100;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
			
		}
	}
	public static void changeColor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("argument[0].style.backgroundcolor='"+color+"'", element);
		try {
			Thread.sleep(20);
		}
		catch(Exception e) {
			
		}
	}
	
	public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("alert('"+message+"')");
		
		
	}
	

}

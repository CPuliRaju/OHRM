package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Application {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		String applicationUrlAddress="https://www.amazon.in/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PULI RAJU\\eclipse-workspace\\eclipse-workspace\\OrangeHRMApplication\\puli\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="Search Amazon.in" class="nav-input 
		                    //nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon.in" spellcheck="false">
		
		
		By SearchbarL=By.id("twotabsearchtextbox");
		WebElement searchbar=driver.findElement(SearchbarL);
		searchbar.sendKeys("wirelessmouse");
		
		//<input id="nav-search-submit-button" type="submit" class="nav-input nav-progressive-attribute" value="Go" tabindex="0">
		By searchL=By.id("nav-search-submit-button");
		WebElement search=driver.findElement(searchL);
		search.click();  
		
		By mouseL=By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div");
		WebElement mouse=driver.findElement(mouseL);
		mouse.click();
		
		By AddToCartL=By.name("submit.add-to-cart");
		WebElement AddToCart=driver.findElement(AddToCartL);
		AddToCart.click();
		
		
		
		driver.quit();
		

	}

}

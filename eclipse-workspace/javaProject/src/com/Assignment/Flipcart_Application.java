package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Application {

	public static void main(String[] args)  {
		
		
		WebDriver driver;
		
		String ApplicationURLAdderss="https://www.flipkart.com/";
		System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(ApplicationURLAdderss);
		driver.manage().window().maximize();
		
	    ////*[@id="container"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a
		By loginL=By.id("container");
		WebElement login=driver.findElement(loginL);
		login.click();
		
		
		//<input class="_3704LK" type="text" title="Search for products, brands and more" name="q" autocomplete="off" placeholder="Search for products, brands and more" value="">
		// //*[starts-with(@name,'q')]
		//*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input
		By searchbarL=By.xpath("//*[starts-with(@name,'q')]");
		WebElement searchbar=driver.findElement(searchbarL);
		searchbar.sendKeys("mobiles");
	
		//*[@id="container"]/div/div[3]/div[2]/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div/a/div/img
		By pocoL=By.xpath("//*[@id=\"container\"]");
		WebElement poco=driver.findElement(pocoL);
		poco.click(); 
		
		//*[@id="container"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img
		By pocomobileL=By.xpath("//*[@id=\"container\"]");
		WebElement pocomobile=driver.findElement(pocomobileL);
		pocomobile.click();
		
		//*[@id="container"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button
		By ADDTOCARTL=By.xpath("//*[@id=\"container\"]");
		WebElement ADDTOCART=driver.findElement(ADDTOCARTL);
		ADDTOCART.click();
		
		
		
		
	}

}

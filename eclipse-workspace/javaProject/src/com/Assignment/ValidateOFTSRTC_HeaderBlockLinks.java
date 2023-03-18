package com.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateOFTSRTC_HeaderBlockLinks {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		By HeaderblockL=By.className("menu-wrap");
		WebElement headerblock=driver.findElement(HeaderblockL);
	    By headerblockelementL=By.tagName("a");
	    List<WebElement>headerblocklinks=headerblock.findElements(headerblockelementL);
	    int headerblocklinks_count=headerblocklinks.size();
	    System.out.println("numberof Elements"+headerblocklinks_count);
	    for (int index=0; index<headerblocklinks_count; index++) {
	    	String headerblocklinksnames=headerblocklinks.get(index).getText();
	    	System.out.println("index"+headerblocklinksnames);
	    	
	    }
		
	}

}

package com.Assignment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		
		WebDriver driver;
		String ApplicationURLAddress="https://www.youtube.com/";
		System.setProperty("webdriver.chrome.driver","./Webdriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationURLAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		By searchsongsL=By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input");
		WebElement searchsongs=driver.findElement(searchsongsL);
		searchsongs.sendKeys("mastaru mastaru song");
		
		 By searchL=By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/button/yt-icon");
		 WebElement search=driver.findElement(searchL);
		 search.click();
		
		By songL=By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon");
		WebElement song=driver.findElement(songL);
		song.click();
		
		By songL1=By.xpath("//*[@id=\"thumbnail\"]/yt-image/img");
		WebElement master=driver.findElement(songL1);
	    master.click();
			
	}

}

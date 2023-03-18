package com.Assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		
		String huburl ="http://192.168.43.27:4444/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(huburl),options);
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("txtUsername")).sendKeys("PULIRAJU");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Puli996632@");
		
		driver.findElement(By.className("button")).click();
	

	}

}

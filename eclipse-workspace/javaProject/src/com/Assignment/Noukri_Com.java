package com.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noukri_Com {

	public static void main(String[] args) {
	

		WebDriver driver;
		
		String ApplicationURLAdderss="https://www.naukri.com/";
		System.setProperty("webdriver.chrome.driver", "./Webdriver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(ApplicationURLAdderss);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//login_Layer
		By loginL=By.id("login_Layer");
		WebElement login=driver.findElement(loginL);
		login.click();
		
		By usernameL=By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input");
		WebElement username=driver.findElement(usernameL);
		username.sendKeys("cpuliraju1@gmail.com");
		
		
		//*[@id="root"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input
		By passwordL=By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input");
		WebElement password=driver.findElement(passwordL);
		password.sendKeys("Puli2002");
		
		//*[@id="root"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button
		By LoginbuttonL=By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button");
		WebElement Loginbutton=driver.findElement(LoginbuttonL);
		Loginbutton.click();
		
		//qsb-keyskill-sugg
		By searchjobsL=By.id("qsb-keyskill-sugg");
		WebElement searchjobs=driver.findElement(searchjobsL);
		searchjobs.sendKeys("Manual Testing Jobs");
				
		//*[@id="search-jobs"]/button
		By searchL=By.xpath("//*[@id=\"search-jobs\"]/button");
	   	WebElement search=driver.findElement(searchL);
	   	search.click();
	   
		
	   
	    //*[@id="root"]/div[4]/div/div/section[2]/div[2]/article[1]
	   	By manualtestingL=By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[2]/div[2]/article[1]/div[1]/div/a");
	    WebElement manualtesting=driver.findElement(manualtestingL);
	    manualtesting.click();
		
	    
	    //*[@id="root"]/div[4]/div/div/section[2]/div[2]/article[1]/div[3]/div[2]
	   	By saveL=By.xpath("//*[@id=\"root\"]/main/div[2]/div[2]/section[1]/div[1]/div[3]/div/button[1]");
	   	WebElement save=driver.findElement(saveL);
	   	save.click();
	   	
	    
	    //*[@id="root"]/main/div[2]/div[2]/section[1]/div[1]/div[3]/div/button[2]
	   	By ApplyoncompanysiteL=By.className("waves-effect waves-ripple btn company-site-button");
	   	WebElement Apply=driver.findElement(ApplyoncompanysiteL);
	   	Apply.click();
		
		
		//driver.quit();

	}

}

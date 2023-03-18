package com.OrangeApplicationTestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.OrangeHRMApplication.BaseTest;
import com.Utility.ExcelCommonMethods;
import com.Utility.Log;
import com.Utility.OHRMProperty;
import com.Utility.OHRMScreenshots;

public class LoginFuctionalityTest extends BaseTest{

	Properties property;
	String excelfileinputpath="./src/main/java/com/OrangeHRMApplicationTestDataFile/LoginText.xlsx";
	String excelfileoutputpath="./src/main/java/com/OrangeHRMApplicationTestResultDataFile/LoginText.xlsx";
	String SheetName="Sheet1";
	ExcelCommonMethods excelfile;

	@Test(priority=1,description="validatingLoginPage-LoginpanelText")
	public void validatingLoginText() throws IOException {

		excelfile=new ExcelCommonMethods(excelfileinputpath, excelfileoutputpath, SheetName);
		property=OHRMProperty.loadproperty();
		By LoginpageloginpaneltextLocator=By.id(property.getProperty("loginPanelTextProperty"));
		String actual_loginpageloinpaneltext=driver.findElement(LoginpageloginpaneltextLocator).getText();
		//excelfile.SetCellValue(1, 1, actual_loginpageloinpaneltext);
		String expected_loginpageloginpaneltext=excelfile.getcellvalue(1, 0);

		if(actual_loginpageloinpaneltext.equals(expected_loginpageloginpaneltext)) 
		{
			Log.info("Sccessful navigated to the OHRMApplication-PASS");
			excelfile.SetCellValue(1, 15," Sccessful navigated to the OHRMApplication-PASS");
		}
		else
		{
			Log.info("Failed to navigated to the OHRMApplication-FAIL");
			excelfile.SetCellValue(1, 2, "Failed to navigated to the OHRMApplication-FAIL");
			OHRMScreenshots.TakeScreenShot(driver,"errortonavigatetoOHRM");
			
			
		}

	}
	@Test(priority=2,description="OrangeHRMApplicationloginfuctionalitytest")
	public void validateloginfuctionalitytest()
	{
		int rowIndex=1;
		while(true)
		{
			try
			{
				String username=excelfile.getcellvalue(rowIndex, 9);
				String password=excelfile.getcellvalue(rowIndex, 10);

				By usernameElementLocator=By.id(property.getProperty("userNameProperty"));
				WebElement usernameElement=driver.findElement(usernameElementLocator);
				usernameElement.clear();
				usernameElement.sendKeys(username);

				By passwordElementLocator=By.id(property.getProperty("passwordProperty"));
				WebElement passwordElement=driver.findElement(passwordElementLocator);
				passwordElement.clear();
				passwordElement.sendKeys(password);

				By loginpageloginbuttonLocator=By.id(property.getProperty("loginButtonProperty"));
				WebElement loginpageloginbutton=driver.findElement(loginpageloginbuttonLocator);
				loginpageloginbutton.click();
				
				if (isLoginPage())
				{
					//LoginPage
					Log.info("Failed to navigated to the OHRMApplication-FAIL");
					OHRMScreenshots.TakeScreenShot(driver, username+password);
					excelfile.SetCellValue(rowIndex, 7, "Failed to navigated to the OHRMApplication-FAIL");
				}
				else
				{
					//HomePage
					Log.info(" Sccessful navigated to the OHRMApplication-PASS");
					validateHomePage(rowIndex);
					Logout();
				}
				rowIndex++;
			}
			catch(Exception e)
			{
				break;
			}
		}
		excelfile.saveExcelData();
	}
	private boolean isLoginPage()
	{
		try
		{
			By loginpageInvalidMessageLocator=By.id(property.getProperty("loginpageInvalidErrorMessage"));
			return driver.findElement(loginpageInvalidMessageLocator).isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	private void validateHomePage(int rowOfIndex) throws IOException
	{
		int rowIndex = 1;
		System.out.println(rowIndex);
		
		String expected_HomePageText=excelfile.getcellvalue(1, 11);
		By HomePageWelcomeadminLocator=By.id(property.getProperty("welcomeAdminProperty"));
		String actual_HomePagetext=driver.findElement(HomePageWelcomeadminLocator).getText();
		excelfile.SetCellValue(1, 6, actual_HomePagetext);

		if(actual_HomePagetext.contains(expected_HomePageText))
		{
			Log.info("Successful navigated OrangeHRMApplication HomePage - PASS");
			excelfile.SetCellValue(rowOfIndex, 7, "Successful navigated OrangeHRMApplication HomePage - PASS");
		}
		else
		{
			Log.info("Failed navigated OrangeHRMApplication HomePage - FAIL");
			OHRMScreenshots.TakeScreenShot(driver, "failedtonavigatedHomePage");
			excelfile.SetCellValue(rowOfIndex, 7, actual_HomePagetext);
		}
	}

	
	private void Logout()
	{
		By HomePagewelcomeAdminLocator=By.id(property.getProperty("welcomeAdminProperty"));
		WebElement HomePagewelcomeAdmin=driver.findElement(HomePagewelcomeAdminLocator);
		HomePagewelcomeAdmin.click();

		By homepagelogoutelementLocator=By.id(property.getProperty("logoutProperty"));
		WebElement HomePageLogoutLocator=driver.findElement(homepagelogoutelementLocator);
		HomePageLogoutLocator.click();
	}

}

package com.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FaceBookLoginPage {
	
	WebDriver driver;
		
	By userName = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");
	
	public FaceBookLoginPage(WebDriver driver) {
		this.driver=driver;
	}
		
	public void ssetUserName(String emailId) {
		driver.findElement(userName).sendKeys(emailId);
		
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	
	public void verifyTitle() {
		Assert.assertEquals("Facebook - Log in or Sign Up", driver.getTitle());
	}
	
}

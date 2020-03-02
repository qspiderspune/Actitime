package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy	(id="username")
private WebElement Untbx; 
@FindBy(name="pwd")
private WebElement Pwtbx; 
@FindBy(xpath="//div[.='Login ']")
private WebElement LoginBtn;

public LoginPage(WebDriver driver) {
PageFactory.initElements(driver, this);	      //initialisation
}
//business logic method
public void setLogin(String un,String pw) {
	Untbx.sendKeys(un); 
	Pwtbx.sendKeys(pw);                    //utilisation
	LoginBtn.click();
	}
}


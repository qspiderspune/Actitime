package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

import qsp.LoginPage;

public class ValidLogin {
@Test
public void testValidLogin() {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sandeep/Desktop/classses/input.html");
LoginPage l=new LoginPage(driver);
l.selectAllChkBX();
l.selectAllChkBX();
}
}

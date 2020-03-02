package com.actitime.generics;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	}
 	@BeforeTest
	public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrowser() {
	driver.close();
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
	FileLib f=new FileLib();
	driver.get(f.getPropertyData("url"));
	LoginPage l=new LoginPage(driver);
	l.setLogin(f.getPropertyData("username"), f.getPropertyData("password"));
	Thread.sleep(9000);
	}
	@AfterMethod
	public void logout() {
    EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
     e.setlogout();
	}
}

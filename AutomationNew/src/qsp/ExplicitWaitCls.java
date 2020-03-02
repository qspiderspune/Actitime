package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitCls {
	static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		try {
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page is getting loaded in 3 sec");
		}
		catch(Exception e) {
		System.out.println("page is not getting loaded in 3 sec");
		}
	}
}

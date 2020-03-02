package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement ListBox = driver.findElement(By.id("day"));
Select s=new Select(ListBox);
s.selectByVisibleText("7");
	}
}

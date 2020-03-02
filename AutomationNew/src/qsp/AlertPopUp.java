package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {
	static{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthlistbox = driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(monthlistbox);
		s.selectByVisibleText("Apr");
		WebElement yearlistbox = driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(yearlistbox);
		s1.selectByVisibleText("1996");
		driver.findElement(By.linkText("9")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		driver.close();



	}
}
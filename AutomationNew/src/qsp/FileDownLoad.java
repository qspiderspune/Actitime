package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownLoad {
	static{
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");	
			}
	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://selenium.dev/downloads/");
driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	Robot r=new Robot();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_ALT);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}

}

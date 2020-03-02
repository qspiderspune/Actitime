package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.vtiger.com");
WebElement we = driver.findElement(By.xpath("//a[contains(.,'Resources')]"));
Actions a=new Actions(driver);
a.moveToElement(we).perform();
driver.findElement(By.xpath("//h6[contains(.,'Contact')]")).click();
String xp = "(//p[contains(text(),'Bang')])[1]/../../../div[2]/span/p";
String text = driver.findElement(By.xpath(xp)).getText();
System.out.println(text);
driver.close();
	}
}

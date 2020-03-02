package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
					}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
WebElement GmailLink = driver.findElement(By.cssSelector("aclass='gb_g']"));
System.out.println(GmailLink.getText());
System.out.println(GmailLink.getAttribute("href"));
		driver.close();
			
		}
			
			}

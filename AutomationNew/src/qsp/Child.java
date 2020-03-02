package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {
	static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/");
String etitle = driver.getTitle();
Set<String> allwh = driver.getWindowHandles();
for(String wh:allwh) {
	driver.switchTo().window(wh);
	String atitle = driver.getTitle();
	if(atitle.equals(etitle)) {
	}
	else {
	driver.close();
	}
}
	}
}

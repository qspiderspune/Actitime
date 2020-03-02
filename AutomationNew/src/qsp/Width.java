package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Width {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
int width1 = driver.findElement(By.id("username")).getSize().getWidth();
int width2 = driver.findElement(By.name("pwd")).getSize().getWidth();
if(width1==width2) {
System.out.println("width of both the textboxes are equal and width ="+width1);
}
else {
System.out.println("width of both the textboxes are not equal and width ="+width1);	
}
driver.close();	
	}

}

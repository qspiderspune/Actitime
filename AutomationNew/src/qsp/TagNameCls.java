package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TagNameCls {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sandeep/Desktop/select.html");
WebElement MultiListBox = driver.findElement(By.id("mtr"));
Select s=new Select(MultiListBox);
List<WebElement> allOptions = s.getOptions();
int count = allOptions.size();
for(int i=0;i<count;i++) {
	String text = allOptions.get(i).getText();
	System.out.println(text);
	s.selectByIndex(i);
	Thread.sleep(1000);
}
driver.close();
	}
}

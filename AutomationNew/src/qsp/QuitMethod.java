package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
//maximise the browser
driver.manage().window().maximize();
driver.get("https://www.google.com/");
//to find the active element
WebElement e = driver.switchTo().activeElement();
//to enter java on the search text box
e.sendKeys("java");
driver.close();
}
}

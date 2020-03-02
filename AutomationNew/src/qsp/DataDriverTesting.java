package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.FileLib;

public class DataDriverTesting {

	public static void main(String[] args) throws IOException {
FileLib f=new FileLib();
String URL = f.getPropertyData("url");
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(URL);
driver.findElement(By.id("username")).sendKeys(f.getPropertyData("un"));
	}
}

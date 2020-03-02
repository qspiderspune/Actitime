package qsp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisabledElements {
	static{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
			}
public static void main(String[] args) throws IOException{
				// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
//type cast the object to TakesScreenshot
TakesScreenshot t=(TakesScreenshot) driver;
//press print screen button to take screen shot
File src = t.getScreenshotAs(OutputType.FILE);
//create an empty file and save the file
File dest=new File("./ss/Screenshot.png");
//copy the file from source to destination and save it
FileUtils.copyFile(src, dest);
driver.close();
}

}

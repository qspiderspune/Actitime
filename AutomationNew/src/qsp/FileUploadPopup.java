package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sandeep/Desktop/FileUploadpopup.html");
File f=new File("./cv/ankith.doc");
String path = f.getAbsolutePath();
driver.findElement(By.id("cv")).sendKeys(path);
	
	}
}
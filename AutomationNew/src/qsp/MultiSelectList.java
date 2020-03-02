package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectList {
static {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
System.out.println("enter the option in which you want to search");
Scanner sc=new Scanner(System.in);
String eText = sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sandeep/Desktop/Hotel.html");
WebElement MTRListbox = driver.findElement(By.id("mtr"));
Select s=new Select(MTRListbox);
List<WebElement> alloptions = s.getOptions();
int found=0;
for(WebElement option:alloptions) {
	String aText = option.getText();
	if(eText.equals(aText)) {
		found++;
	}
}
if(found==0) {
	System.out.println(eText +"is not present");
}
else if(found==1) {
	System.out.println(eText +"is  present");
}
else {
	System.out.println(eText +"is  present and it is having duplicate value");
}
driver.close();
	}
}

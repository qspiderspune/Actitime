package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	static {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
				}
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/sandeep/Desktop/select.html");
WebElement mtrListbox = driver.findElement(By.id("mtr"));
Select MtrSelect=new Select(mtrListbox);
MtrSelect.selectByIndex(0);

MtrSelect.selectByValue("d");

MtrSelect.selectByVisibleText("Poori");
if(MtrSelect.isMultiple()) {
MtrSelect.deselectByIndex(0);

MtrSelect.deselectByValue("d");

MtrSelect.deselectByVisibleText("Poori");
}
else {
	System.out.println("listbox is not multiselect");
}
driver.close();
}
}
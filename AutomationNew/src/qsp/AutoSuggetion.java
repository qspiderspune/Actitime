package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		
		//open the chrome browser
		WebDriver driver=new ChromeDriver();
		//go to the google.com
		driver.get("https://www.google.com/");
		//type java in search text box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		//find all the autoseggtions
List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		//print the count of all autosuggestions
		int count = allSuggestion.size();
		System.out.println(count);
		//get the text of all auto suggetion
		for(int i=0;i<count;i++) {
			String text = allSuggestion.get(i).getText();
			System.out.println(text);
		}
		allSuggestion.get(0).click();
		String ActualTitle = driver.getTitle();
		
		if(ActualTitle.equals("java - Google Search")) {
			System.out.println("titles are matching");
		}
		else {
			System.out.println("titles are not matching");
		}
		driver.close();
	}

}

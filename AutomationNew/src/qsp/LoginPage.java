package qsp;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
             
	@FindBy (xpath="//input[@type='checkbox']")
	private List<WebElement> allchkbx;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void selectAllChkBX() {
		for(int i=0;i<allchkbx.size();i++) {
			allchkbx.get(i).click();
		}
	}
	
}


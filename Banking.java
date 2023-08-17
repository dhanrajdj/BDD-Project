package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Banking {
	
public WebDriver Idriver;
	
	public Banking(WebDriver rdriver){
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	//https://demoqa.com/automation-practice-form/
	
	@FindBy(xpath="//input[@id='//']")
	WebElement userName;	
	
	@FindBy(id="userEmail")
	WebElement emailId;
	
	@FindBy(xpath="//label[contains(text(),'Male')]")
	WebElement checkBox;
	
	public void Namefill(String raj){
	
	userName.clear();
	userName.sendKeys("DHANRAJ");
	
	emailId.sendKeys("dhanraj59yahoo.com");
	
	}
	
	public void checkhandle(){
	
	checkBox.click();	
		
	}
		
	
	
	}
	


package pageObjects;

import org.openqa.selenium.chrome.ChromeDriver;

public class Logout1 {
	
	
	
	ChromeDriver driver= new ChromeDriver();{
		
		driver.get("https://www.dmartindia.com/");
		driver.manage().window().maximize();
	}
	

}

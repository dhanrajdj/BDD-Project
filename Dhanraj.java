import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Section;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dhanraj {

	private static final TimeUnit TimeUnit = null;
	private static WebElement signLink;
	private static WebElement signIn;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.Action class
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement login = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		driver.manage().window().maximize();
		Actions cp = new Actions(driver);
		cp.moveToElement(login).perform();
		WebElement raj = driver.findElement(By.xpath("//span[text()='Baby Wishlist']"));
		raj.click();
		

		
		
	//***************************************************************************	

//		set property
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\Selenium driver\\chromedriver.exe");
//		 Open Chrome browser
//		Launch website
//		set property
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\tttttt\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\PRACT\\chromedriver_win32 (1)\\chromedriver.exe");	
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver= new ChromeDriver();
//		WebDriverManager.chromedriver().setup();
//		driver.get("https://www.snapdeal.com/");//https://demo.nopcommerce.com/register
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("shoes");
//		driver.switchTo().alert();
//		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();

		


//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.nopcommerce.com/register");
//		driver.manage().window().maximize();
//		WebElement raj = driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
//		raj.sendKeys("ty");
//		driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
//		
		//TakesScreenshot
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://seller.flipkart.com/sell-online/");
//		driver.manage().window().maximize();
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File("C:\\Users\\Lenovo\\Desktop\\PRACT");
//		FileUtils.copyFile(src, trg);
//		driver.close();

	
		
		//Application form fill up-https://demoqa.com/automation-practice-form/
		
		//Subject line need to check xpath*****************************************
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);//implicit wait
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(120));*******************new Important
//		wait.until(ExpectedConditions.visibilityOf(dropDown));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sheelu");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Yadav");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]"));//IMPORTANT************************************
//		WebElement maleFmale=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
//		maleFmale.click();	
//		WebElement check=driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
//		System.out.println(check.isSelected());//False as its not selected 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;//scroll down
		executor.executeScript("window.scrollBy(0,500)");//scroll down
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//div[contains(text(),'12')]")).click();
		driver.findElement(By.xpath("//*[text()='Sports']")).click();
		

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(120));*******************new Important
//		wait.until(ExpectedConditions.visibilityOf(dropDown))
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dhanraj");
		driver.findElement(By.id("lastName")).sendKeys("Yadav");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("dhanraj59");
//		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		JavascriptExecutor execute = (JavascriptExecutor)driver;
		execute.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("90322444");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'12')]")).click();
		driver.findElement(By.xpath("//div[text()='18']")).click();
//		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com/automation-practice-form/");
//		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);//dhanraj
////		System.out.println("ROCK");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("ram");
//		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("yadav");
//		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("dhanraj@yahoo.com");
//		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
//		System.out.println("KANE");
//		JavascriptExecutor executor = (JavascriptExecutor)driver;//scroll down
//		executor.executeScript("window.scrollBy(0,500)");//scroll down
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.pollingEvery(duration, unit)
		
		
	//***********************************************************************************	
		
		//Drop down**Select class***********.getOptions() also we can handle drop down. need to create loop.
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gocanvas.com/demo");
		driver.manage().window().maximize();
		System.out.println("Dhanraj");
		JavascriptExecutor execute = (JavascriptExecutor )driver;
		execute.executeScript("window.scrollBy(0,500)");
		WebElement drop = driver.findElement(By.xpath("//select[@id='LBL_INDUSTRY__c']"));
		Select sel = new Select(drop);
//		sel.selectByVisibleText("Other");
		sel.selectByIndex(3);
//		sel.selectByValue("4");//not working
		Select country = new Select(driver.findElement(By.xpath("//select[@id='LBL_PRIMARY_ADDRESS_COUNTRY__c']")));
//		country.selectByVisibleText("Canada");
		country.selectByIndex(5);
		Select company = new Select(driver.findElement(By.name("Company_Size__c")));
		company.selectByIndex(2);		
		//		.getOptions() also we can handle drop down. need to create loop.
		
//***********************************************************************************
//		
//		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Select State')]")); 
//		Actions action = new Actions(driver);
//		action.moveToElement(element).click().perform();
//		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("currentAddress")).sendKeys("Sai");
//		WebElement elem=driver.findElement(By.id("uploadPicture"));
//		Thread.sleep(3000);
//		elem.sendKeys("E:\\New folder\\Manual Certificate.jpg");
				
				
//		WebDriverManager.chromedriver().setup();//DOUBT ALERT HANDLE
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		WebElement raj = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
//		driver.switchTo().alert().accept();
//		Actions action = new Actions(driver);
//		action.doubleClick(raj).build().perform();
		
		//Handle Auto Suggestion drop down****Span-div-li-ul(follow this to find element)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println("Size of Auto suggestions:"+list.size());
		
		for(WebElement listitem:list)
			
		{	
			if(listitem.getText().contains("download"))
				
				listitem.click();
				break;
			
		}	
		
		//not working below
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java tutorial");
//		Thread.sleep(3000);
//		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
//		System.out.println("Size of Auto suggestions:"+list.size());
//		
//		for(WebElement listitem:list)
//			
//		{	
//			if(listitem.getText().contains("spoint"))
//				
//				listitem.click();
//				break;
//			
//		}
		
		
		//STRING/int PRACTICE
		
//		String name = "raj";
//		System.out.println(name);
		+++++++++++++++++++++++++++
//		for(int i=10;i<=20;i++)
//		System.out.println("SHEELU");
		
		int myNum = 5;
		System.out.println(myNum);
		
		//Takesscreenshot
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://seller.flipkart.com/sell-online/");
//		driver.manage().window().maximize();
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File srcFile = ts.getScreenshotAs(OutputType.FILE);
//		File targFile = new File("C:\\Users\\Lenovo\\Desktop\\Vaccine");
//		Files.copy(srcFile, targFile);
//		System.out.println("printdone");
		
		//1.and & or & contains method(imp)	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		WebElement search=  driver.findElement(By.xpath("//input[@class='_3704LK'or name='q']"));
//		search.sendKeys("rose");
		driver.findElement(By.xpath("//input[contains(@class,'370')]")).sendKeys("pen");//in this instead of 3704lk taken only 370. 
//		driver.findElement(By.xpath("//input[contains(@title,'Search for ')]")).sendKeys("book");
//		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("rocket");
		
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);//implicit wait
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sheelu");
		driver.findElement(By.cssSelector("#lastName")).sendKeys("Yadav");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]"));//IMPORTANT************************************
		
		//2.id & name method
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		driver.findElement(By.name("field-keywords")).sendKeys("raj");
		WebElement dj= driver.findElement(By.id("twotabsearchtextbox"));
		dj.sendKeys("pen");
		
		
		//3.Link text/ Partial link text method
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		WebElement raj= driver.findElement(By.linkText("Best Sellers"));
//		raj.click();
//		WebElement som = driver.findElement(By.linkText("Customer Service"));
//		som.click();
//		WebElement tipu = driver.findElement(By.linkText(" Electronics "));//not working
//		tipu.click();
//		driver.findElement(By.partialLinkText("Elect")).click();//working
		WebElement som = driver.findElement(By.partialLinkText("Customer "));//working 
		som.click();
		
		
		//4.Tag name method
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		int Links = driver.findElements(By.tagName("a")).size();
		System.out.println(Links);
		
		
		//5.className method
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		int slides = driver.findElements(By.className("a-icon a-icon-next-rounded")).size();
		System.out.println(slides);
		
		//6 text method
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		
		//7 cssSelector method ****
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[id=email]")).sendKeys("dj");
//		driver.findElement(By.cssSelector("#email")).sendKeys("dj");//instead of Id put #
//		driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("dj");//take only-[name="email"]
//		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("dj");// we can take Tag name also
//		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("dj");//instead of class put .(dot)
//		driver.findElement(By.cssSelector("input.inputtext[autocomplete=username]")).sendKeys("dj");//TAG,CLASS,ATTRIBUTE
//		driver.findElement(By.cssSelector("input[fdprocessedid=ayonxi]")).sendKeys("dj");//TAG & ATTRIBUTE
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector(".nav-input ")).sendKeys("ball");//in this class-only some part taken to locate
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("Puma women shoes");
		driver.findElement(By.cssSelector(".searchTextSpan")).click();//imp******************************
}
}
	
	//8-Created ram method and its called intp main class
//public class Tiktok {
//
//	public static void main(String[] args) {
//		
//
//		ram();
//		
//	}
//
//	public static void ram()
//	{
//		System.out.println("smoke");
//		
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//9 Method Overriding and Super keyword pratice (News) and (Zee) class check & for object purpose check (Bank) class


//10 Try Catch block

WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com");

try
{
	
	driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4zz')]")).click();// pop up
}
catch(Exception e)
{
	System.out.println("DHANRAJ" +e);
//	e.printStackTrace();
}
	

driver.findElement(By.xpath("//input[contains(@class,'370')]")).sendKeys("pen");


//11 Debugging

for(int dc = 5;dc>=1;dc--)//debug this n check how its one by one printing
{
	System.out.println("dj");
}

//12 Type Casting in Java

byte b= 5;// very smallest
double d=b;// little big
System.out.println(b);//5
System.out.println(d);//5.0

//************************

//imp Convert string to Integer Interview.

String a= "123";
//int    b= Integer.parseInt(a);
int    b=Integer.valueOf(a);
System.out.println("convert string to Integer "+ b);//123



//13 JAVA COLLECTION

//ArrayList dp= new ArrayList();
//
//dp.add(100);
//dp.add("welcome");
//dp.add(15.5);
//dp.add('A');
//dp.add(true);
//
//System.out.println(dp);//[100, welcome, 15.5, A, true]

//System.out.println("Number of "+ dp.size());//5

//HashMap map= new HashMap();

map.put(101, "john");
map.put(102, "David");
map.put(103, "scott");
map.put(104, "Mary");


System.out.println(map);//{101=john, 102=David, 103=scott, 104=Mary}

//HashSet hs= new HashSet();
//LinkedList ls= new LinkedList();
//PriorityQueue q= new PriorityQueue();

}
}

//14 isDisplayed method

//WebDriverManager.chromedriver().setup();
//WebDriver driver =new ChromeDriver();
//driver.get("https://admin-demo.nopcommerce.com/login");
//driver.findElement(By.xpath("//button[text()='Log in']")).click();
//WebElement print= driver.findElement(By.linkText("Dashboard"));
//System.out.println(print.isDisplayed());//true

//15 Get text

driver.get("https://demoqa.com/automation-practice-form/");
driver.manage().window().maximize();
String text= driver.findElement(By.xpath("//div[@class='main-header']")).getText();
System.out.println(text);//Practice Form


//16 IF,else condition.

//int age=28;
//if(age>18){
//
//	System.out.println("Can Drive car");
//}
//else
//{
//	System.out.println("Cannot drive");//Can Drive car
//}	
//****************************
//int age=18;
//if(age==18){// in this if age is only 18 then drive
//	
//	System.out.println("yes drive");
//}
//else
//{
//	System.out.println("No not drive");//yes drive
//}
//	
//*********************************
//int age=18;
//boolean condi= (age==18);
//if(condi){
//	
//	System.out.println("yes drive");
//}
//else
//{
//	System.out.println("No not drive");
//}

//17 Scanner class use to addition or put value in Runtime

//int a,b,sum;
//Scanner sc= new Scanner(System.in);
//System.out.println("Enter first Number:");
//a=sc.nextInt();
//
//System.out.println("Enter Second Number:");
//b=sc.nextInt();
//
//sc.close();
//sum=a+b;
//System.out.println("Sum of these numbers: "+sum);//Enter then put 10 again enter then put 20 so result come out=30


//18 How to concat two string

//String a= "Dhanraj";
//String b= "Yadav";
//String c=a.concat(b);
//System.out.println(c);




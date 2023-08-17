import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Academy1.Practice;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DJ extends Amzon {

	public  void main(String[] args) throws InterruptedException {
		
		//step-1 Print Name Multiple times

//		for(int dc = 0;dc<10;dc++)
//		System.out.println("DHANRAJ");
		//++++++++++++++++++++++++++++++++++
//		for(int i=10;i<=15;i++)
			
//		{
//			System.out.println("rock");
//				
//		}
		//+++++++++++++++++++++++++++++++++++++
		//same we cab run opposite way
		
//		for(int dc = 10;dc>1;dc--)
//		System.out.println("DHANRAJ");
//		//++++++++++++++++++++++++++++++++++++
		
		String name = "DHANRAJ";
		String n = "i";
		n = n.replaceAll("i", "iiiiiiiiii");//10
		n = n.replaceAll("i", "iiiiiiiiii");//10*10 = 100
		n = n.replaceAll("i", "iiiiiiiiii");//100*10 = 1000
		
		n = n.replaceAll("i", name + "\n");
		System.out.println(n);//will print Somraj 1000 times	
		
		//step-2 Reverse the string************************************************************3
//				String s = "Somraj";
//				
//				for(int i=s.length()-1; i>=0; i--)
//				{	
//					System.out.print(s.charAt(i)); //jarmoS
//				}
		
		//Another way
//		String a="raj";
//		StringBuffer cp=new StringBuffer(a);
//		System.out.println(cp.reverse());//jar
		
//		String a="123";
//		for(int b=a.length()-1;b>=0;b--)
//		{
//			System.out.print(a.charAt(b));//321
//		}	
		//++++++++++++++++++++++++++++++++
		
//		
//		//STEP-3 -Count the sentence in a String************************************************5
//		String a = "This is a good exercise";
//		int b = a.split(" ").length;
//		System.out.println(b); // 5
		
		
		//Step-4 find the duplicate in String******************************************10
		
		String m = "Automation";
		char[] chr=m.toCharArray();
		for(int p=0; p<chr.length; p++)
		{
			for(int q=p+1; q<chr.length; q++)
			{
				if(chr[p]==chr[q])
				{
					System.out.println("dublicate character in string is "+ chr[p]);
				}	
		
				//dublicate character in string is t
				//dublicate character in string is o
		
		//STEP-5 Separate alphabets and numbers*****************************************		
		

//			String input= "D19HA35N6R8A4J"; 
//			System.out.println(input.replaceAll("[0-9]",""));//DHANRAJ
//			System.out.println(input.replaceAll("[A-Z]", ""));//1935684
		
		//STEP-6 Swapping two number without using 3rd variable**********************
		
//		int A = 20;
//		int B = 100;
//		A=A+B;
//		B=A-B;
//		A=A-B;
//		System.out.println(""+ A +" "+ B);
		
		
		//STEP-7 Print Prime Number or not***************************************************1
//		int a = 3; 
//		boolean b = BigInteger.valueOf(a).isProbablePrime(1);
//		System.out.println(b); //true
		
		***************************
		
		//Printing prime numbers******************************************************2
				//	step 1   step 2 step 4
				for(int i=2; i<=10; i++)
					
				{//Body step 3
					for (int j=2; j<=10; j++)
					{
						if(j==i)
						{
							System.out.print(" "+i); //2 3 5 7 
						}
						if(i%j==0)
						{
							break;
						}	

		
		//STEP-8 -Palindrome****************************************************
//		String a="NITIN";
//		String b=new StringBuffer(a).reverse().toString();
//		if(a.equals(b))
//		{
//			System.out.println("Palindrome");	
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
		
		
		//STEP-9 Print the second highest number from array
//		int[] number = {1,0,5,8,3};
//		int nn = number.length;
//		Arrays.sort(number);
//		System.out.println("second highest number is "+number[nn-2]);	
		
		
		//STEP-10 How to plus or subtract
		
//		int a,b,sum;
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter first Number:");
//		a=sc.nextInt();
//		
//		System.out.println("Enter Second Number:");
//		b=sc.nextInt();
//		
//		sc.close();
//		sum=a+b;
//		System.out.println("Sum of these numbers: "+sum);
		
		
		//STEP-11 Fibonacci series
		int  a= 0,  b = 1, sum = 0;
		
		System.out.println(a+" "+b);
		
		for(int c=2; c<10; c++)
		{
			sum=a+b;
			System.out.print(" "+sum);
			a=b;
			b=sum;
		}
		
				
				//Step-12
				
				//Compare 2 array numbers and find common number********************************8
				int arr1[] = { 1, 3, 5, 7, 9};  
				int arr2[] = { 2, 4 ,6, 8, 9, 5};
				
				
				for(int h=0; h<arr1.length; h++)
				{
					for(int j=0;j<arr2.length; j++)
					{
						if(arr1[h]==arr2[j])
						{
							System.out.println((arr1[h])+" ");				
						}
				
	//Step 9-using Pratice class method	
//		Practice.main(args);
//		Practice.fort();
	//	+++++++++++++++++++++using Pratice class method without Static
//		Practice fg=new Practice();
//		fg.main(args);
//		fg.fort();
		
		
	//Step 10 Method Overriding and Super keyword practice NEWS and ZEE class check
	// static block example given in NEWS class	
		
		
		
//Step 11		LIST Java collection+++++++++++++++++++++Suggestion Dropdown
		
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
		
				
			//Step 12	Set java collection Window Handle++++++++++++++++++++++++++++++		
				
//				WebDriverManager.chromedriver().setup();
//				WebDriver driver = new ChromeDriver();
//				driver.get("https://www.amazon.in/s?k=tsf+shoes&i=shoes&crid=3399V4I0Y7B7N&sprefix=TS%2Cshoes%2C274&ref=nb_sb_ss_ts-doa-p_4_2");
//				driver.manage().window().maximize();
//				WebElement refLink = driver.findElement(By.xpath("//img[@alt='Sponsored Ad - TENDER TSF Genuine Leather Police Boot for Men {T-5002}']"));
//				refLink.click();
//				
//				String mainwindowId = driver.getWindowHandle();
//				System.out.println("mainwindowId:"+mainwindowId);
//				WebElement raj =driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
//				raj.click();
//				
//				String secondWindowId="";
//				
//				Set<String> allOpenWindows = driver.getWindowHandles();
//				System.out.println("allOpenWindows:"+allOpenWindows);
//				for(String currId :allOpenWindows){
//					if(!currId.equals(mainwindowId)){
//						secondWindowId = currId;
//					}
//
//				}	
//				
//				//Switch my Driver to new Tab
//				driver.switchTo().window(secondWindowId);
//				WebElement som =driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
//				som.clear();
//				som.sendKeys("DHANRAJ");
//				driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click
				
				
			//Step 12	Read excel sheet
				
//				public void getData(String excelSheetName){}
//				
//				File f= new File(System.getProperty("user.dir")+"C:\\Users\\Lenovo\\Desktop\\djfile.xlsx");
//				FileInputStream fis = new FileInputStream(f);
//				Workbook wb = WorkbookFactory.create(fis);
//				Sheet sheetName = wb.getSheet(excelSheetName);
//				
//				int totalRows = sheetName.getLastRowNum();
//				System.out.println(totalRows);
//				Row rowCells = sheetName.getRow(0);
//				DataFormatter formate = new DataFormatter();
//				for(int=1;i<=totalRows;i++)
		}	
		
		
	}
			

}

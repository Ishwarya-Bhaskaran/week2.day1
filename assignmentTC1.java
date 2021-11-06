package Week2Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class assignmentTC1 {
	public static void main (String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
	driver.manage().window().maximize();
	//enter the username
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	//enter the pwd 
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//click on login button 
	driver.findElement(By.className("decorativeSubmit")).click();
	//click on CRM/SFA
	driver.findElement(By.linkText("CRM/SFA")).click();
	//click Contacts Tab 
	driver.findElement(By.linkText("Contacts")).click();
	//click create Contact 
	driver.findElement(By.linkText("Create Contact")).click();
	//enter first name 
	driver.findElement(By.id("firstNameField")).sendKeys("Ishu");
	//enter last name 
	driver.findElement(By.id("lastNameField")).sendKeys("B");
	//click Create contact
	driver.findElement(By.name("submitButton")).click();
		//print the first name
	String name=driver.findElement(By.id("viewContact_fullName_sp")).getText();
	System.out.println(name);
		//V1:check the title 
		String title=driver.getTitle();
		//print the title of the browser page
		System.out.println(title);
		

	//close the browser 
		driver.close();

	}
	}


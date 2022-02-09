package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead {

	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("R");
		//driver.findElement(By.xpath("(//button)[7]")).click();
		  driver.findElement(By.linkText("Hari")).click();
		  System.out.println("The Title is: "+driver.getTitle());
		  driver.findElement(By.linkText("Edit")).click();
		  driver.findElement(By.id("updateLeadForm_companyName")).clear();
		  driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("IBM");
		  driver.findElement(By.xpath("//input[@value='Update']")).click();
		  //driver.close();
		 
	}
}

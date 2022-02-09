package week3.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("hari@testleaf");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(200);
		String name=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println(name);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
			 driver.findElement(By.linkText("Duplicate Lead"));
		  System.out.println(driver.getTitle());
		  driver.findElement(By.linkText("Duplicate Lead")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	      String title = driver.getTitle();
	      System.out.println(title);
	      String attribute = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getAttribute("value");
	      System.out.println( attribute);
	      
	      if(name.equals( attribute))
	      {
	          System.out.println(" Name is Duplicate");
	      }
	      else
	      {
	          System.out.println("Name is not Duplicate");
	      }
		
		
	}
}

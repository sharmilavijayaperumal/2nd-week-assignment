package week3.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatContact {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.close();
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sharmila");
		driver.findElement(By.id("lastNameField")).sendKeys("vijayaperumal");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("Worked for 2 years");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("babu@testleaf.com");
		
		WebElement source = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd=new Select(source);
		dd.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("The Title is :"+driver.getTitle());
		//driver.close();
	}

}

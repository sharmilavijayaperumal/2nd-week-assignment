package week3.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image']/preceding::h5)[1]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("babu@testleaf.com");
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[2]")).sendKeys("Done");
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean enabled = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/input)[5]")).isEnabled();
		System.out.println("Edit Field Enabled " +enabled);
		System.out.println(driver.getTitle());
	}


}

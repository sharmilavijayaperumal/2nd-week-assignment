package week3.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[2]")).click();
		//driver.findElement(By.id("home")).click();
		driver.findElement(By.id("position")).click();
		driver.findElement(By.id("color")).click();
		driver.findElement(By.id("size")).click();
		driver.findElement(By.id("home")).click();
	}

}

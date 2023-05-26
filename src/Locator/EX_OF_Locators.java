package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_OF_Locators
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/SampleLocator.html");
//		driver.findElement(By.tagName("input")).sendKeys("abcd");
//		driver.findElement(By.id("1234")).sendKeys("shgfkjhgs");
		
		driver.findElement(By.className("abc123")).sendKeys("ghfksg");
		driver.findElement(By.name("xyz123")).sendKeys("fgjhdgf");
		
	}

}


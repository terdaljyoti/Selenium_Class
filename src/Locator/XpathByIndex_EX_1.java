package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex_EX_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9807654532");
		
		
	}

}

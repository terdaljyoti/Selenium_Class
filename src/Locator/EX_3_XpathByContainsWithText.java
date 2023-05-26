package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_3_XpathByContainsWithText 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//click on create new account link by xpathby text
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//
		
		driver.findElement(By.xpath("//a[contains(text(),'password?')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc");
		
	}

}

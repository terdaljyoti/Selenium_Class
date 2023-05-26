package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_XpathByContainsWithText
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("httpa://www.facebook.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'password?')]")).sendKeys("abc");
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		
	}

}

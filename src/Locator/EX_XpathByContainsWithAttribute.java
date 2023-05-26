package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_XpathByContainsWithAttribute
{
	  public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'address ')]")).sendKeys("7709224811");
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xty");
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).click();
	}

}

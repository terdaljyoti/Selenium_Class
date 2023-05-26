package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_Locator_Link
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/SampleLink.html");
		//driver.findElement(By.linkText("FACEBOOK")).click();
		driver.findElement(By.partialLinkText("BOO")).click();
		
	}

}

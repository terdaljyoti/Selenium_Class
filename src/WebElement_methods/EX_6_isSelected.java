package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_6_isSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(3000);
		
		boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
		System.out.println(result);
		if(result)
		{
			System.out.println("Radio button selected");
		}
		else
		{
			System.out.println("Radio button de-selected");
		}
		
	}

}

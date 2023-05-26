package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_7_isDisplayed
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		System.out.println(result);
		if(result)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}

}

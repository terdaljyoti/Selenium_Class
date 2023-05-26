package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_2_IsEnable 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
	    boolean result=	driver.findElement(By.xpath("//button[contains(@class,'_acan _acap')]")).isEnabled();
		System.out.println(result);
		if(result)
		{
			System.out.println("element is enable");
		}
		else
		{
			System.out.println("element is disable");
		}
	}

}

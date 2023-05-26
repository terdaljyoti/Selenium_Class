package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple_Ex_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();;
		Thread.sleep(2000);
		
		
		
		System.out.println("=====================================================================================");
		
		
		WebElement Day = driver.findElement(By.id("day"));
		Select s1=new Select(Day);
		boolean result = s1.isMultiple();
		if(result)
		{
		System.out.println("List box is multiSelectable");
		}
		else
		{
			System.out.println("List box is multiSelectable");
			s1.selectByIndex(19);	
		}
		Thread.sleep(2000);
		
		WebElement Month = driver.findElement(By.id("month"));
		Select s2=new Select(Month);
		s2.selectByValue("6");
		
		Thread.sleep(2000);
		
		WebElement Year = driver.findElement(By.id("year"));
		Select s3=new Select(Year);
		
		s3.selectByVisibleText("1996");
	}

}

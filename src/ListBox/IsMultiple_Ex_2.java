package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class IsMultiple_Ex_2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample4.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select s1=new Select(country);
		boolean Result = s1.isMultiple();
		System.out.println(Result);
		if(Result)
		{
			System.out.println("List box is multiSelectable");
			s1.selectByIndex(1);
			Thread.sleep(3000);
			s1.selectByVisibleText("Amerika");
			
		}
		else
		{
			System.out.println("List box is single selectable");
		}
		Thread.sleep(3000);
		s1.deselectByIndex(1);
		Thread.sleep(3000);
		s1.deselectByVisibleText("Amerika");
		Thread.sleep(3000);
		driver.close();
		
	}

}

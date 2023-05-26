package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SigleSelectable_EX_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.id("day"));
		Select s=new Select(Day);
		//s.selectByIndex(0);
		//s.selectByValue("5");
		s.selectByVisibleText("6");
		Thread.sleep(4000);
		

		
	}

}

package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectAll_Ex_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample4.html");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s1=new Select(country);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		s1.selectByVisibleText("Amerika");
		Thread.sleep(2000);
		s1.selectByIndex(3);
		
		Thread.sleep(2000);
		s1.deselectAll();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}
	

}

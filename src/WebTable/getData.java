package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getData
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample5.html");
		
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]//td[2]")).getText();
		System.out.println(text);
		
		String text_2 = driver.findElement(By.xpath("//table[@id='1234']//tr[4]//td[3]")).getText();
		System.out.println(text_2);
		
	}

}

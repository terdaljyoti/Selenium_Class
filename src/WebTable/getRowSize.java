package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRowSize 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample5.html");
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		System.out.println(rowSize);
	}

}

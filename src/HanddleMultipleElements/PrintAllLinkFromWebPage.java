package HanddleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinkFromWebPage
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement a:AllLinks)
		{
		System.out.println(a.getText());	
		}
		
		
	} 
	

}

package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_EX_2
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> allId = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(allId);
		
		driver.switchTo().window(ar.get(1));
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		driver.switchTo().window(ar.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		
	}

}

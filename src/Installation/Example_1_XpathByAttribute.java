package Installation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1_XpathByAttribute
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("terdaljyoti322@gmail.com");

		Thread.sleep(2000);		

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("jyoti@testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}

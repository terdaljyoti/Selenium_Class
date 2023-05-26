package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseLeftClick
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'right ')]"));
		Actions act=new Actions(driver);
		
		act.moveToElement(btn);
		act.contextClick().perform();
		
	//	act.moveToElement(btn).contextClick().perform();;
		
	//	act.contextClick(btn).perform();

		
		
	}

}

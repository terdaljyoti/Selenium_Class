package CustomizeListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX_2_Select_oct_option_using_EndKey
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		act.click(month).perform();
		act.sendKeys(Keys.END).perform();
		
		for(int i=1;i<=2;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(2000);
		}
		
		act.sendKeys(Keys.ENTER).perform();
	}

}

package Action_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingOFDropDown 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act=new Actions(driver);
		act.moveToElement(Login).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[3]")).click();
		
				
		
		
		
	}

}

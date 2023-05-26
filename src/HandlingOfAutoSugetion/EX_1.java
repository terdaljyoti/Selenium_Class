package HandlingOfAutoSugetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		 List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		Thread.sleep(2000);
		
		String exp_text="redmi note 50";
		for(WebElement s1:alloptions)
		{
			String act_text = s1.getText();
			if(act_text.equals(exp_text))
			{
				s1.click();
				break;
			}
		}
	}

}

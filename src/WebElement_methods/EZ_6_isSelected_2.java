package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EZ_6_isSelected_2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		Thread.sleep(2000);
		WebElement FemaleRadioBtn=driver.findElement(By.xpath("//label[text()='Female']"));
		Thread.sleep(2000);
		FemaleRadioBtn.click();
		//Thread.sleep(2000);
		boolean result = FemaleRadioBtn.isSelected();
		if(result)
		{
			System.out.println("radio btn selected");
		}
		else
		{
			System.out.println("radio btn de-selected");
		}
		
	}

}

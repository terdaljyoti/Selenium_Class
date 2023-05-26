package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectedOptionFrom_SingleSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).click();
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));

		Select s1=new Select(day);
		s1.selectByIndex(0);
		Thread.sleep(3000);
		s1.selectByValue("12");
		Thread.sleep(3000);
		
		 
		
		s1.selectByVisibleText("14");
		Thread.sleep(3000);
		
		String Day_Text = s1.getFirstSelectedOption().getText();
		System.out.println(Day_Text);
	
		
		
	}

}

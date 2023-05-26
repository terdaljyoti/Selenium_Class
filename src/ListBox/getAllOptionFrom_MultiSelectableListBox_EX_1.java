package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllOptionFrom_MultiSelectableListBox_EX_1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample4.html");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s1=new Select(selectCountry);
		List<WebElement> AllOptions = s1.getOptions();
		System.out.println(AllOptions.size());
		for(WebElement s:AllOptions)
		{
			System.out.println(s.getText());
		}
		
	}
}

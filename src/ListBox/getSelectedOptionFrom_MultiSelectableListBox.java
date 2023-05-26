package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectedOptionFrom_MultiSelectableListBox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample4.html");
		Thread.sleep(2000);
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s1=new Select(selectCountry);
		
		s1.selectByIndex(2);
		Thread.sleep(2000);
		s1.selectByVisibleText("Austrolia");
		Thread.sleep(2000);
		s1.selectByIndex(1);
		Thread.sleep(2000);
		
		String text = s1.getFirstSelectedOption().getText();
		System.out.println(text);
		
		System.out.println("===============================================================================================");
		
		Thread.sleep(2000);
		
		List<WebElement> selectedOption = s1.getAllSelectedOptions();
		
		System.out.println("NO of selected options :"+selectedOption.size());
		
		for(WebElement s:selectedOption)
		{
			System.out.println(s.getText());
		}
		
	}

}

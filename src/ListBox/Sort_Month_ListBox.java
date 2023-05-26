package ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sort_Month_ListBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		List<WebElement> AllOptions = s1.getOptions();
		ArrayList<String> ar=new ArrayList<String>();
		for(WebElement a:AllOptions)
		{
			String S = a.getText();
			ar.add(S);
			
		}
		Collections.sort(ar);
		for(String s:ar)
		{
			System.out.println(s);
		}
		
	}

}

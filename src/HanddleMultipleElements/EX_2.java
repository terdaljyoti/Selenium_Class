package HanddleMultipleElements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/MultiPleElement.html");
		List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("No of checkBoxes :"+AllCheckBoxes.size());
		for(WebElement a:AllCheckBoxes)
		{
			a.click();
			Thread.sleep(500);
		}
		Thread.sleep(2000);
		for(int i=AllCheckBoxes.size()-1;i>=0;i--)
		{
			AllCheckBoxes.get(i).click();
			Thread.sleep(500);
		}
		driver.close();
	}

}

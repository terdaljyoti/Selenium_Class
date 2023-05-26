package Action_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClick
{
	 public static void main(String[] args)
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		 WebElement btn_doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		 
		 Actions act=new Actions(driver);
		 
	//	 act.moveToElement(btn_doubleClick).perform();
	//	 act.doubleClick().perform();
		 
	//	 act.moveToElement(btn_doubleClick).doubleClick().perform();
		 
		  act.doubleClick(btn_doubleClick).perform();
		 
		 
		 Alert alt = driver.switchTo().alert();
		 String text = alt.getText();
		 System.out.println(text);
		 alt.accept();
		 
		 
		

		 
		 
		
	}
}

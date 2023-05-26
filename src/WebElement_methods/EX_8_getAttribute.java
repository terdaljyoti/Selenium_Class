package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_8_getAttribute
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
        WebElement un=driver.findElement(By.xpath("//input[contains(@class,'55r1 _6luy')]"));
        un.sendKeys("dbfhjdf");
        Thread.sleep(2000);
        String text=un.getAttribute("value");
        System.out.println(text); 

//------------------------------------------------------------------------------------------------------------
        
        WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
        pass.sendKeys("12345");
        Thread.sleep(2000);
        String password=pass.getAttribute("value");
        System.out.println(password);
	}

}

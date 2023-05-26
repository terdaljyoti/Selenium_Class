package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.classfile.Annotation.element_value;

public class EX_1_SendKeys 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
//--------------------------sendKeys------clear-----------------------------------------------------------		
		
	WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
	
	UN.sendKeys("mdfhbg");
	Thread.sleep(2000);
    UN.clear();
    Thread.sleep(2000);
    UN.sendKeys("jdbgfkjsb");
		
 //-------------------------------------------click--------------------------------------------------------   
    
   // driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
    
    
//--------------------------------------------getText--------------------------------------------------------    
    
   String text= driver.findElement(By.xpath("//a[contains(text(),'password')]")).getText();
   System.out.println(text);
    
   String text1=driver.findElement(By.xpath("//a[contains(@class,'selected _51sy')]")).getText();
   System.out.println(text1);
   
//---------------------------------------------isEnabled--------------------------------------------------------   
   
   Thread.sleep(2000);
   
   Boolean result=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
   System.out.println(result);
   if(result)
   {
	   System.out.println("element is enable");
   }
   else
   {
	   System.out.println("element is disabled");
   }
    
	}

}

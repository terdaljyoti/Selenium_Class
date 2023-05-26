package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getColSize 
{
	 public static void main(String[] args)
	 {
		 WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/Velocity%20Testing/html/sample5.html");
		
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]//th")).size();
		System.out.println(colSize);
		
		int colSize_1= driver.findElements(By.xpath("//table[@id='1234']//tr[3]//td")).size();
		System.out.println(colSize_1);
	}
	

}

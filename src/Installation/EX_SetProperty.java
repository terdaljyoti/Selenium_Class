package Installation;

import org.openqa.selenium.chrome.ChromeDriver;

public class EX_SetProperty 
{
	public static void main(String[] args)
	{
		//path setup of specific browser
		System.setProperty("Webdriver.chrome.driver", "path of chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
	}

}

package sample;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorld {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.out.println("Hello, World!"); 
		 
		 	WebDriverManager.chromedriver().setup();
		 	ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
			System.out.println("Launching chrome browser");
			WebDriver driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			System.out.println("Title of the Page :>>>>>"+driver.getTitle());
			driver.close();
	}

}

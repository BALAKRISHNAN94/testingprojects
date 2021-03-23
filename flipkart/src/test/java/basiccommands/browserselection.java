package basiccommands;





import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class browserselection {
	
	 static WebDriver driver = null ;

	public static void main(String[] args) throws InterruptedException  {
	 	
		 String browser = "google";
	
	 switch (browser)
		{
		case "google":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		
		case "firefox":
		WebDriverManager.firefoxdriver().setup();	
		driver = new FirefoxDriver();
		break;
		
		case "edge":
		WebDriverManager.edgedriver().setup();	
		driver = new EdgeDriver();
		break;
		
		case "IE":
		WebDriverManager.iedriver().setup();	
		driver = new InternetExplorerDriver();
		break;
	 		}
	    
	    driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	    driver.findElement(By.xpath("//*[@class=\"_3704LK\"]")).sendKeys("mobiles");
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	    Thread.sleep(2000);
	    WebElement element = driver.findElement(By.xpath("//*[@class=\"_3uDYxP\"]/select"));
	    Select dp = new Select(element);
	    dp.selectByIndex(3);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[text()=\"POCO C3 (Arctic Blue, 32 GB)\"]")).click();
	    Thread.sleep(2000);
	    String parent = driver.getWindowHandle();
	    Set<String> values =  driver.getWindowHandles();
	    for (String currenthandle : values){
	    	
	    	if(!currenthandle.equalsIgnoreCase(parent)) {
	    		
	    		driver.switchTo().window(currenthandle);
	    		driver.findElement(By.xpath("//*[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
	    		 Thread.sleep(2000);
	    		driver.findElement(By.xpath("//*[@class=\"_3dsJAO\"][2]")).click();
	    		 Thread.sleep(5000);
	    		 driver.findElement(By.xpath("//*[@class=\"_3dsJAO _24d-qY FhkMJZ\"]")).click();
	    		 Thread.sleep(2000);
	       		 driver.close();
	    	}
	    }
	    Thread.sleep(2000);
	    driver.quit();
	}
		
}	


	  


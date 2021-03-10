package thirdtest;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M.BALAKRISHNAN\\Desktop\\SOFTWARE INDUSTRY\\chromedriver.exe");
		
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://www.google.com");
	     driver.navigate().to("https://www.goibibo.com/");
	     driver.findElementByXPath("//*[@href=\"/cars/\"]").click();
	     driver.findElementByXPath("//*[@class=\"menuBar\"]/ul/li[2]/a").click();
	     driver.findElementByXPath("//*[@class=\"autoText\"]").click();
	     driver.findElementByXPath("//*[@class='inputContainer']/input").sendKeys("thiruverkadu");
	     Thread.sleep(2000);
	     driver.findElementByXPath("//*[@class='inputContainer']/input").sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(2000);
	     driver.findElementByXPath("//*[@class='inputContainer']/input").sendKeys(Keys.ENTER);
	    
	      driver.findElementByXPath("//*[@id=\"destText\"]").click();
	     driver.findElementByXPath("(//*[@class='inputContainer']/input)[1]").sendKeys("airport");
	     Thread.sleep(2000);
	     driver.findElementByXPath("(//*[@class='inputContainer']/input)[1]").sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(2000);
	     driver.findElementByXPath("(//*[@class='inputContainer']/input)[1]").sendKeys(Keys.ENTER);
	     driver.findElementByXPath("//button[@class=\"searchBtn\"]").click();

	}
}  
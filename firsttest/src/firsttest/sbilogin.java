package firsttest;

import org.openqa.selenium.chrome.ChromeDriver;

public class sbilogin {



	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\M.BALAKRISHNAN\\Desktop\\SOFTWARE INDUSTRY\\chromedriver.exe");
	
     ChromeDriver driver = new ChromeDriver();
     driver.get("http://www.google.com");
     driver.manage().window().maximize();
     driver.findElementByXPath("//input[@class='gLFyf gsfi']").sendKeys("sbiloginpage");
     driver.findElementByXPath("//input[@class=\"gNO89b\"]").click();
   
   }

}

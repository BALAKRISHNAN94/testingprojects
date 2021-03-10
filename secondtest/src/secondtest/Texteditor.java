package secondtest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Texteditor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M.BALAKRISHNAN\\Desktop\\SOFTWARE INDUSTRY\\chromedriver.exe");
		
	     ChromeDriver driver = new ChromeDriver();
	     driver.get("http://www.google.com");
	     //driver.findElementByXPath("//input[@class='gLFyf gsfi']").sendKeys("online text editor");
	     //driver.findElementByXPath("//input[@class=\"gNO89b\"]").click();
	     //driver.findElementByXPath("//*[@class='LC20lb DKV0Md']/span").click();
	     //driver.findElementByXPath("//*[@class='btn btn-primary']").click();
	     //driver.findElementByXPath("//*[@name='text']").sendKeys("hi i am bala welcome to my texteditor program");
	
	      driver.navigate().to("https://www.editpad.org/");
	      driver.findElementByXPath("//*[@class='btn btn-primary']").click();
		  driver.findElementByXPath("//*[@name='text']").sendKeys("hi i am bala welcome to my texteditor program");
	
	
	}

}

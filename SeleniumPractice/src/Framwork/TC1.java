package Framwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hi");
		System.setProperty("webdriver.chrome.driver", "C:/Users/Kumarshobhitsoni/workspace/SeleniumPractice/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
System.out.println("Hi");

	}

}

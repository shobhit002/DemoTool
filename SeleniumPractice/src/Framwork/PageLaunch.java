package Framwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLaunch {
 public static void main(String[] args) {
				// TODO Auto-generated method stub
	
	 PropertyFetcher prop = new PropertyFetcher();
	 
	 
	 
	 
WebDriver driver=new ChromeDriver();    
System.setProperty("webdriver.chrome.driver", "C:/Users/Kumarshobhitsoni/workspace/SeleniumPractice/chromedriver.exe");
//System.out.println(prop.getProperty("URL"));
driver.get(prop.fetchProp("URL"));

//System.out.println("Hiii");

	}

}

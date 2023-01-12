package demoQA;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");

		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\global.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();

		driver.get(prop.getProperty("url"));
		
		
	}

}

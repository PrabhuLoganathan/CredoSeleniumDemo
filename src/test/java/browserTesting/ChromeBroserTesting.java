package browserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBroserTesting {
	
	
	public static void main(String[] args) {

		{
//		        System.setProperty(
//		            "webdriver.chrome.driver",
//		            "C:\\Users\\ADMIN\\Documents\\chromedriver.exe");

			WebDriverManager.chromedriver().setup();
			// Instantiate a ChromeDriver class.
			WebDriver driver = new ChromeDriver();

			// Maximize the browser
			driver.manage().window().maximize();

			// Launch Website
			driver.get("https://www.geeksforgeeks.org/");
			
			System.out.println(driver.getTitle());
		}

	}

}

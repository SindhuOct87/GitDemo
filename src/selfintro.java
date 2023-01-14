import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selfintro {

	public static void main(String[] args) {

		//invoking the web browser
		//download chromedriver is a class and has methods
		// create an object for the class to access its methods
		
		// chromedriver driver = new chromedriver(); 
		// class object  = new class(); - but this will access methods only inside the class ChromeDriver, but not for other browsers
		
		//set the chrome.exe file path, selenium will look for the chromedriver and search for the key - webdriver.chrome.driver
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\aypn\\Downloads\\chromedriver_win32\\chromedriver.exe "); this step was replaced by Selenium Manager - Beta phase
		
	WebDriver driver = new ChromeDriver();
		// interface object = to access the methods inside webdriver interface, works in all browsers
		
		//Launch firefox browser
		//WebDriver driver1 = new FirefoxDriver();
		
		//to open a specific browser
		driver.get("https://www.amazon.com/");
		
		// to get the title for the web page
		System.out.println(driver.getTitle());
		
		//get current url 
		System.out.println(driver.getCurrentUrl());
		
		//to close the url - current url
		driver.close();
		
		//to close all associated window opened by selenium
		//driver.quit();
			
	 
	}
	
}

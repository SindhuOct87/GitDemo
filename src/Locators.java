import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set the chromedriver.exe file to the System property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aypn\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		
		//create drive object to access the methods inside the Interface Webdriver and Class ChromeDriver()
		WebDriver driver = new ChromeDriver();
		
		//Hit the browser
		driver.get("https://adactinhotelapp.com/");

		//to find the Username element by ID locator
		driver.findElement(By.id("username")).sendKeys("Sindhu87");
		
		//Give the value to the password field
		driver.findElement(By.id("password")).sendKeys("ManiTcs5#");
		
		//To click login button
		driver.findElement(By.id("login")).click();
		
		//To get the text from the webpage by Selenium, CSS Selector Syntax: tagname.Classname
		System.out.println( driver.findElement(By.cssSelector("div.auth_error")).getText());
	}

}

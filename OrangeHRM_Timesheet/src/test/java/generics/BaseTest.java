package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public WebDriver driver;
	
	// We have to create before class and after class in this
	public String user;
	public String pass;
	String origin;
	
	@BeforeClass
	public void Setup() throws IOException {
		
		driver = new ChromeDriver();
		
		// Create a property object for attracting data from config.properties
		
		Properties propert = new Properties();
		
		//Give the path using fileinputstream
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shree\\OneDrive\\Pictures\\Saved Pictures\\Page Object Model\\OrangeHRM_Timesheet\\src\\test\\resources\\config.properties");
		
		// Load file in it
		
		propert.load(file);
		
		origin = propert.getProperty("url");
		
		user = propert.getProperty("username");
		
		pass = propert.getProperty("password");
		
		
		
		
		// call it using driver.get
		driver.get(origin);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.manage().window().maximize();
		
		
		
		
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.close();
	}

}

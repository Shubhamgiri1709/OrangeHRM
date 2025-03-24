package PageClasses;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		// Immtialize driver using thisdriver as reference 
		
		this.driver=driver;
		
		// USe pagefactory and store [driver and this] parameter in it
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(css = "[type='submit']")
	private WebElement loginButton;
	
	// DO right  click and select the getter the pop box to get the all

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void Login(String Username ,String Password ) {
		
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		
		// this.password.sendKeys(password); // if we use same name then we have to use this key word
		
		loginButton.click();
		
		//driver.findElement(By.xpath("//span[contains(@class, 'oxd-main-menu-item--name') and text()='Time']")).click();
	
		
	}
	
	
	

}

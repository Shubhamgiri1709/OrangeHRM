package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class AddCustomersPage {
	
	WebDriver driver;
	
	public AddCustomersPage(WebDriver driver) {
		
		// Immtialize driver using thisdriver as reference 
		
		this.driver=driver;
				
		// USe pagefactory and store [driver and this] parameter in it
				
		PageFactory.initElements(driver, this);
		
			
	}
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement custName;
	
	@FindBy(css = "[placeholder='Type description here']")
	private WebElement descriptionText;
	
	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveButton;

	public WebElement getCustName() {
		return custName;
	}

	public WebElement getDescriptionText() {
		return descriptionText;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	

	
	public void CustomerAdd() {
		
		custName.sendKeys("Shubham");
		
		descriptionText.sendKeys("QA for team A ");
		
		saveButton.click();
		
		
		
	}

}

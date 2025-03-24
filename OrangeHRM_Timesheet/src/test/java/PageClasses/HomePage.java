package PageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	SoftAssert softAssert = new SoftAssert();
	
	public HomePage(WebDriver driver) {
		
		// Immtialize driver using thisdriver as reference 
		
		this.driver=driver;
				
		// USe pagefactory and store [driver and this] parameter in it
				
		PageFactory.initElements(driver, this);
		
			
	}

	@FindBy(xpath = "//a[@href='/web/index.php/time/viewTimeModule']")
	private WebElement timeLink;
	
	@FindBy(xpath = "//span[.='Project Info ']")
	private WebElement projectinfo;
	
	@FindBy(xpath = "//a[.='Customers']")
	private WebElement customerclick;
	
	@FindBy(xpath = "(//*[.=' Add '])[1]")
	private WebElement addcusto;

	
	
	public WebElement getTimeLink() {
		return timeLink;
	}


	public WebElement getProjectinfo() {
		return projectinfo;
	}


	public WebElement getCustomerclick() {
		return customerclick;
	}


	public WebElement getAddcusto() {
		return addcusto;
	}
	
	@FindBy(xpath = "//h6[.='Dashboard']")
    private WebElement dashAssert;

    public WebElement getSoftAssert() {
        return dashAssert;
    }

    public void dashAssertion() {
        // Use actual text value of 'dashAssert' element for the assertion
        String actualText = dashAssert.getText();
        softAssert.assertEquals(actualText, "Dashboard");

        // Calling assertAll to check all assertions
        softAssert.assertAll();
        
        System.out.println("Success");
    }


	public void Time() {
		
		timeLink.click();
		
		projectinfo.click();
		
		customerclick.click();
		
		addcusto.click();
		
		
	}
	

}

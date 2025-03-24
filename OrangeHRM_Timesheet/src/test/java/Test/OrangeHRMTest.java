package Test;

import org.testng.annotations.Test;

import PageClasses.AddCustomersPage;
import PageClasses.HomePage;
import PageClasses.LoginPage;
import PageClasses.ProjectPage;
import generics.BaseTest;

public class OrangeHRMTest extends BaseTest {
	
	LoginPage Lpage;
	HomePage Hpage;
	AddCustomersPage AddCpage;
	ProjectPage Projpage;
	
	
	// The base class should be parent class for all the test classes

	@Test(priority = 0)
	public void Logintest() {
		
	Lpage = new LoginPage(driver);
	Lpage.Login(user,pass);
	
	
		
	}
	@Test(priority = 1)
	public void DeshbordAssert() {
		
		Hpage = new HomePage(driver);
		Hpage.dashAssertion();
		
	}
	
	
	@Test(priority = 2)
	public void Hometest() {
		
	Hpage = new HomePage(driver);
	Hpage.Time();
		
	}
	
	@Test(priority = 3)
	public void AddCustomerM() {
		
		AddCpage = new AddCustomersPage(driver);
		
		AddCpage.CustomerAdd();
		
		
		
		
	}
	@Test(priority = 4)
	public void ProjectM() throws InterruptedException {
		
		Projpage = new ProjectPage(driver);
		
		Projpage.project();
		
		
		
		
	}
	
	
	
}

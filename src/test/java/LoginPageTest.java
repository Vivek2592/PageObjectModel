import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		
		loginPage = new LoginPage();
		homePage= new HomePage();
		testUtil =  new TestUtil();		
	}
	
	@Test
	public void TitleTest() {
		String ActualTitle = loginPage.validatetitle();
		Assert.assertEquals(ActualTitle, "ExpectedTitle");
	}
	
	@Test
	public void LoginTest() {
		homePage = loginPage.validateLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	
	

}

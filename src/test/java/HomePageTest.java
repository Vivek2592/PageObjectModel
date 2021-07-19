import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	TestUtil testUtil;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		loginPage= new LoginPage();
		testUtil = new TestUtil();
	}
	
	@Test
	public void Test1() {
		
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

}

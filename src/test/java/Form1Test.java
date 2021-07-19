import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Form1Page;
import com.qa.util.TestUtil;

public class Form1Test extends TestBase {
	
	Form1Page form1Page;
	
	public Form1Test() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
		form1Page = new Form1Page();
	}
	
	@Test(priority = 1)
	public void Test1() {
		
	}
	
	@Test(priority = 2)
	public void Test2(){
		
	}
	
	@DataProvider
	public Object[][] GetForm1Data(){
		return TestUtil.getTestData("Form1_Data");
	}
	
	@Test(priority = 3, dataProvider = "GetForm1Data")
	public void FillForm1(String SNumber, String Name, String Sex, String Age) {
		form1Page.NavigateToForm();
		form1Page.FillForm(SNumber, Name, Sex, Age);
	}

}

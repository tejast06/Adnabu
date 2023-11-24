package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.ResultPage;

public class ValidateSearchFunctionality extends BaseClass {

	public HomePage homePage;
	public ResultPage resultPage;
	
	public ValidateSearchFunctionality() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void launchTheBrowser() throws IOException {
		initialization();
		homePage = new HomePage();
		resultPage = new ResultPage();
	}
	
	@Test
	public void validatingSearchFunctionality() throws IOException, InterruptedException {
		resultPage = homePage.clickOnSearchAndEnterProductName("14k Intertwined Earrings");
		Assert.assertTrue(resultPage.verifyProductDisplay().contains("14k Intertwined Earrings"));
	}
	
	@Test
	public void closeTheBrowser() {
		driver.quit();
	}

}

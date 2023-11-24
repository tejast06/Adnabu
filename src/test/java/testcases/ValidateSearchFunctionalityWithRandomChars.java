package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.ResultPage;

public class ValidateSearchFunctionalityWithRandomChars extends BaseClass {

	public HomePage homePage;
	public ResultPage resultPage;
	
	public ValidateSearchFunctionalityWithRandomChars() throws IOException {
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
	public void searchFunctionalityWithRandomChars() throws IOException, InterruptedException {
	   resultPage = homePage.clickOnSearchAndEnterProductName("bbjbjbj");
	   Assert.assertTrue(resultPage.getSearchRelatedErrMsg().contains("Please try a different search term"));
	   
	}
	
	@Test
	public void closeTheBrowser() {
		driver.quit();
	}

}

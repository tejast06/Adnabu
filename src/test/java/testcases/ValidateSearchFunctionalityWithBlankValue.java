package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.ResultPage;

public class ValidateSearchFunctionalityWithBlankValue extends BaseClass {
	
	public HomePage homePage;
	public ResultPage resultPage;

	public ValidateSearchFunctionalityWithBlankValue() throws IOException {
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
	public void validateErrorMsg() throws IOException {
	    resultPage = homePage.clickOnSearch();
	    Assert.assertTrue(resultPage.getErrorMsg().contains("Search field cannot be empty"));
	}

}

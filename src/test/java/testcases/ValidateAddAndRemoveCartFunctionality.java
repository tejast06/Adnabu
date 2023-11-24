package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;


public class ValidateAddAndRemoveCartFunctionality extends BaseClass {
	
	public HomePage homePage;
	public ProductPage productPage;
	public CartPage cartPage;
	
	
	public ValidateAddAndRemoveCartFunctionality() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void launchTheBrowser() throws IOException {
		initialization();
		homePage = new HomePage();
		productPage = new ProductPage();
		cartPage = new CartPage();
	}
	
	@Test
	public void validateAddAndRemoveFunctionalityFromCart() throws IOException {
		
	    productPage = homePage.selectProduct();
	    cartPage =  productPage.clickOnCart();
	    Assert.assertTrue(cartPage.getCartTitle().contains("14k Intertwined Earrings"));
	    cartPage.clickOnRemoveBtn();
	    cartPage.getValidationMsg();
	    Assert.assertTrue(cartPage.getValidationMsg().contains("Your cart is currently empty."));
	
		
	}
	
	@Test
	public void closeTheBrowser() {
		driver.quit();
	}
	

}

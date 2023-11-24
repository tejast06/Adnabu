package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ProductPage extends BaseClass {

	
	@FindBy(xpath="//button[@name='add']")
	WebElement addToCart;
	
	public ProductPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public CartPage clickOnCart() throws IOException {
		addToCart.click();
		return new CartPage();
	}

}

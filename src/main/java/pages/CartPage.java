package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CartPage extends BaseClass {
	
	@FindBy(xpath="//a[text()='Remove']")
	WebElement removeBtn;
	
	

	
	
	public CartPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	public String getCartTitle() {
		String title = driver.findElement(By.xpath("//a[@class='cart__product-title']")).getText();
		return title;
	}
	
	public void clickOnRemoveBtn() {
		removeBtn.click();
	}
	
	public String getValidationMsg() {
		String msg = driver.findElement(By.xpath("//p[text()='Your cart is currently empty.']")).getText();
		return msg;
	}

}

package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ResultPage extends BaseClass {

	public ResultPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String  verifyProductDisplay() {
		String value = driver.findElement(By.xpath("//div[@class='product-card product-card--list']")).getText();
		return value;
	}
	
	public String getErrorMsg() {
		String value = driver.findElement(By.xpath("//li[text()='Search field cannot be empty']")).getText();
		return value;
	}
	
	public String getSearchRelatedErrMsg() {
		String value = driver.findElement(By.xpath("//p[text()='Please try a different search term or go back to the ']")).getText();
		return value;
	}

}

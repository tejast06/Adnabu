package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//button[@class='btn--link site-header__icon site-header__search-toggle js-drawer-open-top']")
	WebElement searchBtn;
	
	@FindBy(xpath="//form[@class='search search-bar__form']/input")
	WebElement searchBar;
	
	@FindBy(xpath="//button[@class='search-bar__submit search__submit btn--link']")
	WebElement search;

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public ResultPage clickOnSearchAndEnterProductName(String value) throws IOException, InterruptedException {
		searchBtn.click();
		Thread.sleep(2000);
		
		searchBar.sendKeys(value);
		
		Thread.sleep(2000);
		search.click();
		return new ResultPage();
	}
	
	public ResultPage clickOnSearch() throws IOException {
		searchBtn.click();
		search.click();
		return new ResultPage();
		}
	
	public ProductPage selectProduct() throws IOException {
		driver.findElement(By.xpath("//li[3]//div[1]//a[1]")).click();
		return new ProductPage();
	}

}

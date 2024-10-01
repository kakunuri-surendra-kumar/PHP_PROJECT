package com.pages.RLL_240Testing_PhpTravels_Hotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpTravels_FilterHotels_lib {
	
	WebDriver wd;
	By Filter = By.linkText("Filter");
//	By star_Rating = By.xpath("(//a[@class=\"btn d-flex justify-content-between align-items-center p-0 text-black waves-effect\"])[1]");
//	By star_Rating1 = By.xpath("//input[@id=\"starRating5\"]");
	//By Filter1 = By.xpath("(//input[@id='starRating5'])[1]");
	
	By Price_Range = By.xpath("(//a[@class=\"btn d-flex justify-content-between align-items-center p-0 text-black waves-effect\"])[2]");
//	By Price_range1 = By.xpath("//span[@class=\"irs-handle from\"]");
//	By Price_Range2 = By.xpath("//span[@class=\"irs-handle to type_last\"]");
	
	//By Price_Sort_By = By.xpath("(//a[@class=\"btn collapsed d-flex justify-content-between align-items-center p-0 text-black waves-effect\"])[3]");
	By Price_Sort_By1 = By.id("desc");
	
	By Apply_Filters = By.xpath("//button[@class=\"btn btn-primary w-100 h-100 text-capitalize waves-effect\"]");
	By Reset = By.xpath("//div[@class=\"reset--btn\"]");
	
	By View_More = By.xpath("(//a[@class=\"w-100 fadeout py-2 d-flex align-items-center justify-content-center btn btn-primary d-block text-center waves-effect\"])[1]");
	
	
	
	
	
	public void intit(WebDriver wd) {
		this.wd=wd;
	}
	
	public void Launch_PHP_Travels() {
		wd.get("https://www.phptravels.net/hotls/dubai/07-10-2024/08-10-2024/1/2/0/IN");
		//wd.getCurrentUrl();
		wd.manage().window().maximize();
	}
	
//	public void star_Rating() throws InterruptedException {
//		wd.findElement(star_Rating).click();
//		Thread.sleep(3000);	
//	}
//	
//	public void star_Rating1() {
//		wd.findElement(star_Rating1).click();
//	}
	
	public void Price_Range() {
		wd.findElement(Price_Range).click();
	}
	
//	public void Price_Range1() {
//		wd.findElement(Price_range1).click();
//	}
//	
//	public void Price_Range2() {
//		wd.findElement(Price_Range2).click();
//	}
	
//	public void Price_Sort_By() {
//		wd.findElement(Price_Sort_By).click();
//	}
	
	public void Price_Sort_By1() throws InterruptedException {
		wd.findElement(Price_Sort_By1).click();
		Thread.sleep(3000);
	}
	
	public void Apply_Filters() throws InterruptedException {
		wd.findElement(Apply_Filters).click();
		Thread.sleep(3000);
	}
	
	public void Reset() throws InterruptedException {
		wd.findElement(Reset).click();
		Thread.sleep(3000);

	}
	public void View_More() throws InterruptedException {
		wd.findElement(View_More).click();
		Thread.sleep(3000);

	}
	
	
	
	
	

	    // Locate the 5-star rating button using XPath
//	    @FindBy(xpath = "//div[@class='rating']/span[@data-value='5']")
//	    WebElement fiveStarButton;
//
//	    // Method to click the 5-star rating button
//	    public void clickFiveStarRating() {
//	        fiveStarButton.click();
//	    }
	
	

}

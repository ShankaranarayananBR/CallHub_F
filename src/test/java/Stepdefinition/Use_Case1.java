package Stepdefinition;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import maintest.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Use_Case1{

	@Given("^Verify if the user is on the home page$")
	public void verify_if_the_user_is_on_the_home_page() throws Throwable {
	       String flipkart_title=BaseTest.driver.getTitle();
	       System.out.println(flipkart_title);
	       String Expected_Flipkart_title=BaseTest.prop.getProperty("Flipkart_title");
	       Assert.assertEquals(Expected_Flipkart_title, flipkart_title);
	       System.out.println("The user is in the flipkart Homepage");
	    
	}

	@When("^Clicking on the Login link$")
	public void clicking_on_the_Login_link() throws Throwable {
	    BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Login_link"))).click();
	    
	}

	@When("^Entering the credentials in the Login pop up$")
	public void entering_the_credentials_in_the_Login_pop_up() throws Throwable {
	    BaseTest.driver.switchTo().activeElement();
	    WebElement Username=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Username_field")));
	    Username.sendKeys("brshankar1992@gmail.com");
	    Thread.sleep(2000);
	    WebElement password=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Password_field")));
	    password.sendKeys("narayanan");
	    Thread.sleep(2000);
	    BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Login_button"))).click();
	}
    
	@Then("^Searching for Iphone(\\d+) in Electronics section$")
	public void searching_for_Iphone_in_Electronics_section(int arg1) throws Throwable {
		Thread.sleep(5000);
	    WebElement SearchField=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Search_field")));
	    SearchField.sendKeys("Iphone 7");
	    Thread.sleep(3000);
	    BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Iphone_7"))).click();
	}
	
	@Then("^Clicking on the OUT OF STOCK link$")
	public void clicking_on_the_OUT_OF_STOCK_link() throws Throwable {
		Thread.sleep(3000);
	    WebElement Availability=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Availability_link")));
	    ((JavascriptExecutor) BaseTest.driver).executeScript("arguments[0].scrollIntoView(true);", Availability);
	     Availability.click();
	     //Clicking on out of stock
	     WebElement OutOfStock=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Out_of_stock")));
	     OutOfStock.click();
	}
     
	@When("^Add the costliest product in shopping cart$")
	public void add_the_costliest_product_in_shopping_cart() throws Throwable {
		WebDriverWait wait = new WebDriverWait(BaseTest.driver,10);
	   List<WebElement> prodValue=BaseTest.driver.findElements(By.xpath(BaseTest.prop.getProperty("Product_value")));
	    int count=prodValue.size();
	    System.out.println(count);
	    for(WebElement i : prodValue){
	    	wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(i)));
	    	System.out.println(i.getText());
	    	
	     }
	     
	}

}

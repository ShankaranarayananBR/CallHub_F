package Stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;
import maintest.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Use_Case2 {

	@Given("^Check if the user is in home page$")
	public void check_if_the_user_is_in_home_page() throws Throwable {
		String flipkart_title = BaseTest.driver.getTitle();
		System.out.println(flipkart_title);
		String Expected_Flipkart_title = BaseTest.prop
				.getProperty("Flipkart_title");
		Assert.assertEquals(Expected_Flipkart_title, flipkart_title);
		System.out.println("The user is in the flipkart Homepage");

	}

	@Given("^Login to Flipkart application$")
	public void login_to_Flipkart_application() throws Throwable {
		BaseTest.driver.findElement(
				By.xpath(BaseTest.prop.getProperty("Login_link"))).click();
		Thread.sleep(3000);
		BaseTest.driver.switchTo().activeElement();
		WebElement Username = BaseTest.driver.findElement(By
				.xpath(BaseTest.prop.getProperty("Username_field")));
		Username.sendKeys("brshankar1992@gmail.com");
		Thread.sleep(2000);
		WebElement password = BaseTest.driver.findElement(By
				.xpath(BaseTest.prop.getProperty("Password_field")));
		password.sendKeys("narayanan");
		Thread.sleep(2000);
		BaseTest.driver.findElement(
				By.xpath(BaseTest.prop.getProperty("Login_button"))).click();
	}

	@Then("^Search for Iphone(\\d+)$")
	public void search_for_Iphone(int arg1) throws Throwable {
		Thread.sleep(5000);
	    WebElement SearchField=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Search_field")));
	    SearchField.sendKeys("Iphone 7");
	    Thread.sleep(3000);
	    BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Iphone_7"))).click();

	}

	@When("^Clicking on the top(\\d+) products$")
	public void clicking_on_the_top_products(int arg1) throws Throwable {
	   List<WebElement> checkbox=BaseTest.driver.findElements(By.xpath(BaseTest.prop.getProperty("Compare_checkbox")));
	   int count=checkbox.size();
	   System.out.println("The number of Add to compare Chechboxes are:"+" "+count);
	   Thread.sleep(3000);
	   for(int i=0;i<count-7;i++){
		   Thread.sleep(2000);
		   checkbox.get(i).click();
	   }
	
	}

	@When("^Clicking on the compare button$")
	public void clicking_on_the_compare_button() throws Throwable {
	 BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Compare_button"))).click();
	    
	}

	@Then("^Take screenshot of the compare page$")
	public void take_screenshot_of_the_compare_page() throws Throwable {
		Thread.sleep(3000);
		String Compare_title=BaseTest.driver.getTitle();
		System.out.println(Compare_title);
		File src= ((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		try {
		
		FileUtils.copyFile(src, new File(BaseTest.current+"\\ScreenShot\\compare.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	    
	}

	@Then("^Logging out of flipkart application$")
	public void logging_out_of_flipkart_application() throws Throwable {
	    WebElement username=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Username")));
	    Actions action = new Actions(BaseTest.driver);
	    action.moveToElement(username).perform();
	    Thread.sleep(2000);
	    WebElement LogOut=BaseTest.driver.findElement(By.xpath(BaseTest.prop.getProperty("Log_out")));
	    action.moveToElement(LogOut).click().build().perform();
	}


}

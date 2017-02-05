package maintest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest {

	public static WebDriver driver;
	public static String current;
	public static File file;
	public static Properties prop;
	
	@Before
	public void Beforetest() throws IOException{
		 current = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver",current+"\\Driver\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("-incognito");
         DesiredCapabilities capabilities = DesiredCapabilities.chrome();
         capabilities.setCapability(ChromeOptions.CAPABILITY, options);
         driver= new ChromeDriver(options);
         file = new File(current+"\\element.properties");
         FileInputStream fileInput = new FileInputStream(file);
         prop = new Properties();
         prop.load(fileInput);
         driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
         driver.get(prop.getProperty("Flipkart_URL"));
         driver.manage().window().maximize();
        
	}

	@After
	public void Aftertest(Scenario scenario) throws InterruptedException{
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
          scenario.embed(screenshot, "image/png");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}

package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageElements.FaceBookLoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTest {

	WebDriver driver;
	FaceBookLoginPage objFaceBookLoginPage;
	
	Scenario scenario;
	
	@Before
	public void beforeStep(Scenario scenario) {
		this.scenario = scenario;
	}
	
	@Given("Launch Facebook page")
	public void launchFaceBook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Given("Maximize log in page")
	public void windowMax() {
		driver.manage().window().maximize();
		scenario.write("Maximized windows successfully");
	}
	
	@When("^Enter (.*) and (.*)$")
	
	public void enterUserNamePassword(String userName, String password) {

		objFaceBookLoginPage = new FaceBookLoginPage(driver);
		objFaceBookLoginPage.ssetUserName(userName);
		objFaceBookLoginPage.setPassword(password);
		scenario.write("Entered username and password successfully");
	}
	
	@When("Click Log in Button")
	public void clickLogin() {
		objFaceBookLoginPage.clickLogin();
		scenario.write("clicked on login button successfully");
	}
	
	@Then("Close Browser")
	public void teardown() {
		driver.quit();
	}

	@After
	public void killBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
		}
		driver.quit();
	}

}

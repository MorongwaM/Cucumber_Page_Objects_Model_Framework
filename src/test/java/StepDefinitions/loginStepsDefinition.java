package StepDefinitions;

import Pages.loginPage;
import io.cucumber.java.en.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static Utils.screenshorts.getScreenshot;

public class loginStepsDefinition {

    WebDriver driver=null;

    loginPage lp;

    @Given("browser is opened")
    public void browser_is_opened() {
        String projectPath=System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/java/drivers/chromedriver2.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
    @And("user is on home page")
    public void user_is_on_home_page() {
        driver.get("https://demo.guru99.com/test/newtours");

    }
    @When("user click login link")
    public void user_click_login_link() {
        lp=new loginPage(driver);
      lp.click_signon();
    }
    @And("^the user enter (.*) and (.*)$")
    public void the_user_enter_test_and_test(String username,String password) {
        lp=new loginPage(driver);
       lp.enter_Username(username);
       lp.enter_Password(password);
    }
    @And("user click submit button")
    public void user_click_submit_button() {
        lp=new loginPage(driver);
        lp.click_submit();

    }
    @Then("user is navigated to the Mercury home page")
    public void user_is_navigated_to_the_mercury_home_page() {
        lp=new loginPage(driver);
        lp.verify_success_login();

    }
    @And("close browser")
    public void close_browser() {
        driver.close();
    }


}

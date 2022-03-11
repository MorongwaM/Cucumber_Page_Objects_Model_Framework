package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginPage {

    WebDriver driver;

    By link_signon = By.xpath("//a[@href='login.php'][contains(.,'SIGN-ON')]");
    By textField_Username = By.xpath("//input[contains(@name,'userName')]");
    By textField_Password = By.xpath("//input[contains(@name,'password')]");
    By button_submit= By.xpath("//input[contains(@type,'submit')]");
    By label_successLogin= By.xpath("//h3[contains(.,'Login Successfully')]");

    public loginPage(WebDriver driver){
        this.driver=driver;
    }

    public void click_signon(){
        driver.findElement(link_signon).click();
    }

    public void enter_Username(String Username){
        driver.findElement(textField_Username).sendKeys(Username);
    }

    public void enter_Password(String Password){
        driver.findElement(textField_Password).sendKeys(Password);
    }

    public void click_submit(){
        driver.findElement(button_submit).click();
    }

    public void verify_success_login(){
        Assert.assertEquals(driver.findElement(label_successLogin).getText(),"Login Successfully");
    }

}

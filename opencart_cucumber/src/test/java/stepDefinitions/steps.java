package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import java.time.Duration;

public class steps {

    WebDriver driver;
    HomePage hp;
    LoginPage lp;

    @Given("User Launch browser")
    public void user_launch_browser() {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Given("opens URL {string}")
    public void opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize(); //test methode should not be repeated

    }
    @When("User navigate to MyAccount menu")
    public void user_navigate_to_my_account_menu() {

        hp=new HomePage(driver);
        hp.clickMyAccount();

    }
    @When("Click on Login")
    public void click_on_login() {
        hp.clickLogin();

    }
    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String pwd) {
        lp=new LoginPage(driver);
        lp.setEmail(email);
        lp.setPassword(pwd);

    }
    @When("Click on Login button")
    public void click_on_login_button() {
        lp.clickLogin();

    }
    @Then("User navigates to MyAccount Page")
    public void user_navigates_to_my_account_page() {
        boolean targetpage=lp.isMyAccountPageExists();
        driver.close();
        if(targetpage)
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }


}

package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    public WebDriver webDriver;

    public LoginSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on login page")
    public void verifyLoginPage() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }
    
    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Then("User already on product page")
    public void verifyDashboard() {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertTrue(loginPage.verifyDashboard());
    }
}

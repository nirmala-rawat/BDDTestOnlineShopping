package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.ShoppingPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ShoppingSteps {
    public WebDriver webDriver;

    public ShoppingSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User is already on the checkout page")
    public void verifyCheckOutPage() {
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        Assert.assertTrue(shoppingPage.verifyChekOutPage());
    }

    @When("User input {string} then {string} and enter {string} as zip code")
    public void InputCheckOutPage(String fsname, String lsname, String zipcode) {
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        shoppingPage.setFirstName(fsname);
        shoppingPage.setLastName(lsname);
        shoppingPage.setZipCode(zipcode);
        shoppingPage.clickBtnContCheck();
    }

    @Then("User finish checkout")
    public void FinishCheckoutPage() {
        ShoppingPage shoppingPage = new ShoppingPage(webDriver);
        shoppingPage.clickFinishCheck();
    }
}

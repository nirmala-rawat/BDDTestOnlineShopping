package step_definitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.pageObject.AddToCartPage;
import org.openqa.selenium.WebDriver;

public class AddToCartSteps {
    public WebDriver webDriver;

    public AddToCartSteps() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @When("User selects a product")
    public void User_selects_a_product() {
        AddToCartPage addToCartpage = new AddToCartPage(webDriver);
        addToCartpage.clickAddToCart();    
    }

    @Then("User is already on your cart page")
    public void shoppingPage() {
        AddToCartPage addToCartPage = new AddToCartPage(webDriver);
        addToCartPage.clickShoppingPage();
        addToCartPage.clickBtnCheckOut();
    }
}

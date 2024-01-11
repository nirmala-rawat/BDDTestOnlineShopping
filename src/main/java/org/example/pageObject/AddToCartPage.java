package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
    public static WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        AddToCartPage.driver = driver;
    }

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement itemBackPack;

    @FindBy(xpath = "//a[.='1']")
    private WebElement shoppingPage;

    @FindBy(xpath="//button[@id='checkout']")
    private WebElement checkoutPage;
    
    public void clickShoppingPage(){
        shoppingPage.click();
    }
    
    public void clickBtnCheckOut(){
        checkoutPage.click();
    }

    public void clickAddToCart() {
        itemBackPack.click();
    }
}

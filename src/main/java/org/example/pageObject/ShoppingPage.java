package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
    public static WebDriver driver;

    public ShoppingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        ShoppingPage.driver = driver;
    }

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement btnCheckOut;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement CheckOutPage;

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement zipCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement btnContinue;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finishCheckOut;

    public void clickFinishCheck() {
        finishCheckOut.click();
    }

    public void clickBtnContCheck() {
        btnContinue.click();
    }

    public void setFirstName(String FsName) {
        firstName.sendKeys(FsName);
    }

    public void setLastName(String LsName) {
        lastName.sendKeys(LsName);
    }

    public void setZipCode(String FsName) {
        zipCode.sendKeys(FsName);
    }

    public boolean verifyChekOutPage() {
        return CheckOutPage.isDisplayed();
    }

    public void clickBtnCheckOut() {
        btnCheckOut.click();
    }
}

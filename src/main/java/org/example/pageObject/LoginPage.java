package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnlogin;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyDashboard;

    @FindBy(css = "h3")
    private WebElement erorText;

    public String textEror() {

        return erorText.getText();
    }

    public boolean verifyDashboard() {

        return verifyDashboard.isDisplayed();
    }

    public void setUserName(String urName) {

        userName.sendKeys(urName);
    }

    public void setPassword(String pssword) {

        password.sendKeys(pssword);
    }

    public void clickLogin() {

        btnlogin.click();
    }

    public boolean verifyLoginPage() {

        return userName.isDisplayed();
    }
}

package pages;

import Util.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    String Email = "test1212@gmail.com";
    String password = "123456";

    @FindBy(how = How.ID, using = "user[email]")
    private WebElement txtEmail;

    @FindBy(how=How.ID, using = "user[password]")
    private WebElement txtPassword;

    @FindBy(how=How.XPATH,using = "/html/body/main/div/div/article/form/div[4]/input")

    private WebElement btnSignIn;

    public void login() {
        txtEmail.sendKeys(Email);
        txtPassword.sendKeys(password);
        btnSignIn.click();
    }

    public void login(String email1, String password1) {
        txtEmail.sendKeys(email1);
        txtPassword.sendKeys(password1);
        btnSignIn.click();
    }
}

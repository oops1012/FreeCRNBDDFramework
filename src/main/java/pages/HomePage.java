package pages;

import Util.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/header/div/div/section[2]/a/img")
    private WebElement lnk_HomePage;

    @FindBy(how = How.XPATH, using = "/html/body/header/div/div/section[1]/ul/li/a")

    private WebElement lnk_LoginPage;


    public void navigateTolnk_HomePage() throws Exception {
        lnk_HomePage.click();
        Boolean isLinkDisplayed = lnk_HomePage.isDisplayed();
        Utilities.verifyLink(isLinkDisplayed);

    }

    public void navigateTolnk_LoginPage() throws Exception {
        lnk_LoginPage.click();
        Boolean isLinkDisplayed = lnk_HomePage.isDisplayed();
        Utilities.verifyLink(isLinkDisplayed);

    }

}

package pages;

import Util.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyDashboardPage {

    public MyDashboardPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/header/div/div/nav/ul/li[1]/a")
    private WebElement headerMyDashboard;

    @FindBy(how = How.XPATH, using = "/html/body/header/div/div/section[1]/ul/li/ul/li[4]/a")
    private WebElement linkSignout;

    @FindBy(how=How.XPATH,using = "/html/body/header/div/div/section[1]/ul/li/a")
    private WebElement userLink;


    public void verifyMyDashboard() throws Exception {
        String myDashboardheader = headerMyDashboard.getText();
        boolean isMyDashboardDisplayed = headerMyDashboard.isDisplayed();
        Utilities.verifyLink(isMyDashboardDisplayed);
    }

        public void signOut () {
            userLink.click();
           // linkSignout.click();
        }

}

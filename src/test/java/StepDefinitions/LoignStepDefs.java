package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Util.*;
import pages.HomePage;
import pages.LoginPage;
import pages.MyDashboardPage;

import java.util.List;

public class LoignStepDefs {
    //WebDriver driver;
/*
    @Given("^User on Home page$")
    public void user_on_Home_page() {
    Utilities.driverSetup();
    Utilities.driver.get("https://courses.ultimateqa.com/");
     }

    @When("^User go to login page$")
    public void goTo_LoingPage() throws Exception {
        HomePage hp = new HomePage(Utilities.driver);
        hp.navigateTolnk_LoginPage();
    }

    @And("^Login with correct credentials$")
    public void userAndPasswordValueEntered(DataTable loginData) {
        List<List<String>> loginCreds = loginData.raw();
        String email = loginCreds.get(0).get(0);
        String password = loginCreds.get(0).get(1);
        LoginPage lg = new LoginPage(Utilities.driver);
        lg.login(email,password);
    }

  *//*  @And("^Login with correct credentials$")
    public void userAndPasswordValueEntered() {
        LoginPage lp = new LoginPage(Utilities.driver);
        lp.login();
    }*//*

    @Then("^My Dashboard is displayed$")
    public void MyDashboardpageIsDisplayed() throws Exception {
        MyDashboardPage dash = new MyDashboardPage(Utilities.driver);
        dash.verifyMyDashboard();
    }

    @Then("^User logout successfully$")
    public void userLogoutSuccessfully() {
        MyDashboardPage dash = new MyDashboardPage(Utilities.driver);
        dash.signOut();
        Utilities.driver.close();

    }

    @And("^Login with username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void loginWithUsernameAndPassword(String arg0, String arg1) throws Throwable {
        LoginPage lg = new LoginPage(Utilities.driver);
        lg.login();
        //throw new PendingException();
    }


    @And("^Login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void loginWithAnd(String email, String password) {
        LoginPage lg = new LoginPage(Utilities.driver);
        lg.login(email,password);

    }*/
}

package StepDefinitions;

import Util.Utilities;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.jetbrains.annotations.NotNull;
import pages.HomePage;
import pages.LoginPage;
import pages.MyDashboardPage;

import java.util.List;
import java.util.Map;

public class LoginWithMap {

    @Before
    public void BeforeSetup() {
        System.out.println("Start of the test.");
        Utilities.driverSetup();
        Utilities.driver.get("https://courses.ultimateqa.com/");
    }

    @After
    public void TearDown() {
        Utilities.driver.close();
        System.out.println("Test completed and driver terminated");
    }

    @Given("^User on Home page$")
    public void user_on_Home_page() {
        /*Utilities.driverSetup();
        Utilities.driver.get("https://courses.ultimateqa.com/");*/
        System.out.println("driver setup and home has been navigated.");
    }

    @When("^User go to login page$")
    public void goTo_LoingPage() throws Exception {
        HomePage hp = new HomePage(Utilities.driver);
        hp.navigateTolnk_LoginPage();
    }

  /*  @And("^Login with correct credentials$")
    public void userAndPasswordValueEntered(DataTable loginData) {
        List<List<String>> loginCreds = loginData.raw();
        String email = loginCreds.get(0).get(0);
        String password = loginCreds.get(0).get(1);
        LoginPage lg = new LoginPage(Utilities.driver);
        lg.login(email,password);
    }*/

  /*  @And("^Login with correct credentials$")
    public void userAndPasswordValueEntered() {
        LoginPage lp = new LoginPage(Utilities.driver);
        lp.login();
    }*/
  @And("^Login with correct credentials$")
    public void userAndPasswordValueEntered(@NotNull DataTable loginData) {
      for (Map<String,String> loginCreds : loginData.asMaps(String.class,String.class))
            {
                String email = loginCreds.get("email");
                String password = loginCreds.get("password");
                LoginPage lg = new LoginPage(Utilities.driver);
                lg.login(email,password);
      }

    }

    @Then("^My Dashboard is displayed$")
    public void MyDashboardpageIsDisplayed() throws Exception {
        MyDashboardPage dash = new MyDashboardPage(Utilities.driver);
        dash.verifyMyDashboard();
    }

    @Then("^User logout successfully$")
    public void userLogoutSuccessfully() {
        MyDashboardPage dash = new MyDashboardPage(Utilities.driver);
        dash.signOut();
       // Utilities.driver.close();

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

    }
}

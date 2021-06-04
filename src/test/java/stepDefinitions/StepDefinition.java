package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {



    @Given("User is on NetBanking landing Page")
    public void userIsOnNetBankingLandingPage(){
        System.out.println("Navigating to  HomePage");
    }

    @When("User login into application with username and password")
    public void userLoginIntoApplicationWithUsernameAndPassword() {
        System.out.println("Login into app");
    }

    @Then("Home Page is populated")
    public void homePageIsPopulated() {
        System.out.println("HomePage is populate");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("Cards are displayed");
    }

    //2
    @When("User login into application with {string} and {string}")
    public void userLoginIntoApplicationWithAnd(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);

    }


    //3
    @When("User login into application with username and {string}")
    public void userLoginIntoApplicationWithUsernameAnd(String arg0) {
        System.out.println(arg0);

    }
}

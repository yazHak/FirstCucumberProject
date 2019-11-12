package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class StepDef2 {

    @Given("^User will navigate to the url as \"([^\"]*)\"$")
    public void user_will_navigate_to_the_url_as_something(String strArg1) throws Throwable {
        System.out.println("User will navigate to Amazon webpage : "+ strArg1);
    }

    @When("^User will type in search box with \"([^\"]*)\"$")
    public void user_will_type_in_search_box_with_something(String strArg1) throws Throwable {
        System.out.println("User will search "+ strArg1);
    }

    @Then("^User will see toys$")
    public void user_will_see_toys() throws Throwable {
        System.out.println("User will see toys");
    }
}
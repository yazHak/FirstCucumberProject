package stepdefinitions;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;

public class StepDef1 {
    @Given("^User will navigate to the webpage$")
    public void user_will_navigate_to_the_webpage() throws Throwable {
        System.out.println("User will navigate to the webpage");
    }

    @When("^User will login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_will_login_into_application_with_and(String arg1, String arg2) throws Throwable {
        System.out.println("username : "+arg1+ "\npassword : "+arg2 );
    }

    @Then("^Dashboard will appear with \"([^\"]*)\"$")
    public void dashboard_will_appear_with_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }

    @Then("^User will see something$")
    public void user_will_see_something() throws Throwable {
        System.out.println("User will see something");
    }

    @When("^User will sign in with following information$")
    public void user_will_sign_in_with_following_information(DataTable arg1) throws Throwable {
        List<List<String>> obj = arg1.raw();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }

    @When("^User login into with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_with_and(String arg1, String arg2) throws Throwable {
        System.out.println(arg1);
        System.out.println(arg2);
    }

    @Given("^XXX$")
    public void xxx() throws Throwable {
        System.out.println("XXX");
        }

    @When("^YYY$")
    public void yyy() throws Throwable {
        System.out.println("YYY");
           }

    @Then("^ZZZ$")
    public void zzz() throws Throwable {
        System.out.println("ZZZ");
          }
}

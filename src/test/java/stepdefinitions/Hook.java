package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before()
    public void beforeValidation() {
        System.out.println("Run before mobileTest");
    }

    @Before()
    public void beforeAnything() {
        System.out.println("Run before WebTest");
    }

    @After()
    public void afterMethod() {
        System.out.println("Run after mobileTest");
    }
}

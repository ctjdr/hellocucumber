package hellocucumber;

import io.cucumber.java.en.Then;


public class StepDefinitions {

    @Then("Say hello")
    public void say_hello() {
        System.out.println("Hello!");
    }

}

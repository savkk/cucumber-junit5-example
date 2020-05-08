package com.github.savkk.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleStepDefs {
    @Given("first step")
    public void firstStep() {
        System.out.println("first step");
    }


    @When("second step")
    public void secondStep() {
        System.out.println("second step");
    }


    @Then("third step")
    public void thirdStep() {
        System.out.println("third step");
    }

}

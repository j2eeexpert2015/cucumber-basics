package com.example.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumStepDefinitions {

    private int num1;
    private int num2;
    private int result;

    @Given("I have two numbers {int} and {int}")
    public void i_have_two_numbers(int number1, int number2) {
        this.num1 = number1;
        this.num2 = number2;
    }

    @When("I add the numbers")
    public void i_add_the_numbers() {
        this.result = this.num1 + this.num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, this.result);
    }
}


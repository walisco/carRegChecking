package com.carcheck.index.tests;

import com.carcheck.tests.helper.CarTaxPageCheck;
import cucumber.api.java.en.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarRegistrationCheckStepDefs {
    static final Logger LOG = LoggerFactory.getLogger(CarRegistrationCheckStepDefs.class);
    final CarTaxPageCheck carTaxPageCheck;
    List<String> randomNumbersGeneratedInTextArea;
    int countOfDatesEntered;

    public CarRegistrationCheckStepDefs(CarTaxPageCheck carTaxPageCheck) {
        this.carTaxPageCheck = carTaxPageCheck;
    }


    @When("^I am go to the car tax check page$")
    public void i_am_go_to_the_car_tax_check_page() throws Throwable {
        carTaxPageCheck.openCarTaxCheckPage();
        LOG.info("Navigating to car tax check page");
    }

    @Then("^I enter \"([^\"]*)\" and \"([^\"]*)\" against the input data$")
    public void i_enter_and_against_the_input_data(String arg1, String arg2) throws Throwable {
    carTaxPageCheck.enterCarRegistration();
    }
//
//    @When("^I enter \"([^\"]*)\" from input data$")
//    public void i_enter_from_input_data(String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I select \"([^\"]*)\" and submit$")
//    public void i_select_and_submit(String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @When("^I check the fields match the input data$")
//    public void i_check_the_fields_match_the_input_data(DataTable arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        throw new PendingException();
//    }


}

package com.carcheck.index.tests;

import com.carcheck.tests.helper.CarTaxPageCheck;
import cucumber.api.java.en.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarRegistrationCheckStepDefs {
    static final Logger LOG = LoggerFactory.getLogger(CarRegistrationCheckStepDefs.class);
    final CarTaxPageCheck carTaxPageCheck;

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
    carTaxPageCheck.checkCarDataWithCarTaxCheckSite();
    }


}

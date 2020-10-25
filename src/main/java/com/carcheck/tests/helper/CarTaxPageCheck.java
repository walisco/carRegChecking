package com.carcheck.tests.helper;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

import static org.openqa.selenium.By.*;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarTaxPageCheck extends BasePage {
    static final long DRIVER_WAIT_TIME = 30;
    final By enterRegistration = id("vrm-input");
    final By freeCarCheck = cssSelector("button");
    final By registration = xpath("//*[contains(text(),'Registration')]//parent::dl");
    final By make = xpath("//*[contains(text(),'Make')]//parent::dl");
    final By model = xpath("//*[contains(text(),'Model')]//parent::dl");
    final By color = xpath("//*[contains(text(),'Colour')]//parent::dl");
    final By year = xpath("//*[contains(text(),'Year')]//parent::dl");


    public void openCarTaxCheckPage() {
        SharedDriver.getWebDriver().get(Props.getProp("url"));
    }

    public void enterCarRegistration() throws IOException, InterruptedException {
        String registrion = null;
        Util util = new Util();
        for (int i = 0; i < util.getRegData().size(); i++) {
            waitForExpectedElement(enterRegistration, DRIVER_WAIT_TIME).clear();
            waitForExpectedElement(enterRegistration, DRIVER_WAIT_TIME).sendKeys(util.getRegData().get(i));
            Thread.sleep(2000);
            waitForExpectedElement(freeCarCheck, DRIVER_WAIT_TIME).click();
            Thread.sleep(1000);
            JavascriptExecutor jse = (JavascriptExecutor) SharedDriver.getWebDriver();
            jse.executeScript("window.scrollBy(0,400)");

            Assert.assertEquals("registration data not matched for: " + util.getRegData().get(i), util.getRegData().get(i), waitForExpectedElement(registration, DRIVER_WAIT_TIME).getAttribute("innerText").split("\n")[1]);
            Assert.assertEquals("registration data not matched for: " + util.getRegData().get(i), util.getMakeData().get(i), waitForExpectedElement(make, DRIVER_WAIT_TIME).getAttribute("innerText").split("\n")[1]);
            Assert.assertEquals("registration data not matched for: " + util.getRegData().get(i), util.getModelData().get(i), waitForExpectedElement(model, DRIVER_WAIT_TIME).getAttribute("innerText").split("\n")[1]);
            Assert.assertEquals("registration data not matched for: " + util.getRegData().get(i), util.getColorData().get(i), waitForExpectedElement(color, DRIVER_WAIT_TIME).getAttribute("innerText").split("\n")[1]);
            Assert.assertEquals("registration data not matched for: " + util.getRegData().get(i), util.getYearData().get(i), waitForExpectedElement(year, DRIVER_WAIT_TIME).getAttribute("innerText").split("\n")[1]);
            SharedDriver.getWebDriver().navigate().back();
        }
    }


}

package com.cydeo.step_definitions;

/*
In this class we will be able to creat "pre" and "post" condition for ALL the SCENARIOS and even STEPS.
 */

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before
    public void setupMethod() {
        System.out.println("---> @Before: RUNNING BEFORE EACH SCENARIO");
    }


    @After
    public void teardownMethod(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");

        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }


    // @BeforeStep
    public void setupStep() {
        System.out.println("---> @BeforeSTEP: Running before each step!");
    }


    // @AfterStep
    public void teardownStep() {
        System.out.println("---> @AfterSTEP: Running after each step!");
    }


}

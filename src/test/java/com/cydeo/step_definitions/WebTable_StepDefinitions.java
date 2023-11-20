package com.cydeo.step_definitions;

import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.pages.WT_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {

    WT_LoginPage wtLoginPage = new WT_LoginPage();

    @Given("user in on the Web Table app login page")
    public void user_in_on_the_web_table_app_login_page() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters correct username")
    public void user_enters_correct_username() {
        wtLoginPage.inputUsername.sendKeys("Test");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        wtLoginPage.inputPassword.sendKeys("Tester");
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        wtLoginPage.loginButton.click();

    }

    @Then("user should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "orders";

        Assert.assertTrue(actualURL.contains(expectedURL));
    }


    @When("user enters {string} username and {string} password")
    public void userEntersUsernameAndPassword(String username, String password) {

        wtLoginPage.inputUsername.sendKeys(username);
        wtLoginPage.inputPassword.sendKeys(password);
    }

    @When("user enters correct credentials")
    public void userEntersCorrectCredentials(Map<String, String> credentials) {

        wtLoginPage.inputUsername.sendKeys(credentials.get("username"));
        wtLoginPage.inputPassword.sendKeys(credentials.get("password"));
    }


    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        wtLoginPage.login();
    }


    WT_OrderPage wtOrderPage = new WT_OrderPage();

    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {
        wtOrderPage.orderLink.click();
    }

    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {

        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(wtOrderPage.productDropdown);

        Assert.assertEquals(actualOptions, expectedOptions);

    }


    @Then("user sees below radio buttons enabled Visa")
    public void userSeesBelowRadioButtonsEnabledVisa() {

        Assert.assertTrue(wtOrderPage.visaRadio.isEnabled());
    }

    @Then("user sees below radio buttons enabled Mastercard")
    public void userSeesBelowRadioButtonsEnabledMastercard() {

        Assert.assertTrue(wtOrderPage.masterCardRadio.isEnabled());
    }

    @Then("user sees below radio buttons enabled American Express")
    public void userSeesBelowRadioButtonsEnabledAmericanExpress() {

        Assert.assertTrue(wtOrderPage.americanExpressRadio.isEnabled());
    }






    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {

        wtOrderPage.quantity.clear();

        wtOrderPage.quantity.sendKeys("2");
    }

    @Then("user click to the calculate button")
    public void userClickToTheCalculateButton() {

        wtOrderPage.calculateButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String customerName) {

        wtOrderPage.customerName.sendKeys(customerName);
    }

    @And("user enters street name {string}")
    public void userEntersStreetName(String street) {

        wtOrderPage.street.sendKeys(street);
    }

    @And("user enters city name {string}")
    public void userEntersCityName(String city) {

        wtOrderPage.city.sendKeys(city);
    }

    @And("user enters state name {string}")
    public void userEntersStateName(String state) {

        wtOrderPage.state.sendKeys(state);
    }

    @And("user enters zip code {string}")
    public void userEntersZipCode(String zipCode) {

        wtOrderPage.zipCode.sendKeys(zipCode);
    }

    @And("user selects payment option {string}")
    public void userSelectsPaymentOption(String paymentType) {

        BrowserUtils.clickRadioButton(wtOrderPage.cardTypes, paymentType);
    }

    @And("user enters card number {string}")
    public void userEntersCardNumber(String cardNumber) {

        wtOrderPage.cardNumber.sendKeys(cardNumber);
    }

    @And("user enters expDate {string}")
    public void userEntersExpDate(String expDate) {

        wtOrderPage.expDate.sendKeys(expDate);
    }

    @And("user clicks to process order button")
    public void userClicksToProcessOrderButton() {

        wtOrderPage.processOrder.click();
    }

    WT_ViewAllOrdersPage wtViewAllOrdersPage = new WT_ViewAllOrdersPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {

        String actualName = wtViewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(actualName, expectedName);

    }




}

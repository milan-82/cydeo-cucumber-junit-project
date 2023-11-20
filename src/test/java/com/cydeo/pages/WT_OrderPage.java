package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WT_OrderPage extends WT_BasePage {

    public WT_OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(xpath = "//input[@value ='Visa']")
    public WebElement visaRadio;

    @FindBy(xpath = "//input[@value ='MasterCard']")
    public WebElement masterCardRadio;

    @FindBy(xpath = "//input[@value ='American Express']")
    public WebElement americanExpressRadio;

    @FindBy(name = "card")
    public List<WebElement> cardTypes;


    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    @FindBy(name = "name")
    public WebElement customerName;

    @FindBy(name = "street")
    public WebElement street;

    @FindBy(name = "city")
    public WebElement city;

    @FindBy(name = "state")
    public WebElement state;


    @FindBy(name = "zip")
    public WebElement zipCode;

    @FindBy(name = "cardNo")
    public WebElement cardNumber;

    @FindBy(name = "cardExp")
    public WebElement expDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrder;

}

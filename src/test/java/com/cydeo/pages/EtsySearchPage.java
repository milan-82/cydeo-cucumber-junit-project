package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;

public class EtsySearchPage {



    public EtsySearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@aria-label='Search']")
    public WebElement searchButton;

}

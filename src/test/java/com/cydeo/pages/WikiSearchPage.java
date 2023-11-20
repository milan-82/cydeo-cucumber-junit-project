package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.runner.manipulation.Ordering;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {


    public WikiSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
  public   WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
   public WebElement searchButton;



}

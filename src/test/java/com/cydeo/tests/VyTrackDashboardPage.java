package com.cydeo.tests;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackDashboardPage {

    public VyTrackDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//li[@='user-menu']/a")
    public WebElement fullname;

    @FindBy(linkText = "Logout")
    public WebElement logOutLink;

    public void logout(){
        fullname.click();
        logOutLink.click();
    }
}

package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage2;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class GoogleSearch2_StepDefinition {

    GoogleSearchPage2 googleSearchPage2 = new GoogleSearchPage2();
    @When("User is on Google search page")
    public void user_is_on_google_search_page() {

        Driver.getDriver().get("http://www.google.com");
        googleSearchPage2.acceptCookies.click();
    }
    @When("User types {string} in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter(String string) {

        googleSearchPage2.searchBox.sendKeys(string + Keys.ENTER);
    }
    @Then("User sees Steve Jobs is in the google title")
    public void user_sees_steve_jobs_is_in_the_google_title() {

        String expectedTitle = "apple";

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

}

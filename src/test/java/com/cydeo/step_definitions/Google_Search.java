package com.cydeo.step_definitions;

import com.cydeo.pages.GooglePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_Search {

    @When("User is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google"));
    }
    @When("User types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        GooglePage googlePage = new GooglePage();
        googlePage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("User sees apple is in the google title")
    public void user_sees_steve_jobs_is_in_the_google_title() {
        System.out.println("User is seeing title apple");
        String actual = Driver.getDriver().getTitle();
        String expected = "aple";

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();

    }
}

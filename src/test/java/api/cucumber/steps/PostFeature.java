package api.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostFeature {
    @Given("^user should be logged in and should be present on his wall$")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable {
        System.out.println("user_should_be_logged_in_and_should_be_present_on_his_wall");
    }

    @When("^I type the message in the box$")
    public void i_type_the_message_in_the_box() throws Throwable {

    }

    @When("^click on post button$")
    public void click_on_post_button() throws Throwable {


    }

    @Then("^the message should get posted$")
    public void the_message_should_get_posted() throws Throwable {


    }

}

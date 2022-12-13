
package api.cucumber.steps;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostSteps {
    @Given("^User should be logged in and should be present at its own wall$")
    public void user_should_be_logged_in_and_should_be_present_at_its_own_wall() throws Throwable {
        System.out.println("user_should_be_logged_in_and_should_be_present_at_its_own_wall");

    }

    @When("^I type the message as \"([^\"]*)\" in the text box$")
    public void i_type_the_message_as_in_the_text_box(String text) throws Throwable {
        System.out.println("text");

    }

    @And("^Click on post button$")
    public void click_on_post_button() throws Throwable {
        System.out.println("click_on_post_button");

    }
    @Then("^message should get posted$")
    public void message_should_get_posted() throws Throwable {
        System.out.println("message_should_get_posted");
    }

    @When("^user supply the you tube link as \"([^\"]*)\" in the text box$")
    public void user_supply_the_you_tube_link_as_in_the_text_box(String url) throws Throwable {
        System.out.println(url);
    }

    @Then("^then video should get posted on the user wall$")
    public void then_video_should_get_posted_on_the_user_wall() throws Throwable {
        System.out.println("then_video_should_get_posted_on_the_user_wall");
    }

    @Then("^the video should have proper thumbnail$")
    public void the_video_should_have_proper_thumbnail() throws Throwable {
        System.out.println("the_video_should_have_proper_thumbnail");


}}


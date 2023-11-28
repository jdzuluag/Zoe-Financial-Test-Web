package co.com.zoefinancial.certification.stepdefinition;

import co.com.zoefinancial.certification.questions.ValidateMessage;
import co.com.zoefinancial.certification.tasks.PressButton;
import co.com.zoefinancial.certification.tasks.SelectNewDate;
import co.com.zoefinancial.certification.tasks.SelectNewTime;
import co.com.zoefinancial.certification.tasks.SelectType;
import co.com.zoefinancial.certification.utils.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ReschedulingStepDefinition {

    @Managed(driver = "chrome")
    static WebDriver driver;

    @Before
    public void init(){
        setTheStage(new Cast());
    }
    @Given("^The user open url application$")
    public void theUserOpenUrlApplication() {
        theActorCalled("actor").can(BrowseTheWeb.with(OwnWebDriver
                .nuevo().chrome("https://portal-test.zoefin.com/reschedule/66965aa0-9c17-11ed-b52a-53af9ee871d5")));
    }


    @When("^The user selects the new date (.*)$")
    public void theUserSelectsTheNewDate(String date) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectNewDate.selectNewDate(date));
    }

    @When("^The user selects the new time for the meeting (.*)$")
    public void theUserSelectsTheNewTimeForTheMeeting(int time) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectNewTime.selectNewTime(time));
    }

    @When("^The user selects the type of the meeting (.*)$")
    public void theUserSelectsTheTypeOfTheMeeting(String type) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectType.selectType(type));
    }

    @When("^The user confirms the meeting$")
    public void theUserConfirmsTheMeeting() {
        OnStage.theActorInTheSpotlight().attemptsTo(PressButton.pressButton());
    }

    @Then("^The user should see the message of successfully rescheduled$")
    public void theUserShouldSeeTheMessageOfSuccessfullyRescheduled() {
        GivenWhenThen.seeThat(ValidateMessage.validateMessage(), Matchers.is(true));
    }
}
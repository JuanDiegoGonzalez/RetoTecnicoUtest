package co.com.choucair.technicalchallenge.utest.stepdefinitions;

import co.com.choucair.technicalchallenge.utest.model.TechnicalChallengeUtestData;
import co.com.choucair.technicalchallenge.utest.questions.Answer;
import co.com.choucair.technicalchallenge.utest.tasks.OpenUp;
import co.com.choucair.technicalchallenge.utest.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class TechnicalChallengeUtestStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Juan Diego wants to be a member of the Utest community$")
    public void thatJuanDiegoWantsToBeAMemberOfTheUtestCommunity() {
        OnStage.theActorCalled("Juan Diego").wasAbleTo(OpenUp.thePage());
    }

    @When("^he goes to the Utest website homepage and fills up the sign up form$")
    public void heGoesToTheUtestWebsiteHomepageAndFillsUpTheSignUpForm(List<TechnicalChallengeUtestData> technicalChallengeUtestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage(technicalChallengeUtestData.get(0).getStrFirstName(),
                technicalChallengeUtestData.get(0).getStrLastName(),
                technicalChallengeUtestData.get(0).getStrEmailAddress(),
                technicalChallengeUtestData.get(0).getStrPassword()));
    }

    @Then("^he has an account created at Utest\\.com and he is welcomed to the site$")
    public void heHasAnAccountCreatedAtUtestComAndHeIsWelcomedToTheSite(List<TechnicalChallengeUtestData> technicalChallengeUtestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(technicalChallengeUtestData.get(0).getStrTitle())));
    }
}

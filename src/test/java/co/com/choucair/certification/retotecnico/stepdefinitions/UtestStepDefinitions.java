package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.tasks.OpenUp;
import co.com.choucair.certification.retotecnico.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Camilo wants to register$")
    public void thanCamiloWantsToRegister() {
        OnStage.theActorCalled("Camilo").wasAbleTo(OpenUp.thePage());

    }


    @When("^he enters the utest page and selects join today$")
    public void heEntersTheUtestPageAndSelectsJoinToday() {
        OnStage.theActorCalled("Camilo").attemptsTo(Register.onThePage());
    }

    @Then("^he finds the form to register$")
    public void heFindsTheFormToRegister() {


    }

}

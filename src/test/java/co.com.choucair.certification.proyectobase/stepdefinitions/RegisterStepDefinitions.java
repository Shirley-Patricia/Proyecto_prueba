package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.RegisterData;
import co.com.choucair.certification.proyectobase.tasks.EnterData;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RegisterStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Shirley wants to register on the application$")
    public void thatShirleyWantsToRegisterOnTheApplication() {
        OnStage.theActorCalled("Shirley").wasAbleTo(OpenUp.thePage(), (Register.enterPage()));
    }

    @When("^she records her personal data$")
    public void sheRecordsHerPersonalData(List<RegisterData> registerData) throws Exception {
        OnStage.theActorCalled("Shirley").attemptsTo(EnterData.personalData(registerData.get(0).getStrName(),registerData.get(0).getStrLastName(),registerData.get(0).getStrEmail(),registerData.get(0).getStrLanguage()));
    }

    @When("^she enters the place where she live$")
    public void sheEntersThePlaceWhereSheLive() {

    }

    @When("^she enters the mobile device data$")
    public void sheEntersTheMobileDeviceData() {

    }

    @When("^she creates her password to enter the site$")
    public void sheCreatesHerPasswordToEnterTheSite() {

    }

    @Then("^she is registered in the application$")
    public void sheIsRegisteredInTheApplication() {

    }
}

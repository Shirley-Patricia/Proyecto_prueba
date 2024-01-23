package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.EnterData;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterStepDefinitions {
    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Shirley wants to register on the application$")
    public void that_Shirley_wants_to_register_on_the_aplication() {
        OnStage.theActorCalled("Shirley").wasAbleTo(OpenUp.thePage(), (Register.enterPage()));

}

    @When("^she records her personal data$")
    public void she_records_her_personal_data() {
        OnStage.theActorCalled("Shirley").attemptsTo(EnterData.personalData.);
    }

    @When("^she enters the place where she live$")
    public void she_enters_the_place_where_she_live() {

    }

    @When("^she enters the mobile device data$")
    public void she_enters_the_mobile_device_data() {

    }

    @When("^she creates her password to enter the site$")
    public void she_create_her_password_to_enter_the_site() {

    }

    @Then("^she is registered in the application$")
    public void she_is_registered_in_the_aplication() {

    }
}

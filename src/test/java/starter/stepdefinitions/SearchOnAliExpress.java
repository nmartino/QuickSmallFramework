package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.tasks.DoASearchOnAliExpress;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchOnAliExpress {

    String actor;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user is on the aliexpress homepage")
    public void theUserIsOnTheSeconfPageOfTheResultsForIphone(){
        this.actor = "user";
        theActorCalled(actor).attemptsTo(NavigateTo.theAliExpressSearchPage());
    }

    @When("he search for an item '(.*)' and go to the second page of the results and clicks on the option number '(.*)'")
    public void theUserSearchesForAnItem(String item, String number){
    theActorInTheSpotlight().attemptsTo(DoASearchOnAliExpress.searchForAnItem(item,number));
    }

    @Then("there are items for buy")
    public void thereAreItemsForBuy(){

    }



}

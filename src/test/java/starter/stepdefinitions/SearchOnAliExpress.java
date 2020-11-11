package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;
import starter.navigation.NavigateTo;
import starter.pages.AliExpresssearchPage2ndPage;
import starter.tasks.DoASearchOnAliExpress;

import java.util.Set;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchOnAliExpress {

    String actor;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The user is on the aliexpress homepage")
    public void theUserIsOnTheSecondPageOfTheResultsForIphone() {
        this.actor = "user";
        theActorCalled(actor).attemptsTo(NavigateTo.theAliExpressSearchPage());
    }

    @When("he search for an item (.*) and go to the second page of the results and clicks on the option number 2")
    public void theUserSearchesForAnItem(String item) {
        //navigating again to the home page so the pop up would dissapear (the popup was always "unavailable to be clicked"
        theActorInTheSpotlight().attemptsTo(NavigateTo.theAliExpressSearchPage());
        theActorInTheSpotlight().attemptsTo(DoASearchOnAliExpress.searchForAnItem(item));
    }

    @Then("there are items for buy")
    public void thereAreItemsForBuy() {
        //creating a windows handle in order to change to the second tab that is opened
        WebDriver driver = BrowseTheWeb.as(theActorInTheSpotlight()).getDriver();
        String currHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.contentEquals(currHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(AliExpresssearchPage2ndPage.buyNowButton).isDisplayed()
        );

    }


}

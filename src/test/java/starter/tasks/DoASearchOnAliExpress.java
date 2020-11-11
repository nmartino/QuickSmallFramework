package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.WebDriver;
import starter.pages.AliExpressPage;
import starter.pages.AliExpresssearchPage2ndPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoASearchOnAliExpress implements Task {

    int resultNumber;
    String item;


    public DoASearchOnAliExpress(String item) {
        this.item = item;
    }

    public static Performable searchForAnItem(String item) {
        return instrumented(DoASearchOnAliExpress.class, item);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(item).into(AliExpressPage.searchInput),
                Click.on(AliExpressPage.searchButton),
                Click.on(AliExpressPage.closePopUpButton),
                Click.on(AliExpresssearchPage2ndPage.resultNumber2)
        );
    }
}

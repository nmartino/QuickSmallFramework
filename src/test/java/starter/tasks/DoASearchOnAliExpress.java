package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.pages.AliExpressPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoASearchOnAliExpress implements Task {

    int resultNumber;

    public DoASearchOnAliExpress(int resultNumber) {
        this.resultNumber = resultNumber;
    }

    public static Performable searchForAnItem() {
        return instrumented(DoASearchOnAliExpress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AliExpressPage.closePopUpButton),
                Click.on(AliExpressPage.results.get(resultNumber)));
    }
}

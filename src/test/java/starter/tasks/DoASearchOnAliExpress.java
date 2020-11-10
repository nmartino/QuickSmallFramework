package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.pages.AliExpressPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoASearchOnAliExpress implements Task {

    int resultNumber;
    String item;

    public DoASearchOnAliExpress(String item,String resultNumber) {
        this.item = item;

        this.resultNumber = Integer.parseInt(resultNumber);
        if (this.resultNumber<0){
            this.resultNumber = 0;
        }else{
            this.resultNumber -= 1;
        }
    }

    public static Performable searchForAnItem(String item, String resultNumber) {
        return instrumented(DoASearchOnAliExpress.class,item,resultNumber);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AliExpressPage.closePopUpButtonHomePage),
                Enter.theValue(item).into(AliExpressPage.searchInput),
                Click.on(AliExpressPage.searchButton),
                Click.on(AliExpressPage.closePopUpButton)
        //        Click.on(AliExpressPage.results.get(resultNumber))
        );
    }
}

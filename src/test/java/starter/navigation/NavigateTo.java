package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.pages.AliExpressPage;


public class NavigateTo {

    public static Performable theAliExpressSearchPage(){
        return Task.where("{0} opens the Aliexpress search page",
                Open.browserOn().the(AliExpressPage.class)
        );
    }

}

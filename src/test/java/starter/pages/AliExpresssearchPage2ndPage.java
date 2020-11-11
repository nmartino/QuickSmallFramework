package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class AliExpresssearchPage2ndPage extends PageObject {

public static Target resultNumber2 = Target.the("Result number 2").locatedBy("//div[@product-index=1]");
public static Target buyNowButton = Target.the("Buy now button").locatedBy(".product-action .buy-now-wrap");


}

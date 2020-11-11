package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.aliexpress.com/")
public class AliExpressPage extends PageObject {

    public static Target searchInput = Target.the("search input").locatedBy(".search-key");
    public static Target searchButton = Target.the("Search button").locatedBy("//div[@class='searchbar-operate-box']//input[@type ='submit']");
    //the nex locator is in that way because was almost impossible to locate the element using a more readable locator
    public static Target closePopUpButton = Target.the("close pop up button").locatedBy("//html/body/div[7]/div[2]/div/a");

}

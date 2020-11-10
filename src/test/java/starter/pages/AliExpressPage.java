package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.aliexpress.com/")
public class AliExpressPage extends PageObject {

    //@FindBy(xpath = "//ul[@class='list-items']//li")
   //public static List<WebElementFacade> results;

    public static Target closePopUpButtonHomePage = Target.the("close pop up button in home page").locatedBy("//img[@data-spm-anchor-id='a2g0o.tm355004.6216442440.i0.e7f31c90CEYzIB']");
    public static Target searchInput = Target.the("search input").locatedBy(".search-key");
    public static Target searchButton = Target.the("Search button").locatedBy("//input[@data-spm-anchor-id='a2g0o.home.1000002.i1.650c21459P8ra6']");
    public static Target closePopUpButton = Target.the("close pop up button").inIFrame(IFrame.withPath(By.id("localstorage-proxy-ifr-alibabadotcom2"))).locatedBy("a.next-dialog-close");

}

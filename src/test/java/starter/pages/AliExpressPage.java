package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("/wholesale?trafficChannel=main&d=y&CatId=0&SearchText=iphone&ltype=wholesale&SortType=default&page=2")
public class AliExpressPage extends PageObject {

    @FindBy(xpath = "//ul[@class='list-items']//li")
    public static List<WebElementFacade> results;

    public static Target closePopUpButton = Target.the("close pop up button").inIFrame(IFrame.withPath(By.id("localstorage-proxy-ifr-alibabadotcom2"))).locatedBy("a.next-dialog-close");

}

package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage {
    public static final Target BUTTON_JOIN = Target.the("Button to register").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(), 'Join Today')]"));
    public static final  Target INPUT_FIRST_NAME = Target.the("Input write first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Input write last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Input write email").located(By.id("email"));
    public static final  Target SELECT_MONTH = Target.the("Select the month of birth").located(By.cssSelector("select#birthMonth"));
    public static final  Target SELECT_DAY = Target.the("Select the day of birth").located(By.cssSelector("select#birthDay"));
    public static final  Target SELECT_YEAR = Target.the("Select the year of birth").located(By.cssSelector("select#birthYear"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("Button next location").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span[contains(text(), 'Next: Location')]"));
    public static final Target INPUT_CITY = Target.the("Input write city").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Input write postal code").located(By.id("zip"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Button next location").located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Next: Devices')]"));



}

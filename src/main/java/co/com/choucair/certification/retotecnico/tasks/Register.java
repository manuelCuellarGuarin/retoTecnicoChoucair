package co.com.choucair.certification.retotecnico.tasks;

import co.com.choucair.certification.retotecnico.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Register implements Task {

    public static Register onThePage() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.BUTTON_JOIN),
                Enter.theValue("Manuel Alejandro").into(UtestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue("Cuellar Guarin").into(UtestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue("guarinalejandro018@outlook.com").into(UtestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("March").from(UtestRegisterPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText("23").from(UtestRegisterPage.SELECT_DAY),
                SelectFromOptions.byVisibleText("1983").from(UtestRegisterPage.SELECT_YEAR),
                Click.on(UtestRegisterPage.BUTTON_NEXT_LOCATION),
                Enter.theValue("Medellin Medellin,Antioquia").into(UtestRegisterPage.INPUT_CITY),
                Enter.theValue("01233").into(UtestRegisterPage.INPUT_POSTAL_CODE),
                Click.on(UtestRegisterPage.BUTTON_NEXT_DEVICES));


    }
}

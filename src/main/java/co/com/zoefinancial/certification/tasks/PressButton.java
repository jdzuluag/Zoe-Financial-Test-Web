package co.com.zoefinancial.certification.tasks;

import co.com.zoefinancial.certification.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.zoefinancial.certification.userinterfaces.Reschedule.*;

public class PressButton implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitHook.theMilliseconds(3),
                Click.on(BTN),
                WaitHook.theMilliseconds(1)
        );
        actor.attemptsTo(
                WaitHook.theMilliseconds(3),
                Click.on(CONFIRMATION_BTN),
                WaitHook.theMilliseconds(1)
        );
    }

    public static PressButton pressButton(){
        return Tasks.instrumented(PressButton.class);
    }
}

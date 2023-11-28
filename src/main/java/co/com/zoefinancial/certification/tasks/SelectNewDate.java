package co.com.zoefinancial.certification.tasks;

import co.com.zoefinancial.certification.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.zoefinancial.certification.userinterfaces.Reschedule.*;

public class SelectNewDate implements Task {

    private String date;

    public SelectNewDate(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitHook.theMilliseconds(3),
                Click.on(DATE.of(date)),
                WaitHook.theMilliseconds(1)
        );
    }

    public static SelectNewDate selectNewDate(String date){
        return Tasks.instrumented(SelectNewDate.class, date);
    }
}

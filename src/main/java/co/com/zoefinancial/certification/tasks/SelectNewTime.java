package co.com.zoefinancial.certification.tasks;

import co.com.zoefinancial.certification.interactions.WaitHook;
import co.com.zoefinancial.certification.utils.SelectTime;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.zoefinancial.certification.userinterfaces.Reschedule.TIME;

public class SelectNewTime implements Task {

    private int time;

    public SelectNewTime(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitHook.theMilliseconds(1),
                Click.on(TIME.of(String.valueOf(SelectTime.filterTime(time)))),
                WaitHook.theMilliseconds(1)
        );
    }

    public static SelectNewTime selectNewTime(int time){
        return Tasks.instrumented(SelectNewTime.class, time);
    }
}

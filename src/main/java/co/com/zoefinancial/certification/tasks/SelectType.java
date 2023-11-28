package co.com.zoefinancial.certification.tasks;

import co.com.zoefinancial.certification.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.zoefinancial.certification.userinterfaces.Reschedule.TYPE;
public class SelectType implements Task {

    private String type;

    public SelectType(String type) {
        this.type = type;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(type.equals("Video Conference")){
            WaitHook.theMilliseconds(1);
            actor.attemptsTo(
                    Click.on(TYPE.of(type))
            );
        }
    }

    public static SelectType selectType(String type){
        return Tasks.instrumented(SelectType.class, type);
    }
}

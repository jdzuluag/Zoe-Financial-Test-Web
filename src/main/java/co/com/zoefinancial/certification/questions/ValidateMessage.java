package co.com.zoefinancial.certification.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.zoefinancial.certification.userinterfaces.Reschedule.*;
public class ValidateMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MESSAGE.resolveFor(actor).isVisible();
    }
    public static ValidateMessage validateMessage(){
        return new ValidateMessage();
    }
}
package co.com.castor.fyffes.utils;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Wait implements Interaction {
    private final int time;

    public Wait(int time){
        this.time = time;
    }

    public static Performable oneTime(int time) {
        return instrumented(Wait.class, time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(time);
    }
}

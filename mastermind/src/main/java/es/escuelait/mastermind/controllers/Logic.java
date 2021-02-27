package es.escuelait.mastermind.controllers;

import es.escuelait.mastermind.models.Session;
import es.escuelait.mastermind.models.StateValue;
import java.util.Map;


public class Logic {

    private Session session;
    private final Map<StateValue, Controller> controllers;

    public Logic() {
        this.session = new Session();
        this.controllers = Map.of(
                StateValue.INITIAL, new StartController(session),
                StateValue.IN_GAME, new ProposeCombinationController(session),
                StateValue.RESUME, new ResumeController(session),
                StateValue.EXIT, new ExitController(session)
        );
    }

    public Controller getController() {
        return this.controllers.get(this.session.getValueState());
    }

    public boolean isExit() {
        return this.controllers.get(this.session.getValueState()).isNull();
    }

}

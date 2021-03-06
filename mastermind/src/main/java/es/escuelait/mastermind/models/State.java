package es.escuelait.mastermind.models;

import static es.escuelait.mastermind.models.StateValue.EXIT;

public class State {

    private StateValue stateValue;

    public State() {
        this.reset();
    }

    public void reset() {
        this.stateValue = StateValue.INITIAL;
    }

    public void next() {
        this.stateValue = StateValue.values()[this.stateValue.ordinal() + 1];
    }

    public StateValue getValueState() {
        return this.stateValue;
    }
    
    public boolean isExit() {
        return EXIT.equals(this.stateValue);
    }

}

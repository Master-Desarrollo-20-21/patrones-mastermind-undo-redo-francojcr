package es.escuelait.mastermind.controllers;

import es.escuelait.mastermind.models.Session;

public abstract class Controller {

    protected Session session;

    public Controller(Session session) {
        this.session = session;
    }

    public abstract void accept(ControllerVisitor controllerVisitor);
    
    public abstract boolean isNull();

    public void next() {
        this.session.next();
    }


}

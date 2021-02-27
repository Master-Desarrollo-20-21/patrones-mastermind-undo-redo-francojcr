package es.escuelait.mastermind.controllers;

import es.escuelait.mastermind.models.Session;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
    
	@Override
	public boolean isNull() {
		return false;		
	}    

}

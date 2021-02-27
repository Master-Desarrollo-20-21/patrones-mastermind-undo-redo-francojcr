package es.escuelait.mastermind.controllers;

import es.escuelait.mastermind.models.Session;

public class ResumeController extends Controller {

    public ResumeController(Session session) {
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

    public void reset() {
    	session.reset();
    }

    public void finish() {
        this.next();
    }
}

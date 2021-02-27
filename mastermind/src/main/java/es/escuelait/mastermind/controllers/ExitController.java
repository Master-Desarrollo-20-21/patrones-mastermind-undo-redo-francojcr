package es.escuelait.mastermind.controllers;

import es.escuelait.mastermind.models.Session;

public class ExitController extends Controller{

	public ExitController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controllerVisitor) {
	}

	@Override
	public boolean isNull() {
		return true;		
	}

}

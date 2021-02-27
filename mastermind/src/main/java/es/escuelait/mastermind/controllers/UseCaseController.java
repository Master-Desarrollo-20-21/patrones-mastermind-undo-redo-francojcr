package es.escuelait.mastermind.controllers;

import es.escuelait.mastermind.models.Session;

public abstract class UseCaseController {

	protected Session session;

	UseCaseController(Session session) {
		this.session = session;
	}


}

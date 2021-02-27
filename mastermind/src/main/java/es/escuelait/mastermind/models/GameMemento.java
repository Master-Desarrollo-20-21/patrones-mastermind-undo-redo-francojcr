package es.escuelait.mastermind.models;

import java.util.ArrayList;
import java.util.List;

class GameMemento {

	private List<Attempt> playedAttempts;
	private SecretCombination secretCombination;

	GameMemento(List<Attempt> playedAttempts, SecretCombination secretCombination) {
		this.playedAttempts = new ArrayList<Attempt>(playedAttempts);
		this.secretCombination = secretCombination.copy();
	}

	public List<Attempt> getPlayedAttempts() {
		return playedAttempts;
	}
	
	public SecretCombination getSecretCombination() {
		return secretCombination;
	}


}

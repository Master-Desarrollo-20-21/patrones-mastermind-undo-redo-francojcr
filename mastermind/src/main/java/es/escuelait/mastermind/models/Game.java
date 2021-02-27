package es.escuelait.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private SecretCombination secretCombination;
    private List<Attempt> playedAttempts;

    public Game() {
    	reset();
    }
    
    public void reset() {
        this.playedAttempts = new ArrayList<>();
        this.secretCombination = new SecretCombination();
    }    

    public void playCombination(ProposedCombination proposedCombination) {
        playedAttempts.add(new Attempt(proposedCombination, secretCombination));
    }

    public boolean isContinuePlaying() {
        return playedAttempts.size() < 10 && !getcurrentAttempt().isWinner();
    }
    
    private Attempt getcurrentAttempt() {
        return playedAttempts.get(playedAttempts.size()-1);    	
    }

    public boolean isWinnerGame() {
        return getcurrentAttempt().isWinner();
    }

    public int getAttemptsCount() {
        return playedAttempts.size();
    }

    public List<Attempt> getPlayedAttempts() {
        return playedAttempts;
    }

	public GameMemento createMemento() {
		return new GameMemento(playedAttempts,secretCombination);
	}

	public void set(GameMemento gameMemento) {
		this.playedAttempts = gameMemento.getPlayedAttempts();
		this.secretCombination = gameMemento.getSecretCombination();
	}

}

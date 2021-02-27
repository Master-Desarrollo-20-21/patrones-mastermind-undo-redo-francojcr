package es.escuelait.mastermind.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import es.escuelait.mastermind.types.Color;

public class SecretCombination extends Combination {

    public SecretCombination() {
        List<Color> colors = Arrays.asList(Color.values());
        Collections.shuffle(colors);    	
        this.setColors(colors.subList(0, COMBINATION_SIZE));
    }
    
    private SecretCombination(SecretCombination secretCombination) {
		this();
		assert secretCombination != null;
		
		this.setColors(secretCombination.getColors());
    }

    public boolean isEqual(Combination proposedCombination) {
        return this.getColors().equals(proposedCombination.getColors());
    }

    public int getBlacks(Combination proposedCombination) {
        int blacks = 0;
        for (int i = 0; i < this.getColors().size(); i++) {
        	if (proposedCombination.containsColor(colors.get(i),i)) {
                blacks++;
            }
        }
        return blacks;
    }

    public int getWhites(Combination proposedCombination) {
        int whites = 0;
        for (Color color : colors) {
        	if (proposedCombination.containsColor(color)) {
        		whites++;
            }
        }
        whites = whites - getBlacks(proposedCombination);
        		
        return whites;
    }

	public SecretCombination copy() {
		return new SecretCombination(this);
	}

}

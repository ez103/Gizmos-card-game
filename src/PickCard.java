import java.awt.image.BufferedImage;
import java.util.*;

public class PickCard extends Card {
    private ArrayList<String> pickedColors; // if these colors are picked, the player is able to draw an additional random marble

    public PickCard(int cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
        super(cost, costColor, cardVictoryPoints, tier, category, image);
	}

    public PickCard(String s, BufferedImage image) {
		super(s, image);
	}

    public void setPickCard(ArrayList<String> pickedColors) {
        this.pickedColors = pickedColors;
    }

    public void addPickedColor(String color) { 
        pickedColors.add(color);
    }
}

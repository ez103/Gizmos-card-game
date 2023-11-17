import java.awt.image.BufferedImage;
import java.util.*;

public class PickCard extends Card {
    private ArrayList<String> pickedColors;

    public PickCard(i
        super(cost, costColor, cardVictoryPoints, tier, category, image);nt cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
	}

    public PickCard(String s, BufferedImage image) {
		super(s, image);
	}

    public void setPickCard(ArrayList<String> pickedColors) {
        this.pickedColors = pickedColors;
    }
}

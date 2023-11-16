import java.awt.image.BufferedImage;

public class BuildCard extends Card {
	public BuildCard(int cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
		super(cost, costColor, cardVictoryPoints, tier, category, image);
		
	}

	public BuildCard(String s, BufferedImage image) {
		super(s, image);
	}
}

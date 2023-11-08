import java.util.*;
import java.awt.image.*;
import java.awt.*;
//hi eric
public class Card {
	private int cost; // this is the cost to build the card -Eric
	private String costColor; // this is the color of the marble used to build this card 
	private int cardVictoryPoints; // this is the amount VP on top corner of card for scoring at end of game 
	private int tier; // this is the tier of the card. 1, 2, or 3.
	private String category; // the type of gizmo card, can be called "Upgrade", "Converter", "File", "Pick", "Build"
	private BufferedImage image;
	private int x, y; // location of the card. used for convenience when painting and stuff.
	private boolean usedThisRound; // has the card actions been used up already this round??
	
	public Card(int cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
		usedThisRound = false;
		this.cost = cost;
		this.costColor = costColor;
		this.cardVictoryPoints = cardVictoryPoints;
		this.tier = tier;
		this.category = category;
		this.image = image;
		x = 0;
		y = 0;
	}
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void use() {
		usedThisRound = true;;
	}
	
	public void newRound() {
		usedThisRound = false;
	}
	
	public boolean isUsed() {
		return usedThisRound;
	}
	
	public int getCost() {
		return cost;
	}
	public String getCostColor() {
		return costColor;
	}
	public int getCardVictoryPoints() {
		return cardVictoryPoints;
	}
	public int getTier() {
		return tier;
	}
	public String getCategory() {
		return category;
	}
	public BufferedImage getImage() {
		return image;
	}
}

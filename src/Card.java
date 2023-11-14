import java.util.*;
import java.awt.image.*;
import java.awt.*;

public class Card {
	private int cost; // this is the cost to build the card -Eric
	private String costColor; // this is the color of the marble used to build this card 
	private int cardVictoryPoints; // this is the amount VP on top corner of card for scoring at end of game 
	private int tier; // this is the tier of the card. 1, 2, or 3.
	private String category; // the type of gizmo card, can be called "upgrade", "converter", "file", "pick", "build"
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

	public Card(String s, BufferedImage image) {// parameter s must be in this format: [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
		usedThisRound = false;
		x = 0;
		y = 0;
		this.image = image;
		this.cost = Integer.parseInt(s.substring(0, 1));

		char color = s.charAt(1);
		if (color == 'r') {
			this.color = "red";
		}
		else if (color == 'y') {
			this.color = "yellow";
		}
		else if (color == 'u') { // this is blue
			this.color = "blue";
		}
		else { // 'a' - this is black
			this.color = "black";
		}

		this.cardVictoryPoints = Integer.parseInt(s.substring(2, 3));
		this.tier = Integer.parseInt(s.substring(3, 4));

		char category = s.charAt(4);
		if (category == 'b') {
			this.category = "build";
		}
		else if (category == 'c') {
			this.category = "converter";
		}
		else if (category == 'f') {
			this.category = "file";
		}
		else if (category == 'p') {
			this.category = "pick";
		}
		else { // category == 'u'
			this.category = "upgrade";
		}
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

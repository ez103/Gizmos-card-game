import java.awt.image.BufferedImage;
import java.util.*;
//ball
public class BuildCard extends Card {

	private ArrayList<String> builtColors; // an arraylist of all possible colors that just got built that will trigger the action.
	private boolean fromFile; // true if MUST build from file in order to trigger action.
	private int builtTier; // 0 if all of them work. 1, 2, or 3 depending on what the card says. only the specified tier may trigger the action.
	private int playerVictoryPoints; // gives the player victory tokens. different than the cardVictoryPoints which is the in the parent Card class.
	private int chooseMarble; // number of marbles that player may choose IF action is triggered. 0, 1, or 2.
	
	private boolean doSearch; // true if the may search if action is triggered.
	private boolean doFile; // true if may file if action is triggered.
	private boolean doBuild; // true if may build if action is triggered.

	public BuildCard(int cost, String costColor, int cardVictoryPoints, int tier, String category, BufferedImage image) {
		super(cost, costColor, cardVictoryPoints, tier, category, image);
		
	}

	public BuildCard(String s, BufferedImage image) {
		super(s, image);
	}

	public void setBuildCard(ArrayList<String> builtColors, boolean fromFile, int builtTier, int playerVictoryPoints, int chooseMarble, String special) {
		this.builtColors = builtColors;
		this.fromFile = fromFile;
		this.builtTier = builtTier;
		this.playerVictoryPoints = playerVictoryPoints;
		this.chooseMarble = chooseMarble;
		
		this.doSearch = false;
		this.doFile = false;
		this.doBuild = false;
		if (special.equals("search")) { 
			this.doSearch = true;
		}
		else if (special.equals("file")) {
			this.doFile = true;
		}
		else if (special.equals("build")) {
			this.doBuild = true;
		}
	}
	
	public void addBuiltColor(String color) {
		builtColors.add(color);
	}
	
	public int getPlayerVp() {
		return playerVictoryPoints;
	}
}

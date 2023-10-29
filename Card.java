import java.util.*;
import java.awt.image.*;
import java.awt.*;

public class Card {
	private int cost; // this is the cost to build the card -Eric
	private String costColor; // this is the color of the marble used to build this card 
	private int cardVictoryPoints; // this is the amount VP on top corner of card for scoring at end of game 
	private int tier; // this is the tier of the card. 1, 2, or 3.
	private String category; // the type of gizmo card, can be called "Upgrade", "Converter", "File", "Pick", "Build"
	private BufferedImage image;
	private int x, y; // location of the card. used for convenience when painting and stuff.
	private boolean usedThisRound; // has the card actions been used up already this round??
	
	
}

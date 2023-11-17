import java.util.*;

import javax.imageio.ImageIO;

import java.awt.image.*;
import java.io.IOException;
import java.awt.*;

public class Deck {
    public ArrayList<Card> cards; 
    
    // CONVENTIONS: object name the same as file name. put it in order. put space between each object.
    
    // ***** REFER TO THIS WHEN adding card objects! *****
    
    // public void Card(String s, BufferedImage image)
    // parameter s must be in this format
    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
    
    // public void setFileCard(int chooseMarble, int randomMarble, int playerVictoryPoints) {
    
    // public void setBuildCard(ArrayList<String> builtColors, boolean fromFile, 
    //						int builtTier, int playerVictoryPoints, int chooseMarble, String special)
    
    public Deck() {
    	
    	try {
    		FileCard r1p1_1 = new FileCard("1a11f", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_1.png")));
    		r1p1_1.setFileCard(1, 0, 0);
    		cards.add(r1p1_1);
    		
    		FileCard r1p1_2 = new FileCard("1u11f", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_2.png")));
    		r1p1_2.setFileCard(1, 0, 0);
    		cards.add(r1p1_2);
    		
    		FileCard r1p1_3 = new FileCard("1r11f", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_3.png")));
    		r1p1_3.setFileCard(1, 0, 0);
    		cards.add(r1p1_3);
    		
    		FileCard r1p1_4 = new FileCard("1y11f", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_4.png")));
    		r1p1_4.setFileCard(1, 0, 0);
    		cards.add(r1p1_4);
    		
    		BuildCard r1p1_5 = new BuildCard("1a11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_5.png")));
    		r1p1_5.setBuildCard(new ArrayList<String>(), false, 0, 0, 1, "");
    		r1p1_5.addBuiltColor("blue");
    		cards.add(r1p1_5);
    	}
    	catch (Exception E) {
    		System.out.println("image exception CARDS DECK rank 1");
    	}
        
    }
}

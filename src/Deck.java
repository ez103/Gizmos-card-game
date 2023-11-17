import java.util.*;

import javax.imageio.ImageIO;

import java.awt.image.*;
import java.io.IOException;
import java.awt.*;

public class Deck {
    public ArrayList<Card> cards; 
    
    // parameter s must be in this format
    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
    public Deck() {
    	
    	try {
    		Card r1p1_1 = new FileCard("1a11f", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_1.png")));
    		cards.add(r1p1_1);
    		
    		Card r1p1_2 = new FileCard("1u11f", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_2.png")));
    		cards.add(r1p1_2);
    	}
    	catch (Exception E) {
    		System.out.println("image exception CARDS DECK rank 1");
    	}
        
    }
}

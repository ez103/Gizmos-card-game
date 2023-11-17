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

			BuildCard r1p1_6 = new BuildCard("1u11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_6.png")));
			r1p1_6.setBuildCard(new ArrayList<String>(), false, 0, 0, 1, "");
			r1p1_6.addBuiltColor("yellow");
            cards.add(r1p1_6);

			BuildCard r1p1_7 = new BuildCard("1r11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_7.png")));
			r1p1_7.setBuildCard(new ArrayList<String>(),false, 0,0,1,"");
			r1p1_7.addBuiltColor("black");
			cards.add(r1p1_7);

			BuildCard r1p1_8 = new BuildCard("1y11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_8.png")));
            r1p1_8.setBuildCard(new ArrayList<String>(), false,0,0,1,"" );
			r1p1_8.addBuiltColor("red");
            cards.add(r1p1_8);
			
			BuildCard r1p1_9 = new BuildCard("1a11b", ImageIO.read(Deck.class.getResource("cardImages/r1p1_9.png")));
			r1p1_9.setBuildCard(new ArrayList<String>(), false,0,1,0,"");
			r1p1_9.addBuiltColor("red");
			cards.add(r1p1_9);
            

			
            BuildCard r1p1_10 = new BuildCard("1u11b", ImageIO.read(Deck.class.getResource("cardImages/r1p1_10.png")));
            r1p1_10.setBuildCard(new ArrayList<String>(), false, 0, 1, 0, "");
            r1p1_10.addBuiltColor("black");
            cards.add(r1p1_10);


			BuildCard r1p1_11 = new BuildCard("1r11b", ImageIO.read(Deck.class.getResources("cardImages/r1p1_11.png")));
			r1p1_11.setBuildCard(new ArrayList<String>(),false, 0,1,0,"");
			r1p1_11.addBuiltColor("yellow");
			cards.add(r1p1_11);

			BuildCard r1p1_12 = new BuildCard("1y11b", ImageIO.read(Deck.class.getResource("cardImages/r1p1_12.png")));
			r1p1_12.setBuildCard(new ArrayList<String>(),false,0,1,0,"");
			r1p1_12.setBuiltColor("blue");
			cards.add(r1p1_12);

            // public void setPickCard(ArrayList<String> pickedColors)

            // public void Card(String s, BufferedImage image)
    // parameter s must be in this format
    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
    
			PickCard r1p2_1 = new PickCard("1a11p");
            r1p2_1.setPickCard(new ArrayList<>());
            r1p2_1.addPickedColor("blue");

			PickCard r1p2_2 = new PickCard("1u11p", ImageIO.read(Deck.class.getResource("cardImages/r1p2_2.p")));
			r1p2_2.setPickCard(new ArrayList<>());
			r1p2_2.addPickedColor("red");
			
		}
    	catch (Exception E) {
    		System.out.println("image exception CARDS DECK rank 1");
    	}
        
    }
}

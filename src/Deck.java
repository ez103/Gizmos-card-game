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
			
			BuildCard r1p1_9 = new BuildCard("1a11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_9.png")));
			r1p1_9.setBuildCard(new ArrayList<String>(), false,0,1,0,"");
			r1p1_9.addBuiltColor("red");
			cards.add(r1p1_9);
            

			
            BuildCard r1p1_10 = new BuildCard("1u11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_10.png")));
            r1p1_10.setBuildCard(new ArrayList<String>(), false, 0, 1, 0, "");
            r1p1_10.addBuiltColor("black");
            cards.add(r1p1_10);


			BuildCard r1p1_11 = new BuildCard("1r11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_11.png")));
			r1p1_11.setBuildCard(new ArrayList<String>(),false, 0,1,0,"");
			r1p1_11.addBuiltColor("yellow");
			cards.add(r1p1_11);

			BuildCard r1p1_12 = new BuildCard("1y11b", ImageIO.read(Deck.class.getResource("/cardImages/r1p1_12.png")));
			r1p1_12.setBuildCard(new ArrayList<String>(),false,0,1,0,"");
			r1p1_12.addBuiltColor("blue");
			cards.add(r1p1_12);

            // public void setPickCard(ArrayList<String> pickedColors)

            // public void Card(String s, BufferedImage image)
    // parameter s must be in this format
    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
    
			PickCard r1p2_1 = new PickCard("1a11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_1.png")));
            r1p2_1.setPickCard(new ArrayList<>());
            r1p2_1.addPickedColor("blue");
			cards.add(r1p2_1);

			PickCard r1p2_2 = new PickCard("1u11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_2.png")));
			r1p2_2.setPickCard(new ArrayList<>());
			r1p2_2.addPickedColor("red");
			cards.add(r1p2_2);

			PickCard r1p2_3 = new PickCard("1y11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_3.png")));
			r1p2_3.setPickCard(new ArrayList<>());
			r1p2_3.addPickedColor("black");
			cards.add(r1p2_3);
			
			PickCard r1p2_4 = new PickCard("1r11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_4.png")));
			r1p2_4.setPickCard(new ArrayList<>());
			r1p2_4.addPickedColor("blue");
			cards.add(r1p2_4);

			PickCard r1p2_5 = new PickCard("1a11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_5.png")));
			r1p2_5.setPickCard(new ArrayList<>());
			r1p2_5.addPickedColor("yellow");
			cards.add(r1p2_5);
			
			PickCard r1p2_6 = new PickCard("1u11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_6.png")));
			r1p2_6.setPickCard(new ArrayList<>());
			r1p2_6.addPickedColor("black");
			cards.add(r1p2_6);
			
			PickCard r1p2_7 = new PickCard("1y11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_7.png")));
			r1p2_7.setPickCard(new ArrayList<>());
			r1p2_7.addPickedColor("red");
			cards.add(r1p2_7);
			
			PickCard r1p2_8 = new PickCard("1r11p", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_8.png")));
			r1p2_8.setPickCard(new ArrayList<>());
			r1p2_8.addPickedColor("yellow");
			cards.add(r1p2_8);


		}
    	catch (Exception E) {
    		System.out.println("image exception CARDS DECK rank 1 - file, build, pick cards");
    	}
        
    	
    	try {
    		// CONVERTER FORMAT 
    		// type a converter is the "normal" converter; from a given color to another color. performed on 1 or 2 only.
    		// type b converter is the converter where given color of marble can all be doubled.
    		
    		// TYPE A converter : public void setConverterA(String startColor, boolean performOnTwo) 
    		// TYPE B converter : public void setConverterB(String startColor) {
    		
    		// public void Card(String s, BufferedImage image)
    	    // parameter s must be in this format
    	    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
    		
    		ConverterCard r1p2_9 = new ConverterCard("1a11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_9.png")));
    		r1p2_9.setConverterA("yellow", false);
    		cards.add(r1p2_9);
    		
    		ConverterCard r1p2_10 = new ConverterCard("3u31c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_10.png")));
    		r1p2_10.setConverterB("red");
    		cards.add(r1p2_10);

			ConverterCard r1p2_11 = new ConverterCard("1y11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_11.png")));
    		r1p2_11.setConverterA("black", false);
			cards.add(r1p2_11);

			ConverterCard r1p2_12 = new ConverterCard("1r11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_12.png")));
			r1p2_12.setConverterA("blue", false);
			card.add(r1p2_12);

			ConverterCard r1p2_13 = new ConverterCard("1a11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_13.png")));
			r1p2_13.setConverterA("red", false);
    	
			ConverterCard r1p2_14 = new ConverterCard("1u11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_14.png")));
			r1p2_14.setCConverterA("yellow", false);
			cards.add(r1p2_14);

			ConverterCard r1p2_15 = new ConverterCard("1r11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_15.png")));
		}
    	catch (Exception E) {
    		System.out.println("image exception CARDS deck rank 1 - ");
    	}

		try {
			// public void setUpgradeCard(int mLimit, int fLimit, int rLimit, String negator, String discount, String extraVp) {

			// public void Card(String s, BufferedImage image)
    	    // parameter s must be in this format
    	    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
			
			
			
			UpgradeCard r1p3_1 = new UpgradeCard("1a11u",ImageIO.read(Deck.class.getResource("/cardImages/r1p3_1.png")));
			r1p3_1.setUpgradeCard(1,0,1,"","","");
			cards.add(r1p3_1);
			
			UpgradeCard r1p3_2 = new UpgradeCard("1u11u",ImageIO.read(Deck.class.getResource("/cardImages/r1p3_2.png")));
			r1p3_2.setUpgradeCard(1,0,1,"","","");
			cards.add(r1p3_2);

			UpgradeCard	r1p3_3 = new UpgradeCard("1y11u", ImageIO.read(Deck.class.getResource("/cardImages/r1p3_3.png")));
			r1p3_1.setUpgradeCard(1, 0, 1, "", "", "");
			cards.add(r1p3_3);

			UpgradeCard r1p3_4 = new UpgradeCard("1r11u", ImageIO.read(Deck.class.getResource("/cardImages/r1p3_4.png")));
			r1p3_4.setUpgradeCard(1, 1, 0, "", "", "");
			cards.add(r1p3_4);
			
			UpgradeCard r1p3_5 = new UpgradeCard("1a11u",ImageIO.read(Deck.class.getResource("/cardImages/r1p3_5.png")));
			r1p3_5.setUpgradeCard(1,1,0,"","","");
			cards.add(r1p3_5);
			
			UpgradeCard r1p3_6 = new UpgradeCard("1u11u", ImageIO.read(Deck.class.getResource("/cardImages/r1p3_6.png")));
			r1p3_6.setUpgradeCard(1, 1, 0, "", "", "");
			cards.add(r1p3_6);

			UpgradeCard r1p3_7 = new UpgradeCard("1y11u",ImageIO.read(Deck.class.getResource("/cardImages/r1p3_7.png")));
            r1p3_7.setUpgradeCard(1,1, 0,"","","");
            cards.add(r1p3_7);

			UpgradeCard r1p3_8 = new UpgradeCard("1r11u", ImageIO.read(Deck.class.getResource("/cardImages/r1p3_8.png")));
			r1p3_8.setUpgradeCard(1, 0, 1, "", "", "");
			cards.add(r1p3_8);
		}
		catch (Exception E) {
			System.out.padrintln("image exception TIER 1 upgrade Cards");
		}

		try {
			// public void setPickCard(ArrayList<String> pickedColors)

            // public void Card(String s, BufferedImage image)
    		// parameter s must be in this format
   			// : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
			
			
		}
		catch (Exception E) {
			System.out.println("image exception tier 2 -");
		}
    }
}

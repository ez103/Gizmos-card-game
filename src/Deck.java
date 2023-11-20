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
			cards.add(r1p2_12);

			ConverterCard r1p2_13 = new ConverterCard("1a11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_13.png")));
			r1p2_13.setConverterA("red", false);
    	
			ConverterCard r1p2_14 = new ConverterCard("1u11c", ImageIO.read(Deck.class.getResource("/cardImages/r1p2_14.png")));
			r1p2_14.setConverterA("yellow", false);
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
			System.out.println("image exception TIER 1 upgrade Cards");
		}

		try {
			
			
			PickCard r2p1_1 = new PickCard("2a22p",ImageIO.read(Deck.class.getResource("/cardImages/r2p1_1.png")));
			r2p1_1.setPickCard(new ArrayList<>());
			r2p1_1.addPickedColor("yellow");
			r2p1_1.addPickedColor("red");
			cards.add(r2p1_1);
			
			PickCard r2p1_2 = new PickCard("2u22p", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_2.png")));
			r2p1_2.setPickCard(new ArrayList<>());
			r2p1_2.addPickedColor("yellow");
			r2p1_2.addPickedColor("black");
			cards.add(r2p1_2);

			PickCard r2p1_3 = new PickCard("2y22p",ImageIO.read(Deck.class.getResource("/cardImages/r2p1_3.png")));
			r2p1_3.setPickCard(new ArrayList<>());
			r2p1_3.addPickedColor("red");
			r2p1_3.addPickedColor("blue");
			cards.add(r2p1_3);

			PickCard r2p1_4 = new PickCard("2r22p", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_4.png")));
			r2p1_4.setPickCard(new ArrayList<>());
			r2p1_4.addPickedColor("blue");
			r2p1_4.addPickedColor("black");
			cards.add(r2p1_4);


			// public void setUpgradeCard(int mLimit, int fLimit, int rLimit, String negator, String discount, String extraVp) {

			// public void Card(String s, BufferedImage image)
    	    // parameter s must be in this format
    	    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
			
			UpgradeCard r2p1_5 = new UpgradeCard("3a32u", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_5.png")));
			r2p1_5.setUpgradeCard(2, 1, 2, "", "", "");
			cards.add(r2p1_5);
			
			UpgradeCard r2p1_6 = new UpgradeCard("3u32u",ImageIO.read(Deck.class.getResource("/cardImages/r2p1_6.png")));
			r2p1_6.setUpgradeCard(2,1,2,"","","");
			cards.add(r2p1_6);

			UpgradeCard r2p1_7 = new UpgradeCard("3y32u",ImageIO.read(Deck.class.getResource("/cardImages/r2p1_7.png")));
			r2p1_7.setUpgradeCard(2,1,2,"","","");
			cards.add(r2p1_7);

			UpgradeCard r2p1_8 = new UpgradeCard("3r32u", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_8.png")));
			r2p1_8.setUpgradeCard(2, 1, 2, "", "", "");
			cards.add(r2p1_8);
			

				
			// public void setUpgradeCard(int mLimit, int fLimit, int rLimit, String negator, String discount, String extraVp) {

			// public void Card(String s, BufferedImage image)
    	    // parameter s must be in this format
    	    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
		}
		catch (Exception E) {
			System.out.println("image exception tier 2 - pick and upgrade card");
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

			ConverterCard r2p1_9 = new ConverterCard("3a32c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_9.png")));
			r2p1_9.setConverterB("red");
			cards.add(r2p1_9);

			ConverterCard r2p1_10 = new ConverterCard("3y32c",ImageIO.read(Deck.class.getResource("/cardImages/r2p1_10.png")));
			r2p1_10.setConverterB("blue");
			cards.add(r2p1_10);
		
			ConverterCard r2p1_11 = new ConverterCard("3r32c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_11.png")));
			r2p1_11.setConverterB("black");
			cards.add(r2p1_11);

			ConverterCard r2p1_12 = new ConverterCard("2a22c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_12.png")));
			r2p1_12.setConverterA("blue", true);
			cards.add(r2p1_12);

			ConverterCard r2p1_13 = new ConverterCard("2u22c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_13.png")));
			r2p1_13.setConverterA("black", true);
			cards.add(r2p1_13);
			
			ConverterCard r2p1_14 = new ConverterCard("2y22c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_14.png")));
			r2p1_14.setConverterA("red", true);
			cards.add(r2p1_14);
		
			ConverterCard r2p1_15 = new ConverterCard("2r22c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_15.png")));
			r2p1_15.setConverterA("yellow", true);
			cards.add(r2p1_15);
		
			ConverterCard r2p1_16 = new ConverterCard("3a32c",  ImageIO.read(Deck.class.getResource("/cardImages/r2p1_16.png")));
			r2p1_16.setConverterB("yellow");
			cards.add(r2p1_16);
			
			ConverterCard r2p1_17 = new ConverterCard("3u32c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_17.png")));
			r2p1_17.setConverterB("yellow");
			cards.add(r2p1_17);
			
			ConverterCard r2p1_18 = new ConverterCard("3y32c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_18.png")));
			r2p1_18.setConverterB("black");
			cards.add(r2p1_18);
			

			ConverterCard r2p1_19 = new ConverterCard("3r32c", ImageIO.read(Deck.class.getResource("/cardImages/r2p1_19.png")));
			r2p1_19.setConverterB("blue");	
			cards.add(r2p1_19);

		
		}
		
		catch (Exception E) {
			System.out.println("image exception tier 2 - converter ");
		}
		
		try {

			BuildCard r2p2_1 = new BuildCard("3a32b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_1.png")));
			r2p2_1.setBuildCard(new ArrayList<String>(), true, 0, 0, 2, "");
			cards.add(r2p2_1);

			BuildCard r2p2_2 = new BuildCard("3u32b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_2.png")));
			r2p2_2.setBuildCard(new ArrayList<String>(), true, 0, 0, 2, "");
			cards.add(r2p2_2);

			BuildCard r2p2_3 = new BuildCard("3y32b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_3.png")));
			r2p2_3.setBuildCard(new ArrayList<String>(), true, 0, 0, 2, "");
			cards.add(r2p2_3);

			BuildCard r2p2_4 = new BuildCard("3r32b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_4.png")));
			r2p2_4.setBuildCard(new ArrayList<String>(), true, 0, 0, 2, "");
			cards.add(r2p2_4);

			BuildCard r2p2_5 = new BuildCard("2a22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_5.png")));
			r2p2_5.setBuildCard(new ArrayList<String>(), false, 0, 0, 1, "");
			r2p2_5.addBuiltColor("yellow");
			r2p2_5.addBuiltColor("red");
			cards.add(r2p2_5);

			BuildCard r2p2_6 = new BuildCard("2u22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_6.png")));
			r2p2_6.setBuildCard(new ArrayList<String>(), false, 0, 0, 1, "");
			r2p2_6.addBuiltColor("yellow");
			r2p2_6.addBuiltColor("black");
			cards.add(r2p2_6);

			BuildCard r2p2_7 = new BuildCard("2y22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_7.png")));
			r2p2_7.setBuildCard(new ArrayList<String>(), false, 0, 0, 1, "");
			r2p2_7.addBuiltColor("blue");
			r2p2_7.addBuiltColor("black");
			cards.add(r2p2_7);

			BuildCard r2p2_8 = new BuildCard("2r22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_8.png")));
			r2p2_8.setBuildCard(new ArrayList<String>(), false, 0, 0, 1, "");
			r2p2_8.addBuiltColor("blue");
			r2p2_8.addBuiltColor("black");
			cards.add(r2p2_8);

			BuildCard r2p2_9 = new BuildCard("2a22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_9.png")));
			r2p2_9.setBuildCard(new ArrayList<String>(),false,0,0,1,"");
			r2p2_9.addBuiltColor("red");
			r2p2_9.addBuiltColor("blue");
			cards.add(r2p2_9);

				BuildCard r2p2_10 = new BuildCard("2u22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_10.png")));
			r2p2_10.setBuildCard(new ArrayList<String>(),false,0,0,1,"");
			r2p2_9.addBuiltColor("red");
			r2p2_9.addBuiltColor("yellow");
			cards.add(r2p2_10);

			BuildCard r2p2_11 = new BuildCard("2y22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_11.png")));
			r2p2_10.setBuildCard(new ArrayList<String>(),false,0,0,1,"");
			r2p2_9.addBuiltColor("red");
			r2p2_9.addBuiltColor("black");
			cards.add(r2p2_11);

			BuildCard r2p2_12 = new BuildCard("2r22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_12.png")));
			r2p2_12.setBuildCard(new ArrayList<String>(),false,0,0,1,"");
			r2p2_12.addBuiltColor("blue");
			r2p2_12.addBuiltColor("yellow");
			cards.add(r2p2_12);

			BuildCard r2p2_13 = new BuildCard("3a22b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_13.png")));
			r2p2_13.setBuildCard(new ArrayList<String>(),false,0,1,0,"");
			r2p2_13.addBuiltColor("blue");
			r2p2_13.addBuiltColor("yellow");
			cards.add(r2p2_13);

			BuildCard r2p2_14 = new BuildCard("3u32b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_14.png")));
			r2p2_14.setBuildCard(new ArrayList<String>(),false,0,1,0,"");
			r2p2_14.addBuiltColor("black");
			r2p2_14.addBuiltColor("red");
			cards.add(r2p2_14);

			BuildCard r2p2_15 = new BuildCard("3y32b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_15.png")));
			r2p2_15.setBuildCard(new ArrayList<String>(),false,0,1,0,"");
			r2p2_15.addBuiltColor("blue");
			r2p2_15.addBuiltColor("red");
			cards.add(r2p2_15);

				BuildCard r2p2_16 = new BuildCard("3r32b", ImageIO.read(Deck.class.getResource("/cardImages/r2p2_16.png")));
			r2p2_16.setBuildCard(new ArrayList<String>(),false,0,1,0,"");
			r2p2_16.addBuiltColor("yellow");
			r2p2_16.addBuiltColor("black");
			cards.add(r2p2_16);


		}
		catch (Exception E) {
			System.out.println("image exception tier 2 part 2 - build cards");
		}

		try {
			ConverterCard r3p1_1 = new ConverterCard("5a53c", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_1.png")));
			r3p1_1.setConverterB("blue");
			r3p1_1.setColorB("yellow");
			cards.add(r3p1_1);

			ConverterCard r3p1_2 = new ConverterCard("5u53c", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_2.png")));
			r3p1_2.setConverterB("black");
			r3p1_2.setColorB("red");
			cards.add(r3p1_2);

			ConverterCard r3p1_3 = new ConverterCard("4r43c",ImageIO.read(Deck.class.getResource("/cardImages/r3p1_3.png")));
			r3p1_3.setConverterA("",false);
			cards.add(r3p1_3);
			
			ConverterCard r3p1_4 = new ConverterCard("4y43c", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_4.png")));
			r3p1_4.setConverterA("", false);
			cards.add(r3p1_4);
			

			FileCard r3p1_5 = new FileCard("4a43f", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_5.png")));
			r3p1_5.setFileCard(0, 0, 1);
			cards.add(r3p1_5);

			FileCard r3p1_6 = new FileCard("4u43f", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_6.png")));
			r3p1_6.setFileCard(0,3,0);
			cards.add(r3p1_6);

			FileCard r3p1_7 = new FileCard("4r43f",ImageIO.read(Deck.class.getResource("/cardImages/r3p1_7.png")));
			r3p1_7.setFileCard(0,0,1);
			cards.add(r3p1_7);		
			
			FileCard r3p1_8 = new FileCard("5y53f", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_8.png")));
			r3p1_8.setFileCard(0, 0, 2);
			cards.add(r3p1_8);
			
			BuildCard r3p1_9 = new BuildCard("5a53b",ImageIO.read(Deck.class.getResource("/cardImages/r3p1_9.png")));
			r3p1_9.setBuildCard(new ArrayList<String>(), false,0,0,0,"file");
			r3p1_9.addBuiltColor("blue");
			r3p1_9.addBuiltColor("yellow");
			cards.add(r3p1_9);

			BuildCard r3p1_10 = new BuildCard("6u63b", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_10.png")));
			r3p1_10.setBuildCard(new ArrayList<String>(), false, 0, 0, 0, "build");
			r3p1_10.addBuiltColor("yellow");
			r3p1_10.addBuiltColor("red");
			cards.add(r3p1_10);
			
			BuildCard r3p1_11 = new  BuildCard("5r53b",ImageIO.read(Deck.class.getResource("/cardImages/r3p1_11.png")));
			r3p1_11.setBuildCard(new ArrayList<String>(),false,0,2,0,"");
			r3p1_11.addBuiltColor("yellow");
			r3p1_11.addBuiltColor("black");
			cards.add(r3p1_11);

			BuildCard r3p1_12 = new BuildCard("6y63b", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_12.png")));
			r3p1_12.setBuildCard(new ArrayList<String>(), false, 0, 0, 0, "build");
			r3p1_12.addBuiltColor("blue");
			r3p1_12.addBuiltColor("black");
			cards.add(r3p1_12);
			
			BuildCard r3p1_13 = new BuildCard("6a63b", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_13.png")));
			r3p1_13.setBuildCard(new ArrayList<String>(),false,2,0,2,"");
			cards.add(r3p1_13);
			
			BuildCard r3p1_14 = new BuildCard("6r63b", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_14.png")));
			r3p1_14.setBuildCard(new ArrayList<String>(), false, 2, 0, 2, "");
			cards.add(r3p1_14);
			
			Buildcard r3p1_15 = new  BuildCard("7r73b", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_15.png")));
			r3p1_15.setBuildCard(new ArrayList<String>(), false, 0,0,0,"research");
			r3p1_15.addBuiltColor("blue");
			r3p1_15.addBuiltColor("black");
			cards.add(r3p1_15);

			BuildCard r3p1_16 = new BuildCard("5y53b", ImageIO.read(Deck.class.getResource("/cardImages/r3p1_16.png")));
			r3p1_16.setBuildCard(new ArrayList<String>(), false, 0, 0, 0, "file");
			r3p1_16.addBuiltColor("black");
			r3p1_16.addBuiltColor("red");
			cards.add(r3p1_16);
			
			// public void setBuildCard(ArrayList<String> builtColors, boolean fromFile, 
   			//						int builtTier, int playerVictoryPoints, int chooseMarble, String special)
			// For build cards tier 3 - String special is the action that the player may do. search, file, or build.
			
			// public void Card(String s, BufferedImage image)
    		// parameter s must be in this format
    		// : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
    
  			// public void setFileCard(int chooseMarble, int randomMarble, int playerVictoryPoints) {
		}
		catch (Exception E) {
			System.out.println("Tier 3 part 1 image exception- converter, file, build");
		}

		try {

			UpgradeCard r3p2_1 = new UpgradeCard("6a63u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_1.png")));
			r3p2_1.setUpgradeCard(0,0,0,"","research", "");
			cards.add(r3p2_1);

			UpgradeCard r3p2_2 = new UpgradeCard("5u53u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_2.png")));
			r3p2_2.setUpgradeCard(0, 0, 0, "", "file", "");
			cards.add(r3p2_2); 

			UpgradeCard r3p2_3 = new UpgradeCard("6y63u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_3.png")));
			r3p2_2.setUpgradeCard(0, 0, 0, "", "research", "");
			cards.add(r3p2_3);

			UpgradeCard r3p2_4 = new UpgradeCard("5r53u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_4.png")));
			r3p2_4.setUpgradeCard(0,0,0,"","file","");
			cards.add(r3p2_4);
			
			UpgradeCard r3p2_5 = new UpgradeCard("4a83u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_5.png")));
			r3p2_5.setUpgradeCard(0, 0, 0, "research", "", "");
			cards.add(r3p2_5);

			UpgradeCard r3p2_6 = new UpgradeCard("4u73u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_6.png")));
			r3p2_6.setUpgradeCard(0,0,0,"file","","");
			cards.add(r3p2_6);

			UpgradeCard r3p2_7 = new UpgradeCard("4y83u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_7.png")));
			r3p2_7.setUpgradeCard(0,0,0,"research","","");
			cards.add(r3p2_7);
			
			UpgradeCard r3p2_8 = new UpgradeCard("4a83u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_8.png")));
			r3p2_8.setUpgradeCard(0, 0, 0, "file", "", "");
			cards.add(r3p2_8);
			
			UpgradeCard r3p2_9 = new UpgradeCard("4a43u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_9.png")));
			r3p2_9.setUpgradeCard(4,0,0,"","","");
			cards.add(r3p2_9);
			
			UpgradeCard r3p2_10 = new UpgradeCard("4u43u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_10.png")));
			r3p2_10.setUpgradeCard(4, 0, 0, "", "", "");
			cards.add(r3p2_10);

			UpgradeCard r3p2_11 = new UpgradeCard("5y53u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_11.png")));
			r3p2_11.setUpgradeCard(0,0,0,"","two","");
			cards.add(r3p2_11);
			
			UpgradeCard r3p2_12 = new UpgradeCard("5u53u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_12.png")));
			r3p2_12.setUpgradeCard(0, 0, 0, "", "two", "");
			cards.add(r3p2_12);
			
			UpgradeCard r3p2_13 = new UpgradeCard("7x03u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_13.png")));
			r3p2_13.setUpgradeCard(0, 0, 0, "", "", "token")
			cards.add(r3p2_13);

			UpgradeCard r3p2_14 = new UpgradeCard("7x03u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_14.png")));
			r3p2_14.setUpgradeCard(0, 0, 0, "", "", "energy");
			cards.add(r3p2_14);

			UpgradeCard r3p2_15 = new UpgradeCard("7x03u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_15.png")));
			r3p2_15.setUpgradeCard(0, 0, 0, "", "", "token");
			cards.add(r3p2_15);

			UpgradeCard r3p2_16 = new UpgradeCard("7x03u", ImageIO.read(Deck.class.getResource("/cardImages/r3p2_16.png")));
			r3p2_16.setUpgradeCard(0, 0, 0, "", "", "energy");
			cards.add(r3p2_16);
			
			// public void setUpgradeCard(int mLimit, int fLimit, int rLimit, String negator, String discount, String extraVp) {
				// String discount: two, file, research
				// String negator: research, file
				// String extraVp: energy, token

			// public void Card(String s, BufferedImage image)
    	    // parameter s must be in this format
    	    // : [cost][lowercase first letter of color][cardVP][tier][category: lowercase first letter]
		}
		catch (Exception E) {
			System.out.println("Tier 3 part 2 image exception");
		}
    }
}

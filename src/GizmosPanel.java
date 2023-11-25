import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.Window;

import java.io.*;
import java.util.*;
import java.util.List;

public class GizmosPanel extends JPanel implements MouseListener {
	private Player[] players;
	private int turn; // 1, 2, 3, or 4.
	
	private boolean startScreen = true;
	
	private BufferedImage startBg, startButton, brownBelt, greyBelt;
	private BufferedImage energyRing, yellowMarble, redMarble, blueMarble, blackMarble, chest;
	private BufferedImage tier3Cover, tier2Cover, tier1Cover, blank, archiveButton, researchButton, background;
	
	private HashMap<Integer, ArrayList<Card>> board;
	
    public GizmosPanel() throws IOException {
    	try {
        	startBg = ImageIO.read(GizmosPanel.class.getResource("/images/iangizmo.png"));
        	
        	startButton = ImageIO.read(GizmosPanel.class.getResource("/images/butten.png"));
			//break
			brownBelt = ImageIO.read(GizmosPanel.class.getResource("/images/tool1.png")); // for player who has their turn
			greyBelt = ImageIO.read(GizmosPanel.class.getResource("/images/tool2.png")); // for the other 3 players
			
			energyRing = ImageIO.read(GizmosPanel.class.getResource("/images/energ.png"));
			redMarble = ImageIO.read(GizmosPanel.class.getResource("/images/redMarble.png"));
			blueMarble = ImageIO.read(GizmosPanel.class.getResource("/images/blueMarble.jpg"));
			blackMarble = ImageIO.read(GizmosPanel.class.getResource("/images/blackMarble.png"));
			yellowMarble = ImageIO.read(GizmosPanel.class.getResource("/images/yellowMarble.png"));
			
			chest = ImageIO.read(GizmosPanel.class.getResource("/images/chest.jpg"));
			tier3Cover = ImageIO.read(GizmosPanel.class.getResource("/images/purp.png"));
			tier2Cover = ImageIO.read(GizmosPanel.class.getResource("/images/lvl2.png"));
			tier1Cover = ImageIO.read(GizmosPanel.class.getResource("/images/org.png"));
			blank = ImageIO.read(GizmosPanel.class.getResource("/images/blank.png"));
			//archiveButton = ImageIO.read(GizmosPanel.class.getResource("/images/arch.png"));
			//researchButton = ImageIO.read(GizmosPanel.class.getResource("/images/research.png"));
			background = ImageIO.read(GizmosPanel.class.getResource("/images/back.jpg"));

    	}
    	catch (Exception E){
        	System.err.println("erre");
        	return; 
    	}
    	
    	Deck d = new Deck();
    	board = new HashMap<>();
    	for (Card c : d.cards) {
    		if (c.getTier() == 1) {
    			if (board.get(1) == null) {
    				board.put(1, new ArrayList<>());
    			}
    			board.get(1).add(c);
    		}
    		else if (c.getTier() == 2) {
    			if (board.get(2) == null) {
    				board.put(2, new ArrayList<>());
    			}
    			board.get(2).add(c);
    		}
    		else if (c.getTier() == 3) {
    			if (board.get(3) == null) {
    				board.put(3, new ArrayList<>());
    			}
    			board.get(3).add(c);
    		}
    	}
    	shuffle(board.get(1), 0, board.get(1).size());
    	
    	
		addMouseListener(this);


	}
	
	public void paint(Graphics g) {
		if (startScreen) {
			g.drawImage(startBg, 0, 0, 1900, 1000, null);

			g.drawImage(startButton, 1550, 630, 350, 350, null);
		}
		if(!startScreen){
			g.setFont(new Font("Dialog", Font.BOLD, 20));
			
			g.drawImage(background, 0, 0,1900,1000,null);
			g.drawImage(chest, 750, 20,120,120,null);
			g.drawImage(yellowMarble, 880, 20,50,50,null);
			g.drawImage(blueMarble, 940, 20,50,50,null);
			g.drawImage(blackMarble, 1000, 20,50,50,null);
			g.drawImage(yellowMarble, 880, 80,50,50,null);
			g.drawImage(blueMarble, 940, 80,50,50,null);
			g.drawImage(blackMarble, 1000, 80,50,50,null);
			
			g.drawImage(tier3Cover, 10, 10,130,130,null);
			g.drawImage(blank, 160, 10,130,130,null);
			g.drawImage(blank, 300, 10,130,130,null);

			g.drawImage(tier2Cover, 10, 150,130,130,null);
			g.drawImage(blank, 160, 150,130,130,null);
			g.drawImage(blank, 300, 150,130,130,null);
			g.drawImage(blank, 440, 150,130,130,null);
			
			g.drawImage(tier1Cover, 10, 290,130,130,null);
			g.drawImage(board.get(1).get(0).getImage(), 160, 290,130,130,null);
			g.drawImage(board.get(1).get(1).getImage(), 300, 290,130,130,null);
			g.drawImage(board.get(1).get(2).getImage(), 440, 290,130,130,null);
			g.drawImage(board.get(1).get(3).getImage(), 580, 290,130,130,null);
			
			g.drawImage(brownBelt, 10, 460, 850,100,null);
			g.drawImage(energyRing, 870, 400,175,175,null);
			g.drawString("Name 1",10,440);
			
			g.drawImage(archiveButton, 580, 150,100,60,null);
			g.drawImage(researchButton, 580, 220,100,60,null);
			
			g.drawString("Name 2(Marble Info)",1075,30);
			g.drawImage(greyBelt, 1075, 40, 800,80,null);

			g.drawString("Name 3(Marble Info)",1075,315);
			g.drawImage(greyBelt, 1075, 335, 800,80,null);
			
			g.drawString("Name 4(Marble Info)",1075,615);
			g.drawImage(greyBelt, 1075, 640, 800,80,null);
		}
		System.out.println("yess");

	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getX() > 1550 && e.getX() < 1900 && e.getY() > 630 && e.getY() < 980) {
			startScreen = false;
			System.out.println("yes");
		}
		repaint();
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static <T> void shuffle(ArrayList<T> list, int startIndex, int endIndex) {
        List<T> sublist = list.subList(startIndex, endIndex); 
        Collections.shuffle(sublist, new Random());
        for (int i = startIndex, j = 0; i < endIndex; i++, j++) {
            list.set(i, sublist.get(j));
        }
    }
}



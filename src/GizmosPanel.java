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
	private int restier;// for research tier -dev

	private boolean startScreen = true;
	
	private BufferedImage startBg, startButton, brownBelt, greyBelt;
	private BufferedImage energyRing, yellowMarble, redMarble, blueMarble, blackMarble, chest;
	private BufferedImage tier3Cover, tier2Cover, tier1Cover, blank, archiveButton, researchButton, background;
	
	private HashMap<Integer, ArrayList<Card>> board;
	
	private ArrayList<Marble> marbles;
	
	private int state = 1; // gamestate values are detailed in the google doc
	
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
    	shuffle(board.get(2), 0, board.get(2).size());
    	shuffle(board.get(3), 0, board.get(3).size());
    	
    	
    	marbles = new ArrayList<>();
    	for (int i = 0; i < 13; i++) {
    		marbles.add(new Marble("red"));
    		marbles.add(new Marble("yellow"));
    		marbles.add(new Marble("blue"));
    		marbles.add(new Marble("black"));
    	}
    	shuffle(marbles, 0, marbles.size());
    	
    	
    	players = new Player[5];
    	players[1] = new Player(1);
    	players[2] = new Player(2);
    	players[3] = new Player(3);
    	players[4] = new Player(4);
    	
    	
		addMouseListener(this);
		
		turn = 1;

	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		if (startScreen) {
			g.drawImage(startBg, 0, 0, 1900, 1000, null);

			g.drawImage(startButton, 1550, 630, 350, 350, null);
		}
		if(!startScreen){
			
			g.drawImage(background, 0, 0,1900,1000,null);
			
			g.drawImage(chest, 650, 15,120,90,null);
			g.drawImage(marbles.get(5).getImage(), 780, 35,40,40,null);
			marbles.get(5).setLocation(780, 35);
			g.drawImage(marbles.get(4).getImage(), 825, 35,40,40,null);
			marbles.get(4).setLocation(825, 35);
			g.drawImage(marbles.get(3).getImage(), 870, 35,40,40,null);
			marbles.get(3).setLocation(870, 35);
			g.drawImage(marbles.get(2).getImage(), 915, 35,40,40,null);
			marbles.get(2).setLocation(915, 35);
			g.drawImage(marbles.get(1).getImage(), 960, 35,40,40,null);
			marbles.get(1).setLocation(960, 35);
			g.drawImage(marbles.get(0).getImage(), 1005, 35,40,40,null);
			marbles.get(0).setLocation(1005, 35);
			
			g.drawImage(tier3Cover, 10, 10,130,130,null);
			g.drawImage(board.get(3).get(0).getImage(), 160, 10,130,130,null);
			g.drawImage(board.get(3).get(1).getImage(), 300, 10,130,130,null);

			g.drawImage(tier2Cover, 10, 150,130,130,null);
			g.drawImage(board.get(2).get(0).getImage(), 160, 150,130,130,null);
			g.drawImage(board.get(2).get(1).getImage(), 300, 150,130,130,null);
			g.drawImage(board.get(2).get(2).getImage(), 440, 150,130,130,null);
			
			g.drawImage(tier1Cover, 10, 290,130,130,null);
			g.drawImage(board.get(1).get(0).getImage(), 160, 290,130,130,null);
			g.drawImage(board.get(1).get(1).getImage(), 300, 290,130,130,null);
			g.drawImage(board.get(1).get(2).getImage(), 440, 290,130,130,null);
			g.drawImage(board.get(1).get(3).getImage(), 580, 290,130,130,null);
			
			g.setFont(new Font("Dialog", Font.BOLD, 20));

			g.drawImage(brownBelt, 10, 460, 850,100,null);
			g.drawImage(energyRing, 870, 400,175,175,null);
			g.drawString("Player " + turn + ": ",10,440);
			
			g.drawImage(archiveButton, 580, 150,100,60,null);
			g.drawImage(researchButton, 580, 220,100,60,null);
			

			if (turn%4 == 3) {
				g.drawString("Player " + 4 + ": " ,1075,25);
			}
			else {
				g.drawString("Player " + ((turn+1)%4) + ": " ,1075,25);
			}
			g.drawImage(greyBelt, 1075, 40, 800,80,null);
			
			if (turn%4 == 2) {
				g.drawString("Player " + 4 + ": " ,1075,325);
			}
			else {
				g.drawString("Player " + ((turn+2)%4) + ": " ,1075,325);
			}
			g.drawImage(greyBelt, 1075, 340, 800,80,null);
			
			if (turn%4 == 1) {
				g.drawString("Player " + 4 + ": " ,1075,625);
			}
			else {
				g.drawString("Player " + ((turn+3)%4) + ": " ,1075,625);
			}
			g.drawImage(greyBelt, 1075, 640, 800,80,null);
			
			// state = 1 buttons for the player to click
			if (state == 1) {
				g.setColor(Color.blue);
				g.fillOval(762, 420, 90, 49);
				g.fillOval(641, 420, 90, 49);
				g.fillOval(500, 420, 90, 49);
				g.fillOval(348, 420, 90, 49);
				
				g.setColor(Color.white);
				g.drawString("Click", 782, 450);
				g.drawString("Click", 661, 450);
				g.drawString("Click", 520, 450);
				g.drawString("Click", 368, 450);
				
			}
		}

if (state == 69){
				 g.setColor(Color.GRAY);
				g.fillRect(1400,600,500,400);
				for(int i = 0;i<players[turn].getResearchLimit();i++){
					
				}
		}
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {		
		int x = e.getX();
		int y = e.getY();
		
		if (e.getX() > 1550 && e.getX() < 1900 && e.getY() > 630 && e.getY() < 980) { // startButton pressed
			startScreen = false;
			System.out.println("yes");
		}
		repaint();
		
		if (state == 1) { // start of turn. player chooses which of the 4 actions to do
			if (x >= 348 && x <= 438 && y >= 420 && y <= 469) { // file button
				state = 10;
			}
			else if (x >= 500 && x <= 590 && y >= 420 && y <= 469) { // pick button
				state = 21;
			}
			else if (x >= 641 && x <= 731 && y >= 420 && y <= 469) { // build button
				state = 11;
			}
			else if (x >= 762 && x <= 852 && y >= 420 && y <= 469) { // research button
				state = 69;
			}
		}
		
		if (state == 10) {
			if 
		}

		



		//research
		

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



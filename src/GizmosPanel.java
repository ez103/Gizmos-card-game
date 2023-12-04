import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.awt.Window;
import java.util.Collections;


import java.io.*;
import java.util.*;
import java.util.List;


 // suck my ass
public class GizmosPanel extends JPanel implements MouseListener {
	private Player[] players;
	private int turn; // 1, 2, 3, or 4.
	
	private String message = ""; // this will be displayed to help user know what to do.
	
	private int restier;// for research tier -dev
	private int clickCar; //research purposes
	private Card chosen; // chosen card to file or build in the RESEARCH options
	
	private Card cardToBuild; // try to build this card.
	private int toBuildTier;
	private int toBuildIndex;
	
	private boolean startScreen = true;
	private ArrayList<Card> tempcard;
	
	private int numRandom = 0; // number of random marbles that can be drawn

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
    	shorten16(board.get(3));
    	
    	
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
    	
    	tempcard = new ArrayList<>();
    	
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
			if(checkT()){
			g.drawImage(background, 0, 0,1900,1000,null);

			
			
			//for (players.turn[].getCards().get(""))


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


			g.drawImage(tier3Cover, 10, 10,130,130,null); // drawing the cards on the board
			g.drawImage(board.get(3).get(0).getImage(), 160, 10,130,130,null);
			board.get(3).get(0).setLocation(160, 10);
			g.drawImage(board.get(3).get(1).getImage(), 300, 10,130,130,null);
			board.get(3).get(1).setLocation(300, 10);

			g.drawImage(tier2Cover, 10, 150,130,130,null);
			g.drawImage(board.get(2).get(0).getImage(), 160, 150,130,130,null);
			board.get(2).get(0).setLocation(160, 150);
			g.drawImage(board.get(2).get(1).getImage(), 300, 150,130,130,null);
			board.get(2).get(1).setLocation(300, 150);
			g.drawImage(board.get(2).get(2).getImage(), 440, 150,130,130,null);
			board.get(2).get(2).setLocation(440, 150);

			g.drawImage(tier1Cover, 10, 290,130,130,null);
			g.drawImage(board.get(1).get(0).getImage(), 160, 290,130,130,null);
			board.get(1).get(0).setLocation(160, 290);
			g.drawImage(board.get(1).get(1).getImage(), 300, 290,130,130,null);
			board.get(1).get(1).setLocation(300, 290);
			g.drawImage(board.get(1).get(2).getImage(), 440, 290,130,130,null);
			board.get(1).get(2).setLocation(440, 290);
			g.drawImage(board.get(1).get(3).getImage(), 580, 290,130,130,null);
			board.get(1).get(3).setLocation(580, 290);

			g.setFont(new Font("Dialog", Font.BOLD, 20));


			if (turn == 1) { // IF current player is PLAYER 1
				g.drawImage(brownBelt, 10, 460, 850,100,null);
			}
			else { // IF current is not PLAYER
				g.drawImage(greyBelt, 10, 460, 850,100,null);
			}
			g.drawImage(energyRing, 870, 400,175,175,null);
			int joe = 1;
			g.drawString("Player " + turn + ":     " + "Bonus Victory Point Tokens: " + players[turn].getPlayerVp(),10,440); // Current player. CARDS
			for (Card c : players[turn].getCards().get("upgrade")) {
				g.drawImage(c.getImage(), 20, joe * 35 + 535, 130, 130, null);
				joe++;
			}
			joe = 1;
			g.drawString("Player " + turn + ": ",10,440); // Current player.
			for (Card c : players[turn].getCards().get("converter")) {
				g.drawImage(c.getImage(), 175, joe * 35 + 535, 130, 130, null);
				joe++;
			}
			joe = 1;
			g.drawString("Player " + turn + ": ",10,440); // Current player.
			for (Card c : players[turn].getCards().get("file")) {
				g.drawImage(c.getImage(), 330, joe * 35 + 535, 130, 130, null);
				joe++;
			}
			joe = 1;
			g.drawString("Player " + turn + ": ",10,440); // Current player.
			for (Card c : players[turn].getCards().get("pick")) {
				g.drawImage(c.getImage(), 485, joe * 35 + 535, 130, 130, null);
				joe++;
			}
			joe = 1;
			g.drawString("Player " + turn + ": ",10,440); // Current player.
			for (Card c : players[turn].getCards().get("build")) {
				g.drawImage(c.getImage(), 640, joe * 35 + 535, 130, 130, null);
				joe++;
			}

			// draw the archived cards of a player
			g.setFont(new Font("Cambria", Font.BOLD, 27));
			g.drawString("Cards in Archive: ", 760, 600);
			int eric = 0;
			for (Card c : players[turn].getArchive()) {
				g.drawImage(c.getImage(), 790 + (eric/3)*100, 610 + 110 * (eric%3), 100, 100, null);
				c.setLocation(790 + (eric/3)*100, 610 + 110 * (eric%3));
				eric++;
			}

			g.setFont(new Font("Dialog", Font.BOLD, 20));

			int turn2 = 0; // the player whos turn is direcly after; one turn away
			if (turn%4 == 3) {
				g.drawString("Player " + 4 + ": " ,1075,25);
				turn2 = 4;
			}
			else {
				g.drawString("Player " + ((turn+1)%4) + ": " ,1075,25);
				turn2 = ((turn+1)%4);
			}
			if (turn2 == 1) {
				g.drawImage(brownBelt, 1075, 40, 800,80,null);
			}
			else {
				g.drawImage(greyBelt, 1075, 40, 800,80,null);
			}

			int turn3 = 0; // two turns away
			if (turn%4 == 2) {
				g.drawString("Player " + 4 + ": " ,1075,325);
				turn3 = 4;
			}
			else {
				g.drawString("Player " + ((turn+2)%4) + ": " ,1075,325);
				turn3 = (turn+2)%4;
			}
			if (turn3 == 1) {
				g.drawImage(brownBelt, 1075, 340, 800,80,null);
			}
			else {
				g.drawImage(greyBelt, 1075, 340, 800,80,null);
			}

			int turn4 = 0; // three turns away
			if (turn%4 == 1) {
				g.drawString("Player " + 4 + ": " ,1075,625);
				turn4 = 4;
			}
			else {
				g.drawString("Player " + ((turn+3)%4) + ": " ,1075,625);
				turn4 = (turn+3)%4;
			}
			if (turn4 == 1) {
				g.drawImage(brownBelt, 1075, 640, 800,80,null);
			}
			else {
				g.drawImage(greyBelt, 1075, 640, 800,80,null);
			}




			// DRAW current players MARBLEs in their ENGERY RING in a 4x4 square
			for (int i = 0; i < 3; i++) { // DRAWING CARDS OF THE OTHER 3 PLAYERS. very rough right now, need to change later
				Player boobies;
				if (i == 0) {
					boobies = players[turn2];
				}
				else if (i == 1) {
					boobies = players[turn3];
				}
				else {
					boobies = players[turn4];
				}

				g.drawString("Player " + turn + ": ",10,440); // side player
				int len = 1;
				for (Card c : boobies.getCards().get("upgrade")) {
					g.drawImage(c.getImage(), 1100, len*25 + 95 + 300 * i, 100, 100, null);
					len++;
				}
				len = 1;
				g.drawString("Player " + turn + ": ",10,440); // side player.
				for (Card c : boobies.getCards().get("converter")) {
					g.drawImage(c.getImage(), 1240, len*25 + 95 + 300 * i, 100, 100, null);
					len++;
				}
				len = 1;
				g.drawString("Player " + turn + ": ",10,440); // side player.
				for (Card c : boobies.getCards().get("file")) {
					g.drawImage(c.getImage(), 1380, len*25 + 95 + 300 * i, 100, 100, null);
					len++;
				}
				len = 1;
				g.drawString("Player " + turn + ": ",10,440); // side player.
				for (Card c : boobies.getCards().get("pick")) {
					g.drawImage(c.getImage(), 1520, len*25 + 95 + 300 * i, 100, 100, null);
					len++;
				}
				len = 1;
				g.drawString("Player " + turn + ": ",10,440); // side player.
				for (Card c : boobies.getCards().get("build")) {
					g.drawImage(c.getImage(), 1660, len*25 + 95 + 300 * i, 100, 100, null);
					len++;
				}
			}
			
			
			// drawing a running LEADERBOARD
			g.setColor(new Color(50, 205, 50));
			g.fillRect(850,  100,  190, 290);
			g.setColor(Color.black);
			
			g.setFont(new Font("Cambria", Font.BOLD, 21));
			g.drawString("LEADERBOARD", 865, 135);
			
			g.setFont(new Font("Cambria", Font.PLAIN, 21));
			g.drawString("Player 1:           " + players[1].getTotalVictoryPoints(), 860, 180);
			g.drawString("Player 2:           " + players[2].getTotalVictoryPoints(), 860, 240);
			g.drawString("Player 3:           " + players[3].getTotalVictoryPoints(), 860, 300);
			g.drawString("Player 4:           " + players[4].getTotalVictoryPoints(), 860, 360);
			
			
			g.setFont(new Font("Dialog", Font.BOLD, 20));
			// state = 1 buttons for the player to click
			if (state == 1) {
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Click on a blue button", 20, 935);
				
				g.setFont(new Font("Dialog", Font.BOLD, 20));
				g.setColor(Color.blue);
				g.fillOval(641, 420, 90, 49);//build
				g.fillOval(762, 420, 90, 49);//res
				g.fillOval(500, 420, 90, 49);//pick
				g.fillOval(348, 420, 90, 49);//file

				g.setColor(Color.white);
				g.drawString("Click", 782, 450);
				g.drawString("Click", 661, 450);
				g.drawString("Click", 520, 450);
				g.drawString("Click", 368, 450);

			}
			else if (state == 21) {
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Pick 1 marble from the 6 shown marbles", 20, 935);
			}
			else if(state==10){
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Click on a blue button", 20, 935);
				
				//draw two choices
				g.setFont(new Font("Dialog", Font.BOLD, 20));
				g.setColor(Color.blue);
				g.fillOval(780, 300, 120, 49); // from board
				g.fillOval(915, 300, 120, 49); // from archive
				g.setColor(Color.white);
				g.drawString("From Board", 790, 330);
				g.drawString("From Archive", 910, 330);

			}
			else if (state == 11) {
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Select a card from the board to archive", 20, 935);
			}
			
			
			else if (state == 40) {
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Select a card from the board to build", 20, 935);
			}
			else if (state == 41) {
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Select a card from archive to build", 20, 935);
			}
			
			else if (state == 69){ // RESEARCH panel pops up
				
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Select a card from the research row", 20, 935);
				
				g.setColor(Color.GRAY);
				g.fillRect(800,850,1100,150);
				tempcard = board.get(restier);

				int ind = 5 - restier; //  index of card arraylist that player sees
				for (int i = 0; i<players[turn].getResearchLimit(); i++){
					Card resc = tempcard.get(ind);
					int u = i * 100 + 800;
					g.drawImage(resc.getImage(),u,845,100,120,null);
					ind++;
				}
				state = 73;
			}
			else if(state ==74){ // these buttons, the player uses to choose to build or file after research.
				g.setColor(Color.black);
				g.setFont(new Font("Dialog", Font.BOLD, 23));
				g.drawString("Click on a blue button", 20, 935);
				
				g.setFont(new Font("Dialog", Font.BOLD, 20));
				g.setColor(Color.blue);
				g.fillOval(641, 420, 90, 49);//build
				g.fillOval(348, 420, 90, 49);//file
				g.setColor(Color.white);
				g.drawString("Click", 659, 450);
				g.drawString("Click", 366, 450);
			}
			

			int ind = 0;
			for (Marble m : players[turn].getMarbles()) {
				g.drawImage(m.getImage(), 898 + 27 * (ind%4), 425 + 27 * (ind/4), 25, 25, null);
				ind++;
			}
			

		}
			else{
				ArrayList<score> win = getWinner();
				int p1 = win.get(0).gN();
				int p2 = win.get(1).gN();
				int p3 = win.get(2).gN();
				int p4 = win.get(3).gN();
				g.setColor(Color.BLACK);
				g.setFont(new Font("Dialog", Font.BOLD, 20));

				g.drawString("Winner : player "+p1,200,200);
				g.drawString("2nd : player "+p2,200,300);
				g.drawString("3rd : player "+p3,200,400);
				g.drawString("4th : player "+p4,200,500);



			}
		}

	}
	public ArrayList<score> getWinner(){
		ArrayList<Integer> tell = new ArrayList<Integer>();
		int p1s = players[1].Vpoints();
		int p2s = players[2].Vpoints();
		int p3s = players[3].Vpoints();
		int p4s = players[4].Vpoints();
		score p1 = new score(1,p1s);
		score p2 = new score(1,p2s);
		score p3 = new score(1,p3s);
		score p4 = new score(1,p4s);

		tell.add(p1s);
		tell.add(p2s);
		tell.add(p3s);
		tell.add(p4s);
		ArrayList<score> scoreList = new ArrayList<>();
		scoreList.add(p1);
		scoreList.add(p2);
		scoreList.add(p3);
		scoreList.add(p4);
		return scoreList;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {		
		int x = e.getX();
		int y = e.getY();
		
		if (startScreen && e.getX() > 1550 && e.getX() < 1900 && e.getY() > 630 && e.getY() < 980) { // startButton pressed
			startScreen = false;
			System.out.println("yes");
		}
		
		else if (state == 1) { // start of turn. player chooses which of the 4 actions to do
			
			if (x >= 348 && x <= 438 && y >= 420 && y <= 469) { // file button
				state = 11;
			}
			else if (x >= 500 && x <= 590 && y >= 420 && y <= 469) { // pick button
				state = 21;
			}
			else if (x >= 641 && x <= 731 && y >= 420 && y <= 469) { // build button
				state = 10;
			}
			else if (x >= 762 && x <= 852 && y >= 420 && y <= 469) { // research button
				state = 72;
			}
		}
//		else if (state ==40){
//			//choose to build from board or arhive
////			g.fillOval(780, 300, 120, 49);
////			g.fillOval(915, 300, 120, 49);
//			if(x>780&&x<900&&y>300&&y<350){
//				state =11;
//			}
//			else if(x>915&&x<930&&y>300&&y<250){
//				if(players[turn].getArchive().size()>0){
//					state =101;
//				}
//			}
//		}
		// g.drawImage(tier3Cover, 10, 10,130,130,null); // drawing the cards on the board

		// 				g.drawImage(tier2Cover, 10, 150,130,130,null);

		// 	g.drawImage(tier1Cover, 10, 290,130,130,null);

		else if(state==70){ // player click on card, puts back into back of arraylist
			chosen =tempcard.get(5 - restier + clickCar); // need to check this if there is a bug

			tempcard.remove(5 - restier + clickCar);
			List<Card> Rem = tempcard.subList(0, players[turn].getResearchLimit());
			tempcard.addAll(Rem);
			for(int i=5 - restier; i<players[turn].getResearchLimit()-1; i++){
				tempcard.remove(0);
			}
			board.put(restier,tempcard);
			state = 74;

		}
		
		else if(state==72){ // state=72 means player clicks on one of the tiers to choose which tier to research
			if(x>10&&x<140&&y>290&&y<420){
				restier =1;
				state=69;
			}
			else if(x>10&&x<140&&y>150&&y<280){
				restier =2;
				state=69;

			}
			else if(x>10&&x<140&&y>10&&y<140){
				restier =3;
				state=69;

			}
		
		}
		else if(state ==73&&y>850&&y<1000){
			for (int i = 0; i<players[turn].getResearchLimit(); i++){
				int erm =i * 100 + 800;
				if(x> erm&&x<erm+100){
					clickCar=i;
				}
			}
			state =70;
		}
		
		else if(state ==74){

			if(x>641&&x<730&&y>420&&y<470){
				state = 75;
				//fuck bitch then build
			}
			else if(x>348&&x<440&&y>420&&y<470){
				state = 76;
			}
		}
		
		else if (state ==75){
			cardToBuild = chosen; // these 3 PIVs are reset efvery time state = 40
			toBuildTier = chosen.getTier();
			toBuildIndex = clickCar;

			if (pay()) {
				state = 1;
				turn++;
				if (turn == 5) {
					turn = 1;
				}
			}
			else {
				state = 1;
			}

			cardToBuild = null;
			toBuildTier = -1;
			toBuildIndex = -1;
		}
		
		else if(state==76){
//			if(players[turn].archiveCard(chosen)){
//				players[turn].addCard(chosen);
//			} don't need this, addCard adds to belt. archiveCard adds to the player archive when it is called.
			
			boolean success = players[turn].archiveCard(chosen);
			if (success) { // added to archive successfully. Now we can go to the next player.
				turn++;
				if (turn == 5) {
					turn = 1;
				}
				state = 1;
			}
			else { // OVER FILE LIMIT. maybe add an error message later.
				state = 1; // player must choose a card again, then choose whether to
			}
		}
		
		else if (state == 21) {
			if (players[turn].getMarbles().size() < players[turn].getMarbleLimit()) {
				for (int i = 0; i < 6; i++) {
					if (x >= marbles.get(i).getX() && x <= marbles.get(i).getX() + 40 && y >= marbles.get(i).getY() && y <= marbles.get(i).getY() + 40) {
						Marble temp = marbles.get(i);
						marbles.remove(i);
						players[turn].addMarble(temp);
						
						pickChain(temp.getColor());
						
						state = 1;
						turn++;
						if (turn == 5) {
							turn = 1;
						}
					}
				}
				
			}
			else {
				state = 1; // maybe also add an error message later
			}
			
		}
		
		else if (state == 31) {
			if (x >= 650 && x <= 770 && y >= 15 && y <= 105) {
				for (int i = 0; i < numRandom; i++) {
					Marble m = marbles.remove(marbles.size()-3);
					players[turn].addMarble(m);
				}
			}
		}

		else if (state == 11) { // player chooses to do the FILE action
			for (int i = 0; i < 4; i++) { // tier 1 cards
				Card c = board.get(1).get(i);
				if (x >= c.getX() && x <= c.getX() + 130 && y >= c.getY() && y <= c.getY() + 130) {
					boolean boob = players[turn].archiveCard(c);
					if (boob) { // archived succesfully
						board.get(1).remove(i); // remove the card from the board because it is now in player archive
						state = 1;
						turn++;
						if (turn == 5) {
							turn = 1;
						}
						
					}
					else {
						state = 1; // try again. maybe put an error message here later.
					}
				}
			}
			
			for (int i = 0; i < 3; i++) { // tier 2 cards
				Card c = board.get(2).get(i);
				if (x >= c.getX() && x <= c.getX() + 130 && y >= c.getY() && y <= c.getY() + 130) {
					boolean boob = players[turn].archiveCard(c);
					if (boob) { // archived succesfully
						board.get(2).remove(i); // remove the card from the board because it is now in player archive
						state = 1;
						turn++;
						if (turn == 5) {
							turn = 1;
						}
					}
					else {
						state = 1; // try again. maybe put an error message here later.
					}
				}
			}
			
			for (int i = 0; i < 2; i++) { // tier 3 cards
				Card c = board.get(3).get(i);
				if (x >= c.getX() && x <= c.getX() + 130 && y >= c.getY() && y <= c.getY() + 130) {
					boolean boob = players[turn].archiveCard(c);
					if (boob) { // archived succesfully
						board.get(3).remove(i); // remove the card from the board because it is now in player archive
						state = 1;
						turn++;
						if (turn == 5) {
							turn = 1;
						}
					}
					else {
						state = 1; // try again. maybe put an error message here later.
					}
				}
			}
			
			
		}
		
		
		else if (state == 10) {
			if (x>780&&x<900&&y>300&&y<349) {
				state = 40; // Now, player can pick card from BOARD to BUILD.
			}
			else if (x>915&&x<1035&&y>300&&y<349) {
				if (players[turn].getArchive().size()==0) {
					state = 1;
				}
				else {
					state = 41; // Now, player can pick card from ARCHIVE to BUILD.
				}
			}
		}
		
		else if (state== 40) { // builds from BOARD.
			cardToBuild = null; // these 3 PIVs are reset efvery time state = 40
			toBuildTier = -1;
			toBuildIndex = -1;
			
			for (int i = 0; i < 4; i++) { // tier 1 cards
				Card c = board.get(1).get(i);
				if (x >= c.getX() && x <= c.getX() + 130 && y >= c.getY() && y <= c.getY() + 130) {
					cardToBuild = c;
					toBuildTier = c.getTier();
					toBuildIndex = i;
				}
			}
			for (int i = 0; i < 3; i++) { // tier 2 cards
				Card c = board.get(2).get(i);
				if (x >= c.getX() && x <= c.getX() + 130 && y >= c.getY() && y <= c.getY() + 130) {
					cardToBuild = c;
					toBuildTier = c.getTier();
					toBuildIndex = i;
				}
			}
			for (int i = 0; i < 2; i++) { // tier 3 cards
				Card c = board.get(3).get(i);
				if (x >= c.getX() && x <= c.getX() + 130 && y >= c.getY() && y <= c.getY() + 130) {
					cardToBuild = c;
					toBuildTier = c.getTier();
					toBuildIndex = i;
				}
			}
			
			if (!(cardToBuild == null)) { // if paoyer ac5tually clicked on one of the cards
				if (pay()) { // if paid fully
					if (cardToBuild.getCategory().equals("upgrade")) {
						players[turn].increaseFileLimit(cardToBuild.getFileIncrease());
						players[turn].increaseMarbleLimit(cardToBuild.getMarbleIncrease());
						players[turn].increaseResearchLimit(cardToBuild.getResearchIncrease());
					}
					state = 1;
					turn++;
					if (turn == 5) {
						turn = 1;
					}
				}
				else { // cannot pay, try another action
					state = 1;
				}
			}
		}
		
		else if (state == 41) { // builds from ARCHIVE
			cardToBuild = null; // these 3 PIVs are reset efvery time state = 40
			toBuildTier = -1;
			toBuildIndex = -1;
			
			for (int i = 0; i < players[turn].getArchive().size(); i++) {
				Card bust = players[turn].getArchive().get(i);
				if (x >= bust.getX() && x <= bust.getX() + 100 && y >= bust.getY() && y <= bust.getY() + 100) {
					cardToBuild = bust;
					toBuildTier = bust.getTier();
					toBuildIndex = i;
				}
			}
			
			
			if (!(cardToBuild == null)) {
				if (pay()) { // if paid fully
					if (cardToBuild.getCategory().equals("upgrade")) {
						players[turn].increaseFileLimit(cardToBuild.getFileIncrease());
						players[turn].increaseMarbleLimit(cardToBuild.getMarbleIncrease());
						players[turn].increaseResearchLimit(cardToBuild.getResearchIncrease());
					}
					
					state = 1;
					turn++;
					if (turn == 5) {
						turn = 1;
					}
				}
				else { // cannot pay, try another action
					state = 1;
				}
			}
		}

		//research
		
		repaint();
	}
//check if all player
	public  boolean checkT(){
		for(int i =1;i< 5;i++){
			if (players[i].isDone()){
				return false; // game is not in play
			}
		}
		return true; // game is in play

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
	
	public static <T> void shorten16(ArrayList<T> list) {
		ArrayList<T> temp = new ArrayList<>();
		int ind = 0;
		for (T c : list) {
			temp.add(list.get(ind));
			ind++;
			if (ind == 16) {
				break;
			}
		}
		list = temp;
	}
	
	public boolean pay() { // for BUILDING. if has enough, then return true and pay it and move the next player. if not enough marbles, then return false.
		String color = cardToBuild.getCostColor();
		int needToPay = cardToBuild.getCost();
		
		ArrayList<Marble> pmarbles = players[turn].getMarbles();
		
		needToPay -= players[turn].numMarbles(color); 
		
		if (needToPay <= 0) {
			int paid = 0;
			for (int i = players[turn].getMarbles().size()-1; i >= 0; i--) {
				Marble m = players[turn].getMarbles().get(i);
				if (m.getColor().equals(color)) {
					paid++;
					players[turn].removeMarble(i);
					marbles.add((int)((marbles.size() - 10) * Math.random()) + 8, m);
				}
				if (paid == cardToBuild.getCost()) {
					break;
				}
			}
			
			if (state == 40) { // built from board
				board.get(toBuildTier).remove(toBuildIndex);
			}
			else if (state == 41) { // built from archive
				players[turn].getArchive().remove(toBuildIndex);
			}
			players[turn].addCard(cardToBuild);
			builtChain(cardToBuild);
			return true;
		}
		
		// this is a little iffy, need to test this when we have more time.
		int nonColor = players[turn].getMarbles().size() - players[turn].numMarbles(color);
		int potential = 0;
		int numDoublers = 0;
		for (Card c : players[turn].getCards().get("converter")) {
			// use the converters to convert other marbles 
			if (c.isConverterB()) {
				if (c.getStartColor().equals(color)) {
					needToPay -= players[turn].numMarbles(color);
					numDoublers++;
				}
				else if (c.getColorB().equals(color)) {
					needToPay -= players[turn].numMarbles(color);
					numDoublers++;
				}
			}
			else {
				if (!c.getStartColor().equals(color) && c.isPerformOnTwo()) { // convert 2 cards
					potential += 2;
					needToPay -= 2;
				}
				else if (!c.getStartColor().equals(color) && !c.isPerformOnTwo()) { // only convert 1 card
					potential++;
					needToPay--;
				}
			}
		}
		
		if (needToPay > 0) { // not enough to pay
			return false;
		}
		else { // paying now, returning true,
			int paid = 0;
			for (int i = players[turn].getMarbles().size()-1; i >= 0; i--) {
				Marble m = players[turn].getMarbles().get(i);
				if (m.getColor().equals(color)) {
					paid++;
					players[turn].removeMarble(i);
					marbles.add((int)((marbles.size() - 10) * Math.random()) + 8, m);
				}
				if (paid == cardToBuild.getCost()) {
					break;
				}
			}
			
			if (paid < cardToBuild.getCost()) {
				if (numDoublers >= 1) {
					paid *= 2;
				}
				if (numDoublers >= 2) {
					paid *= 2;
				}
				if (numDoublers >= 3) {
					paid *= 2;
				}
				if (numDoublers >= 4) {
					paid *= 2;
				}
				if (numDoublers >= 5) {
					paid *= 2;
				}
			}
			
			if (paid < cardToBuild.getCost()) {
				for (int i = players[turn].getMarbles().size()-1; i >= 0; i--) {
					players[turn].getMarbles().remove(i);
					paid++;
					if (paid == cardToBuild.getCost()) {
						break;
					}
				}
			}
			
			if (state == 40) { // built from board
				board.get(toBuildTier).remove(toBuildIndex);
			}
			else if (state == 41) { // built from archive
				players[turn].getArchive().remove(toBuildIndex);
			}
			builtChain(cardToBuild);
			players[turn].addCard(cardToBuild);
			return true;
		}
	}
	
	public void fileChain(Card c) {
		
	}
	public void pickChain(String color) {
		numRandom = 0;
		for (Card p : players[turn].getCards().get("pick")) {
			for (String s: p.getPickedColors()) {
				if (s.equals(color)) {
					numRandom++;
				}
			}
		}
		if (numRandom > 0) {
			state = 31;
		}
	}
	public void builtChain(Card c) {
		players[turn].increasePlayerVp(c.getPlayerVictoryPoints());
		System.out.println(c.getPlayerVictoryPoints());
	}
}



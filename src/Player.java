import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Player {
	private BufferedImage beltImage;
	
	private HashMap<String, ArrayList<Card>> belt;
	private ArrayList<Card> archive; // the "filed" cards of teh palyer. make sure this does not go over fileLimit
	private ArrayList<Marble> marbles;
	
	private int playerNumber;
	private int playerVictoryPoints;
	private int marbleLimit;
	private int fileLimit;
	private int researchLimit;
	private int x;
	private int y;

	private int t3;
	private int tot;
	private boolean canFile = true, canResearch = true; // if player is allowed to do these actions or not - they can be negated by certain cards.
	
	public Player(int n) {
		belt = new HashMap<>();
		belt.put("upgrade", new ArrayList<>());
		belt.put("file", new ArrayList<>());
		belt.put("build", new ArrayList<>());
		belt.put("pick", new ArrayList<>());
		belt.put("converter", new ArrayList<>());
		
		archive = new ArrayList<>();
		try {
			belt.get("file").add(new FileCard("0x00f", ImageIO.read(Player.class.getResource("/cardImages/defaultCard.png"))));
		}
		catch(Exception E) {
			System.out.println("default arhcive card image exception");
		}
		
		
		marbles = new ArrayList<>();
		
		playerNumber = n;
		playerVictoryPoints = 0;
		marbleLimit = 5;
		fileLimit = 1;
		researchLimit = 3;
		
	}
	public int Vpoints(){
		int ret = 0;
		ArrayList<Card> up= belt.get("upgrade");
		ArrayList<Card> fil= belt.get("file");
		ArrayList<Card> bu= belt.get("build");
		ArrayList<Card> pi= belt.get("pick");
		ArrayList<Card> con= belt.get("converter");
		for(int i =0;i<up.size();i++){
			ret = ret +up.get(i).getCardVictoryPoints();
		}
		for(int i =0;i<fil.size();i++){
			ret = ret +fil.get(i).getCardVictoryPoints();

		}
		for(int i =0;i<bu.size();i++){
			ret = ret +bu.get(i).getCardVictoryPoints();


		}
		for(int i =0;i<pi.size();i++){
			ret = ret +pi.get(i).getCardVictoryPoints();


		}
		for(int i =0;i<con.size();i++){
			ret = ret +con.get(i).getCardVictoryPoints();


		}
		return ret;
	}
	public boolean isDone(){
		int tret = 0;//total cards
		int three=0; // lvl3 cards
		ArrayList<Card> up= belt.get("upgrade");
		ArrayList<Card> fil= belt.get("file");
		ArrayList<Card> bu= belt.get("build");
		ArrayList<Card> pi= belt.get("pick");
		ArrayList<Card> con= belt.get("converter");
		for(int i =0;i<up.size();i++){
			tret++;
			if(up.get(i).getTier()==3){
				three++;
			}

		}
		for(int i =0;i<fil.size();i++){
			tret++;
			if(fil.get(i).getTier()==3){
				three++;
			}

		}
		for(int i =0;i<bu.size();i++){
			tret++;
			if(bu.get(i).getTier()==3){
				three++;
			}

		}
		for(int i =0;i<pi.size();i++){
			tret++;
			if(pi.get(i).getTier()==3){
				three++;
			}

		}
		for(int i =0;i<con.size();i++){
			tret++;
			if(con.get(i).getTier()==3){
				three++;
			}

		}
		return tret>=16||three>=3;
	}
	public void addCard(Card c) {
		belt.get(c.getCategory()).add(c);
	}
	public HashMap<String, ArrayList<Card>> getCards() {
		return belt;
	}
	public boolean archiveCard(Card c) { // retuyrns false if reached the limit, true if succuessfully addeed the card
		if (archive.size() == fileLimit) {
			return false;
		}
		archive.add(c);
		return true;
	}
	public ArrayList<Card> getArchive() {
		return archive;
	}
	
	public void negateFile() {
		canFile = false;
	}
	public void negateResearch() {
		canResearch = false;
	}

	public int getTotalVictoryPoints() { 
		Collection<ArrayList<Card>> list = belt.values();
		int sum = 0;
		for (ArrayList<Card> arr : list) {
			for (Card c : arr) {
				sum += c.getCardVictoryPoints();
			}
		}
		sum += playerVictoryPoints;

		return sum;
	}
	
	public void addMarble(Marble m) {
		marbles.add(m);
	}
	public ArrayList<Marble> getMarbles() {
		return marbles;
	}
	public int numMarbles(String co) {
		int count = 0;
		for (Marble m : marbles) {
			if (m.getColor().equals(co)) {
				count++;
			}
		}
		return count;
	}
	public void removeMarble(int i) {
		marbles.remove(i);
	}

	public void increaseMarbleLimit(int n) {
		marbleLimit += n;
	}
	public void increaseFileLimit(int n) {
		fileLimit += n;
	}
	public void increaseResearchLimit(int n) {
		researchLimit += n;
	}

	public int getResearchLimit() {
		return researchLimit;
	}
	public int getFileLimit() {
		return fileLimit;
	}
	public int getMarbleLimit() {
		return marbleLimit;
	}

	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public BufferedImage getImage() {
		return beltImage;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

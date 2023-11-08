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
	private ArrayList<Marble> marbles;
	private String name;
	private int playerNumber;
	private int playerVictoryPoints;
	private int marbleLimit;
	private int fileLimit;
	private int researchLimit;
	private int x;
	private int y;

	public int getTotalVictoryPoints() { 
		ArrayList<Integer> list = belt.values();
		int sum = 0;
		for (Card c : list) {
			sum += c.getCardVictoryPoints();
		}
		sum += playerVictoryPoints;

		return sum;
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

	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Player {
	private BufferedImage belt;
	private HashMap<String, ArrayList<Card>>;
	private ArrayList<Marble>;
	private String name;
	private int playerNumber;
	private int playerVictoryPoints;
	private int marbleLimit;
	private int fileLimit;
	private int researchLimit;
	private int x;
	private int y;

	public int getTotalVictoryPoints() { // NOT FINISHED. need to include the points from all of the cards. DO this when card calsses are done.
		return playerVictoryPoints;
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

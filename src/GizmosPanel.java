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
	private boolean gme = true;
	private BufferedImage ep,ep2,ep3,ep4,ep5,ep1,ep7,ep8,ep9,epy,epr,epblue,epblack,chest,purp,green,org,blank,arc,res,back;;
    public GizmosPanel() {
    	try {
        	ep = ImageIO.read(GizmosPanel.class.getResource("/images/iangizmo.png"));
        	ep2 = ImageIO.read(GizmosPanel.class.getResource("/images/player1.png"));
        	ep3 = ImageIO.read(GizmosPanel.class.getResource("/images/player2.png"));
        	ep4 = ImageIO.read(GizmosPanel.class.getResource("/images/player3.png"));
        	ep5 = ImageIO.read(GizmosPanel.class.getResource("/images/player4.png"));
        	ep1 = ImageIO.read(GizmosPanel.class.getResource("/images/butten.png"));
			//break
			ep7 = ImageIO.read(GizmosPanel.class.getResource("/images/tool1.png"));
			ep8 = ImageIO.read(GizmosPanel.class.getResource("/images/tool2.png"));
			ep9 =ImageIO.read(GizmosPanel.class.getResource("/images/energ.png"));
			epr =ImageIO.read(GizmosPanel.class.getResource("/images/redMarble.png"));
			epblue =ImageIO.read(GizmosPanel.class.getResource("/images/blueMarble.jpg"));
			epblack =ImageIO.read(GizmosPanel.class.getResource("/images/blackMarble.png"));
			chest =ImageIO.read(GizmosPanel.class.getResource("/images/chest.jpg"));
			purp     =ImageIO.read(GizmosPanel.class.getResource("/images/purp.png"));
			green     =ImageIO.read(GizmosPanel.class.getResource("/images/lvl2.png"));
			org     =ImageIO.read(GizmosPanel.class.getResource("/images/org.png"));
			blank     =ImageIO.read(GizmosPanel.class.getResource("/images/blank.png"));
			arc     =ImageIO.read(GizmosPanel.class.getResource("/images/blank.png"));
			res     =ImageIO.read(GizmosPanel.class.getResource("/images/research.png"));
			back     =ImageIO.read(GizmosPanel.class.getResource("/images/back.jpg"));

    	}
    	catch (Exception E){
        	System.err.println("erre");
        	return; 
    	}
		try{
			epy =ImageIO.read(GizmosPanel.class.getResource("/images/yellowMarble.png"));

		}
		catch (Exception E){        	System.err.println("epy");
		}
		addMouseListener(this);


	}
	
	public void paint(Graphics g) {
		if (gme) {
			g.drawImage(ep, 0, 0, 1900, 1000, null);

			g.drawImage(ep1, 1550, 630, 350, 350, null);
		}
		if(!gme){
			g.setFont(new Font("Dialog", Font.BOLD, 20));

			g.drawImage(back, 0, 0,1900,1000,null);
			g.drawImage(chest, 750, 20,120,120,null);
			g.drawImage(epy, 880, 20,50,50,null);
			g.drawImage(epblue, 940, 20,50,50,null);
			g.drawImage(epblack, 1000, 20,50,50,null);
			g.drawImage(epy, 880, 80,50,50,null);
			g.drawImage(epblue, 940, 80,50,50,null);
			g.drawImage(epblack, 1000, 80,50,50,null);
			g.drawImage(purp, 10, 10,130,130,null);
			g.drawImage(blank, 160, 10,130,130,null);
			g.drawImage(blank, 300, 10,130,130,null);

			g.drawImage(green, 10, 150,130,130,null);
			g.drawImage(blank, 160, 150,130,130,null);
			g.drawImage(blank, 300, 150,130,130,null);
			g.drawImage(blank, 440, 150,130,130,null);
			g.drawImage(org, 10, 290,130,130,null);
			g.drawImage(blank, 160, 290,130,130,null);
			g.drawImage(blank, 300, 290,130,130,null);
			g.drawImage(blank, 440, 290,130,130,null);
			g.drawImage(blank, 580, 290,130,130,null);
			g.drawImage(ep7, 10, 460, 850,100,null);
			g.drawImage(ep9, 870, 400,175,175,null);
			g.drawString("Name 1",10,440);
			g.drawImage(arc, 580, 150,100,60,null);
			g.drawImage(res, 580, 220,100,60,null);
			g.drawString("Name 2(Marble Info)",1075,30);
			g.drawImage(ep8, 1075, 40, 800,80,null);

			g.drawString("Name 3(Marble Info)",1075,315);
			g.drawImage(ep8, 1075, 335, 800,80,null);
			g.drawString("Name 4(Marble Info)",1075,615);
			g.drawImage(ep8, 1075, 640, 800,80,null);
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
			gme = false;
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

}



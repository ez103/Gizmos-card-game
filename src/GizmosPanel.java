import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class GizmosPanel extends JPanel implements MouseListener {
	
	private BufferedImage ep,ep2,ep3,ep4,ep5,ep1;
    public GizmosPanel() {
    	try {
        	ep = ImageIO.read(GizmosPanel.class.getResource("/images/iangizmo.png"));
        	ep2 = ImageIO.read(GizmosPanel.class.getResource("/images/player1.png"));
        	ep3 = ImageIO.read(GizmosPanel.class.getResource("/images/player2.png"));
        	ep4 = ImageIO.read(GizmosPanel.class.getResource("/images/player3.png"));
        	ep5 = ImageIO.read(GizmosPanel.class.getResource("/images/player4.png"));
        	ep1 = ImageIO.read(GizmosPanel.class.getResource("/images/butten.png"));
    	}
    	catch (Exception E){
        	System.err.println("error");
        	return; 
    	}
    	
    	
	}
	
	public void paint(Graphics g) {
		g.drawImage(ep, 0, 0, 1900,1000,null); 
		g.drawImage(ep2, 200, 100, 300,70,null); 
		g.drawImage(ep3, 200, 300, 300,70,null); 
		g.drawImage(ep4, 600, 100, 300,70,null); 
		g.drawImage(ep5, 600, 300, 300,70,null); 
		g.drawImage(ep1, 1550 , 630, 350,350,null);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
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

/*
import java.awt.*;
import java.awt.Image.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;
import javax.swing.*;
import java.io.*;


public class FirstGraphicPanel extends JPanel {
	private BufferedImage ep,ep2,ep3,ep4,ep5,ep1;
    public FirstGraphicPanel() {
    	try {
        	ep = ImageIO.read(new File("iangizmo.png"));
        	ep2 = ImageIO.read(new File("player1.png"));
        	ep3 = ImageIO.read(new File("player2.png"));
        	ep4 = ImageIO.read(new File("player3.png"));
        	ep5 = ImageIO.read(new File("player4.png"));
        	ep1 = ImageIO.read(new File("butten.png"));
    	}
    	catch (Exception E){
        	System.err.println("error");
        	return; 
    	}
	}
	
	public void paint(Graphics g) {
		g.drawImage(ep, 0, 0, 1900,1000,null); 
		g.drawImage(ep2, 200, 100, 300,70,null); 
		g.drawImage(ep3, 200, 300, 300,70,null); 
		g.drawImage(ep4, 600, 100, 300,70,null); 
		g.drawImage(ep5, 600, 300, 300,70,null); 
		g.drawImage(ep1, 1550 , 630, 350,350,null);
	}
}
*/

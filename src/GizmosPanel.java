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

		g.drawImage(ep1, 1550 , 630, 350,350,null);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
if(e.getX()>1550&&e.getX()<1900&&e.getY()>630&&e.getY()<980){
	JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
	frame.dispose();
	GameFrame mf = new GameFrame();


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



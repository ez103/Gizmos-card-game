import java.awt.*;
import java.awt.Image.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;
import javax.swing.*;
import java.io.*;


public class FirstGraphicPanel extends JPanel{
    private BufferedImage ep,ep2,ep3,ep4,ep5,ep1;
    public FirstGraphicPanel()
{
    try{
        ep = ImageIO.read(new File("iangizmo.png"));
        ep2 = ImageIO.read(new File("player1.png"));
        ep3 = ImageIO.read(new File("player2.png"));
          ep4 = ImageIO.read(new File("player3.png"));

        ep5 = ImageIO.read(new File("player4.png"));
        ep1 = ImageIO.read(new File("butten.png"));


    }
    catch(Exception E){
        System.err.println("error");
        return; 
    }
}
public void paint(Graphics g)
{
g.drawImage(ep, 0, 0, 1900,1000,null); 
g.drawImage(ep2, 200, 100, 300,70,null); 
g.drawImage(ep3, 200, 300, 300,70,null); 
g.drawImage(ep4, 600, 100, 300,70,null); 
g.drawImage(ep5, 600, 300, 300,70,null); 
g.drawImage(ep1, 1550 , 630, 350,350,null); 

}
}

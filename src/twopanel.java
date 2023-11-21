import java.awt.*;
import java.awt.Image.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;
import javax.swing.*;
import java.io.*;


public class twopanel extends JPanel{
    private BufferedImage ep,ep1,ep2,epy,epr,epblue,epblack,chest,purp,green,org,blank,arc,res,back;
    public twopanel()
{
    try{
        ep = ImageIO.read(Deck.class.getResource("/cardImages/tool1.png"));
        ep1 = ImageIO.read(Deck.class.getResource("/cardImages/tool2.png"));
        ep2 =ImageIO.read(Deck.class.getResource("/cardImages/energ.png"));
        epy =ImageIO.read(Deck.class.getResource("/cardImages/ylw.png"));
         epr =ImageIO.read(Deck.class.getResource("/cardImages/red.png"));
          epblue =ImageIO.read(Deck.class.getResource("/cardImages/blue.jpg"));
     epblack =ImageIO.read(Deck.class.getResource("/cardImages/black.png"));
          chest =ImageIO.read(Deck.class.getResource("/cardImages/chest.jpg"));
        purp     =ImageIO.read(Deck.class.getResource("/cardImages/purp.png"));
        green     =ImageIO.read(Deck.class.getResource("/cardImages/lvl2.png"));
        org     =ImageIO.read(Deck.class.getResource("/cardImages/org.png"));
        blank     =ImageIO.read(Deck.class.getResource("/cardImages/blank.png"));
        arc     =ImageIO.read(new File("arch.png"));
        res     =ImageIO.read(new File("res.png"));
        back     =ImageIO.read(new File("back.jpg"));

    }
    catch(Exception E){
        System.err.println("error");
        return; 
    }
}
public void paint(Graphics g)
{
    g.setFont(new Font("Dialog", Font.BOLD, 20));


/*g.drawImage(ep, 0, 20, 650,80,null); 
g.drawImage(ep2, 650, 0,100,100,null); 

g.drawImage(ep1, 0, 450, 650,80,null); 
g.drawImage(ep2, 650, 450,100,100,null); 

g.drawImage(ep1, 1140, 20, 650,80,null); 
g.drawImage(ep2, 1790, 0,95,100,null); 
g.drawImage(ep1, 1140, 450, 650,80,null); 
g.drawImage(ep2, 1790, 450,95,100,null); 
g.drawImage(chest, 750, 20,120,120,null); 
g.drawImage(epy, 880, 20,50,50,null); 
g.drawImage(epblue, 940, 20,50,50,null); 
g.drawImage(epblack, 1000, 20,50,50,null); 
g.drawImage(epy, 880, 80,50,50,null); 
g.drawImage(epblue, 940, 80,50,50,null); 
g.drawImage(epblack, 1000, 80,50,50,null); 
g.drawImage(purp, 750, 140,90,90,null); 
g.drawImage(blank, 850, 140,120,120,null); 
g.drawImage(blank, 975, 140,120,120,null); 
g.drawImage(green, 750, 280,90,90,null); 
g.drawImage(blank, 850, 280,120,120,null); 
g.drawImage(blank, 975, 280,120,120,null); 
g.drawImage(blank, 905, 405,120,120,null); 
g.drawImage(org, 750, 550,90,90,null); 
g.drawImage(blank, 850, 550,120,120,null); 
g.drawImage(blank, 975, 550,120,120,null); 
g.drawImage(blank, 850, 690,120,120,null); 
g.drawImage(blank, 975, 690,120,120,null); 
g.drawImage(arc, 850, 820,100,60,null); 
g.drawImage(res, 965, 820,100,60,null); */
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
g.drawImage(ep, 10, 460, 850,100,null);
g.drawImage(ep2, 870, 400,175,175,null); 
g.drawString("Name 1",10,440);
g.drawImage(arc, 580, 150,100,60,null); 
g.drawImage(res, 580, 220,100,60,null);
g.drawString("Name 2(Marble Info)",1075,30);
g.drawImage(ep1, 1075, 40, 800,80,null); 

g.drawString("Name 3(Marble Info)",1075,315);
g.drawImage(ep1, 1075, 335, 800,80,null); 
g.drawString("Name 4(Marble Info)",1075,615);
g.drawImage(ep1, 1075, 640, 800,80,null); 
}
}

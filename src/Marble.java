import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class Marble {
    private String color;
    private BufferedImage marbleImage;
    private int x;
    private int y;

    public Marble(String color) {
        this.color = color;
        try {
            if (color.equals("red")) { 
                marbleImage = ImageIO.read(Marble.class.getResource("/images/redMarble.png"));
            }
            else if (color.equals("yellow")) { 
                marbleImage = ImageIO.read(Marble.class.getResource("/images/yellowMarble.png"));
            }
            else if (color.equals("blue")) {
                marbleImage = ImageIO.read(Marble.class.getResource("/images/blueMarble"));
            }
            else if (color.equals("black")) {
                marbleImage = ImageIO.read(Marble.class.getResource("/images/blackMarble"));
            }
            else {
                System.out.println("NOT corrct color");
            }
        }
        catch (Exception e) {
            System.out.println("marble images exception");
        }
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

    private void convert(String color) {
        this.color = color;
    }
    private String getColor() {
        return color;
    }
    private BufferedImage getImage() {
        return image;
    }
}

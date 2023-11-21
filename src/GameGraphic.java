import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
public class GameGraphic extends JFrame{
    private static final int WIDTH = 1900;
    private static final int HEIGHT = 1000;
    public GameGraphic(String framename)
    {
        super(framename);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        add(new GamePanel());
        setVisible(true);
        add(new twopanel());
        setVisible(true);
    }
}
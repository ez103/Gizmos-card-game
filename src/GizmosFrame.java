import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class GizmosFrame extends JFrame {
	
	public GizmosFrame() {
		super("X Gamez Premium Online - Gizmos");
		setSize(1900, 1000);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new GizmosPanel());
		setVisible(true);
	}
}
	



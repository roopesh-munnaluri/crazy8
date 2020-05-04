package gui;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JPanel;


public class TwoPlayerGUI {
	TwoPlayerGUI() throws IOException{
		System.out.println("Hello");
		JFrame f= new JFrame("Crazy8");
		JPanel panel = new JPanel(null);
	    panel.setBackground(new Color(0x088A4B));
	    for (int i =0;i<Cards.ar.size();i++) {
	    	String path = "C:\\Users\\roope\\eclipse-workspace1\\Crazy-8\\src\\images\\"+ Cards.ar.get(i)+".gif";
	    	BufferedImage myPicture = ImageIO.read(new File(path));
		    JButton button = new JButton(new ImageIcon(myPicture));
		    button.setPreferredSize(new Dimension(73,97));
		    button.setBounds(new Rectangle(new Point(250, 450), button.getPreferredSize()));
		    panel.add(button);
		    
	    }
	    BufferedImage myPicture1 = ImageIO.read(new File("C:\\Users\\roope\\eclipse-workspace1\\Crazy-8\\src\\images\\2 of Clubs.gif"));
	    JButton button1 = new JButton(new ImageIcon(myPicture1));
	    button1.setPreferredSize(new Dimension(73,97));
	    button1.setBounds(new Rectangle(new Point(275, 450), button1.getPreferredSize()));
	    panel.add(button1);
	    BufferedImage myPicture2 = ImageIO.read(new File("C:\\Users\\roope\\eclipse-workspace1\\Crazy-8\\src\\images\\3 of Clubs.gif"));
	    JButton button2 = new JButton(new ImageIcon(myPicture2));
	    button2.setPreferredSize(new Dimension(73,97));
	    button2.setBounds(new Rectangle(new Point(300, 450), button2.getPreferredSize()));
	    panel.add(button2);	    
	    
	    Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
	    int windowWidth = 900;
	    int windowHeight = 700;
	    f.setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2, windowWidth, windowHeight);
	    f.add(panel);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);
	}
	
	 }

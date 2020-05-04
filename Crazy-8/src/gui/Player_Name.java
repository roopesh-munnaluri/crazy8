package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Player_Name {
	Player_Name(){
	JFrame f= new JFrame("Crazy8");
	JPanel panel = new JPanel(null);
    panel.setBackground(new Color(0x088A4B));
    JLabel welcome = new JLabel("Enter Player Name:");
    welcome.setBounds(new Rectangle(new Point(200, 250), welcome.getPreferredSize()));
    
    JButton b=new JButton("Next");
    b.setBackground(new Color(72, 99, 160));
    b.setForeground(Color.white);
    b.setFont(new Font("ARIAL", Font.PLAIN, 20));
    b.setBounds(new Rectangle(new Point(250, 350), b.getPreferredSize()));
    

    
    Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
    int windowWidth = 700;
    int windowHeight = 700;
    f.setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2, windowWidth, windowHeight);
    panel.add(welcome);
    panel.add(b);
    f.add(panel);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
	}

}

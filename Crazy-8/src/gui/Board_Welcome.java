package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Board_Welcome extends JPanel 
{
	public Board_Welcome() 
	{
	
	JFrame f= new JFrame("Crazy8");
	JPanel panel = new JPanel(null);
    panel.setBackground(new Color(0x088A4B));
    
    //JLabel
    JLabel welcome = new JLabel("Crazy 8's!");
    welcome.setFont(new Font("Vladimir Script", Font.PLAIN, 80));
    welcome.setForeground(Color.WHITE);
    welcome.setBounds(new Rectangle(new Point(200, 250), welcome.getPreferredSize()));
    
    //JButton
    JButton b=new JButton("Start Game");
    b.setBackground(new Color(72, 99, 160));
    b.setForeground(Color.white);
    b.setFont(new Font("ARIAL", Font.PLAIN, 20));
    b.setBounds(new Rectangle(new Point(250, 350), b.getPreferredSize()));
    b.setFocusPainted(false);
    b.addActionListener((ActionListener) new ActionListener() { 
        public void actionPerformed(ActionEvent e) { 
            new ChoosePlayer();
            f.setVisible(false);
        } 
    });
    
    //Adding Components to Panel and Frame
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
public static void main(String[] args) 
{
	Board_Welcome b = new Board_Welcome();  
 }
}
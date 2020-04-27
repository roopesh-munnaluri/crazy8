package gui;
import javax.swing.*;
import java.awt.*;

public class Choose_Player  extends JPanel {
 
	public Choose_Player() {
		JFrame f= new JFrame("Choose Player");
		JPanel panel = new JImage();
	    panel.setBackground(new Color(0x088A4B));
	    
	    JButton b=new JButton("2-Player");
	    b.setFont(new Font("ARIAL", Font.PLAIN, 15));
	    b.setPreferredSize(new Dimension(100,35));
	    b.setBounds(new Rectangle(new Point(250, 150), b.getPreferredSize()));
	    b.setFocusPainted(false);
	    panel.add(b);

	    JButton b1=new JButton("4-Player");
	    b1.setFont(new Font("ARIAL", Font.PLAIN, 15));
	    b1.setPreferredSize(new Dimension(100,35));
	    b1.setBounds(new Rectangle(new Point(250, 250), b1.getPreferredSize()));
	    b1.setFocusPainted(false);
	    panel.add(b1);
	    
	    JButton b2=new JButton("7-Player");
	    b2.setFont(new Font("ARIAL", Font.PLAIN, 15));
	    b2.setPreferredSize(new Dimension(100,35));
	    b2.setBounds(new Rectangle(new Point(250, 350), b2.getPreferredSize()));
	    b2.setFocusPainted(false);
	    panel.add(b2);
	    
	    
	    Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
	    int windowWidth = 600;
	    int windowHeight = 600;
	    f.setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2, windowWidth, windowHeight);
	    f.add(panel);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);	    
	}

}

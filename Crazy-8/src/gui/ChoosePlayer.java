package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
import javax.imageio.ImageIO;
public class ChoosePlayer extends JPanel{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BufferedImage bi = null;
	  static int players=0;
	  ChoosePlayer(){
	    try{
	      bi = ImageIO.read(new File("C:\\Users\\roope\\Desktop\\background.png"));
	      JFrame f = new JFrame();
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      MyJPanel panel = new MyJPanel();
	      panel.setLayout(null);
	      JButton b=new JButton("2-Player");
		    b.setFont(new Font("ARIAL", Font.PLAIN, 15));
		    b.setPreferredSize(new Dimension(100,35));
		    b.setBounds(new Rectangle(new Point(150, 150), b.getPreferredSize()));
		    b.setFocusPainted(false);
		    b.addActionListener((ActionListener) new ActionListener() { 
		        public void actionPerformed(ActionEvent e) { 
		            try {
						new TwoPlayerGUI();
						players = 2;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            f.setVisible(false);
		        } 
		    });
		    panel.add(b);

		    JButton b1=new JButton("4-Player");
		    b1.setFont(new Font("ARIAL", Font.PLAIN, 15));
		    b1.setPreferredSize(new Dimension(100,35));
		    b1.setBounds(new Rectangle(new Point(250, 250), b1.getPreferredSize()));
		    b1.setFocusPainted(false);
		    b1.addActionListener((ActionListener) new ActionListener() { 
		        public void actionPerformed(ActionEvent e) { 
		            try {
						new TwoPlayerGUI();
						players = 4;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            f.setVisible(false);
		        } 
		    });
		    panel.add(b1);
		    
		    JButton b2=new JButton("7-Player");
		    b2.setFont(new Font("ARIAL", Font.PLAIN, 15));
		    b2.setPreferredSize(new Dimension(100,35));
		    b2.setBounds(new Rectangle(new Point(350, 350), b2.getPreferredSize()));
		    b2.setFocusPainted(false);
		    b2.addActionListener((ActionListener) new ActionListener() { 
		        public void actionPerformed(ActionEvent e) { 
		            try {
						new TwoPlayerGUI();
						players = 7;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		            f.setVisible(false);
		        } 
		    });
		    panel.add(b2);

	      
	      
	      panel.setPreferredSize(new Dimension(bi.getWidth(), bi.getHeight()));
	      Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
	      int windowWidth = 600;
	      int windowHeight = 600;
	      f.setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2, windowWidth, windowHeight);
	      f.add(panel);
	      f.pack();
	      f.setVisible(true);
	    }catch(Exception e){
	      e.printStackTrace();
	    }
	  }

	  class MyJPanel extends JPanel{
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
	    public void paintComponent(Graphics g){
	      super.paintComponent(g);
	      g.drawImage(bi, 0, 0, this);
	    }
	  } 
}
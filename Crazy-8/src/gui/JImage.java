package gui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
import javax.imageio.ImageIO;
public class JImage extends JPanel{
	  BufferedImage bi = null;
	  JImage(){
	    try{
	      bi = ImageIO.read(new File("C:\\Users\\roope\\Desktop\\background.png"));
	      JFrame f = new JFrame();
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      MyJPanel p = new MyJPanel();
	      p.setPreferredSize(new Dimension(bi.getWidth(), bi.getHeight()));
	      f.add(p);
	      f.pack();
	      f.setVisible(true);
	    }catch(Exception e){
	      e.printStackTrace();
	    }
	  }
	  public static void main(String[] args){
	    new JImage();
	  }
	  class MyJPanel extends JPanel{
	    @Override
	    public void paintComponent(Graphics g){
	      super.paintComponent(g);
	      g.drawImage(bi, 0, 0, this);
	    }
	  } 
}
import java.awt.*;
import javax.swing.*;

public class Board_Welcome extends JPanel 
{
	public Board_Welcome() 
	{
	
	JFrame f= new JFrame("Crazy8");
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	JPanel panel = new JPanel(new GridBagLayout());
    panel.setBackground(new Color(0x088A4B));
    JLabel welcome = new JLabel("Crazy Eights!",SwingConstants.CENTER);
    welcome.setFont(new Font("Serif", Font.PLAIN, 50));
    welcome.setForeground(Color.WHITE);
    JButton b=new JButton("Start Game");
    panel.add(welcome);
    panel.add(b);
    f.add(panel);
    f.setSize(screenSize.width, screenSize.height);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
	System.out.println(welcome.getX());
    System.out.println(welcome.getY());
  }
public static void main(String[] args) 
{
	Board_Welcome b = new Board_Welcome();  
    
 }
}
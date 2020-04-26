import java.awt.*;
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
    
    //Adding Components to Panel and Frame
    panel.add(welcome);
    panel.add(b);
    f.add(panel);
    f.setSize(700,700);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
public static void main(String[] args) 
{
	Board_Welcome b = new Board_Welcome();  
 }
}
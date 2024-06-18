import java.awt.*;
import javax.swing.*;
public class Pr3_ex2
{
    public static void main( String args[] )
    {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(300,200);
        f.setLayout(new BorderLayout());
         
        JButton b1 = new JButton("North");    
        JButton b2 = new JButton("South");    
        JButton b3 = new JButton("East"); 
        JButton b4 = new JButton("West"); 
        JButton b5 = new JButton("Center");   
         
        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.EAST);
        f.add(b4,BorderLayout.WEST);
        f.add(b5,BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
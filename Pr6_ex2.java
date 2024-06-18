import javax.swing.*;
import java.awt.*;

public class Pr6_ex2 extends JFrame
 {
  Pr6_ex2() 
  {
     JTextArea a1 = new JTextArea("Hello Everyone");
	 JScrollPane j1=new JScrollPane(a1);
	 j1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	 j1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	 j1.setBounds(100,100,100,100);

	 add(j1);
	 setLayout(null);
	 setSize(600,600);
	 setVisible(true);
    }

    public static void main(String[] args) {
        new Pr6_ex2();
    }
}
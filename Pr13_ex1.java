import java.awt.*;
import java.awt.event.*;
class Pr13_ex1 extends WindowAdapter
{
 Frame f;
 Pr13_ex1()
 {
     f=new Frame();
	 f.addWindowListener(this);
	 f.setSize(500,500);
	 f.setLayout(null);
	 f.setVisible(true);
 }
 public void windowClosing(WindowEvent e)
 {
	 f.dispose();
 }
 public static void main(String args[])
 {
	 new Pr13_ex1();
 }
}
import java.awt.*;
import java.awt.event.*;

class Pr13_ex2 
{
	Frame f;
	Label l;
 Pr13_ex2()
 {
    f=new Frame();
    l=new Label("See Here");
	l.setBounds(100,100,200,30);
	f.addWindowListener(new WindowAdapter()
											{
											   public void windowOpened(WindowEvent e)
											   {
												   l.setBackground(Color.white);
      											 l.setText("Window is Opened");
		     									}
												public void windowClosing(WindowEvent e)
											   {
												   l.setBackground(Color.white);
      											 l.setText("Window is Closing");
		     									}
												public void windowActivated(WindowEvent e)
											   {
												   l.setBackground(Color.pink);
      											 l.setText("Window is Activated");
		     									}
											}
					   );
					   f.add(l);
					   f.setLayout(null);
					   f.setVisible(true);
					   f.setSize(500,500);
 }
  public static void main(String args[])
 {
	 new Pr13_ex2();
 }
}
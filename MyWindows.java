import java.awt.*;
import java.awt.event.*;
class MyWindows extends Frame implements WindowListener
{
 MyWindows()
 {
	 addWindowListener(this);
	 setSize(500,500);
	 setLayout(null);
	 setVisible(true);
 }
 public void windowOpened(WindowEvent e){ }
 public void windowClosed(WindowEvent e){ }
 public void windowClosing(WindowEvent e)
 {
	 dispose();
 }
 public void windowActivated(WindowEvent e){ }
 public void windowDeactivated(WindowEvent e){ }
 public void windowIconified(WindowEvent e){ }
 public void windowDeiconified(WindowEvent e){ }
 public static void main(String args[])
 {
	 new MyWindows();
 }
}
import java.awt.*;
import java.awt.event.*;
class MouseEx extends Frame implements MouseListener
{
 TextField t;
 MouseEx()
 {
	 t=new TextField("Ready for Mouse Events");
	 t.setBounds(100,100,150,50);
	 t.addMouseListener(this);
	 add(t);
	 setSize(500,500);
	 setLayout(null);
	 setVisible(true);
 }
 public void mouseClicked(MouseEvent e)
 {
	 t.setText("Mouse Clicked");
 }
 public void mousePressed(MouseEvent e)
 {
	 t.setText("Mouse Pressed");
 }
 public void mouseReleased(MouseEvent e)
 {
	  t.setText("Mouse Released");
 }
 public void mouseEntered(MouseEvent e)
 {
	 t.setText("Mouse Entered");
 }
 public void mouseExited(MouseEvent e)
 {
	 t.setText("Mouse Exited");
 }
 public static void main(String args[])
 {
  new MouseEx();
 }
} 
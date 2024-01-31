import java.awt.*;
import java.awt.event.*;
public class MouseMotionEx extends Frame implements MouseMotionListener
{
 MouseMotionEx()
 {
	 addMouseMotionListener(this);
	 setSize(500,500);
	 setBackground(Color.black);
	 setLayout(null);
	 setVisible(true);
 }
 public void mouseMoved(MouseEvent e){ }
 public void mouseDragged(MouseEvent e)
 {
  Graphics g=getGraphics();
  g.setColor(Color.pink);
  g.drawRect(e.getX(),e.getY(),20,40);
 }
 public static void main(String args[])
 {
	 new MouseMotionEx();
 }
}
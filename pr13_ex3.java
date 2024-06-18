import java.awt.*;
import java.awt.event.*;
public class pr13_ex3 extends Frame
{
 pr13_ex3()
 {
	 addMouseMotionListener(new MouseMotionAdapter()
	 {
		 public void mouseDragged(MouseEvent e)
		 {
		  Graphics g=getGraphics();
		  g.setColor(Color.pink);
		  g.drawRect(e.getX(),e.getY(),20,40);
		 }
	 });
	 setSize(500,500);
	 setBackground(Color.black);
	 setLayout(null);
	 setVisible(true);
 }
 public static void main(String args[])
 {
	 new pr13_ex3();
 }
}
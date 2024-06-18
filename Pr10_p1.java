import java.awt.*;
import java.awt.event.*;
class Pr10_p1 implements KeyListener
{
 Label l;
 Frame f1;
 Pr10_p1()
 {
	 f1=new Frame();
  l=new Label("See Here");
  l.setBounds(50,50,300,50);
  f1.add(l);
  f1.addKeyListener(this);
  f1.setLayout(null);
  f1.setSize(500,500);
  f1.setVisible(true);
 }
 public void keyPressed(KeyEvent e)
 {
  l.setText("Key Pressed: " +e.getKeyChar());
  }
  public void keyReleased(KeyEvent e){}
  public void keyTyped(KeyEvent e){}
 public static void main(String s[])
 {
  new Pr10_p1();
 }
}
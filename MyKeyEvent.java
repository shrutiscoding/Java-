import java.awt.*;
import java.awt.event.*;
class MyKeyEvent extends Frame implements KeyListener
{
 Label l;
 TextField f;
 MyKeyEvent()
 {
  l=new Label("See Here");
  f=new TextField();
  l.setBounds(50,50,300,50);
  f.setBounds(50,100,100,100);
  add(l);
  add(f);
  f.addKeyListener(this);
  setLayout(null);
  setSize(500,500);
  setVisible(true);
 }
 public void keyPressed(KeyEvent e)
 {
  l.setText("Key Pressed");
 }
 public void keyReleased(KeyEvent e)
 {
	 l.setText("Key Released");
 }
 public void keyTyped(KeyEvent e)
 {
	 l.setText("Key Typed");
 }
 public static void main(String s[])
 {
  new MyKeyEvent();
 }
}
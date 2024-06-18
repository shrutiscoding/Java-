import java.awt.*;
import javax.swing.*;
class Pr3_p2 extends JFrame
{
 Pr3_p2()
 {
  GridLayout g=new GridLayout(5,2,20,20);
  setLayout(g);
  add(new JButton("0"));
  add(new JButton("1"));
  add(new JButton("2"));
  add(new JButton("3"));
  add(new JButton("4"));
  add(new JButton("5"));
  add(new JButton("6"));
  add(new JButton("7"));
  add(new JButton("8"));
  add(new JButton("9"));
  setSize(500,500);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String args[])
 {
  new Pr3_p2();
 }
}

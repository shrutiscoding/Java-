import java.awt.*;
import javax.swing.*;
class Pr3_ex1 extends JFrame
{
 Pr3_ex1()
 {
  GridLayout g=new GridLayout(3,2,20,20);
  setLayout(g);
  add(new JButton("Button 1"));
  add(new JButton("Button 2"));
  add(new JButton("Button 3"));
  add(new JButton("Button 4"));
  add(new JButton("Button 5"));
  setSize(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String args[])
 {
  new Pr3_ex1();
 }
}

import java.awt.*;
import javax.swing.*;
class MyJComponent extends JFrame
{
 MyJComponent()
 {
  JLabel jl=new JLabel("Hello Everyone....");
  JButton jb1=new JButton("Click here....");
  JButton jb=new JButton(new ImageIcon("space.jpg"));
  setLayout(new FlowLayout());
  add(jl);
  add(jb1);
  add(jb);
  setSize(500,500);
  setVisible(true);
 }
 public static void main(String args[])
 {
  new MyJComponent();
 }
}
import javax.swing.*;
import java.awt.*;
class Pr12_p extends JFrame
{
 Pr12_p()
 {
  JLabel l2=new JLabel("Enter Your Password:");
  l2.setBounds(50,100,150,30);
  
  JPasswordField p=new JPasswordField();
  p.setEchoChar('#');
  p.setBounds(200,100,100,30);
  
  add(l2);
  add(p);

  setLayout(null);
  setSize(500,500);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String ar[])
 {
  new Pr12_p();
 }
}
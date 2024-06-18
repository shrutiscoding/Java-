import java.awt.*;
import javax.swing.*;
class Pr9_ex1 extends JFrame
{
 JProgressBar jp1,jp2;
 int i=0;
 Pr9_ex1()
 {
  jp1=new JProgressBar(0,100);
  jp1.setBounds(40,40,160,30);
  jp1.setValue(0);
  jp1.setStringPainted(true);
  jp2=new JProgressBar(0,100);
  jp2.setBounds(220,40,30,160);
  jp2.setValue(0);
  jp2.setStringPainted(true);
  jp2.setOrientation(SwingConstants.VERTICAL);
  add(jp1);
  add(jp2);
  setSize(350,350);
  setLayout(null);
  setVisible(true);
 }
 
 public void iterate()
 {
  while(i<=100)
  {
  jp1.setValue(i);
  jp2.setValue(i);
  i=i+20;
  try
  {
    Thread.sleep(150);
  }
  catch(Exception e){}
  }
 }
 public static void main(String a[])
 {
  Pr9_ex1 p=new Pr9_ex1();
  p.iterate();
 }
}
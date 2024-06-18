import java.awt.*;
import javax.swing.*;
class Pr9_p extends JFrame
{
 JProgressBar jp;
 int i=0;
 Pr9_p()
 {
  jp=new JProgressBar(0,100);
  jp.setBounds(40,40,160,30);
  jp.setValue(0);
  jp.setStringPainted(true);
  add(jp);
  setSize(250,150);
  setLayout(null);
  setVisible(true);
 }
 public void iterate()
 {
  while(i<=100)
  {
  jp.setValue(i);
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
  Pr9_p p=new Pr9_p();
  p.iterate();
 }
}
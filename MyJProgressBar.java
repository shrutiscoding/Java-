import java.awt.*;
import javax.swing.*;
class MyJProgressBar extends JFrame
{
 JProgressBar jp;
 int i=0;
 MyJProgressBar()
 {
  jp=new JProgressBar(0,200);
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
  while(i<=200)
  {
  jp.setValue(i);
  i=i+10;
  try
  {
    Thread.sleep(150);
  }
  catch(Exception e){}
  }
 }
 public static void main(String a[])
 {
  MyJProgressBar p=new MyJProgressBar();
  p.iterate();
 }
}
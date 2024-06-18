import java.awt.*;
class Pr3_p1 extends Frame
{
 Pr3_p1()
 {
  GridLayout g=new GridLayout(5,5);
  for(int i=1;i<=25;i++)
  {
    add(new Button(""+i));
  }
  setLayout(g);
  
  setSize(500,500);
  setVisible(true);
  
 }
 public static void main(String args[])
 {
  new Pr3_p1();
 }
}

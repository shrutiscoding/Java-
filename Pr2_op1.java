import java.awt.*;
class Pr2_op1
{
  public static void main(String args[])
  {
    List l=new List(3,false);
    l.setBounds(50,100,100,60);
    l.add("Summer");
    l.add("Winter");
    l.add("Rainy");
    Frame f=new Frame("Output Of Program Code");
    f.setSize(200,200);
    f.setVisible(true);
    f.setLayout(null);
    f.add(l);
  }
}
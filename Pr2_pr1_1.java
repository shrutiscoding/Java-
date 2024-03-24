import java.awt.*;
class Pr2_pr1_1
{
  public static void main(String args[])
  {
    List l=new List(5,true);
    l.setBounds(50,50,100,80);
    l.add("Maths");
    l.add("Physics");
    l.add("Chemistry");
    l.add("C++");
    l.add("Java");
    l.add("PHP");
    l.add("PYTHON");
    l.add("VB.NET");
    l.add("HTML");
    l.add("ANDROID");
	Label l1=new Label("Select Subjects You Like");
	l1.setBounds(50,130,200,50);
    Frame f=new Frame("Output Code of Practical Related");
    f.setSize(200,200);
    f.setVisible(true);
    f.setLayout(null);
	f.add(l1);
    f.add(l);
  }
}
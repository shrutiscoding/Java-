import java.awt.*;
import java.applet.*;
/*<applet code="Pr2_pr1_2.class" width=500 height=500>
</applet>*/
public class Pr2_pr1_2 extends Applet
{
  public void init()
  {
    List l=new List(5,true);
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
	add(l1);
    add(l);
  }
}
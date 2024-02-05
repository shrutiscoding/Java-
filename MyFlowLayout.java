import java.awt.*; 
import java.applet.*; 
public class MyFlowLayout extends Applet
{
  public void init()
  {
   setLayout(new FlowLayout(FlowLayout.RIGHT,20,20));
   Button b1=new Button("AJP");
   Button b2=new Button("CSS");
   Button b3=new Button("OSY");
   Button b4=new Button("CPP");
   Button b5=new Button("ITR");
   add(b1);
   add(b2);
   add(b3);
   add(b4);
   add(b5);
  }
}
/*<applet code="MyFlowLayout.class" width=300 height=300>
</applet>*/
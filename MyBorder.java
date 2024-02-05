import java.awt.*;
import java.applet.*;
public class MyBorder extends Applet
{
 public void init()
 {
  setLayout(new BorderLayout(15,20));
  add(new Button("North"),BorderLayout.NORTH);
  add(new Button("South"),BorderLayout.SOUTH);
  add(new Button("East"),BorderLayout.EAST);
  add(new Button("West"),BorderLayout.WEST);
  add(new Button("Center"),BorderLayout.CENTER);
 }
}
/*<applet code="MyBorder.class" width=400 height=400>
</applet>*/
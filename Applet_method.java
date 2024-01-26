import java.awt.*;
import java.applet.*;

public class Applet_method extends Applet
{
 public void init(){
  setBackground(Color.darkGray);
}
  public void paint(Graphics g)
  {
    g.setColor(Color.magenta);
    g.fillRect(30,80,150,60);
    g.setColor(Color.cyan);
    g.fillOval(30,80,150,60);
    int x1[]={50,110,100,90};
    int y1[]={50,110,150,70};
    int n=4;
    g.setColor(Color.pink);
    g.fillPolygon(x1,y1,n);
    g.setColor(Color.black);
    g.drawString("Hello I am Shruti!! ",50,110);
  }
}
/*<applet code="Applet_method.class" width="300" height="300">
</applet>
*/
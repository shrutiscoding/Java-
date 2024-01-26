import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Applet_MouseEx extends Applet implements MouseListener
{
 public void init()
 {
  addMouseListener(this);
 }
 public void mousePressed(MouseEvent e){}
 public void mouseReleased(MouseEvent e){}
 public void mouseEntered(MouseEvent e){}
 public void mouseExited(MouseEvent e){}
 public void mouseClicked(MouseEvent e)
 {
  int x=e.getX();
  int y=e.getY();
  showStatus("X="+x+" Y="+y);
 }
}
/*<applet code="Applet_MouseEx.class" width="500" height="500">
  </applet>
  */
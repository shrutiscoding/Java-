import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*;
/* <APPLET CODE ="Pr11_ex1.class" WIDTH=300 HEIGHT=200> </APPLET> */ 
public class Pr11_ex1 extends Applet implements MouseListener 
{ 
Label l;
public void init() 
{
l=new Label("Hello Change Background Color");
l.setBounds(50,100,200,30);
setLayout(null);
add(l);
l.addMouseListener(this);
}
public void mousePressed(MouseEvent e)
{
 setBackground(Color.pink);
}
public void mouseReleased(MouseEvent e)
{
setBackground(Color.cyan);
}
public void mouseEntered(MouseEvent e)
{
setBackground(Color.green);
}
public void mouseExited(MouseEvent e)
{
setBackground(Color.gray);
}
public void mouseClicked(MouseEvent e)
{
setBackground(Color.yellow);
}
}
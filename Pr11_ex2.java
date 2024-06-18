import java.awt.*;
import java.awt.event.*;
class Pr11_ex2 extends Frame implements MouseListener
{
 TextField t;
 Pr11_ex2()
 {
	 t=new TextField("Mouse Click Events");
	 t.setBounds(100,100,200,50);
	 t.addMouseListener(this);
	 add(t);
	 setSize(500,500);
	 setLayout(null);
	 setVisible(true);
 }
 public void mouseClicked(MouseEvent e)
 {
    t.setText("Mouse clicked no of clicks:"+e.getClickCount());
 }
 public void mousePressed(MouseEvent e)
 {
 }
 public void mouseReleased(MouseEvent e)
 {
 }
 public void mouseEntered(MouseEvent e)
 {
 }
 public void mouseExited(MouseEvent e)
 {

 }
 public static void main(String args[])
 {
  new Pr11_ex2();
 }
}

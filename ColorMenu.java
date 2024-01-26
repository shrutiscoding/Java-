import java.awt.*;
import java.awt.event.*;
class ColorMenu extends Frame implements ActionListener
{
	MenuItem r,g,b;
 Panel p;
 ColorMenu()
 {
  MenuBar mb=new MenuBar();
  Menu c=new Menu("Color");
   r=new MenuItem("Red");
   g=new MenuItem("Green");
   b=new MenuItem("Blue");
   p=new Panel();
  c.add(r); c.add(g);  c.add(b);
  r.addActionListener(this);
  g.addActionListener(this);
  b.addActionListener(this);
  add(p);
  mb.add(c);
  setMenuBar(mb);
  p.setBounds(40,40,400,400);
  setLayout(null);
  setSize(500,500);
  setVisible(true);
 }
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==r)
   p.setBackground(Color.red);
  if(ae.getSource()==g)
   p.setBackground(Color.green);
  if(ae.getSource()==b)
   p.setBackground(Color.blue);
 }
 public static void main(String args[])
 {
  new ColorMenu();
 }
}
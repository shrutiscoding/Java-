import java.awt.*;
class Pr5_p extends Frame
{
  Pr5_p()
  {
    MenuBar mb=new MenuBar();
	
	Menu c=new Menu("COLOURS");
	MenuItem p=new MenuItem("Pink");
	MenuItem y=new MenuItem("Yellow");
	MenuItem r=new MenuItem("Red");
	MenuItem b=new MenuItem("Blue");
	MenuItem bl=new MenuItem("Black");
	bl.setEnabled(false);
	MenuItem w=new MenuItem("White");
	MenuItem o=new MenuItem("Orange");
	MenuItem g=new MenuItem("Grey");
	c.add(p);
	c.add(y);
	c.add(r);
	c.add(b);
	c.add(bl);
	c.add(w);
	c.add(o);
	c.add(g);
	mb.add(c);
	setMenuBar(mb);
	setSize(400,400);
	setBackground(Color.magenta);
	setLayout(new FlowLayout());
	setVisible(true);
	
  }
  public static void main(String args[])
  {
    new Pr5_p();
  }
 }
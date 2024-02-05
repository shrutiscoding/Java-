import java.awt.*;
class MyMenu2 extends Frame
{
  MyMenu2()
  {
    MenuBar mb=new MenuBar();
	Menu m=new Menu("File");
	Menu f=new Menu("Format");
	CheckboxMenuItem w=new CheckboxMenuItem("Word Wrap");
	Menu n=new Menu("New");
	MenuItem h=new MenuItem("HTML");
	MenuItem j=new MenuItem("JAVA");
	n.add(h);
	n.add(j);
	MenuItem o=new MenuItem("Open");
	MenuItem c=new MenuItem("Close");
	f.add(w);
	m.add(n);
	m.add(o);
	m.addSeparator();
	m.add(c);
	mb.add(m);
	mb.add(f);
	setMenuBar(mb);
	setSize(400,400);
	setBackground(Color.pink);
	setLayout(new FlowLayout());
	setVisible(true);
  }
  public static void main(String args[])
  {
    new MyMenu2();
  }
 }
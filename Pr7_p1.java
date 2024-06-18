import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class Pr7_p1 extends JFrame
{
  Pr7_p1()
  {
	  
	  DefaultMutableTreeNode color=new DefaultMutableTreeNode("Colors");
	  DefaultMutableTreeNode r=new DefaultMutableTreeNode("Red");
	  DefaultMutableTreeNode g=new DefaultMutableTreeNode("Green");
	  DefaultMutableTreeNode b=new DefaultMutableTreeNode("Blue");
	  DefaultMutableTreeNode p=new DefaultMutableTreeNode("Pink");
	  DefaultMutableTreeNode bro=new DefaultMutableTreeNode("Brown");
	  r.add(p);r.add(bro);
	  color.add(r);color.add(g);color.add(b);
	  JTree t=new JTree(color);
	  add(t);
	  pack();
	  setVisible(true);
	  setTitle("This Colors JTree");
  }
  public static void main(String args[])
  {
   new Pr7_p1();
  }
}
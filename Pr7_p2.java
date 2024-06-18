import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class Pr7_p2 extends JFrame
{
  Pr7_p2()
  {
	  
	  DefaultMutableTreeNode country=new DefaultMutableTreeNode("India");
	  DefaultMutableTreeNode m=new DefaultMutableTreeNode("Maharashtra");
	  DefaultMutableTreeNode mu=new DefaultMutableTreeNode("Mumbai");
	  DefaultMutableTreeNode p=new DefaultMutableTreeNode("Pune");
	  DefaultMutableTreeNode n=new DefaultMutableTreeNode("Nashik");
	  DefaultMutableTreeNode nag=new DefaultMutableTreeNode("Nagpur");
	  DefaultMutableTreeNode g=new DefaultMutableTreeNode("Gujrath");
	  m.add(mu);m.add(p);m.add(n);m.add(nag);
	  country.add(m);country.add(g);
	  JTree t=new JTree(country);
	  add(t);
	  pack();
	  setVisible(true);
  }
  public static void main(String args[])
  {
   new Pr7_p2();
  }
}
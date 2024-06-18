import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class Pr7_ex extends JFrame
{
  Pr7_ex()
  {
	  
	  DefaultMutableTreeNode root=new DefaultMutableTreeNode("Root");
	  DefaultMutableTreeNode tp=new DefaultMutableTreeNode("This PC");
	  DefaultMutableTreeNode de=new DefaultMutableTreeNode("Desktop");
	  root.add(tp);root.add(de);
	  DefaultMutableTreeNode doc=new DefaultMutableTreeNode("Documents");
	  DefaultMutableTreeNode down=new DefaultMutableTreeNode("Downloads");
	  DefaultMutableTreeNode music=new DefaultMutableTreeNode("Music");
	  DefaultMutableTreeNode pic=new DefaultMutableTreeNode("Pictures");
	  DefaultMutableTreeNode vid=new DefaultMutableTreeNode("Videos");
	  tp.add(doc);tp.add(down);tp.add(music);
	  de.add(pic);de.add(vid);
	  JTree t=new JTree(root);
	  add(t);
	  pack();
	  setVisible(true);
	  setTitle("File Manager");
  }
  public static void main(String args[])
  {
   new Pr7_ex();
  }
}
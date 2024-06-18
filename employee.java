import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class employee extends JFrame
{
  employee()
  {
	  
	  DefaultMutableTreeNode Dept=new DefaultMutableTreeNode("Department");
	  DefaultMutableTreeNode Sales=new DefaultMutableTreeNode("Sales");
	  DefaultMutableTreeNode Marketing=new DefaultMutableTreeNode("Marketing");
	  DefaultMutableTreeNode Manufacturing=new DefaultMutableTreeNode("Manufacturing");
	  Dept.add(Sales);Dept.add(Marketing);Dept.add(Manufacturing);
	  
	  DefaultMutableTreeNode Shruti=new DefaultMutableTreeNode("Shruti");
	  DefaultMutableTreeNode Samiksha=new DefaultMutableTreeNode("Samiksha");
	  DefaultMutableTreeNode Jui=new DefaultMutableTreeNode("Jui");
	  DefaultMutableTreeNode Anjali=new DefaultMutableTreeNode("Anjali");
	  DefaultMutableTreeNode Swapnali=new DefaultMutableTreeNode("Swapnali");
	  DefaultMutableTreeNode Sanika=new DefaultMutableTreeNode("Sanika");
	  DefaultMutableTreeNode Dipti=new DefaultMutableTreeNode("Dipti");
	  
	  Sales.add(Shruti);Sales.add(Samiksha);
	  Marketing.add(Jui); Marketing.add(Anjali);
	  Manufacturing.add(Swapnali);Manufacturing.add(Sanika);Manufacturing.add(Dipti);
	  
	  JTree t=new JTree(Dept);
	  add(t);
	  pack();
	  setVisible(true);
	  setTitle("File Manager");
  }
  public static void main(String args[])
  {
   new employee();
  }
}
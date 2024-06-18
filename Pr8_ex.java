import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class Pr8_ex extends JFrame
{
  Pr8_ex()
  {
	  String Columns[]={"NAME","PERCENTAGE","GRADE"};
	  String Data[][]={
		                {"Shrutika","88.43","A+"},
						{"Samiksha","80.64","A"},
						{"Dipti","78.34","B+"},
						{"Shreya","68.95","B"},
						{"Madhura","48.86","C+"},
						{"Shruti","98.74","A++"},
						{"Anjali","85.33","A+"},
						{"Amruta","40.44","C"},
						{"Swapnali","73.32","B++"},
						{"Sanika","75.55","B++"}
                      };
	JTable table=new JTable(Data,Columns);
	JScrollPane scrollPane = new JScrollPane(table);
    add(scrollPane);
setVisible(true);
setSize(500,500);
setLayout(new FlowLayout());	
  }
  public static void main(String args[])
  {
   new Pr8_ex();
  }
}
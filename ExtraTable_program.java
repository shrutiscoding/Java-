import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class ExtraTable_program extends JFrame
{
	
	ExtraTable_program()
	{

		JLabel label1 = new JLabel("Top 10 Employees");
		 
		String data[][] = {
		{"1","Dipti","Manager","40"},
		{"2","Shruti","Programmer","25"},
		{"3","Sakshi","Leader","30"},
		{"4","Anuja","Designer","50"},
		{"5","Shruti","Analyst","32"},
		{"6","Samiya","Developer","28"},
		{"7","Swapnali","Programmer","21"},
		{"8","Sanika","Developer","26"},
		{"9","Samiksha","Designer","29"},
		{"10","Shreesha","Analyst","25"}
		};

	String[] columnName = { "No.","Name","Designation","Age"};
	JTable t = new JTable(data, columnName);
	JScrollPane sp = new JScrollPane(t);
	add(sp);
	setSize(500, 250);
	setLayout(new FlowLayout());
	setVisible(true);
	}
	public static void main(String[] args)
	{
     	new ExtraTable_program();
	}
}
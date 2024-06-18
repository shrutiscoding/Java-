import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class Pr8_p2 extends JFrame
{
  Pr8_p2()
  {
	  String Columns[]={"ID","NAME","SALARY"};
	  String Data[][]={
		                {"101","Amit","670000"},
						{"102","Jal","760000"},
						{"101","Sachin","700000"}
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
   new Pr8_p2();
  }
}
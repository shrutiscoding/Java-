import java.awt.*;
import javax.swing.*;

class MyJTabbedPane extends JFrame
{
 MyJTabbedPane()
 {
	 JTabbedPane t=new JTabbedPane();
	 t.setSize(400,400);
	 
	 JPanel p1=new JPanel();
	 p1.setSize(400,400);
	 JLabel l1=new JLabel(new ImageIcon("personal.jpeg"));
	 l1.setBounds(100,150,50,10);
	 p1.add(l1);
	 
	 
	 JPanel p2=new JPanel();
	 p2.setSize(400,400);
	 JLabel l2=new JLabel(new ImageIcon("admission.jpeg"));
	 l2.setBounds(100,150,50,10);
	 p2.add(l2);
	 
	 JPanel p3=new JPanel();
	 p3.setSize(400,400);
	 JLabel l3=new JLabel(new ImageIcon("department.jpg"));
	 l3.setBounds(100,150,150,20);
	 p3.add(l3);
	 
	 t.add("Personal Detail",p1);
	 t.add("Admission Detail",p2);
	 t.add("Department Detail",p3);
	  
	 add(t);
	 setLayout(null);
	 setSize(600,600);
	 setVisible(true);
 }
 public static void main(String a[])
 {
	 new MyJTabbedPane();
 }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Pr6_ex1 extends JFrame implements ActionListener
{
 JComboBox c;
 Label l;
 Pr6_ex1()
 {
  String states[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
  c=new JComboBox(states);
  c.setBounds(100,100,200,30);
  setLayout(null);
  setSize(700,300);
  setVisible(true);
  c.addActionListener(this);
  l=new Label(" ");
  l.setFont(new Font("Courier",Font.BOLD,15));
  l.setBounds(300,100,250,30);
  add(c);
  add(l);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e)
 {
	 String selectedItem =(String)c.getSelectedItem();
	 l.setText("Your State is " + selectedItem);
 }
 public static void main(String ar[])
 {
   new Pr6_ex1();
 }
}
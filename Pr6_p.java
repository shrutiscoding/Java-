import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Pr6_p extends JFrame implements ActionListener
{
 JComboBox c;
 Label l;
 Pr6_p()
 {
  String city[]={"Solapur","Pune","Banglore","Mumbai"};
  c=new JComboBox(city);
  c.setBounds(100,100,100,30);
  setLayout(null);
  setSize(500,500);
  setVisible(true);
  c.addActionListener(this);
  l=new Label(" ");
  l.setBounds(200,100,150,30);
  add(c);
  add(l);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e)
 {
	 String selectedItem =(String)c.getSelectedItem();
	 l.setText("You are in " + selectedItem);
 }
 public static void main(String ar[])
 {
   new Pr6_p();
 }
}
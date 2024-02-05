import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyItem extends JFrame implements ItemListener
{
 JLabel l;
 JCheckBox c1,c2,c3,c4,c5;
 MyItem()
 {
  l=new JLabel("Select Favourite Language From the Following :");
  l.setBounds(50,50,350,30);
  c1=new JCheckBox("Python");
  c2=new JCheckBox("Java");
  c3=new JCheckBox("Block Chain");
  c4=new JCheckBox("C++");
  c5=new JCheckBox("C");
  c1.setBounds(50,100,150,30);
  c2.setBounds(50,150,150,30);
  c3.setBounds(50,200,150,30);
  c4.setBounds(50,250,150,30);
  c5.setBounds(50,300,150,30);
  add(c1);add(c2);add(c3);add(c4);add(c5);
  add(l);
  c1.addItemListener(this);
  c2.addItemListener(this);
  c3.addItemListener(this);
  c4.addItemListener(this);
  c5.addItemListener(this);
  setLayout(null);
  setSize(500,500);
  setVisible(true);
 }
 public void itemStateChanged(ItemEvent e)
 {
  if(e.getSource()==c1)
  {
   l.setText((c1.isSelected())?"My Favourite Language is Python !!":"");
  }
  if(e.getSource()==c2)
  {
   l.setText((c2.isSelected())?"My Favourite Language is Java !!":"");
  }
  if(e.getSource()==c3)
  {
   l.setText((c3.isSelected())?"My Favourite Language is Block Chain !!":"");
  }
  if(e.getSource()==c4)
  {
   l.setText((c4.isSelected())?"My Favourite Language is C++ !!":"");
  }
  if(e.getSource()==c5)
  {
   l.setText((c5.isSelected())?"My Favourite Language is C !!":"");
  }
 }
 public static void main(String s[])
 {
  new MyItem();
 }
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Pr12_ex1 extends JFrame implements ActionListener
{
 JLabel result;
 JTextField tf1;
 JPasswordField tf2;
 Pr12_ex1()
 {
  setTitle("Login Page");
  Font f1=new Font("Courier",Font.BOLD,25);
  Font f2=new Font("Arial Black",Font.BOLD,15);
  result=new JLabel(" ");
  
  JLabel L1=new JLabel("SHRUTI's Software PVT LTD");
  L1.setFont(f1);
  
  JLabel L2=new JLabel("Enter Username:");
  L2.setFont(f2);
  
  JLabel L3=new JLabel("Enter Password:");
  L3.setFont(f2);
  
  tf1=new JTextField();
  tf2=new JPasswordField();
  
  JButton b1=new JButton("Login");
  b1.setFont(f2);
  
  b1.addActionListener(this);//Action Registration
  
  L1.setBounds(150,200,400,40);
  L2.setBounds(200,300,200,40);
  tf1.setBounds(370,300,150,30);
  L3.setBounds(200,350,150,40);
  tf2.setBounds(370,350,150,30);
  b1.setBounds(300,430,90,40);
  result.setBounds(300,500,250,40);
  
  result.setFont(f2);
  add(L1);
  add(L2);
  add(tf1);
  add(L3);
  add(tf2);
  add(b1);
  add(result);
  setLayout(null);
  setVisible(true); 
  setSize(700,700);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }
 public void actionPerformed(ActionEvent ae)//Event
 {
	 String un=tf1.getText();
	 String psw=tf2.getText();
	 if(un.equals("SHRUTI") && psw.equals("SHRUTI"))
	 {
	  result.setText("Login Successful!!!");
	 }
	 else{
		   result.setText("Login Fail!!!");
	 }
 }
 public static void main(String args[])
 {
  new Pr12_ex1();
 }
}
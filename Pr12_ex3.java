import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Pr12_ex3 extends JFrame implements ActionListener
{
 JLabel result;
 JTextField tf1;
 JPasswordField tf2;
 Pr12_ex3()
 {
  ImageIcon i=new ImageIcon("login.png");
  ImageIcon i1=new ImageIcon("password.png");
  ImageIcon i2=new ImageIcon("user.jpeg");
  ImageIcon i3=new ImageIcon("side.png");
  
  setTitle("Login Page");
  
  Font f1=new Font("Courier",Font.BOLD,25);
  Font f2=new Font("Arial Black",Font.BOLD,15);
  result=new JLabel(" ");
  
  JLabel L1=new JLabel("LOGIN PAGE");
  L1.setFont(f1);
  L1.setIcon(i);
  
  JLabel L2=new JLabel("Enter Username:");
  L2.setFont(f2);
  L2.setIcon(i2);
  
  JLabel L3=new JLabel("Enter Password:");
  L3.setFont(f2);
  L3.setIcon(i1);
  
  tf1=new JTextField();
  tf2=new JPasswordField();
  
  JButton b1=new JButton("Login");
  b1.setFont(f2);
  
  JLabel la=new JLabel();
  la.setIcon(i3);
  b1.addActionListener(this);//Action Registration
  
  L1.setBounds(150,50,400,150);
  L2.setBounds(100,250,500,100);
  tf1.setBounds(500,290,150,30);
  L3.setBounds(100,400,400,100);
  tf2.setBounds(500,425,150,30);
  b1.setBounds(300,550,90,40);
  la.setBounds(700,200,500,300);
  result.setBounds(200,600,400,30);
  result.setFont(f2);
  add(L1);
  add(L2);
  add(tf1);
  add(L3);
  add(tf2);
  add(b1);
  add(la);
  add(result);
  setLayout(null);
  setVisible(true); 
  setSize(1000,800);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }
 public void actionPerformed(ActionEvent ae)//Event
 {
	 String un=tf1.getText();
	 String psw=tf2.getText();
	 if(psw.length()>6)
	 {
		 if(un.equals("SHRUTI") && psw.equals("Shruti12"))
		 {
		  result.setText("Login Successful!!!");
		 }
		 else
		 {
			   result.setText("Login Fail!!!");
		 }
	}
	else
	{
	   result.setText("Password length must be >6 characters");
    }	
 }
 public static void main(String args[])
 {
  new Pr12_ex3();
 }
}
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;  
public class Pr10_ex3 extends JFrame implements KeyListener{  
    JTextField tf1,tf2,tf3;  
	JLabel l,l1,l2,l3,res;
    Pr10_ex3()
	{  
	    Font f1=new Font("Courier",Font.BOLD,25);
		ImageIcon i=new ImageIcon("calci.png");
	    JLabel icon=new JLabel();
		icon.setIcon(i);
		icon.setBounds(400,100,200,300);
		l=new JLabel("Sum Calculation");
		l.setBounds(100,20,300,50);
		l.setFont(f1);
		
        l1=new JLabel("Enter First Number:");
        l1.setBounds(50,100,200,30);		
        tf1=new JTextField();  
        tf1.setBounds(250,100,100,30); 
		
		l2=new JLabel("Enter Second Number:");
        l2.setBounds(50,200,200,30);	
        tf2=new JTextField();  
        tf2.setBounds(250,200,100,30);  
		
		l3=new JLabel("Multiplication of First and Second Number:");
        l3.setBounds(50,300,300,30);
        tf3=new JTextField();  
        tf3.setBounds(300,300,100,30); 
		
        tf3.setEditable(false);   
        tf1.addKeyListener(this); 
		tf2.addKeyListener(this); 
		res=new JLabel("");
		res.setBounds(100,450,200,30);
		
        add(l);add(l1);add(tf1);add(l2);add(tf2);add(l3);add(tf3);add(res); add(icon);
        setSize(600,600);  
        setLayout(null);  
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
    }         
    public void keyPressed(KeyEvent e) 
	{  
        String s1=tf1.getText();  
        String s2=tf2.getText(); 
			if(e.getKeyChar()=='*')
			{
				Double a=Double.parseDouble(s1);  
				Double b=Double.parseDouble(s2);  
				Double c=0.0;  
				c=a*b;
				String result=String.valueOf(c);  
				tf3.setText(result);  
			}
	}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}
public static void main(String[] args) 
{  
    new Pr10_ex3();  
} 
}  
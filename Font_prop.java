import java.awt.*;
import java.awt.event.*;
class Font_prop extends Frame implements ActionListener
{
 Button b1,b2,b3;
 TextField t;
 Font f,f1,f2,f3;
 Font_prop()
 {
	 setLayout(null);
	b1=new Button("Font Size");
	b1.setBounds(50,50,100,30);
	b2=new Button("Font Style");
	b2.setBounds(150,50,100,30);
	b3=new Button("Font");
	b3.setBounds(250,50,100,30);
	add(b1); add(b2); add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	t=new TextField();
	t.setBounds(100,300,200,50);
	f=new Font("Times New Roman",Font.PLAIN,15);
	f1=new Font("Times New Roman",Font.PLAIN,35  );
	f2=new Font("Times New Roman",Font.BOLD|Font.ITALIC,35);
	f3=new Font("Courier",Font.BOLD,35);
	add(t);
	t.setFont(f);
	setVisible(true);
	setSize(600,600);
 }
 public void actionPerformed(ActionEvent ae)
 {
	if(ae.getSource()==b1)
       t.setFont(f1);
	if(ae.getSource()==b2)
       t.setFont(f2);
	if(ae.getSource()==b3)
       t.setFont(f3);
 }
 public static void main(String ar[])
 {
	new Font_prop();
 }
}
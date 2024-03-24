import java.awt.*;
class Pr2_ex1
{
  public static void main(String args[])
  {
   Frame f=new Frame("City Selection");
	  
   Font f1=new Font("Cooper",Font.BOLD,15);
   
   Label l1=new Label("Select City From the Following:");
   l1.setBounds(100,50,250,20);
   l1.setFont(f1);
   
   List l=new List(10,false);
   l.add("KOLHAPUR");
   l.add("KARAD");
   l.add("SATARA");
   l.add("TASGAON");
   l.add("MUMBAI");
   l.add("PUNE");
   l.add("BANGLORE");
   l.add("SANGLI");
   l.add("DELHI");
   l.add("SOLAPUR");
   l.setBounds(150,100,100,100);
   
   f.setLayout(null);
   f.add(l1);
   f.add(l);
   f.setSize(500,500);
   f.setVisible(true);
  
  }
}
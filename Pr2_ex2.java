import java.awt.*;
class Pr2_ex2
{
  public static void main(String args[])
  {
   Frame f=new Frame("NewsPaper Selection");
	  
   Font f1=new Font("Cooper",Font.BOLD,15);
   
   Label l1=new Label("Select Newspapers From the Following:");
   l1.setBounds(100,50,300,20);
   l1.setFont(f1);
   
   List l=new List(10,true);
   l.add("Hindustan Times");
   l.add("The Times Of India");
   l.add("Dainik Bhaskar");
   l.add("Kesari");
   l.add("Lokmat");
   l.add("Maharashtra Times");
   l.add("Sakal");
   l.add("Pudhari");
   l.add("Tarun Bharat");
   l.add("Daily News");
   l.setBounds(150,100,150,80);
   
   f.setLayout(null);
   f.add(l1);
   f.add(l);
   f.setSize(500,500);
   f.setVisible(true);
 
  }
}
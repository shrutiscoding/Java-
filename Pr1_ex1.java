import java.awt.*;
class Pr1_ex1
{
  public static void main(String args[])
  {
   Frame f=new Frame("Practical No. 1 (Ex_1)");
   Label l=new Label("Welcome to Java");
   Font f1=new Font("SANS_SERIF",Font.BOLD,20);
   f.setBackground(Color.cyan);
   l.setBackground(Color.pink);
   f.setFont(f1);
   l.setForeground(Color.yellow);
   l.setBounds(50,100,170,30);
   f.add(l); 
   f.setLayout(null);
   f.setVisible(true);
   f.setSize(300,300);
   
  }
}